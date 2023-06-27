package typings.formDataEncoder

import typings.formDataEncoder.`@typeFormDataEncoderMod`.FormDataEncoderOptions
import typings.formDataEncoder.`@typeFormDataLikeMod`.FormDataLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("form-data-encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("form-data-encoder", "FormDataEncoder")
  @js.native
  open class FormDataEncoder protected ()
    extends typings.formDataEncoder.`@typeFormDataEncoderMod`.FormDataEncoder {
    /**
      * Creates a multipart/form-data encoder.
      *
      * @param form FormData object to encode. This object must be a spec-compatible FormData implementation.
      *
      * @example
      *
      * ```js
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
      * ```
      */
    def this(form: FormDataLike) = this()
    /**
      * Creates multipart/form-data encoder with custom boundary string.
      *
      * @param form FormData object to encode. This object must be a spec-compatible FormData implementation.
      * @param boundary An optional boundary string that will be used by the encoder. If there's no boundary string is present, Encoder will generate it automatically.
      */
    def this(form: FormDataLike, boundary: String) = this()
    /**
      * Creates multipart/form-data encoder with additional options.
      *
      * @param form FormData object to encode. This object must be a spec-compatible FormData implementation.
      * @param options Additional options
      */
    def this(form: FormDataLike, options: FormDataEncoderOptions) = this()
    def this(form: FormDataLike, boundary: String, options: FormDataEncoderOptions) = this()
  }
  
  inline def isFile(value: Any): /* is form-data-encoder.form-data-encoder/@type/FileLike.FileLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(value.asInstanceOf[js.Any]).asInstanceOf[/* is form-data-encoder.form-data-encoder/@type/FileLike.FileLike */ Boolean]
  
  inline def isFormData(value: Any): /* is form-data-encoder.form-data-encoder/@type/FormDataLike.FormDataLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormData")(value.asInstanceOf[js.Any]).asInstanceOf[/* is form-data-encoder.form-data-encoder/@type/FormDataLike.FormDataLike */ Boolean]
}
