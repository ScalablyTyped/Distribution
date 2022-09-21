package typings.expressSitemapXml

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.expressSitemapXml.expressSitemapXmlBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a sitemap.xml middleware.
    * @param getUrls Is called at most once per 24 hours. The resulting sitemap(s)
    *   are cached to make repeated HTTP requests faster.
    * @param base Specifies the base URL to be used in case any URLs are specified
    *   as relative URLs. The argument is also used if a sitemap index needs to be
    *   generated and sitemap locations need to be specified, e.g.
    *   `${base}/sitemap-0.xml` becomes `https://bitmidi.com/sitemap-0.xml`.
    */
  inline def apply(getUrls: js.Function0[js.Array[SitemapLeaf] | js.Promise[js.Array[SitemapLeaf]]], base: String): RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = (^.asInstanceOf[js.Dynamic].apply(getUrls.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]]
  
  @JSImport("express-sitemap-xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @async
    * Create an object where the keys are sitemap URLs to be served by the
    * server and the values are strings of sitemap XML content
    */
  inline def buildSitemaps(urls: js.Array[SitemapLeaf], base: String): js.Promise[Sitemap] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSitemaps")(urls.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Sitemap]]
  
  trait LeafObject extends StObject {
    
    var changeFreq: js.UndefOr[String] = js.undefined
    
    /** specify `true` for today's date */
    var lastMod: js.UndefOr[String | js.Date | `true`] = js.undefined
    
    var url: String
  }
  object LeafObject {
    
    inline def apply(url: String): LeafObject = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeafObject]
    }
    
    extension [Self <: LeafObject](x: Self) {
      
      inline def setChangeFreq(value: String): Self = StObject.set(x, "changeFreq", value.asInstanceOf[js.Any])
      
      inline def setChangeFreqUndefined: Self = StObject.set(x, "changeFreq", js.undefined)
      
      inline def setLastMod(value: String | js.Date | `true`): Self = StObject.set(x, "lastMod", value.asInstanceOf[js.Any])
      
      inline def setLastModUndefined: Self = StObject.set(x, "lastMod", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Sitemap = StringDictionary[String]
  
  type SitemapLeaf = String | LeafObject
}
