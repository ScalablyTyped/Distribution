package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientRibbonStateStatic extends js.Object {
  /**
    * A ribbon is minimized. Returns 1
    */
  var Minimized: Double
  /**
    * A ribbon is in the normal state. Returns 0
    */
  var Normal: Double
  /**
    * A ribbon is temporarily shown. Returns 2
    */
  var TemporaryShown: Double
}

object ASPxClientRibbonStateStatic {
  @scala.inline
  def apply(Minimized: Double, Normal: Double, TemporaryShown: Double): ASPxClientRibbonStateStatic = {
    val __obj = js.Dynamic.literal(Minimized = Minimized, Normal = Normal, TemporaryShown = TemporaryShown)
  
    __obj.asInstanceOf[ASPxClientRibbonStateStatic]
  }
}

