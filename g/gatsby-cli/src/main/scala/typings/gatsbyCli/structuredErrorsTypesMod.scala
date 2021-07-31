package typings.gatsbyCli

import typings.gatsbyCli.anon.Dictkey
import typings.gatsbyCli.anon.End
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structuredErrorsTypesMod {
  
  @js.native
  sealed trait Level extends StObject
  @JSImport("gatsby-cli/lib/structured-errors/types", "Level")
  @js.native
  object Level extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Level & String] = js.native
    
    @js.native
    sealed trait DEBUG
      extends StObject
         with Level
    /* "DEBUG" */ val DEBUG: typings.gatsbyCli.structuredErrorsTypesMod.Level.DEBUG & String = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with Level
    /* "ERROR" */ val ERROR: typings.gatsbyCli.structuredErrorsTypesMod.Level.ERROR & String = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with Level
    /* "INFO" */ val INFO: typings.gatsbyCli.structuredErrorsTypesMod.Level.INFO & String = js.native
    
    @js.native
    sealed trait WARNING
      extends StObject
         with Level
    /* "WARNING" */ val WARNING: typings.gatsbyCli.structuredErrorsTypesMod.Level.WARNING & String = js.native
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSImport("gatsby-cli/lib/structured-errors/types", "Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Type & String] = js.native
    
    @js.native
    sealed trait CONFIG
      extends StObject
         with Type
    /* "CONFIG" */ val CONFIG: typings.gatsbyCli.structuredErrorsTypesMod.Type.CONFIG & String = js.native
    
    @js.native
    sealed trait GRAPHQL
      extends StObject
         with Type
    /* "GRAPHQL" */ val GRAPHQL: typings.gatsbyCli.structuredErrorsTypesMod.Type.GRAPHQL & String = js.native
    
    @js.native
    sealed trait PLUGIN
      extends StObject
         with Type
    /* "PLUGIN" */ val PLUGIN: typings.gatsbyCli.structuredErrorsTypesMod.Type.PLUGIN & String = js.native
    
    @js.native
    sealed trait WEBPACK
      extends StObject
         with Type
    /* "WEBPACK" */ val WEBPACK: typings.gatsbyCli.structuredErrorsTypesMod.Type.WEBPACK & String = js.native
  }
  
  trait IConstructError extends StObject {
    
    var details: Dictkey
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
  
  trait ILocationPosition extends StObject {
    
    var column: Double
    
    var line: Double
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
  
  trait IOptionalGraphQLInfoContext extends StObject {
    
    var codeFrame: js.UndefOr[String] = js.undefined
    
    var filePath: js.UndefOr[String] = js.undefined
    
    var plugin: js.UndefOr[String] = js.undefined
    
    var urlPath: js.UndefOr[String] = js.undefined
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
  
  trait IStructuredError extends StObject {
    
    var category: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCategory * / any */ String
      ] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var docsUrl: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[Error] = js.undefined
    
    var filePath: js.UndefOr[String] = js.undefined
    
    var group: js.UndefOr[String] = js.undefined
    
    var level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Level * / any */ String
    
    var location: js.UndefOr[End] = js.undefined
    
    var stack: js.Array[IStructuredStackFrame]
    
    var text: String
    
    var `type`: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String
      ] = js.undefined
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
  
  trait IStructuredStackFrame extends StObject {
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var fileName: String
    
    var functionName: js.UndefOr[String] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
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
