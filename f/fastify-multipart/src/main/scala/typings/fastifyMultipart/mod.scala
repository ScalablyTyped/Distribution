package typings.fastifyMultipart

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.busboy.busboy.Busboy
import typings.busboy.busboy.BusboyConfig
import typings.fastify.pluginMod.FastifyPlugin
import typings.fastifyError.mod.FastifyError
import typings.fastifyMultipart.anon.FieldNameSize
import typings.fastifyMultipart.fastifyMultipartBooleans.`false`
import typings.fastifyMultipart.fastifyMultipartBooleans.`true`
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Readable
import typings.std.AsyncIterableIterator
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fastify-multipart", JSImport.Default)
  @js.native
  val default: FastifyPlugin[FastifyMultipartOptions] = js.native
  
  trait BodyEntry extends StObject {
    
    var data: Buffer
    
    var encoding: String
    
    var filename: String
    
    var limit: `false`
    
    var mimetype: String
  }
  object BodyEntry {
    
    @scala.inline
    def apply(data: Buffer, encoding: String, filename: String, mimetype: String): BodyEntry = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], limit = false, mimetype = mimetype.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyEntry]
    }
    
    @scala.inline
    implicit class BodyEntryMutableBuilder[Self <: BodyEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimit(value: `false`): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
    }
  }
  
  trait FastifyMultipartOptions extends StObject {
    
    /**
      * Append the multipart parameters to the body object
      */
    var addToBody: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only valid in the promise api. Append the multipart parameters to the body object.
      */
    var attachFieldsToBody: js.UndefOr[Boolean] = js.undefined
    
    var limits: js.UndefOr[FieldNameSize] = js.undefined
    
    /**
      * Manage the file stream like you need
      */
    var onFile: js.UndefOr[
        js.Function6[
          /* fieldName */ String, 
          /* stream */ Readable, 
          /* filename */ String, 
          /* encoding */ String, 
          /* mimetype */ String, 
          /* body */ Record[String, BodyEntry], 
          Unit | js.Promise[Unit]
        ]
      ] = js.undefined
    
    /**
      * Add a shared schema to validate the input fields
      */
    var sharedSchemaId: js.UndefOr[String] = js.undefined
  }
  object FastifyMultipartOptions {
    
    @scala.inline
    def apply(): FastifyMultipartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyMultipartOptions]
    }
    
    @scala.inline
    implicit class FastifyMultipartOptionsMutableBuilder[Self <: FastifyMultipartOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddToBody(value: Boolean): Self = StObject.set(x, "addToBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddToBodyUndefined: Self = StObject.set(x, "addToBody", js.undefined)
      
      @scala.inline
      def setAttachFieldsToBody(value: Boolean): Self = StObject.set(x, "attachFieldsToBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachFieldsToBodyUndefined: Self = StObject.set(x, "attachFieldsToBody", js.undefined)
      
      @scala.inline
      def setLimits(value: FieldNameSize): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
      
      @scala.inline
      def setOnFile(
        value: (/* fieldName */ String, /* stream */ Readable, /* filename */ String, /* encoding */ String, /* mimetype */ String, /* body */ Record[String, BodyEntry]) => Unit | js.Promise[Unit]
      ): Self = StObject.set(x, "onFile", js.Any.fromFunction6(value))
      
      @scala.inline
      def setOnFileUndefined: Self = StObject.set(x, "onFile", js.undefined)
      
      @scala.inline
      def setSharedSchemaId(value: String): Self = StObject.set(x, "sharedSchemaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedSchemaIdUndefined: Self = StObject.set(x, "sharedSchemaId", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastifyMultipart.mod.MultipartValue[T]
    - typings.fastifyMultipart.mod.MultipartFile
  */
  trait Multipart[T] extends StObject
  object Multipart {
    
    @scala.inline
    def MultipartFile(
      encoding: String,
      fieldname: String,
      fields: MultipartFields,
      file: ReadableStream,
      filename: String,
      filepath: String,
      mimetype: String,
      toBuffer: () => js.Promise[Buffer]
    ): typings.fastifyMultipart.mod.MultipartFile = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], toBuffer = js.Any.fromFunction0(toBuffer))
      __obj.asInstanceOf[typings.fastifyMultipart.mod.MultipartFile]
    }
    
    @scala.inline
    def MultipartValue[T](value: T): typings.fastifyMultipart.mod.MultipartValue[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastifyMultipart.mod.MultipartValue[T]]
    }
  }
  
  trait MultipartErrors extends StObject {
    
    var FieldsLimitError: FastifyError
    
    var FilesLimitError: FastifyError
    
    var InvalidMultipartContentTypeError: FastifyError
    
    var PartsLimitError: FastifyError
    
    var PrototypeViolationError: FastifyError
    
    var RequestFileTooLargeError: FastifyError
  }
  object MultipartErrors {
    
    @scala.inline
    def apply(
      FieldsLimitError: FastifyError,
      FilesLimitError: FastifyError,
      InvalidMultipartContentTypeError: FastifyError,
      PartsLimitError: FastifyError,
      PrototypeViolationError: FastifyError,
      RequestFileTooLargeError: FastifyError
    ): MultipartErrors = {
      val __obj = js.Dynamic.literal(FieldsLimitError = FieldsLimitError.asInstanceOf[js.Any], FilesLimitError = FilesLimitError.asInstanceOf[js.Any], InvalidMultipartContentTypeError = InvalidMultipartContentTypeError.asInstanceOf[js.Any], PartsLimitError = PartsLimitError.asInstanceOf[js.Any], PrototypeViolationError = PrototypeViolationError.asInstanceOf[js.Any], RequestFileTooLargeError = RequestFileTooLargeError.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipartErrors]
    }
    
    @scala.inline
    implicit class MultipartErrorsMutableBuilder[Self <: MultipartErrors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldsLimitError(value: FastifyError): Self = StObject.set(x, "FieldsLimitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesLimitError(value: FastifyError): Self = StObject.set(x, "FilesLimitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidMultipartContentTypeError(value: FastifyError): Self = StObject.set(x, "InvalidMultipartContentTypeError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsLimitError(value: FastifyError): Self = StObject.set(x, "PartsLimitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrototypeViolationError(value: FastifyError): Self = StObject.set(x, "PrototypeViolationError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestFileTooLargeError(value: FastifyError): Self = StObject.set(x, "RequestFileTooLargeError", value.asInstanceOf[js.Any])
    }
  }
  
  type MultipartFields = StringDictionary[Multipart[`true`] | js.Array[Multipart[`true`]]]
  
  trait MultipartFile
    extends StObject
       with Multipart[js.Any] {
    
    var encoding: String
    
    var fieldname: String
    
    var fields: MultipartFields
    
    var file: ReadableStream
    
    var filename: String
    
    var filepath: String
    
    var mimetype: String
    
    def toBuffer(): js.Promise[Buffer]
  }
  object MultipartFile {
    
    @scala.inline
    def apply(
      encoding: String,
      fieldname: String,
      fields: MultipartFields,
      file: ReadableStream,
      filename: String,
      filepath: String,
      mimetype: String,
      toBuffer: () => js.Promise[Buffer]
    ): MultipartFile = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], toBuffer = js.Any.fromFunction0(toBuffer))
      __obj.asInstanceOf[MultipartFile]
    }
    
    @scala.inline
    implicit class MultipartFileMutableBuilder[Self <: MultipartFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldname(value: String): Self = StObject.set(x, "fieldname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: MultipartFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: ReadableStream): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToBuffer(value: () => js.Promise[Buffer]): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
    }
  }
  
  type MultipartHandler = js.Function5[
    /* field */ String, 
    /* file */ js.Any, 
    /* filename */ String, 
    /* encoding */ String, 
    /* mimetype */ String, 
    Unit
  ]
  
  trait MultipartValue[T]
    extends StObject
       with Multipart[T] {
    
    var value: T
  }
  object MultipartValue {
    
    @scala.inline
    def apply[T](value: T): MultipartValue[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipartValue[T]]
    }
    
    @scala.inline
    implicit class MultipartValueMutableBuilder[Self <: MultipartValue[?], T] (val x: Self & MultipartValue[T]) extends AnyVal {
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FastifyPlugin[FastifyMultipartOptions]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FastifyPlugin[FastifyMultipartOptions] = default
  
  /* augmented module */
  object fastifyAugmentingMod {
    
    trait FastifyInstance extends StObject {
      
      var multipartErrors: MultipartErrors
    }
    object FastifyInstance {
      
      @scala.inline
      def apply(multipartErrors: MultipartErrors): FastifyInstance = {
        val __obj = js.Dynamic.literal(multipartErrors = multipartErrors.asInstanceOf[js.Any])
        __obj.asInstanceOf[FastifyInstance]
      }
      
      @scala.inline
      implicit class FastifyInstanceMutableBuilder[Self <: FastifyInstance] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMultipartErrors(value: MultipartErrors): Self = StObject.set(x, "multipartErrors", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait FastifyRequest extends StObject {
      
      def cleanRequestFiles(): js.Promise[Unit] = js.native
      
      // Stream mode
      def file(): js.Promise[Multipart[`true`]] = js.native
      def file(options: BusboyConfig): js.Promise[Multipart[`true`]] = js.native
      
      def files(): AsyncIterableIterator[Multipart[`true`]] = js.native
      def files(options: BusboyConfig): AsyncIterableIterator[Multipart[`true`]] = js.native
      
      def isMultipart(): Boolean = js.native
      
      // legacy
      def multipart(handler: MultipartHandler, next: js.Function1[/* err */ Error, Unit]): Busboy = js.native
      def multipart(handler: MultipartHandler, next: js.Function1[/* err */ Error, Unit], options: BusboyConfig): Busboy = js.native
      
      // promise api
      def multipartIterator(): AsyncIterableIterator[Multipart[`true`]] = js.native
      def multipartIterator(options: BusboyConfig): AsyncIterableIterator[Multipart[`true`]] = js.native
      
      def parts(): AsyncIterableIterator[Multipart[`true`]] = js.native
      def parts(options: BusboyConfig): AsyncIterableIterator[Multipart[`true`]] = js.native
      
      // Disk mode
      def saveRequestFiles(): js.Promise[js.Array[Multipart[`true`]]] = js.native
      def saveRequestFiles(options: BusboyConfig): js.Promise[js.Array[Multipart[`true`]]] = js.native
      
      var tmpUploads: js.Array[Multipart[`true`]] = js.native
    }
  }
}
