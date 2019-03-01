package typings
package dompurifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var RETURN_DOM: js.UndefOr[dompurifyLib.dompurifyLibNumbers.`false`] = js.undefined
  var RETURN_DOM_FRAGMENT: js.UndefOr[dompurifyLib.dompurifyLibNumbers.`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(
    RETURN_DOM: dompurifyLib.dompurifyLibNumbers.`false` = null,
    RETURN_DOM_FRAGMENT: dompurifyLib.dompurifyLibNumbers.`false` = null
  ): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (RETURN_DOM != null) __obj.updateDynamic("RETURN_DOM")(RETURN_DOM)
    if (RETURN_DOM_FRAGMENT != null) __obj.updateDynamic("RETURN_DOM_FRAGMENT")(RETURN_DOM_FRAGMENT)
    __obj.asInstanceOf[Anon_False]
  }
}

