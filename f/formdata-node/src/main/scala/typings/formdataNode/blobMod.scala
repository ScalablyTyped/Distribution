package typings.formdataNode

import typings.formdataNode.blobPartMod._BlobPart
import typings.webStreamsPolyfill.mod.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blobMod {
  
  @JSImport("formdata-node/@type/Blob", "Blob")
  @js.native
  /**
    * Returns a new [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob) object.
    * The content of the blob consists of the concatenation of the values given in the parameter array.
    *
    * @param blobParts An `Array` strings, or [`ArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer), [`ArrayBufferView`](https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView), [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob) objects, or a mix of any of such objects, that will be put inside the [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob).
    * @param options An optional object of type `BlobPropertyBag`.
    */
  open class Blob ()
    extends StObject
       with _BlobPart {
    def this(blobParts: BlobParts) = this()
    def this(blobParts: Unit, options: BlobPropertyBag) = this()
    def this(blobParts: BlobParts, options: BlobPropertyBag) = this()
    
    /**
      * Returns a [`Promise`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise) that resolves with the contents of the blob as binary data contained in an [`ArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer).
      */
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    var get: Any = js.native
    
    @JSName(js.Symbol.hasInstance)
    var hasInstance: js.Function1[/* value */ Any, Boolean] = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Returns the size of the [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob) or [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File) in bytes.
      */
    def size: Double = js.native
    
    /**
      * Creates and returns a new [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob) object which contains data from a subset of the blob on which it's called.
      *
      * @param start An index into the Blob indicating the first byte to include in the new Blob. If you specify a negative value, it's treated as an offset from the end of the Blob toward the beginning. For example, -10 would be the 10th from last byte in the Blob. The default value is 0. If you specify a value for start that is larger than the size of the source Blob, the returned Blob has size 0 and contains no data.
      * @param end An index into the Blob indicating the first byte that will *not* be included in the new Blob (i.e. the byte exactly at this index is not included). If you specify a negative value, it's treated as an offset from the end of the Blob toward the beginning. For example, -10 would be the 10th from last byte in the Blob. The default value is size.
      * @param contentType The content type to assign to the new Blob; this will be the value of its type property. The default value is an empty string.
      */
    def slice(): Blob = js.native
    def slice(start: Double): Blob = js.native
    def slice(start: Double, end: Double): Blob = js.native
    def slice(start: Double, end: Double, contentType: String): Blob = js.native
    def slice(start: Double, end: Unit, contentType: String): Blob = js.native
    def slice(start: Unit, end: Double): Blob = js.native
    def slice(start: Unit, end: Double, contentType: String): Blob = js.native
    def slice(start: Unit, end: Unit, contentType: String): Blob = js.native
    
    var static: Any = js.native
    
    /**
      * Returns a [`ReadableStream`](https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream) which upon reading returns the data contained within the [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob).
      */
    def stream(): ReadableStream[js.typedarray.Uint8Array] = js.native
    
    /**
      * Returns a [`Promise`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise) that resolves with a string containing the contents of the blob, interpreted as UTF-8.
      */
    def text(): js.Promise[String] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    /**
      * Returns the [`MIME type`](https://developer.mozilla.org/en-US/docs/Glossary/MIME_type) of the [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob) or [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File).
      */
    def `type`: String = js.native
  }
  
  @js.native
  trait BlobLike
    extends StObject
       with _BlobPart {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    var size: Double = js.native
    
    def slice(): BlobLike = js.native
    def slice(start: Double): BlobLike = js.native
    def slice(start: Double, end: Double): BlobLike = js.native
    def slice(start: Double, end: Double, contentType: String): BlobLike = js.native
    def slice(start: Double, end: Unit, contentType: String): BlobLike = js.native
    def slice(start: Unit, end: Double): BlobLike = js.native
    def slice(start: Unit, end: Double, contentType: String): BlobLike = js.native
    def slice(start: Unit, end: Unit, contentType: String): BlobLike = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: String = js.native
    
    var `type`: String = js.native
  }
  
  type BlobParts = js.Array[Any] | js.Iterable[Any]
  
  trait BlobPropertyBag extends StObject {
    
    /**
      * The [`MIME type`](https://developer.mozilla.org/en-US/docs/Glossary/MIME_type) of the data that will be stored into the blob.
      * The default value is the empty string, (`""`).
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BlobPropertyBag {
    
    inline def apply(): BlobPropertyBag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlobPropertyBag]
    }
    
    extension [Self <: BlobPropertyBag](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
