package typings.expressSitemapXml

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Express middleware to serve {@link https://en.wikipedia.org/wiki/Sitemaps|`sitemap.xml`} from a list of URLs
    * Create a sitemap.xml middleware.
    */
  @scala.inline
  def apply(getUrls: js.Function0[js.Array[SitemapLeaf] | js.Promise[js.Array[SitemapLeaf]]], base: String): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = (^.asInstanceOf[js.Dynamic].apply(getUrls.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @JSImport("express-sitemap-xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @async
    * Create an object where the keys are sitemap URLs to be served by the server
    * and the values are strings of sitemap XML content
    */
  @scala.inline
  def buildSitemaps(urls: js.Array[SitemapLeaf], base: String): js.Promise[Sitemap] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSitemaps")(urls.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Sitemap]]
  
  trait LeafObject extends StObject {
    
    var changeFreq: js.UndefOr[String] = js.undefined
    
    var lastMod: js.UndefOr[String | Date] = js.undefined
    
    var url: String
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
