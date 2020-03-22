package typings.devextreme

import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.columns
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.outside
import typings.devextreme.mod.DevExpress.ui.format
import typings.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgumentFormat extends js.Object {
  var argumentFormat: js.UndefOr[format] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[AnonColorDashStyle] = js.undefined
  var connector: js.UndefOr[AnonColorVisible] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ js.Any, String]] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  var position: js.UndefOr[columns | inside | outside] = js.undefined
  var radialOffset: js.UndefOr[Double] = js.undefined
  var rotationAngle: js.UndefOr[Double] = js.undefined
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.undefined
}

object AnonArgumentFormat {
  @scala.inline
  def apply(
    argumentFormat: format = null,
    backgroundColor: String = null,
    border: AnonColorDashStyle = null,
    connector: AnonColorVisible = null,
    customizeText: /* pointInfo */ js.Any => String = null,
    font: Font = null,
    format: format = null,
    position: columns | inside | outside = null,
    radialOffset: Int | Double = null,
    rotationAngle: Int | Double = null,
    textOverflow: ellipsis | hide | none = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wordWrap: normal | breakWord | none = null
  ): AnonArgumentFormat = {
    val __obj = js.Dynamic.literal()
    if (argumentFormat != null) __obj.updateDynamic("argumentFormat")(argumentFormat.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (radialOffset != null) __obj.updateDynamic("radialOffset")(radialOffset.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgumentFormat]
  }
}

