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
  
  @scala.inline
  def apply(): IgnoreScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreScroll]
  }
  
  @scala.inline
  implicit class IgnoreScrollMutableBuilder[Self <: IgnoreScroll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreScroll(value: Boolean): Self = StObject.set(x, "ignoreScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreScrollUndefined: Self = StObject.set(x, "ignoreScroll", js.undefined)
    
    @scala.inline
    def setIgnoreSorting(value: Boolean): Self = StObject.set(x, "ignoreSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSortingUndefined: Self = StObject.set(x, "ignoreSorting", js.undefined)
    
    @scala.inline
    def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
  }
}
