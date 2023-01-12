package typings.expressFileupload

import org.scalablytyped.runtime.StringDictionary
import typings.busboy.mod.Limits
import typings.express.mod.RequestHandler
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  inline def apply(options: Options): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("express-fileupload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type FileArray = StringDictionary[UploadedFile | js.Array[UploadedFile]]
  
  /**
    * @see {@link https://github.com/richardgirges/express-fileupload#available-options}
    */
  // TODO: we need the `Partial<...>` part here because BusboyConfig properties used to be not optional
  // in @types/busboy@0, users upgrading this type with a lockfile won't receive the update to
  // newer busboy types this package actually requires
  /* Inlined parent std.Partial<busboy.busboy.BusboyConfig> */
  trait Options extends StObject {
    
    /**
      * Returns a HTTP 413 when the file is bigger than the size limit if `true`.
      * Otherwise, it will add a `truncated = true` to the resulting file structure.
      * @default false
      */
    var abortOnLimit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Automatically creates the directory path specified in `.mv(filePathName)`
      * @default false
      */
    var createParentPath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Turn on/off upload process logging. Can be useful for troubleshooting.
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var defCharset: js.UndefOr[String] = js.undefined
    
    var defParamCharset: js.UndefOr[String] = js.undefined
    
    var fileHwm: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    /**
      * User defined limit handler which will be invoked if the file is bigger than configured limits.
      * @default false
      */
    var limitHandler: js.UndefOr[
        Boolean | (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ])
      ] = js.undefined
    
    var limits: js.UndefOr[Limits] = js.undefined
    
    /**
      * By default, `req.body` and `req.files` are flattened like this:
      * `{'name': 'John', 'hobbies[0]': 'Cinema', 'hobbies[1]': 'Bike'}
      *
      * When this option is enabled they are parsed in order to be nested like this:
      * `{'name': 'John', 'hobbies': ['Cinema', 'Bike']}`
      * @default false
      */
    var parseNested: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Preserves filename extension when using `safeFileNames` option.
      * If set to `true`, will default to an extension length of `3`.
      * If set to `number`, this will be the max allowable extension length.
      * If an extension is smaller than the extension length, it remains untouched. If the extension is longer,
      * it is shifted.
      * @default false
      *
      * @example
      * // true
      * app.use(fileUpload({ safeFileNames: true, preserveExtension: true }));
      * // myFileName.ext --> myFileName.ext
      *
      * @example
      * // max extension length 2, extension shifted
      * app.use(fileUpload({ safeFileNames: true, preserveExtension: 2 }));
      * // myFileName.ext --> myFileNamee.xt
      */
    var preserveExtension: js.UndefOr[Boolean | Double] = js.undefined
    
    var preservePath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Response which will be send to client if file size limit exceeded when `abortOnLimit` set to `true`.
      * @default 'File size limit has been reached'
      */
    var responseOnLimit: js.UndefOr[String] = js.undefined
    
    /**
      * Strips characters from the upload's filename.
      * You can use custom regex to determine what to strip.
      * If set to `true`, non-alphanumeric characters _except_ dashes and underscores will be stripped.
      * This option is off by default.
      * @default false
      *
      * @example
      * // strip slashes from file names
      * app.use(fileUpload({ safeFileNames: /\\/g }))
      *
      * @example
      * app.use(fileUpload({ safeFileNames: true }))
      */
    var safeFileNames: js.UndefOr[Boolean | js.RegExp] = js.undefined
    
    /**
      * Path to store temporary files.
      * Used along with the `useTempFiles` option. By default this module uses `'tmp'` folder
      * in the current working directory.
      * You can use trailing slash, but it is not necessary.
      * @default './tmp'
      */
    var tempFileDir: js.UndefOr[String] = js.undefined
    
    /**
      * This defines how long to wait for data before aborting. Set to `0` if you want to turn off timeout checks.
      * @default 60_000
      */
    var uploadTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Applies uri decoding to file names if set `true`.
      * @default false
      */
    var uriDecodeFileNames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default this module uploads files into RAM.
      * Setting this option to `true` turns on using temporary files instead of utilising RAM.
      * This avoids memory overflow issues when uploading large files or in case of uploading
      * lots of files at same time.
      * @default false
      */
    var useTempFiles: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAbortOnLimit(value: Boolean): Self = StObject.set(x, "abortOnLimit", value.asInstanceOf[js.Any])
      
      inline def setAbortOnLimitUndefined: Self = StObject.set(x, "abortOnLimit", js.undefined)
      
      inline def setCreateParentPath(value: Boolean): Self = StObject.set(x, "createParentPath", value.asInstanceOf[js.Any])
      
      inline def setCreateParentPathUndefined: Self = StObject.set(x, "createParentPath", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDefCharset(value: String): Self = StObject.set(x, "defCharset", value.asInstanceOf[js.Any])
      
      inline def setDefCharsetUndefined: Self = StObject.set(x, "defCharset", js.undefined)
      
      inline def setDefParamCharset(value: String): Self = StObject.set(x, "defParamCharset", value.asInstanceOf[js.Any])
      
      inline def setDefParamCharsetUndefined: Self = StObject.set(x, "defParamCharset", js.undefined)
      
      inline def setFileHwm(value: Double): Self = StObject.set(x, "fileHwm", value.asInstanceOf[js.Any])
      
      inline def setFileHwmUndefined: Self = StObject.set(x, "fileHwm", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setLimitHandler(
        value: Boolean | (RequestHandler[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ])
      ): Self = StObject.set(x, "limitHandler", value.asInstanceOf[js.Any])
      
      inline def setLimitHandlerUndefined: Self = StObject.set(x, "limitHandler", js.undefined)
      
      inline def setLimits(value: Limits): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
      
      inline def setParseNested(value: Boolean): Self = StObject.set(x, "parseNested", value.asInstanceOf[js.Any])
      
      inline def setParseNestedUndefined: Self = StObject.set(x, "parseNested", js.undefined)
      
      inline def setPreserveExtension(value: Boolean | Double): Self = StObject.set(x, "preserveExtension", value.asInstanceOf[js.Any])
      
      inline def setPreserveExtensionUndefined: Self = StObject.set(x, "preserveExtension", js.undefined)
      
      inline def setPreservePath(value: Boolean): Self = StObject.set(x, "preservePath", value.asInstanceOf[js.Any])
      
      inline def setPreservePathUndefined: Self = StObject.set(x, "preservePath", js.undefined)
      
      inline def setResponseOnLimit(value: String): Self = StObject.set(x, "responseOnLimit", value.asInstanceOf[js.Any])
      
      inline def setResponseOnLimitUndefined: Self = StObject.set(x, "responseOnLimit", js.undefined)
      
      inline def setSafeFileNames(value: Boolean | js.RegExp): Self = StObject.set(x, "safeFileNames", value.asInstanceOf[js.Any])
      
      inline def setSafeFileNamesUndefined: Self = StObject.set(x, "safeFileNames", js.undefined)
      
      inline def setTempFileDir(value: String): Self = StObject.set(x, "tempFileDir", value.asInstanceOf[js.Any])
      
      inline def setTempFileDirUndefined: Self = StObject.set(x, "tempFileDir", js.undefined)
      
      inline def setUploadTimeout(value: Double): Self = StObject.set(x, "uploadTimeout", value.asInstanceOf[js.Any])
      
      inline def setUploadTimeoutUndefined: Self = StObject.set(x, "uploadTimeout", js.undefined)
      
      inline def setUriDecodeFileNames(value: Boolean): Self = StObject.set(x, "uriDecodeFileNames", value.asInstanceOf[js.Any])
      
      inline def setUriDecodeFileNamesUndefined: Self = StObject.set(x, "uriDecodeFileNames", js.undefined)
      
      inline def setUseTempFiles(value: Boolean): Self = StObject.set(x, "useTempFiles", value.asInstanceOf[js.Any])
      
      inline def setUseTempFilesUndefined: Self = StObject.set(x, "useTempFiles", js.undefined)
    }
  }
  
  @js.native
  trait UploadedFile extends StObject {
    
    /** A buffer representation of your file, returns empty buffer in case useTempFiles option was set to true. */
    var data: Buffer = js.native
    
    /** Encoding type of the file */
    var encoding: String = js.native
    
    /** MD5 checksum of the uploaded file */
    var md5: String = js.native
    
    /** The mimetype of your file */
    var mimetype: String = js.native
    
    def mv(path: String): js.Promise[Unit] = js.native
    /** A function to move the file elsewhere on your server */
    def mv(path: String, callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
    
    /** file name */
    var name: String = js.native
    
    /** Uploaded size in bytes */
    var size: Double = js.native
    
    /** A path to the temporary file in case useTempFiles option was set to true. */
    var tempFilePath: String = js.native
    
    /** A boolean that represents if the file is over the size limit */
    var truncated: Boolean = js.native
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        var files: js.UndefOr[FileArray | Null] = js.undefined
      }
      object Request {
        
        inline def apply(): Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Request]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
          
          inline def setFiles(value: FileArray): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
          
          inline def setFilesNull: Self = StObject.set(x, "files", null)
          
          inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
        }
      }
    }
  }
}
