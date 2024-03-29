package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptOrigin
  extends StObject
     with BackboneElement {
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * A given origin index (e.g. 1) can appear only once in the list (e.g. Origin 1 cannot be specified twice ... once as FormFiller and again as FormProcessor within the same script as that could get confusing during test configuration).
    * Different origin indices could play the same actor in the same test script (e.g. You could have two different test systems acting as Form-Filler).
    * The origin indices provided elsewhere in the test script must be one of these origin indices.
    */
  var index: Double
  
  /**
    * Must be a "sender"/"client" profile.
    */
  var profile: Coding
  
  /**
    * If provided, the test engine is not expected to prompt for or accept external input of this value.
    */
  var url: js.UndefOr[String] = js.undefined
}
object TestScriptOrigin {
  
  inline def apply(index: Double, profile: Coding): TestScriptOrigin = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptOrigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptOrigin] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: Coding): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
