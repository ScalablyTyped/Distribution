package typings.expressSitemapXml

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Express middleware to serve {@link https://en.wikipedia.org/wiki/Sitemaps|`sitemap.xml`} from a list of URLs
    * Create a sitemap.xml middleware.
    */
  @JSImport("express-sitemap-xml", JSImport.Namespace)
  @js.native
  def apply(getUrls: js.Function0[js.Array[SitemapLeaf] | js.Promise[js.Array[SitemapLeaf]]], base: String): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * @async
    * Create an object where the keys are sitemap URLs to be served by the server
    * and the values are strings of sitemap XML content
    */
  @JSImport("express-sitemap-xml", "buildSitemaps")
  @js.native
  def buildSitemaps(urls: js.Array[SitemapLeaf], base: String): js.Promise[Sitemap] = js.native
  
  @js.native
  trait LeafObject extends StObject {
    
    var changeFreq: js.UndefOr[String] = js.native
    
    var lastMod: js.UndefOr[String | Date] = js.native
    
    var url: String = js.native
  }
  object LeafObject {
    
    @scala.inline
    def apply(url: String): LeafObject = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeafObject]
    }
    
    @scala.inline
    implicit class LeafObjectMutableBuilder[Self <: LeafObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeFreq(value: String): Self = StObject.set(x, "changeFreq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeFreqUndefined: Self = StObject.set(x, "changeFreq", js.undefined)
      
      @scala.inline
      def setLastMod(value: String | Date): Self = StObject.set(x, "lastMod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModUndefined: Self = StObject.set(x, "lastMod", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Sitemap = StringDictionary[String]
  
  type SitemapLeaf = String | LeafObject
}
