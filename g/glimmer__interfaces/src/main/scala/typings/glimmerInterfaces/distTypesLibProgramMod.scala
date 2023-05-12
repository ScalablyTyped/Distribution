package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibCompileEncoderMod.Encoder
import typings.glimmerInterfaces.distTypesLibComponentsMod.ComponentDefinition
import typings.glimmerInterfaces.distTypesLibComponentsMod.ComponentDefinitionState
import typings.glimmerInterfaces.distTypesLibComponentsMod.ComponentInstanceState
import typings.glimmerInterfaces.distTypesLibManagersInternalComponentMod.InternalComponentManager
import typings.glimmerInterfaces.distTypesLibRuntimeHelperMod.HelperDefinitionState
import typings.glimmerInterfaces.distTypesLibRuntimeModifierMod.ModifierDefinitionState
import typings.glimmerInterfaces.distTypesLibRuntimeOwnerMod.Owner
import typings.glimmerInterfaces.distTypesLibSerializeMod.CompileTimeResolver
import typings.glimmerInterfaces.distTypesLibSerializeMod.ResolvedComponentDefinition
import typings.glimmerInterfaces.distTypesLibTemplateMod.ContainingMetadata
import typings.glimmerInterfaces.distTypesLibTemplateMod.STDLib
import typings.glimmerInterfaces.distTypesLibTemplateMod.Template
import typings.glimmerInterfaces.distTypesLibVmOpcodesMod.Op
import typings.glimmerInterfaces.glimmerInterfacesBooleans.`false`
import typings.glimmerInterfaces.glimmerInterfacesBooleans.`true`
import typings.glimmerInterfaces.glimmerInterfacesInts.`0`
import typings.glimmerInterfaces.glimmerInterfacesInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibProgramMod {
  
  trait CompileTimeArtifacts extends StObject {
    
    var constants: CompileTimeConstants & ResolutionTimeConstants
    
    var heap: CompileTimeHeap
  }
  object CompileTimeArtifacts {
    
    inline def apply(constants: CompileTimeConstants & ResolutionTimeConstants, heap: CompileTimeHeap): CompileTimeArtifacts = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], heap = heap.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompileTimeArtifacts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompileTimeArtifacts] (val x: Self) extends AnyVal {
      
      inline def setConstants(value: CompileTimeConstants & ResolutionTimeConstants): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setHeap(value: CompileTimeHeap): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompileTimeCompilationContext extends StObject {
    
    // Interned constants
    val constants: CompileTimeConstants & ResolutionTimeConstants
    
    // The heap that the program is serializing into
    val heap: CompileTimeHeap
    
    // The mechanism of resolving names to values at compile-time
    val resolver: CompileTimeResolver[Owner]
    
    // The offsets to stdlib functions
    val stdlib: STDLib
  }
  object CompileTimeCompilationContext {
    
    inline def apply(
      constants: CompileTimeConstants & ResolutionTimeConstants,
      heap: CompileTimeHeap,
      resolver: CompileTimeResolver[Owner],
      stdlib: STDLib
    ): CompileTimeCompilationContext = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], heap = heap.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any], stdlib = stdlib.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompileTimeCompilationContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompileTimeCompilationContext] (val x: Self) extends AnyVal {
      
      inline def setConstants(value: CompileTimeConstants & ResolutionTimeConstants): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setHeap(value: CompileTimeHeap): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
      
      inline def setResolver(value: CompileTimeResolver[Owner]): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setStdlib(value: STDLib): Self = StObject.set(x, "stdlib", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompileTimeConstants extends StObject {
    
    def array(values: js.Array[Any]): Double
    
    def toPool(): ConstantPool
    
    def value(value: Any): Double
  }
  object CompileTimeConstants {
    
    inline def apply(array: js.Array[Any] => Double, toPool: () => ConstantPool, value: Any => Double): CompileTimeConstants = {
      val __obj = js.Dynamic.literal(array = js.Any.fromFunction1(array), toPool = js.Any.fromFunction0(toPool), value = js.Any.fromFunction1(value))
      __obj.asInstanceOf[CompileTimeConstants]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompileTimeConstants] (val x: Self) extends AnyVal {
      
      inline def setArray(value: js.Array[Any] => Double): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
      
      inline def setToPool(value: () => ConstantPool): Self = StObject.set(x, "toPool", js.Any.fromFunction0(value))
      
      inline def setValue(value: Any => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CompileTimeHeap
    extends StObject
       with OpcodeHeap {
    
    def capture(): SerializedHeap = js.native
    def capture(offset: Double): SerializedHeap = js.native
    
    def finishMalloc(handle: Double, scopeSize: Double): Unit = js.native
    
    // for debugging
    def getaddr(handle: Double): Double = js.native
    
    def malloc(): Double = js.native
    
    var offset: Double = js.native
    
    def push(name: Op): Unit = js.native
    def push(name: Op, op1: Double): Unit = js.native
    def push(name: Op, op1: Double, op2: Double): Unit = js.native
    def push(name: Op, op1: Double, op2: Double, op3: Double): Unit = js.native
    def push(name: Op, op1: Double, op2: Unit, op3: Double): Unit = js.native
    def push(name: Op, op1: Unit, op2: Double): Unit = js.native
    def push(name: Op, op1: Unit, op2: Double, op3: Double): Unit = js.native
    def push(name: Op, op1: Unit, op2: Unit, op3: Double): Unit = js.native
    
    def setbyaddr(address: Double, value: Double): Unit = js.native
    
    def sizeof(handle: Double): Double = js.native
  }
  
  type ConstantPool = js.Array[Any]
  
  type EMPTY_ARRAY = js.Array[js.Array[scala.Nothing]]
  
  trait OpcodeHeap extends StObject {
    
    def getbyaddr(address: Double): Double
  }
  object OpcodeHeap {
    
    inline def apply(getbyaddr: Double => Double): OpcodeHeap = {
      val __obj = js.Dynamic.literal(getbyaddr = js.Any.fromFunction1(getbyaddr))
      __obj.asInstanceOf[OpcodeHeap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpcodeHeap] (val x: Self) extends AnyVal {
      
      inline def setGetbyaddr(value: Double => Double): Self = StObject.set(x, "getbyaddr", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ResolutionTimeConstants extends StObject {
    
    def component(definitionState: ComponentDefinitionState, owner: js.Object): (ComponentDefinition[
        ComponentDefinitionState, 
        ComponentInstanceState, 
        InternalComponentManager[ComponentInstanceState, ComponentDefinitionState]
      ]) | Null = js.native
    def component(definitionState: ComponentDefinitionState, owner: js.Object, isOptional: Boolean): (ComponentDefinition[
        ComponentDefinitionState, 
        ComponentInstanceState, 
        InternalComponentManager[ComponentInstanceState, ComponentDefinitionState]
      ]) | Null = js.native
    @JSName("component")
    def component_ComponentDefinition(definitionState: ComponentDefinitionState, owner: js.Object): ComponentDefinition[
        ComponentDefinitionState, 
        ComponentInstanceState, 
        InternalComponentManager[ComponentInstanceState, ComponentDefinitionState]
      ] = js.native
    @JSName("component")
    def component_false(definitionState: ComponentDefinitionState, owner: js.Object, isOptional: `false`): ComponentDefinition[
        ComponentDefinitionState, 
        ComponentInstanceState, 
        InternalComponentManager[ComponentInstanceState, ComponentDefinitionState]
      ] = js.native
    
    // TODO: The default template is unique per-program. This should likely belong
    // in StdLib, but it's not really possible to thread it through that way
    // currently.
    var defaultTemplate: Template = js.native
    
    def helper(definitionState: HelperDefinitionState): Double = js.native
    def helper(definitionState: HelperDefinitionState, resolvedName: String): Double = js.native
    @JSName("helper")
    def helper_true(definitionState: HelperDefinitionState, resolvedName: String, isOptional: `true`): Double | Null = js.native
    @JSName("helper")
    def helper_true(definitionState: HelperDefinitionState, resolvedName: Null, isOptional: `true`): Double | Null = js.native
    
    def modifier(definitionState: ModifierDefinitionState): Double = js.native
    def modifier(definitionState: ModifierDefinitionState, resolvedName: String): Double = js.native
    @JSName("modifier")
    def modifier_true(definitionState: ModifierDefinitionState, resolvedName: String, isOptional: `true`): Double | Null = js.native
    @JSName("modifier")
    def modifier_true(definitionState: ModifierDefinitionState, resolvedName: Null, isOptional: `true`): Double | Null = js.native
    
    def resolvedComponent(
      definitionState: ResolvedComponentDefinition[
          ComponentDefinitionState, 
          ComponentInstanceState, 
          InternalComponentManager[ComponentInstanceState, ComponentDefinitionState]
        ],
      resolvedName: String
    ): ComponentDefinition[
        ComponentDefinitionState, 
        ComponentInstanceState, 
        InternalComponentManager[ComponentInstanceState, ComponentDefinitionState]
      ] = js.native
  }
  
  trait RuntimeConstants extends StObject {
    
    def getArray[T](handle: Double): js.Array[T]
    
    def getValue[T](handle: Double): T
  }
  object RuntimeConstants {
    
    inline def apply(getArray: Double => js.Array[Any], getValue: Double => Any): RuntimeConstants = {
      val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction1(getArray), getValue = js.Any.fromFunction1(getValue))
      __obj.asInstanceOf[RuntimeConstants]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeConstants] (val x: Self) extends AnyVal {
      
      inline def setGetArray(value: Double => js.Array[Any]): Self = StObject.set(x, "getArray", js.Any.fromFunction1(value))
      
      inline def setGetValue(value: Double => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    }
  }
  
  trait RuntimeHeap
    extends StObject
       with OpcodeHeap {
    
    def getaddr(handle: Double): Double
    
    def sizeof(handle: Double): Double
  }
  object RuntimeHeap {
    
    inline def apply(getaddr: Double => Double, getbyaddr: Double => Double, sizeof: Double => Double): RuntimeHeap = {
      val __obj = js.Dynamic.literal(getaddr = js.Any.fromFunction1(getaddr), getbyaddr = js.Any.fromFunction1(getbyaddr), sizeof = js.Any.fromFunction1(sizeof))
      __obj.asInstanceOf[RuntimeHeap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeHeap] (val x: Self) extends AnyVal {
      
      inline def setGetaddr(value: Double => Double): Self = StObject.set(x, "getaddr", js.Any.fromFunction1(value))
      
      inline def setSizeof(value: Double => Double): Self = StObject.set(x, "sizeof", js.Any.fromFunction1(value))
    }
  }
  
  trait RuntimeOp extends StObject {
    
    var isMachine: `0` | `1`
    
    var offset: Double
    
    var op1: Double
    
    var op2: Double
    
    var op3: Double
    
    var size: Double
    
    var `type`: Double
  }
  object RuntimeOp {
    
    inline def apply(
      isMachine: `0` | `1`,
      offset: Double,
      op1: Double,
      op2: Double,
      op3: Double,
      size: Double,
      `type`: Double
    ): RuntimeOp = {
      val __obj = js.Dynamic.literal(isMachine = isMachine.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], op1 = op1.asInstanceOf[js.Any], op2 = op2.asInstanceOf[js.Any], op3 = op3.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeOp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeOp] (val x: Self) extends AnyVal {
      
      inline def setIsMachine(value: `0` | `1`): Self = StObject.set(x, "isMachine", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOp1(value: Double): Self = StObject.set(x, "op1", value.asInstanceOf[js.Any])
      
      inline def setOp2(value: Double): Self = StObject.set(x, "op2", value.asInstanceOf[js.Any])
      
      inline def setOp3(value: Double): Self = StObject.set(x, "op3", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerializedHeap extends StObject {
    
    var buffer: js.typedarray.ArrayBuffer
    
    var handle: Double
    
    var table: js.Array[Double]
  }
  object SerializedHeap {
    
    inline def apply(buffer: js.typedarray.ArrayBuffer, handle: Double, table: js.Array[Double]): SerializedHeap = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedHeap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializedHeap] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setTable(value: js.Array[Double]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableVarargs(value: Double*): Self = StObject.set(x, "table", js.Array(value*))
    }
  }
  
  trait TemplateCompilationContext extends StObject {
    
    val encoder: Encoder
    
    val meta: ContainingMetadata
    
    val program: CompileTimeCompilationContext
  }
  object TemplateCompilationContext {
    
    inline def apply(encoder: Encoder, meta: ContainingMetadata, program: CompileTimeCompilationContext): TemplateCompilationContext = {
      val __obj = js.Dynamic.literal(encoder = encoder.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateCompilationContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateCompilationContext] (val x: Self) extends AnyVal {
      
      inline def setEncoder(value: Encoder): Self = StObject.set(x, "encoder", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: ContainingMetadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setProgram(value: CompileTimeCompilationContext): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    }
  }
}
