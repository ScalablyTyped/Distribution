package typings.gatsbyCli

import typings.gatsbyCli.anon.Dictkey
import typings.gatsbyCli.anon.End
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structuredErrorsTypesMod {
  
  @js.native
  sealed trait Level extends StObject
  @JSImport("gatsby-cli/lib/structured-errors/types", "Level")
  @js.native
  object Level extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Level with String] = js.native
    
    @js.native
    sealed trait DEBUG extends Level
    /* "DEBUG" */ val DEBUG: typings.gatsbyCli.structuredErrorsTypesMod.Level.DEBUG with String = js.native
    
    @js.native
    sealed trait ERROR extends Level
    /* "ERROR" */ val ERROR: typings.gatsbyCli.structuredErrorsTypesMod.Level.ERROR with String = js.native
    
    @js.native
    sealed trait INFO extends Level
    /* "INFO" */ val INFO: typings.gatsbyCli.structuredErrorsTypesMod.Level.INFO with String = js.native
    
    @js.native
    sealed trait WARNING extends Level
    /* "WARNING" */ val WARNING: typings.gatsbyCli.structuredErrorsTypesMod.Level.WARNING with String = js.native
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSImport("gatsby-cli/lib/structured-errors/types", "Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Type with String] = js.native
    
    @js.native
    sealed trait CONFIG extends Type
    /* "CONFIG" */ val CONFIG: typings.gatsbyCli.structuredErrorsTypesMod.Type.CONFIG with String = js.native
    
    @js.native
    sealed trait GRAPHQL extends Type
    /* "GRAPHQL" */ val GRAPHQL: typings.gatsbyCli.structuredErrorsTypesMod.Type.GRAPHQL with String = js.native
    
    @js.native
    sealed trait PLUGIN extends Type
    /* "PLUGIN" */ val PLUGIN: typings.gatsbyCli.structuredErrorsTypesMod.Type.PLUGIN with String = js.native
    
    @js.native
    sealed trait WEBPACK extends Type
    /* "WEBPACK" */ val WEBPACK: typings.gatsbyCli.structuredErrorsTypesMod.Type.WEBPACK with String = js.native
  }
  
  @js.native
  trait IConstructError extends StObject {
    
    var details: Dictkey = js.native
  }
  object IConstructError {
    
    @scala.inline
    def apply(details: Dictkey): IConstructError = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConstructError]
    }
    
    @scala.inline
    implicit class IConstructErrorMutableBuilder[Self <: IConstructError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: Dictkey): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILocationPosition extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
  }
  object ILocationPosition {
    
    @scala.inline
    def apply(column: Double, line: Double): ILocationPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILocationPosition]
    }
    
    @scala.inline
    implicit class ILocationPositionMutableBuilder[Self <: ILocationPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOptionalGraphQLInfoContext extends StObject {
    
    var codeFrame: js.UndefOr[String] = js.native
    
    var filePath: js.UndefOr[String] = js.native
    
    var plugin: js.UndefOr[String] = js.native
    
    var urlPath: js.UndefOr[String] = js.native
  }
  object IOptionalGraphQLInfoContext {
    
    @scala.inline
    def apply(): IOptionalGraphQLInfoContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptionalGraphQLInfoContext]
    }
    
    @scala.inline
    implicit class IOptionalGraphQLInfoContextMutableBuilder[Self <: IOptionalGraphQLInfoContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeFrame(value: String): Self = StObject.set(x, "codeFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeFrameUndefined: Self = StObject.set(x, "codeFrame", js.undefined)
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      @scala.inline
      def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      @scala.inline
      def setUrlPath(value: String): Self = StObject.set(x, "urlPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPathUndefined: Self = StObject.set(x, "urlPath", js.undefined)
    }
  }
  
  @js.native
  trait IStructuredError extends StObject {
    
    var category: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCategory * / any */ String
      ] = js.native
    
    var code: js.UndefOr[String] = js.native
    
    var docsUrl: js.UndefOr[String] = js.native
    
    var error: js.UndefOr[Error] = js.native
    
    var filePath: js.UndefOr[String] = js.native
    
    var group: js.UndefOr[String] = js.native
    
    var level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Level * / any */ String = js.native
    
    var location: js.UndefOr[End] = js.native
    
    var stack: js.Array[IStructuredStackFrame] = js.native
    
    var text: String = js.native
    
    var `type`: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String
      ] = js.native
  }
  object IStructuredError {
    
    @scala.inline
    def apply(
      level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Level * / any */ String,
      stack: js.Array[IStructuredStackFrame],
      text: String
    ): IStructuredError = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStructuredError]
    }
    
    @scala.inline
    implicit class IStructuredErrorMutableBuilder[Self <: IStructuredError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCategory * / any */ String
      ): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocsUrlUndefined: Self = StObject.set(x, "docsUrl", js.undefined)
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setLevel(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Level * / any */ String
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: End): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setStack(value: js.Array[IStructuredStackFrame]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackVarargs(value: IStructuredStackFrame*): Self = StObject.set(x, "stack", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait IStructuredStackFrame extends StObject {
    
    var columnNumber: js.UndefOr[Double] = js.native
    
    var fileName: String = js.native
    
    var functionName: js.UndefOr[String] = js.native
    
    var lineNumber: js.UndefOr[Double] = js.native
  }
  object IStructuredStackFrame {
    
    @scala.inline
    def apply(fileName: String): IStructuredStackFrame = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStructuredStackFrame]
    }
    
    @scala.inline
    implicit class IStructuredStackFrameMutableBuilder[Self <: IStructuredStackFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    }
  }
}
