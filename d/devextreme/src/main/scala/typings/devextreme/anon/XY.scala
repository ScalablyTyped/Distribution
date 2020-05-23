package typings.devextreme.anon

import typings.devextreme.devextremeStrings.fit
import typings.devextreme.devextremeStrings.flip
import typings.devextreme.devextremeStrings.flipfit
import typings.devextreme.devextremeStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XY extends js.Object {
  var x: js.UndefOr[fit | flip | flipfit | none] = js.undefined
  var y: js.UndefOr[fit | flip | flipfit | none] = js.undefined
}

object XY {
  @scala.inline
  def apply(x: fit | flip | flipfit | none = null, y: fit | flip | flipfit | none = null): XY = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XY]
  }
}

