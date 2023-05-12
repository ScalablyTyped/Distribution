package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<fundamental-react.fundamental-react/lib/Column/Column.ScreenSize, number> */
trait RecordScreenSizenumber extends StObject {
  
  var largeScreen: Double
  
  var mediumScreen: Double
  
  var smallScreen: Double
  
  var xLargeScreen: Double
}
object RecordScreenSizenumber {
  
  inline def apply(largeScreen: Double, mediumScreen: Double, smallScreen: Double, xLargeScreen: Double): RecordScreenSizenumber = {
    val __obj = js.Dynamic.literal(largeScreen = largeScreen.asInstanceOf[js.Any], mediumScreen = mediumScreen.asInstanceOf[js.Any], smallScreen = smallScreen.asInstanceOf[js.Any], xLargeScreen = xLargeScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordScreenSizenumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordScreenSizenumber] (val x: Self) extends AnyVal {
    
    inline def setLargeScreen(value: Double): Self = StObject.set(x, "largeScreen", value.asInstanceOf[js.Any])
    
    inline def setMediumScreen(value: Double): Self = StObject.set(x, "mediumScreen", value.asInstanceOf[js.Any])
    
    inline def setSmallScreen(value: Double): Self = StObject.set(x, "smallScreen", value.asInstanceOf[js.Any])
    
    inline def setXLargeScreen(value: Double): Self = StObject.set(x, "xLargeScreen", value.asInstanceOf[js.Any])
  }
}
