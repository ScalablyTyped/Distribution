package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAudienceBidding
  extends StObject
     with canSetBidModifier {
  
  def clearBidModifier(): Unit
}
object SearchAudienceBidding {
  
  inline def apply(clearBidModifier: () => Unit, getBidModifier: () => Double, setBidModifier: Double => Unit): SearchAudienceBidding = {
    val __obj = js.Dynamic.literal(clearBidModifier = js.Any.fromFunction0(clearBidModifier), getBidModifier = js.Any.fromFunction0(getBidModifier), setBidModifier = js.Any.fromFunction1(setBidModifier))
    __obj.asInstanceOf[SearchAudienceBidding]
  }
  
  extension [Self <: SearchAudienceBidding](x: Self) {
    
    inline def setClearBidModifier(value: () => Unit): Self = StObject.set(x, "clearBidModifier", js.Any.fromFunction0(value))
  }
}
