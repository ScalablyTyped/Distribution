package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartAnnotations extends js.Object {
  var boxStyle: js.UndefOr[ChartBoxStyle] = js.native
  var datum: js.UndefOr[ChartStemAndStyle] = js.native
  var domain: js.UndefOr[ChartStemAndStyle] = js.native
  var highContrast: js.UndefOr[Boolean] = js.native
  var stem: js.UndefOr[ChartStem] = js.native
  var style: js.UndefOr[String] = js.native
  var textStyle: js.UndefOr[ChartTextStyle] = js.native
}

object ChartAnnotations {
  @scala.inline
  def apply(): ChartAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAnnotations]
  }
  @scala.inline
  implicit class ChartAnnotationsOps[Self <: ChartAnnotations] (val x: Self) extends AnyVal {
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
    def setBoxStyle(value: ChartBoxStyle): Self = this.set("boxStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxStyle: Self = this.set("boxStyle", js.undefined)
    @scala.inline
    def setDatum(value: ChartStemAndStyle): Self = this.set("datum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatum: Self = this.set("datum", js.undefined)
    @scala.inline
    def setDomain(value: ChartStemAndStyle): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setHighContrast(value: Boolean): Self = this.set("highContrast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighContrast: Self = this.set("highContrast", js.undefined)
    @scala.inline
    def setStem(value: ChartStem): Self = this.set("stem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStem: Self = this.set("stem", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTextStyle(value: ChartTextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}

