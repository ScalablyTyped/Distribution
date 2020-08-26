package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaselineValueFormat extends js.Object {
  /** The comparison type of key value with baseline value. */
  var comparisonType: js.UndefOr[String] = js.native
  /**
    * Description which is appended after the baseline value.
    * This field is optional.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Color to be used, in case baseline value represents a negative change for
    * key value. This field is optional.
    */
  var negativeColor: js.UndefOr[Color] = js.native
  /**
    * Color to be used, in case baseline value represents a negative change for
    * key value. This field is optional.
    * If negative_color is also set, this field takes precedence.
    */
  var negativeColorStyle: js.UndefOr[ColorStyle] = js.native
  /**
    * Specifies the horizontal text positioning of baseline value.
    * This field is optional. If not specified, default positioning is used.
    */
  var position: js.UndefOr[TextPosition] = js.native
  /**
    * Color to be used, in case baseline value represents a positive change for
    * key value. This field is optional.
    */
  var positiveColor: js.UndefOr[Color] = js.native
  /**
    * Color to be used, in case baseline value represents a positive change for
    * key value. This field is optional.
    * If positive_color is also set, this field takes precedence.
    */
  var positiveColorStyle: js.UndefOr[ColorStyle] = js.native
  /** Text formatting options for baseline value. */
  var textFormat: js.UndefOr[TextFormat] = js.native
}

object BaselineValueFormat {
  @scala.inline
  def apply(): BaselineValueFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaselineValueFormat]
  }
  @scala.inline
  implicit class BaselineValueFormatOps[Self <: BaselineValueFormat] (val x: Self) extends AnyVal {
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
    def setComparisonType(value: String): Self = this.set("comparisonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparisonType: Self = this.set("comparisonType", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setNegativeColor(value: Color): Self = this.set("negativeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeColor: Self = this.set("negativeColor", js.undefined)
    @scala.inline
    def setNegativeColorStyle(value: ColorStyle): Self = this.set("negativeColorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeColorStyle: Self = this.set("negativeColorStyle", js.undefined)
    @scala.inline
    def setPosition(value: TextPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositiveColor(value: Color): Self = this.set("positiveColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositiveColor: Self = this.set("positiveColor", js.undefined)
    @scala.inline
    def setPositiveColorStyle(value: ColorStyle): Self = this.set("positiveColorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositiveColorStyle: Self = this.set("positiveColorStyle", js.undefined)
    @scala.inline
    def setTextFormat(value: TextFormat): Self = this.set("textFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextFormat: Self = this.set("textFormat", js.undefined)
  }
  
}

