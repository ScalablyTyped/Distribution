package typings.gestalt.anon

import typings.gestalt.gestaltInts.`2`
import typings.gestalt.gestaltInts.`3`
import typings.gestalt.gestaltInts.`4`
import typings.gestalt.gestaltInts.`5`
import typings.gestalt.gestaltInts.`6`
import typings.gestalt.gestaltInts.`7`
import typings.gestalt.gestaltInts.`8`
import typings.gestalt.gestaltStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rounding extends StObject {
  
  var rounding: circle | typings.gestalt.gestaltInts.`0` | typings.gestalt.gestaltInts.`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`
  
  var wash: Boolean
}
object Rounding {
  
  inline def apply(
    rounding: circle | typings.gestalt.gestaltInts.`0` | typings.gestalt.gestaltInts.`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`,
    wash: Boolean
  ): Rounding = {
    val __obj = js.Dynamic.literal(rounding = rounding.asInstanceOf[js.Any], wash = wash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rounding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rounding] (val x: Self) extends AnyVal {
    
    inline def setRounding(
      value: circle | typings.gestalt.gestaltInts.`0` | typings.gestalt.gestaltInts.`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`
    ): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setWash(value: Boolean): Self = StObject.set(x, "wash", value.asInstanceOf[js.Any])
  }
}
