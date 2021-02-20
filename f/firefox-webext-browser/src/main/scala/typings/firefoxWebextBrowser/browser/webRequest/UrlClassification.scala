package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlClassification extends StObject {
  
  /** Classification flags if the request has been classified and it is first party. */
  var firstParty: UrlClassificationParty = js.native
  
  /**
    * Classification flags if the request has been classified and it or its window hierarchy is third party.
    */
  var thirdParty: UrlClassificationParty = js.native
}
object UrlClassification {
  
  @scala.inline
  def apply(firstParty: UrlClassificationParty, thirdParty: UrlClassificationParty): UrlClassification = {
    val __obj = js.Dynamic.literal(firstParty = firstParty.asInstanceOf[js.Any], thirdParty = thirdParty.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlClassification]
  }
  
  @scala.inline
  implicit class UrlClassificationMutableBuilder[Self <: UrlClassification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstParty(value: UrlClassificationParty): Self = StObject.set(x, "firstParty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPartyVarargs(value: UrlClassificationFlags*): Self = StObject.set(x, "firstParty", js.Array(value :_*))
    
    @scala.inline
    def setThirdParty(value: UrlClassificationParty): Self = StObject.set(x, "thirdParty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirdPartyVarargs(value: UrlClassificationFlags*): Self = StObject.set(x, "thirdParty", js.Array(value :_*))
  }
}
