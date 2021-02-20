package typings.download

import org.scalablytyped.runtime.StringDictionary
import typings.decompress.mod.DecompressOptions
import typings.got.mod.GotBodyOptions
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("download", JSImport.Namespace)
  @js.native
  def apply(url: String): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
  @JSImport("download", JSImport.Namespace)
  @js.native
  def apply(url: String, destination: js.UndefOr[scala.Nothing], options: DownloadOptions): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
  @JSImport("download", JSImport.Namespace)
  @js.native
  def apply(url: String, destination: String): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
  @JSImport("download", JSImport.Namespace)
  @js.native
  def apply(url: String, destination: String, options: DownloadOptions): js.Promise[Buffer] with WritableStream with ReadableStream = js.native
  
  @js.native
  trait DownloadOptions
    extends GotBodyOptions[String]
       with DecompressOptions {
    
    /**
      * If set to true, try extracting the file using decompress.
      */
    var extract: js.UndefOr[Boolean] = js.native
    
    /**
      * Name of the saved file.
      */
    var filename: js.UndefOr[String] = js.native
    
    /**
      * Request Headers
      */
    @JSName("headers")
    var headers_DownloadOptions: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Proxy endpoint
      */
    var proxy: js.UndefOr[String] = js.native
  }
  object DownloadOptions {
    
    @scala.inline
    def apply(): DownloadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadOptions]
    }
    
    @scala.inline
    implicit class DownloadOptionsMutableBuilder[Self <: DownloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtract(value: Boolean): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
  
  type RetryFunction = js.Function2[/* retry */ Double, /* error */ js.Any, Double]
}
