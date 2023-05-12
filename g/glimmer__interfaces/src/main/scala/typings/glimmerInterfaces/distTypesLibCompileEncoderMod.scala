package typings.glimmerInterfaces

import typings.glimmerInterfaces.anon.End
import typings.glimmerInterfaces.anon.IfComponent
import typings.glimmerInterfaces.anon.IfHelper
import typings.glimmerInterfaces.anon.IfValue
import typings.glimmerInterfaces.distTypesLibCompileOperandsMod.SingleBuilderOperand
import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.Hash
import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Core.Params
import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.Expressions.Expression
import typings.glimmerInterfaces.distTypesLibCoreMod.Option
import typings.glimmerInterfaces.distTypesLibProgramMod.CompileTimeConstants
import typings.glimmerInterfaces.distTypesLibSerializeMod.CompileTimeComponent
import typings.glimmerInterfaces.distTypesLibTemplateMod.HandleResult
import typings.glimmerInterfaces.distTypesLibTemplateMod.NamedBlocks
import typings.glimmerInterfaces.glimmerInterfacesInts.`1000`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1001`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1002`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1003`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1004`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1005`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1006`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1007`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1008`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1009`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1010`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1011`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibCompileEncoderMod {
  
  trait ArgsOptions
    extends StObject
       with SimpleArgsOptions {
    
    var blocks: NamedBlocks
    
    @JSName("named")
    var named_ArgsOptions: Hash
  }
  object ArgsOptions {
    
    inline def apply(atNames: Boolean, blocks: NamedBlocks): ArgsOptions = {
      val __obj = js.Dynamic.literal(atNames = atNames.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], named = null, positional = null)
      __obj.asInstanceOf[ArgsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArgsOptions] (val x: Self) extends AnyVal {
      
      inline def setBlocks(value: NamedBlocks): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setNamed(value: Hash): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setNamedNull: Self = StObject.set(x, "named", null)
    }
  }
  
  type BuilderOp = js.Tuple4[
    /* op */ BuilderOpcode, 
    /* op1 */ js.UndefOr[SingleBuilderOperand], 
    /* op1 */ js.UndefOr[SingleBuilderOperand], 
    /* op1 */ js.UndefOr[SingleBuilderOperand]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.distTypesLibVmOpcodesMod.Op
    - typings.glimmerInterfaces.distTypesLibVmOpcodesMod.MachineOp
  */
  trait BuilderOpcode extends StObject
  
  trait Encoder extends StObject {
    
    /**
      * Finalize the current compilation unit, add a `(Return)`, and push the opcodes from
      * the buffer into the program. At this point, some of the opcodes might still be
      * placeholders, such as in the case of recursively compiled templates.
      *
      * @param compiler
      * @param size
      */
    def commit(size: Double): HandleResult
    
    def error(error: EncoderError): Unit
    
    /**
      * Mark the current position with a label name. This label name
      * can be used by any other opcode in this label block.
      * @param name
      * @param index
      */
    def label(name: String): Unit
    
    /**
      * Push a syscall into the program with up to three optional
      * operands.
      *
      * @param opcode
      * @param args up to three operands, formatted as
      *   { type: "type", value: value }
      */
    def push(constants: CompileTimeConstants, opcode: BuilderOpcode, args: SingleBuilderOperand*): Unit
    
    /**
      * Start a new labels block. A labels block is a scope for labels that
      * can be referred to before they are declared. For example, when compiling
      * an `if`, the `JumpUnless` opcode occurs before the target label. To
      * accommodate this use-case ergonomically, the `Encoder` allows a syntax
      * to create a labels block and then refer to labels that have not yet
      * been declared. Once the block is complete, a second pass replaces the
      * label names with offsets.
      *
      * The pattern is:
      *
      * ```ts
      * encoder.reserve(Op.JumpUnless);
      * encoder.target(encoder.pos, 'ELSE');
      * ```
      *
      * The `reserve` method creates a placeholder opcode with space for a target
      * in the future, and the `target` method registers the blank operand position
      * to be replaced with an offset to `ELSE`, once it's known.
      */
    def startLabels(): Unit
    
    /**
      * Finish the current labels block and replace label names with offsets,
      * now that all of the offsets are known.
      */
    def stopLabels(): Unit
  }
  object Encoder {
    
    inline def apply(
      commit: Double => HandleResult,
      error: EncoderError => Unit,
      label: String => Unit,
      push: (CompileTimeConstants, BuilderOpcode, /* repeated */ SingleBuilderOperand) => Unit,
      startLabels: () => Unit,
      stopLabels: () => Unit
    ): Encoder = {
      val __obj = js.Dynamic.literal(commit = js.Any.fromFunction1(commit), error = js.Any.fromFunction1(error), label = js.Any.fromFunction1(label), push = js.Any.fromFunction3(push), startLabels = js.Any.fromFunction0(startLabels), stopLabels = js.Any.fromFunction0(stopLabels))
      __obj.asInstanceOf[Encoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encoder] (val x: Self) extends AnyVal {
      
      inline def setCommit(value: Double => HandleResult): Self = StObject.set(x, "commit", js.Any.fromFunction1(value))
      
      inline def setError(value: EncoderError => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setLabel(value: String => Unit): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setPush(value: (CompileTimeConstants, BuilderOpcode, /* repeated */ SingleBuilderOperand) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
      
      inline def setStartLabels(value: () => Unit): Self = StObject.set(x, "startLabels", js.Any.fromFunction0(value))
      
      inline def setStopLabels(value: () => Unit): Self = StObject.set(x, "stopLabels", js.Any.fromFunction0(value))
    }
  }
  
  trait EncoderError extends StObject {
    
    var problem: String
    
    var span: End
  }
  object EncoderError {
    
    inline def apply(problem: String, span: End): EncoderError = {
      val __obj = js.Dynamic.literal(problem = problem.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncoderError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncoderError] (val x: Self) extends AnyVal {
      
      inline def setProblem(value: String): Self = StObject.set(x, "problem", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: End): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    }
  }
  
  type HighLevelBuilderOp = StartLabelsOp | StopLabelsOp | LabelOp
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1000`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1001`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1002`
  */
  trait HighLevelBuilderOpcode extends StObject
  object HighLevelBuilderOpcode {
    
    inline def End: `1002` = 1002.asInstanceOf[`1002`]
    
    inline def Label: `1000` = 1000.asInstanceOf[`1000`]
    
    inline def Start: `1000` = 1000.asInstanceOf[`1000`]
    
    inline def StartLabels: `1001` = 1001.asInstanceOf[`1001`]
    
    inline def StopLabels: `1002` = 1002.asInstanceOf[`1002`]
  }
  
  type HighLevelOp = HighLevelBuilderOp | HighLevelResolutionOp
  
  type HighLevelResolutionOp = ResolveModifierOp | ResolveComponentOp | ResolveComponentOrHelperOp | ResolveHelperOp | ResolveOptionalHelperOp | ResolveOptionalComponentOrHelperOp | ResolveFreeOp | ResolveTemplateLocalOp | ResolveLocalOp
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1003`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1004`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1005`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1006`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1007`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1008`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1009`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1010`
    - typings.glimmerInterfaces.glimmerInterfacesInts.`1011`
  */
  trait HighLevelResolutionOpcode extends StObject
  object HighLevelResolutionOpcode {
    
    inline def End: `1011` = 1011.asInstanceOf[`1011`]
    
    inline def ResolveComponent: `1004` = 1004.asInstanceOf[`1004`]
    
    inline def ResolveComponentOrHelper: `1007` = 1007.asInstanceOf[`1007`]
    
    inline def ResolveFree: `1009` = 1009.asInstanceOf[`1009`]
    
    inline def ResolveHelper: `1005` = 1005.asInstanceOf[`1005`]
    
    inline def ResolveLocal: `1010` = 1010.asInstanceOf[`1010`]
    
    inline def ResolveModifier: `1003` = 1003.asInstanceOf[`1003`]
    
    inline def ResolveOptionalComponentOrHelper: `1008` = 1008.asInstanceOf[`1008`]
    
    inline def ResolveOptionalHelper: `1006` = 1006.asInstanceOf[`1006`]
    
    inline def ResolveTemplateLocal: `1011` = 1011.asInstanceOf[`1011`]
    
    inline def Start: `1003` = 1003.asInstanceOf[`1003`]
  }
  
  type LabelOp = js.Tuple2[`1000`, /* op1 */ String]
  
  type ResolveComponentOp = js.Tuple3[
    `1004`, 
    /* op1 */ Expression, 
    /* op2 */ js.Function1[/* component */ CompileTimeComponent, Unit]
  ]
  
  type ResolveComponentOrHelperOp = js.Tuple3[`1007`, /* op1 */ Expression, /* op2 */ IfComponent]
  
  type ResolveFreeOp = js.Tuple3[`1009`, /* op1 */ Double, /* op2 */ js.Function1[/* handle */ Double, Unit]]
  
  type ResolveHelperOp = js.Tuple3[`1005`, /* op1 */ Expression, /* op2 */ js.Function1[/* handle */ Double, Unit]]
  
  type ResolveLocalOp = js.Tuple3[
    `1010`, 
    /* op1 */ Double, 
    /* op2 */ js.Function2[/* name */ String, /* moduleName */ String, Unit]
  ]
  
  type ResolveModifierOp = js.Tuple3[`1003`, /* op1 */ Expression, /* op2 */ js.Function1[/* handle */ Double, Unit]]
  
  type ResolveOptionalComponentOrHelperOp = js.Tuple3[`1008`, /* op1 */ Expression, /* op2 */ IfValue]
  
  type ResolveOptionalHelperOp = js.Tuple3[`1006`, /* op1 */ Expression, /* op2 */ IfHelper]
  
  type ResolveTemplateLocalOp = js.Tuple3[`1011`, /* op1 */ Double, /* op2 */ js.Function1[/* handle */ Double, Unit]]
  
  trait SimpleArgsOptions extends StObject {
    
    var atNames: Boolean
    
    var named: Option[Hash]
    
    var positional: Option[Params]
  }
  object SimpleArgsOptions {
    
    inline def apply(atNames: Boolean): SimpleArgsOptions = {
      val __obj = js.Dynamic.literal(atNames = atNames.asInstanceOf[js.Any], named = null, positional = null)
      __obj.asInstanceOf[SimpleArgsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleArgsOptions] (val x: Self) extends AnyVal {
      
      inline def setAtNames(value: Boolean): Self = StObject.set(x, "atNames", value.asInstanceOf[js.Any])
      
      inline def setNamed(value: Option[Hash]): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
      
      inline def setNamedNull: Self = StObject.set(x, "named", null)
      
      inline def setPositional(value: Option[Params]): Self = StObject.set(x, "positional", value.asInstanceOf[js.Any])
      
      inline def setPositionalNull: Self = StObject.set(x, "positional", null)
    }
  }
  
  type StartLabelsOp = js.Array[`1001`]
  
  type StopLabelsOp = js.Array[`1002`]
}
