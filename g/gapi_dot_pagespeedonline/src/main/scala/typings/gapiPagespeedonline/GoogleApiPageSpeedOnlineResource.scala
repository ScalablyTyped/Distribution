package typings.gapiPagespeedonline

import typings.gapiPagespeedonline.anon.CssResponsebytes
import typings.gapiPagespeedonline.anon.Locale
import typings.gapiPagespeedonline.anon.Major
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiPageSpeedOnlineResource extends StObject {
  
  /**
    * Localized PageSpeed results. Contains a ruleResults entry for each PageSpeed rule instantiated and run by the server.
    */
  var formattedResults: Locale = js.native
  
  /**
    * Canonicalized and final URL for the document, after following page redirects (if any).
    */
  var id: String = js.native
  
  /**
    * List of rules that were specified in the request, but which the server did not know how to instantiate.
    */
  var invalidRules: js.Array[String] = js.native
  
  /**
    * Kind of result.
    */
  var kind: String = js.native
  
  /**
    * Summary statistics for the page, such as number of JavaScript bytes, number of HTML bytes, etc.
    */
  var pageStats: CssResponsebytes = js.native
  
  /**
    * Response code for the document. 200 indicates a normal page load. 4xx/5xx indicates an error.
    */
  var responseCode: Double = js.native
  
  /**
    * The PageSpeed Score (0-100), which indicates how much faster a page could be. A high score indicates little room for improvement, while a lower score indicates more room for improvement.
    */
  var score: Double = js.native
  
  /**
    * Title of the page, as displayed in the browser's title bar.
    */
  var title: String = js.native
  
  /**
    * The version of the PageSpeed SDK used to generate these results.
    */
  var version: Major = js.native
}
object GoogleApiPageSpeedOnlineResource {
  
  @scala.inline
  def apply(
    formattedResults: Locale,
    id: String,
    invalidRules: js.Array[String],
    kind: String,
    pageStats: CssResponsebytes,
    responseCode: Double,
    score: Double,
    title: String,
    version: Major
  ): GoogleApiPageSpeedOnlineResource = {
    val __obj = js.Dynamic.literal(formattedResults = formattedResults.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invalidRules = invalidRules.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageStats = pageStats.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiPageSpeedOnlineResource]
  }
  
  @scala.inline
  implicit class GoogleApiPageSpeedOnlineResourceMutableBuilder[Self <: GoogleApiPageSpeedOnlineResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedResults(value: Locale): Self = StObject.set(x, "formattedResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidRules(value: js.Array[String]): Self = StObject.set(x, "invalidRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidRulesVarargs(value: String*): Self = StObject.set(x, "invalidRules", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStats(value: CssResponsebytes): Self = StObject.set(x, "pageStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCode(value: Double): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Major): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
