package typings.formDataEncoder

import typings.formDataEncoder.fileLikeMod.FileLike
import typings.formDataEncoder.formDataLikeMod.FormDataLike
import typings.std.AsyncGenerator
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formDataEncoderMod {
  
  @JSImport("form-data-encoder/@type/FormDataEncoder", "FormDataEncoder")
  @js.native
  open class FormDataEncoder protected () extends StObject {
    /**
      * Creates a multipart/form-data encoder.
      *
      * @param form FormData object to encode. This object must be a spec-compatible FormData implementation.
      * @param boundary An optional boundary string that will be used by the encoder. If there's no boundary string is present, Encoder will generate it automatically.
      *
      * @example
      *
      * import {Readable} from "stream"
      *
      * import {FormData, File, fileFromPath} from "formdata-node"
      * import {FormDataEncoder} from "form-data-encoder"
      *
      * import fetch from "node-fetch"
      *
      * const form = new FormData()
      *
      * form.set("field", "Just a random string")
      * form.set("file", new File(["Using files is class amazing"], "file.txt"))
      * form.set("fileFromPath", await fileFromPath("path/to/a/file.txt"))
      *
      * const encoder = new FormDataEncoder(form)
      *
      * const options = {
      *   method: "post",
      *   headers: encoder.headers,
      *   body: Readable.from(encoder)
      * }
      *
      * const response = await fetch("https://httpbin.org/post", options)
      *
      * console.log(await response.json())
      */
    def this(form: FormDataLike) = this()
    def this(form: FormDataLike, boundary: String) = this()
    def this(form: FormDataLike, options: FormDataEncoderOptions) = this()
    def this(form: FormDataLike, boundary: String, options: FormDataEncoderOptions) = this()
    
    /**
      * Returns boundary string
      */
    val boundary: String = js.native
    
    /**
      * Returns Content-Length header
      */
    val contentLength: js.UndefOr[String] = js.native
    
    /**
      * Returns Content-Type header
      */
    val contentType: String = js.native
    
    /**
      * Creates an async iterator allowing to perform the encoding by portions.
      * This method **will** also read files.
      *
      * @example
      *
      * import {Readable} from "stream"
      *
      * import {FormData, File, fileFromPath} from "formdata-node"
      * import {FormDataEncoder} from "form-data-encoder"
      *
      * import fetch from "node-fetch"
      *
      * const form = new FormData()
      *
      * form.set("field", "Just a random string")
      * form.set("file", new File(["Using files is class amazing"], "file.txt"))
      * form.set("fileFromPath", await fileFromPath("path/to/a/file.txt"))
      *
      * const encoder = new FormDataEncoder(form)
      *
      * const options = {
      *   method: "post",
      *   headers: encoder.headers,
      *   body: Readable.from(encoder.encode()) // or Readable.from(encoder)
      * }
      *
      * const response = await fetch("https://httpbin.org/post", options)
      *
      * console.log(await response.json())
      */
    def encode(): AsyncGenerator[js.typedarray.Uint8Array, Unit, Unit] = js.native
    
    /**
      * Returns form-data content length
      *
      * @deprecated Use FormDataEncoder.contentLength or FormDataEncoder.headers["Content-Length"] instead
      */
    def getContentLength(): js.UndefOr[Double] = js.native
    
    /**
      * Returns headers object with Content-Type and Content-Length header
      */
    val headers: FormDataEncoderHeaders = js.native
    
    /**
      * Creates an iterator allowing to read through the encoder data using for...of loops
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Generator[js.typedarray.Uint8Array | FileLike, Unit, Unit]] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Creates an iterator allowing to go through form-data parts (with metadata).
      * This method **will not** read the files.
      *
      * Using this method, you can convert form-data content into Blob:
      *
      * @example
      *
      * import {Readable} from "stream"
      *
      * import {FormDataEncoder} from "form-data-encoder"
      *
      * import {FormData} from "formdata-polyfill/esm-min.js"
      * import {fileFrom} from "fetch-blob/form.js"
      * import {File} from "fetch-blob/file.js"
      * import {Blob} from "fetch-blob"
      *
      * import fetch from "node-fetch"
      *
      * const form = new FormData()
      *
      * form.set("field", "Just a random string")
      * form.set("file", new File(["Using files is class amazing"]))
      * form.set("fileFromPath", await fileFrom("path/to/a/file.txt"))
      *
      * const encoder = new FormDataEncoder(form)
      *
      * const options = {
      *   method: "post",
      *   body: new Blob(encoder, {type: encoder.contentType})
      * }
      *
      * const response = await fetch("https://httpbin.org/post", options)
      *
      * console.log(await response.json())
      */
    def values(): Generator[js.typedarray.Uint8Array | FileLike, Unit, Unit] = js.native
  }
  
  /* Inlined std.Readonly<form-data-encoder.form-data-encoder/@type/FormDataEncoder.RawHeaders> & std.Readonly<form-data-encoder.form-data-encoder/@type/util/LowercaseObjectKeys.LowercaseObjectKeys<form-data-encoder.form-data-encoder/@type/FormDataEncoder.RawHeaders>> */
  trait FormDataEncoderHeaders extends StObject {
    
    val `Content-Length`: js.UndefOr[String] = js.undefined
    
    val `Content-Type`: String
  }
  object FormDataEncoderHeaders {
    
    inline def apply(`Content-Type`: String): FormDataEncoderHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormDataEncoderHeaders]
    }
    
    extension [Self <: FormDataEncoderHeaders](x: Self) {
      
      inline def `setContent-Length`(value: String): Self = StObject.set(x, "Content-Length", value.asInstanceOf[js.Any])
      
      inline def `setContent-LengthUndefined`: Self = StObject.set(x, "Content-Length", js.undefined)
      
      inline def `setContent-Type`(value: String): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormDataEncoderOptions extends StObject {
    
    /**
      * When enabled, the encoder will emit additional per part headers, such as `Content-Length`.
      *
      * Please note that the web clients do not include these, so when enabled this option might cause an error if `multipart/form-data` does not consider additional headers.
      *
      * Defaults to `false`.
      */
    var enableAdditionalHeaders: js.UndefOr[Boolean] = js.undefined
  }
  object FormDataEncoderOptions {
    
    inline def apply(): FormDataEncoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormDataEncoderOptions]
    }
    
    extension [Self <: FormDataEncoderOptions](x: Self) {
      
      inline def setEnableAdditionalHeaders(value: Boolean): Self = StObject.set(x, "enableAdditionalHeaders", value.asInstanceOf[js.Any])
      
      inline def setEnableAdditionalHeadersUndefined: Self = StObject.set(x, "enableAdditionalHeaders", js.undefined)
    }
  }
  
  trait RawHeaders extends StObject {
    
    var `Content-Length`: js.UndefOr[String] = js.undefined
    
    var `Content-Type`: String
  }
  object RawHeaders {
    
    inline def apply(`Content-Type`: String): RawHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawHeaders]
    }
    
    extension [Self <: RawHeaders](x: Self) {
      
      inline def `setContent-Length`(value: String): Self = StObject.set(x, "Content-Length", value.asInstanceOf[js.Any])
      
      inline def `setContent-LengthUndefined`: Self = StObject.set(x, "Content-Length", js.undefined)
      
      inline def `setContent-Type`(value: String): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    }
  }
}
