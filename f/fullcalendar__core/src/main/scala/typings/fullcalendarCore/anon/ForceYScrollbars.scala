package typings.fullcalendarCore.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceYScrollbars extends StObject {
  
  var forceYScrollbars: Boolean
  
  var scrollerClientHeights: StringDictionary[Double]
  
  var scrollerClientWidths: StringDictionary[Double]
}
object ForceYScrollbars {
  
  inline def apply(
    forceYScrollbars: Boolean,
    scrollerClientHeights: StringDictionary[Double],
    scrollerClientWidths: StringDictionary[Double]
  ): ForceYScrollbars = {
    val __obj = js.Dynamic.literal(forceYScrollbars = forceYScrollbars.asInstanceOf[js.Any], scrollerClientHeights = scrollerClientHeights.asInstanceOf[js.Any], scrollerClientWidths = scrollerClientWidths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceYScrollbars]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForceYScrollbars] (val x: Self) extends AnyVal {
    
    inline def setForceYScrollbars(value: Boolean): Self = StObject.set(x, "forceYScrollbars", value.asInstanceOf[js.Any])
    
    inline def setScrollerClientHeights(value: StringDictionary[Double]): Self = StObject.set(x, "scrollerClientHeights", value.asInstanceOf[js.Any])
    
    inline def setScrollerClientWidths(value: StringDictionary[Double]): Self = StObject.set(x, "scrollerClientWidths", value.asInstanceOf[js.Any])
  }
}
