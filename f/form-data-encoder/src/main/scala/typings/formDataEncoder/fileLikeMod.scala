package typings.formDataEncoder

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileLikeMod {
  
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
    val toStringTag: String = js.native
    
    /**
      * Returns the media type ([`MIME`](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)) of the file represented by a `File` object.
      */
    val `type`: String = js.native
  }
}
