package typings.formdataNode

import typings.formdataNode.`@typeBlobMod`.BlobParts
import typings.formdataNode.`@typeBlobMod`.BlobPropertyBag
import typings.formdataNode.`@typeFileMod`.FilePropertyBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("formdata-node", "Blob")
  @js.native
  /**
    * Returns a new [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob) object.
    * The content of the blob consists of the concatenation of the values given in the parameter array.
    *
    * @param blobParts An `Array` strings, or [`ArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer), [`ArrayBufferView`](https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView), [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob) objects, or a mix of any of such objects, that will be put inside the [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob).
    * @param options An optional object of type `BlobPropertyBag`.
    */
  open class Blob ()
    extends typings.formdataNode.`@typeBlobMod`.Blob {
    def this(blobParts: BlobParts) = this()
    def this(blobParts: Unit, options: BlobPropertyBag) = this()
    def this(blobParts: BlobParts, options: BlobPropertyBag) = this()
  }
  
  @JSImport("formdata-node", "File")
  @js.native
  open class File protected ()
    extends typings.formdataNode.`@typeFileMod`.File {
    /**
      * Creates a new File instance.
      *
      * @param fileBits An `Array` strings, or [`ArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer), [`ArrayBufferView`](https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView), [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob) objects, or a mix of any of such objects, that will be put inside the [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File).
      * @param name The name of the file.
      * @param options An options object containing optional attributes for the file.
      */
    def this(fileBits: BlobParts, name: String) = this()
    def this(fileBits: BlobParts, name: String, options: FilePropertyBag) = this()
  }
  
  @JSImport("formdata-node", "FormData")
  @js.native
  open class FormData ()
    extends typings.formdataNode.`@typeFormDataMod`.FormData
}
