package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait canSetBidModifier extends StObject {
  
  def getBidModifier(): Double = js.native
  
  def setBidModifier(modifier: Double): Unit = js.native
}
object canSetBidModifier {
  
  @scala.inline
  def apply(getBidModifier: () => Double, setBidModifier: Double => Unit): canSetBidModifier = {
    val __obj = js.Dynamic.literal(getBidModifier = js.Any.fromFunction0(getBidModifier), setBidModifier = js.Any.fromFunction1(setBidModifier))
    __obj.asInstanceOf[canSetBidModifier]
  }
  
  @scala.inline
  implicit class canSetBidModifierMutableBuilder[Self <: canSetBidModifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBidModifier(value: () => Double): Self = StObject.set(x, "getBidModifier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetBidModifier(value: Double => Unit): Self = StObject.set(x, "setBidModifier", js.Any.fromFunction1(value))
  }
}
