package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait isCampaignChild extends StObject {
  
  def getCampaign(): Campaign
}
object isCampaignChild {
  
  inline def apply(getCampaign: () => Campaign): isCampaignChild = {
    val __obj = js.Dynamic.literal(getCampaign = js.Any.fromFunction0(getCampaign))
    __obj.asInstanceOf[isCampaignChild]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: isCampaignChild] (val x: Self) extends AnyVal {
    
    inline def setGetCampaign(value: () => Campaign): Self = StObject.set(x, "getCampaign", js.Any.fromFunction0(value))
  }
}
