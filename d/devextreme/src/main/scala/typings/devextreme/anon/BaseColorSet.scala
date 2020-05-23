package typings.devextreme.anon

import typings.devextreme.devextremeStrings.alternate
import typings.devextreme.devextremeStrings.blend
import typings.devextreme.devextremeStrings.extrapolate
import typings.devextreme.devextremeStrings.gradientSet
import typings.devextreme.devextremeStrings.indicatingSet
import typings.devextreme.devextremeStrings.simpleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseColorSet extends js.Object {
  var baseColorSet: js.UndefOr[simpleSet | indicatingSet | gradientSet] = js.undefined
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
}

object BaseColorSet {
  @scala.inline
  def apply(
    baseColorSet: simpleSet | indicatingSet | gradientSet = null,
    paletteExtensionMode: alternate | blend | extrapolate = null
  ): BaseColorSet = {
    val __obj = js.Dynamic.literal()
    if (baseColorSet != null) __obj.updateDynamic("baseColorSet")(baseColorSet.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseColorSet]
  }
}

