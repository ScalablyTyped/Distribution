package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorColor extends js.Object {
  var connectorColor: js.UndefOr[String] = js.native
  var connectorWidth: js.UndefOr[Double] = js.native
  var customizeText: js.UndefOr[js.Function1[/* barValue */ ValueText, String]] = js.native
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.native
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  var indent: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object ConnectorColor {
  @scala.inline
  def apply(): ConnectorColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorColor]
  }
  @scala.inline
  implicit class ConnectorColorOps[Self <: ConnectorColor] (val x: Self) extends AnyVal {
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
    def setConnectorColor(value: String): Self = this.set("connectorColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorColor: Self = this.set("connectorColor", js.undefined)
    @scala.inline
    def setConnectorWidth(value: Double): Self = this.set("connectorWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorWidth: Self = this.set("connectorWidth", js.undefined)
    @scala.inline
    def setCustomizeText(value: /* barValue */ ValueText => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
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
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

