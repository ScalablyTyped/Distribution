package typings.glidejsGlide.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakpointsComponent
  extends StObject
     with Component {
  
  /**
    * Matches currently active `@media` breakpoint from the passed collection and returns configured settings object for that size.
    */
  def `match`(breakpoints: Record[Double, Options]): Options
}
object BreakpointsComponent {
  
  inline def apply(`match`: Record[Double, Options] => Options): BreakpointsComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[BreakpointsComponent]
  }
  
  extension [Self <: BreakpointsComponent](x: Self) {
    
    inline def setMatch(value: Record[Double, Options] => Options): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
  }
}
