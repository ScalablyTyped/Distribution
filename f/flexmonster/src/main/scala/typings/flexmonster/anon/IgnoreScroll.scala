package typings.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreScroll extends StObject {
  
  var ignoreScroll: js.UndefOr[Boolean] = js.undefined
  
  var ignoreSorting: js.UndefOr[Boolean] = js.undefined
  
  var partial: js.UndefOr[Boolean] = js.undefined
}
object IgnoreScroll {
  
  inline def apply(): IgnoreScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreScroll]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnoreScroll] (val x: Self) extends AnyVal {
    
    inline def setIgnoreScroll(value: Boolean): Self = StObject.set(x, "ignoreScroll", value.asInstanceOf[js.Any])
    
    inline def setIgnoreScrollUndefined: Self = StObject.set(x, "ignoreScroll", js.undefined)
    
    inline def setIgnoreSorting(value: Boolean): Self = StObject.set(x, "ignoreSorting", value.asInstanceOf[js.Any])
    
    inline def setIgnoreSortingUndefined: Self = StObject.set(x, "ignoreSorting", js.undefined)
    
    inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
  }
}
