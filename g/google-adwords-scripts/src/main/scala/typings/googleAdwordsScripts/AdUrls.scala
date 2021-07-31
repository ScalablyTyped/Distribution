package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdUrls
  extends StObject
     with AdWordsUrls
     with hasGetFinalUrl
object AdUrls {
  
  @scala.inline
  def apply(
    getCustomParameters: () => js.Object,
    getFinalUrl: () => String,
    getMobileFinalUrl: () => String,
    getTrackingTemplate: () => String
  ): AdUrls = {
    val __obj = js.Dynamic.literal(getCustomParameters = js.Any.fromFunction0(getCustomParameters), getFinalUrl = js.Any.fromFunction0(getFinalUrl), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate))
    __obj.asInstanceOf[AdUrls]
  }
}
