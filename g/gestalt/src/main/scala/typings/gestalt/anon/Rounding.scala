package typings.gestalt.anon

import typings.gestalt.gestaltNumbers.`3`
import typings.gestalt.gestaltNumbers.`4`
import typings.gestalt.gestaltNumbers.`5`
import typings.gestalt.gestaltNumbers.`6`
import typings.gestalt.gestaltNumbers.`7`
import typings.gestalt.gestaltNumbers.`8`
import typings.gestalt.gestaltStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rounding extends StObject {
  
  var rounding: circle | typings.gestalt.gestaltNumbers.`0` | typings.gestalt.gestaltNumbers.`1` | typings.gestalt.gestaltNumbers.`2` | `3` | `4` | `5` | `6` | `7` | `8`
  
  var wash: Boolean
}
object Rounding {
  
  inline def apply(
    rounding: circle | typings.gestalt.gestaltNumbers.`0` | typings.gestalt.gestaltNumbers.`1` | typings.gestalt.gestaltNumbers.`2` | `3` | `4` | `5` | `6` | `7` | `8`,
    wash: Boolean
  ): Rounding = {
    val __obj = js.Dynamic.literal(rounding = rounding.asInstanceOf[js.Any], wash = wash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rounding]
  }
  
  extension [Self <: Rounding](x: Self) {
    
    inline def setRounding(
      value: circle | typings.gestalt.gestaltNumbers.`0` | typings.gestalt.gestaltNumbers.`1` | typings.gestalt.gestaltNumbers.`2` | `3` | `4` | `5` | `6` | `7` | `8`
    ): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setWash(value: Boolean): Self = StObject.set(x, "wash", value.asInstanceOf[js.Any])
  }
}
