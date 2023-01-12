package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A plain JavaScript objects to describe a content label. */
trait ExcludedContentLabelObject extends StObject {
  
  var contentLabelType: String
}
object ExcludedContentLabelObject {
  
  inline def apply(contentLabelType: String): ExcludedContentLabelObject = {
    val __obj = js.Dynamic.literal(contentLabelType = contentLabelType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludedContentLabelObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludedContentLabelObject] (val x: Self) extends AnyVal {
    
    inline def setContentLabelType(value: String): Self = StObject.set(x, "contentLabelType", value.asInstanceOf[js.Any])
  }
}
