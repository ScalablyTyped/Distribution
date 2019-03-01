package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var ej: Anon_Accordion
}

object Window {
  @scala.inline
  def apply(ej: Anon_Accordion): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ej")(ej)
    __obj.asInstanceOf[Window]
  }
}

