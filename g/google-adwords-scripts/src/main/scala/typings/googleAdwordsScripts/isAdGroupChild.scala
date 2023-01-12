package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait isAdGroupChild
  extends StObject
     with isCampaignChild {
  
  def getAdGroup(): AdGroup
}
object isAdGroupChild {
  
  inline def apply(getAdGroup: () => AdGroup, getCampaign: () => Campaign): isAdGroupChild = {
    val __obj = js.Dynamic.literal(getAdGroup = js.Any.fromFunction0(getAdGroup), getCampaign = js.Any.fromFunction0(getCampaign))
    __obj.asInstanceOf[isAdGroupChild]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: isAdGroupChild] (val x: Self) extends AnyVal {
    
    inline def setGetAdGroup(value: () => AdGroup): Self = StObject.set(x, "getAdGroup", js.Any.fromFunction0(value))
  }
}
