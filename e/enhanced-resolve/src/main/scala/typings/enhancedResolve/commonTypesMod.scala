package typings.enhancedResolve

import typings.enhancedResolve.anon.Encoding
import typings.enhancedResolve.anon.Flag
import typings.enhancedResolve.anon.Push
import typings.enhancedResolve.descriptionFileUtilsMod.DescriptionFileData
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.Stats
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTypesMod {
  
  @js.native
  trait AbstractInputFileSystem extends StObject {
    
    var purge: js.UndefOr[js.Function1[/* what */ js.UndefOr[String | js.Array[String]], Unit]] = js.native
    
    def readFile(filename: String, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
    def readFile(
      filename: String,
      encoding: String,
      callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
    ): Unit = js.native
    def readFile(
      filename: String,
      options: Encoding,
      callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
    ): Unit = js.native
    def readFile(
      filename: String,
      options: Flag,
      callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
    ): Unit = js.native
    
    var readFileSync: js.UndefOr[js.Function1[/* filename */ String, Buffer]] = js.native
    
    var readJson: js.UndefOr[
        js.Function2[
          /* path */ String, 
          /* callback */ js.Function2[/* err */ ErrnoException, /* data */ js.Any, Unit], 
          Unit
        ]
      ] = js.native
    
    var readJsonSync: js.UndefOr[js.Function1[/* path */ String, js.Any]] = js.native
    
    def readdir(path: String, callback: js.Function2[/* err */ ErrnoException, /* files */ js.Array[String], Unit]): Unit = js.native
    
    var readdirSync: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.native
    
    def readlink(path: String, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, Unit]): Unit = js.native
    
    var readlinkSync: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
    
    def stat(path: String, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, Unit]): Unit = js.native
    
    var statSync: js.UndefOr[js.Function1[/* path */ String, Stats]] = js.native
  }
  
  type CommonFileSystemMethod = js.Function2[
    /* name */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* repeated */ js.Any, Unit], 
    Unit
  ]
  
  type ErrorCallback[T] = js.Function2[/* err */ T | Null, /* repeated */ js.Any, js.Any]
  
  trait LoggingCallbackTools extends StObject {
    
    var log: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    var missing: js.UndefOr[js.Array[String] | Push] = js.undefined
    
    var stack: js.UndefOr[js.Array[String]] = js.undefined
  }
  object LoggingCallbackTools {
    
    @scala.inline
    def apply(): LoggingCallbackTools = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggingCallbackTools]
    }
    
    @scala.inline
    implicit class LoggingCallbackToolsMutableBuilder[Self <: LoggingCallbackTools] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLog(value: /* msg */ String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMissing(value: js.Array[String] | Push): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      
      @scala.inline
      def setMissingVarargs(value: String*): Self = StObject.set(x, "missing", js.Array(value :_*))
      
      @scala.inline
      def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LoggingCallbackWrapper
    extends StObject
       with LoggingCallbackTools {
    
    def apply(err: Null, args: js.Any*): js.Any = js.native
    def apply(err: Unit, args: js.Any*): js.Any = js.native
    def apply(err: Error, args: js.Any*): js.Any = js.native
  }
  
  trait ResolveContext extends StObject {
    
    var issuer: js.UndefOr[String] = js.undefined
  }
  object ResolveContext {
    
    @scala.inline
    def apply(): ResolveContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveContext]
    }
    
    @scala.inline
    implicit class ResolveContextMutableBuilder[Self <: ResolveContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    }
  }
  
  trait ResolveError
    extends StObject
       with Error {
    
    var details: String
    
    var missing: js.Array[String]
    
    var recursion: Boolean
  }
  object ResolveError {
    
    @scala.inline
    def apply(details: String, message: String, missing: js.Array[String], name: String, recursion: Boolean): ResolveError = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recursion = recursion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveError]
    }
    
    @scala.inline
    implicit class ResolveErrorMutableBuilder[Self <: ResolveError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissing(value: js.Array[String]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingVarargs(value: String*): Self = StObject.set(x, "missing", js.Array(value :_*))
      
      @scala.inline
      def setRecursion(value: Boolean): Self = StObject.set(x, "recursion", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolveParseResult extends StObject {
    
    var directory: Boolean
    
    var file: Boolean
    
    var module: Boolean
    
    var query: String
    
    var request: String
  }
  object ResolveParseResult {
    
    @scala.inline
    def apply(directory: Boolean, file: Boolean, module: Boolean, query: String, request: String): ResolveParseResult = {
      val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveParseResult]
    }
    
    @scala.inline
    implicit class ResolveParseResultMutableBuilder[Self <: ResolveParseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolverRequest extends StObject {
    
    var __innerRequest: js.UndefOr[String] = js.undefined
    
    var __innerRequest_relativePath: js.UndefOr[String] = js.undefined
    
    var __innerRequest_request: js.UndefOr[String] = js.undefined
    
    var context: ResolveContext
    
    var descriptionFileData: js.UndefOr[DescriptionFileData] = js.undefined
    
    var descriptionFilePath: js.UndefOr[String] = js.undefined
    
    var descriptionFileRoot: js.UndefOr[String] = js.undefined
    
    var directory: js.UndefOr[Boolean] = js.undefined
    
    var module: js.UndefOr[Boolean] = js.undefined
    
    var path: String
    
    var query: js.UndefOr[String] = js.undefined
    
    var relativePath: js.UndefOr[String] = js.undefined
    
    var request: String
  }
  object ResolverRequest {
    
    @scala.inline
    def apply(context: ResolveContext, path: String, request: String): ResolverRequest = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverRequest]
    }
    
    @scala.inline
    implicit class ResolverRequestMutableBuilder[Self <: ResolverRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: ResolveContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFileData(value: DescriptionFileData): Self = StObject.set(x, "descriptionFileData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFileDataUndefined: Self = StObject.set(x, "descriptionFileData", js.undefined)
      
      @scala.inline
      def setDescriptionFilePath(value: String): Self = StObject.set(x, "descriptionFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFilePathUndefined: Self = StObject.set(x, "descriptionFilePath", js.undefined)
      
      @scala.inline
      def setDescriptionFileRoot(value: String): Self = StObject.set(x, "descriptionFileRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFileRootUndefined: Self = StObject.set(x, "descriptionFileRoot", js.undefined)
      
      @scala.inline
      def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setModule(value: Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
      
      @scala.inline
      def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__innerRequest(value: String): Self = StObject.set(x, "__innerRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__innerRequestUndefined: Self = StObject.set(x, "__innerRequest", js.undefined)
      
      @scala.inline
      def set__innerRequest_relativePath(value: String): Self = StObject.set(x, "__innerRequest_relativePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__innerRequest_relativePathUndefined: Self = StObject.set(x, "__innerRequest_relativePath", js.undefined)
      
      @scala.inline
      def set__innerRequest_request(value: String): Self = StObject.set(x, "__innerRequest_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__innerRequest_requestUndefined: Self = StObject.set(x, "__innerRequest_request", js.undefined)
    }
  }
}
