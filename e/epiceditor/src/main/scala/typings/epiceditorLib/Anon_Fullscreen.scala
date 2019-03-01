package typings
package epiceditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fullscreen extends js.Object {
  var fullscreen: scala.Double
  var modifier: scala.Double
  var preview: scala.Double
}

object Anon_Fullscreen {
  @scala.inline
  def apply(fullscreen: scala.Double, modifier: scala.Double, preview: scala.Double): Anon_Fullscreen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fullscreen")(fullscreen)
    __obj.updateDynamic("modifier")(modifier)
    __obj.updateDynamic("preview")(preview)
    __obj.asInstanceOf[Anon_Fullscreen]
  }
}

