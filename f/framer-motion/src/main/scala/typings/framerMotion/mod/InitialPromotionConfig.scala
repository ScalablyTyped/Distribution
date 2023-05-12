package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialPromotionConfig extends StObject {
  
  /**
    * If the follow tree should preserve its opacity when the lead is promoted on mount
    */
  var shouldPreserveFollowOpacity: js.UndefOr[js.Function1[/* member */ IProjectionNode[Any], Boolean]] = js.undefined
  
  /**
    * The initial transition to use when the elements in this group mount (and automatically promoted).
    * Subsequent updates should provide a transition in the promote method.
    */
  var transition: js.UndefOr[Transition1] = js.undefined
}
object InitialPromotionConfig {
  
  inline def apply(): InitialPromotionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialPromotionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitialPromotionConfig] (val x: Self) extends AnyVal {
    
    inline def setShouldPreserveFollowOpacity(value: /* member */ IProjectionNode[Any] => Boolean): Self = StObject.set(x, "shouldPreserveFollowOpacity", js.Any.fromFunction1(value))
    
    inline def setShouldPreserveFollowOpacityUndefined: Self = StObject.set(x, "shouldPreserveFollowOpacity", js.undefined)
    
    inline def setTransition(value: Transition1): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
