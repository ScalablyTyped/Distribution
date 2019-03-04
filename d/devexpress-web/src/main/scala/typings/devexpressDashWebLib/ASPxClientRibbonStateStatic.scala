package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientRibbonStateStatic extends js.Object {
  /**
    * A ribbon is minimized. Returns 1
    */
  var Minimized: scala.Double
  /**
    * A ribbon is in the normal state. Returns 0
    */
  var Normal: scala.Double
  /**
    * A ribbon is temporarily shown. Returns 2
    */
  var TemporaryShown: scala.Double
}

object ASPxClientRibbonStateStatic {
  @scala.inline
  def apply(Minimized: scala.Double, Normal: scala.Double, TemporaryShown: scala.Double): ASPxClientRibbonStateStatic = {
    val __obj = js.Dynamic.literal(Minimized = Minimized, Normal = Normal, TemporaryShown = TemporaryShown)
  
    __obj.asInstanceOf[ASPxClientRibbonStateStatic]
  }
}

