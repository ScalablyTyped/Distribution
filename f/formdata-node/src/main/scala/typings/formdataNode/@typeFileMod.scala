package typings.formdataNode

import typings.formdataNode.`@typeBlobMod`.Blob
import typings.formdataNode.`@typeBlobMod`.BlobParts
import typings.formdataNode.`@typeBlobMod`.BlobPropertyBag
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@typeFileMod` {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.formdataNode.`@typeFileMod`.FileLike because var conflicts: size, toStringTag, `type`. Inlined name, lastModified */ @JSImport("formdata-node/@type/File", "File")
  @js.native
  open class File protected () extends Blob {
    /**
      * Creates a new File instance.
      *
      * @param fileBits An `Array` strings, or [`ArrayBuffer`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer), [`ArrayBufferView`](https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView), [`Blob`](https://developer.mozilla.org/en-US/docs/Web/API/Blob) objects, or a mix of any of such objects, that will be put inside the [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File).
      * @param name The name of the file.
      * @param options An options object containing optional attributes for the file.
      */
    def this(fileBits: BlobParts, name: String) = this()
    def this(fileBits: BlobParts, name: String, options: FilePropertyBag) = this()
    
    /**
      * The last modified date of the file as the number of milliseconds since the Unix epoch (January 1, 1970 at midnight). Files without a known last modified date return the current date.
      */
    def lastModified: Double = js.native
    /**
      * The last modified date of the file as the number of milliseconds since the Unix epoch (January 1, 1970 at midnight). Files without a known last modified date return the current date.
      */
    @JSName("lastModified")
    val lastModified_FFile: Double = js.native
    
    /**
      * Name of the file referenced by the File object.
      */
    def name: String = js.native
    /**
      * Name of the file referenced by the File object.
      */
    @JSName("name")
    val name_FFile: String = js.native
    
    def webkitRelativePath: String = js.native
  }
  
  @js.native
  trait FileLike extends StObject {
    
    /**
      * The last modified date of the file as the number of milliseconds since the Unix epoch (January 1, 1970 at midnight). Files without a known last modified date return the current date.
      */
    val lastModified: Double = js.native
    
    /**
      * Name of the file referenced by the File object.
      */
    val name: String = js.native
    
    /**
      * Size of the file parts in bytes
      */
    val size: Double = js.native
    
    /**
      * Returns a [`ReadableStream`](https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream) which upon reading returns the data contained within the [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File).
      */
    def stream(): AsyncIterable[js.typedarray.Uint8Array] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: String = js.native
    
    /**
      * Returns the media type ([`MIME`](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)) of the file represented by a `File` object.
      */
    val `type`: String = js.native
  }
  
  trait FilePropertyBag
    extends StObject
       with BlobPropertyBag {
    
    /**
      * The last modified date of the file as the number of milliseconds since the Unix epoch (January 1, 1970 at midnight). Files without a known last modified date return the current date.
      */
    var lastModified: js.UndefOr[Double] = js.undefined
  }
  object FilePropertyBag {
    
    inline def apply(): FilePropertyBag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePropertyBag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilePropertyBag] (val x: Self) extends AnyVal {
      
      inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    }
  }
}
