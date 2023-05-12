package typings.glimmerInterfaces

import typings.glimmerInterfaces.anon.End
import typings.glimmerInterfaces.distTypesLibCompileEncoderMod.EncoderError
import typings.glimmerInterfaces.distTypesLibCompileOperandsMod.Operand
import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.SerializedInlineBlock
import typings.glimmerInterfaces.distTypesLibCompileWireFormatMod.SerializedTemplateBlock
import typings.glimmerInterfaces.distTypesLibCoreMod.Option
import typings.glimmerInterfaces.distTypesLibManagersInternalComponentMod.InternalComponentCapabilities
import typings.glimmerInterfaces.distTypesLibProgramMod.CompileTimeCompilationContext
import typings.glimmerInterfaces.distTypesLibProgramMod.ConstantPool
import typings.glimmerInterfaces.distTypesLibProgramMod.SerializedHeap
import typings.glimmerInterfaces.distTypesLibRuntimeOwnerMod.Owner
import typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.BlockSymbolTable
import typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.ProgramSymbolTable
import typings.glimmerInterfaces.distTypesLibTier1SymbolTableMod.SymbolTable
import typings.glimmerInterfaces.glimmerInterfacesStrings.error
import typings.glimmerInterfaces.glimmerInterfacesStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibTemplateMod {
  
  trait BlockWithContext extends StObject {
    
    val block: SerializedInlineBlock
    
    val containingLayout: LayoutWithContext
  }
  object BlockWithContext {
    
    inline def apply(block: SerializedInlineBlock, containingLayout: LayoutWithContext): BlockWithContext = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], containingLayout = containingLayout.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockWithContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockWithContext] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: SerializedInlineBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setContainingLayout(value: LayoutWithContext): Self = StObject.set(x, "containingLayout", value.asInstanceOf[js.Any])
    }
  }
  
  type CompilableBlock = CompilableTemplate[BlockSymbolTable]
  
  trait CompilableProgram
    extends StObject
       with CompilableTemplate[ProgramSymbolTable] {
    
    var moduleName: String
  }
  object CompilableProgram {
    
    inline def apply(
      compile: CompileTimeCompilationContext => HandleResult,
      moduleName: String,
      symbolTable: ProgramSymbolTable
    ): CompilableProgram = {
      val __obj = js.Dynamic.literal(compile = js.Any.fromFunction1(compile), moduleName = moduleName.asInstanceOf[js.Any], symbolTable = symbolTable.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilableProgram]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompilableProgram] (val x: Self) extends AnyVal {
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompilableTemplate[S /* <: SymbolTable */] extends StObject {
    
    def compile(context: CompileTimeCompilationContext): HandleResult
    
    var symbolTable: S
  }
  object CompilableTemplate {
    
    inline def apply[S /* <: SymbolTable */](compile: CompileTimeCompilationContext => HandleResult, symbolTable: S): CompilableTemplate[S] = {
      val __obj = js.Dynamic.literal(compile = js.Any.fromFunction1(compile), symbolTable = symbolTable.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilableTemplate[S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompilableTemplate[?], S /* <: SymbolTable */] (val x: Self & CompilableTemplate[S]) extends AnyVal {
      
      inline def setCompile(value: CompileTimeCompilationContext => HandleResult): Self = StObject.set(x, "compile", js.Any.fromFunction1(value))
      
      inline def setSymbolTable(value: S): Self = StObject.set(x, "symbolTable", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompilerArtifacts extends StObject {
    
    var constants: ConstantPool
    
    var heap: SerializedHeap
  }
  object CompilerArtifacts {
    
    inline def apply(constants: ConstantPool, heap: SerializedHeap): CompilerArtifacts = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], heap = heap.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilerArtifacts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompilerArtifacts] (val x: Self) extends AnyVal {
      
      inline def setConstants(value: ConstantPool): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setConstantsVarargs(value: Any*): Self = StObject.set(x, "constants", js.Array(value*))
      
      inline def setHeap(value: SerializedHeap): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
    }
  }
  
  type CompilerBuffer = js.Array[Operand]
  
  trait ContainingMetadata extends StObject {
    
    var evalSymbols: Option[js.Array[String]]
    
    var isStrictMode: Boolean
    
    var moduleName: String
    
    var owner: Owner | Null
    
    var scopeValues: js.Array[Any] | Null
    
    var size: Double
    
    var upvars: Option[js.Array[String]]
  }
  object ContainingMetadata {
    
    inline def apply(isStrictMode: Boolean, moduleName: String, size: Double): ContainingMetadata = {
      val __obj = js.Dynamic.literal(isStrictMode = isStrictMode.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], evalSymbols = null, owner = null, scopeValues = null, upvars = null)
      __obj.asInstanceOf[ContainingMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainingMetadata] (val x: Self) extends AnyVal {
      
      inline def setEvalSymbols(value: Option[js.Array[String]]): Self = StObject.set(x, "evalSymbols", value.asInstanceOf[js.Any])
      
      inline def setEvalSymbolsNull: Self = StObject.set(x, "evalSymbols", null)
      
      inline def setEvalSymbolsVarargs(value: String*): Self = StObject.set(x, "evalSymbols", js.Array(value*))
      
      inline def setIsStrictMode(value: Boolean): Self = StObject.set(x, "isStrictMode", value.asInstanceOf[js.Any])
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerNull: Self = StObject.set(x, "owner", null)
      
      inline def setScopeValues(value: js.Array[Any]): Self = StObject.set(x, "scopeValues", value.asInstanceOf[js.Any])
      
      inline def setScopeValuesNull: Self = StObject.set(x, "scopeValues", null)
      
      inline def setScopeValuesVarargs(value: Any*): Self = StObject.set(x, "scopeValues", js.Array(value*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUpvars(value: Option[js.Array[String]]): Self = StObject.set(x, "upvars", value.asInstanceOf[js.Any])
      
      inline def setUpvarsNull: Self = StObject.set(x, "upvars", null)
      
      inline def setUpvarsVarargs(value: String*): Self = StObject.set(x, "upvars", js.Array(value*))
    }
  }
  
  trait ErrHandle extends StObject {
    
    var errors: js.Array[EncoderError]
    
    var handle: Double
  }
  object ErrHandle {
    
    inline def apply(errors: js.Array[EncoderError], handle: Double): ErrHandle = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrHandle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrHandle] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[EncoderError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: EncoderError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    }
  }
  
  type HandleResult = OkHandle | ErrHandle
  
  trait LayoutWithContext extends StObject {
    
    val block: SerializedTemplateBlock
    
    val id: String
    
    val isStrictMode: Boolean
    
    val moduleName: String
    
    val owner: Owner | Null
    
    val scope: js.UndefOr[js.Function0[js.Array[Any]] | Null] = js.undefined
  }
  object LayoutWithContext {
    
    inline def apply(block: SerializedTemplateBlock, id: String, isStrictMode: Boolean, moduleName: String): LayoutWithContext = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isStrictMode = isStrictMode.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], owner = null)
      __obj.asInstanceOf[LayoutWithContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayoutWithContext] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: SerializedTemplateBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsStrictMode(value: Boolean): Self = StObject.set(x, "isStrictMode", value.asInstanceOf[js.Any])
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerNull: Self = StObject.set(x, "owner", null)
      
      inline def setScope(value: () => js.Array[Any]): Self = StObject.set(x, "scope", js.Any.fromFunction0(value))
      
      inline def setScopeNull: Self = StObject.set(x, "scope", null)
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait NamedBlocks extends StObject {
    
    def get(name: String): Option[SerializedInlineBlock]
    
    def has(name: String): Boolean
    
    var hasAny: Boolean
    
    var names: js.Array[String]
    
    def `with`(name: String, block: Option[SerializedInlineBlock]): NamedBlocks
  }
  object NamedBlocks {
    
    inline def apply(
      get: String => Option[SerializedInlineBlock],
      has: String => Boolean,
      hasAny: Boolean,
      names: js.Array[String],
      `with`: (String, Option[SerializedInlineBlock]) => NamedBlocks
    ): NamedBlocks = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), hasAny = hasAny.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.updateDynamic("with")(js.Any.fromFunction2(`with`))
      __obj.asInstanceOf[NamedBlocks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NamedBlocks] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String => Option[SerializedInlineBlock]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setHasAny(value: Boolean): Self = StObject.set(x, "hasAny", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setWith(value: (String, Option[SerializedInlineBlock]) => NamedBlocks): Self = StObject.set(x, "with", js.Any.fromFunction2(value))
    }
  }
  
  type OkHandle = Double
  
  trait ResolvedLayout extends StObject {
    
    var capabilities: InternalComponentCapabilities
    
    var compilable: Option[CompilableProgram]
    
    var handle: Double
  }
  object ResolvedLayout {
    
    inline def apply(capabilities: InternalComponentCapabilities, handle: Double): ResolvedLayout = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], compilable = null)
      __obj.asInstanceOf[ResolvedLayout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolvedLayout] (val x: Self) extends AnyVal {
      
      inline def setCapabilities(value: InternalComponentCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCompilable(value: Option[CompilableProgram]): Self = StObject.set(x, "compilable", value.asInstanceOf[js.Any])
      
      inline def setCompilableNull: Self = StObject.set(x, "compilable", null)
      
      inline def setHandle(value: Double): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    }
  }
  
  trait STDLib extends StObject {
    
    var `cautious-append`: Double
    
    var `cautious-non-dynamic-append`: Double
    
    var main: Double
    
    var `trusting-append`: Double
    
    var `trusting-non-dynamic-append`: Double
  }
  object STDLib {
    
    inline def apply(
      `cautious-append`: Double,
      `cautious-non-dynamic-append`: Double,
      main: Double,
      `trusting-append`: Double,
      `trusting-non-dynamic-append`: Double
    ): STDLib = {
      val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
      __obj.updateDynamic("cautious-append")(`cautious-append`.asInstanceOf[js.Any])
      __obj.updateDynamic("cautious-non-dynamic-append")(`cautious-non-dynamic-append`.asInstanceOf[js.Any])
      __obj.updateDynamic("trusting-append")(`trusting-append`.asInstanceOf[js.Any])
      __obj.updateDynamic("trusting-non-dynamic-append")(`trusting-non-dynamic-append`.asInstanceOf[js.Any])
      __obj.asInstanceOf[STDLib]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: STDLib] (val x: Self) extends AnyVal {
      
      inline def `setCautious-append`(value: Double): Self = StObject.set(x, "cautious-append", value.asInstanceOf[js.Any])
      
      inline def `setCautious-non-dynamic-append`(value: Double): Self = StObject.set(x, "cautious-non-dynamic-append", value.asInstanceOf[js.Any])
      
      inline def setMain(value: Double): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def `setTrusting-append`(value: Double): Self = StObject.set(x, "trusting-append", value.asInstanceOf[js.Any])
      
      inline def `setTrusting-non-dynamic-append`(value: Double): Self = StObject.set(x, "trusting-non-dynamic-append", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.glimmerInterfacesStrings.main
    - typings.glimmerInterfaces.glimmerInterfacesStrings.`cautious-append`
    - typings.glimmerInterfaces.glimmerInterfacesStrings.`trusting-append`
    - typings.glimmerInterfaces.glimmerInterfacesStrings.`cautious-non-dynamic-append`
    - typings.glimmerInterfaces.glimmerInterfacesStrings.`trusting-non-dynamic-append`
  */
  trait STDLibName extends StObject
  
  type SerializedStdlib = js.Tuple3[Double, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerInterfaces.distTypesLibTemplateMod.TemplateOk
    - typings.glimmerInterfaces.distTypesLibTemplateMod.TemplateError
  */
  trait Template extends StObject
  object Template {
    
    inline def TemplateError(problem: String, span: End): typings.glimmerInterfaces.distTypesLibTemplateMod.TemplateError = {
      val __obj = js.Dynamic.literal(problem = problem.asInstanceOf[js.Any], result = "error", span = span.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.glimmerInterfaces.distTypesLibTemplateMod.TemplateError]
    }
    
    inline def TemplateOk(asLayout: () => CompilableProgram, asWrappedLayout: () => CompilableProgram, moduleName: String): typings.glimmerInterfaces.distTypesLibTemplateMod.TemplateOk = {
      val __obj = js.Dynamic.literal(asLayout = js.Any.fromFunction0(asLayout), asWrappedLayout = js.Any.fromFunction0(asWrappedLayout), moduleName = moduleName.asInstanceOf[js.Any], result = "ok")
      __obj.asInstanceOf[typings.glimmerInterfaces.distTypesLibTemplateMod.TemplateOk]
    }
  }
  
  trait TemplateError
    extends StObject
       with Template {
    
    var problem: String
    
    var result: error
    
    var span: End
  }
  object TemplateError {
    
    inline def apply(problem: String, span: End): TemplateError = {
      val __obj = js.Dynamic.literal(problem = problem.asInstanceOf[js.Any], result = "error", span = span.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateError] (val x: Self) extends AnyVal {
      
      inline def setProblem(value: String): Self = StObject.set(x, "problem", value.asInstanceOf[js.Any])
      
      inline def setResult(value: error): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: End): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    }
  }
  
  type TemplateFactory = js.Function1[/* owner */ js.UndefOr[Owner], Template]
  
  trait TemplateOk
    extends StObject
       with Template {
    
    // internal casts, these are lazily created and cached
    def asLayout(): CompilableProgram
    
    def asWrappedLayout(): CompilableProgram
    
    /**
      * Module name associated with the template, used for debugging purposes
      */
    var moduleName: String
    
    var result: ok
  }
  object TemplateOk {
    
    inline def apply(asLayout: () => CompilableProgram, asWrappedLayout: () => CompilableProgram, moduleName: String): TemplateOk = {
      val __obj = js.Dynamic.literal(asLayout = js.Any.fromFunction0(asLayout), asWrappedLayout = js.Any.fromFunction0(asWrappedLayout), moduleName = moduleName.asInstanceOf[js.Any], result = "ok")
      __obj.asInstanceOf[TemplateOk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateOk] (val x: Self) extends AnyVal {
      
      inline def setAsLayout(value: () => CompilableProgram): Self = StObject.set(x, "asLayout", js.Any.fromFunction0(value))
      
      inline def setAsWrappedLayout(value: () => CompilableProgram): Self = StObject.set(x, "asWrappedLayout", js.Any.fromFunction0(value))
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setResult(value: ok): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
