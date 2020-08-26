package typings.devextreme.anon

import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.columns
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.outside
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgumentFormat extends js.Object {
  var argumentFormat: js.UndefOr[format] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var border: js.UndefOr[ColorDashStyle] = js.native
  var connector: js.UndefOr[ColorVisible] = js.native
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ js.Any, String]] = js.native
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.native
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  var position: js.UndefOr[columns | inside | outside] = js.native
  var radialOffset: js.UndefOr[Double] = js.native
  var rotationAngle: js.UndefOr[Double] = js.native
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
}

object ArgumentFormat {
  @scala.inline
  def apply(): ArgumentFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentFormat]
  }
  @scala.inline
  implicit class ArgumentFormatOps[Self <: ArgumentFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgumentFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = this.set("argumentFormat", js.Any.fromFunction1(value))
    @scala.inline
    def setArgumentFormat(value: format): Self = this.set("argumentFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgumentFormat: Self = this.set("argumentFormat", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorder(value: ColorDashStyle): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setConnector(value: ColorVisible): Self = this.set("connector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnector: Self = this.set("connector", js.undefined)
    @scala.inline
    def setCustomizeText(value: /* pointInfo */ js.Any => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    @scala.inline
    def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setPosition(value: columns | inside | outside): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRadialOffset(value: Double): Self = this.set("radialOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadialOffset: Self = this.set("radialOffset", js.undefined)
    @scala.inline
    def setRotationAngle(value: Double): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationAngle: Self = this.set("rotationAngle", js.undefined)
    @scala.inline
    def setTextOverflow(value: ellipsis | hide | none): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWordWrap(value: normal | breakWord | none): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
  }
  
}

