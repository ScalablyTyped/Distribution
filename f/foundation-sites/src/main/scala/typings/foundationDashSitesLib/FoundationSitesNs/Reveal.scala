package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/reveal.html#javascript-reference
trait Reveal extends js.Object {
  def close(): scala.Unit
  def destroy(): scala.Unit
  def open(): scala.Unit
  def toggle(): scala.Unit
}

object Reveal {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    open: js.Function0[scala.Unit],
    toggle: js.Function0[scala.Unit]
  ): Reveal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[Reveal]
  }
}

