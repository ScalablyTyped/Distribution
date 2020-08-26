package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrimaryXAxisMultiLevelLabel extends js.Object {
  /** Options for customizing the border of the series.
    */
  var border: js.UndefOr[PrimaryXAxisMultiLevelLabelsBorder] = js.native
  /** Ending value of the multi level labels.
    * @Default {null}
    */
  var end: js.UndefOr[js.Any] = js.native
  /** Options for customizing the font of the text.
    */
  var font: js.UndefOr[PrimaryXAxisMultiLevelLabelsFont] = js.native
  /** Specifies the level of multi level labels.
    * @Default {0}
    */
  var level: js.UndefOr[Double] = js.native
  /** Specifies the maximum width of the text in multi level labels.
    * @Default {null}
    */
  var maximumTextWidth: js.UndefOr[Double] = js.native
  /** Starting value of the multi level labels.
    * @Default {null}
    */
  var start: js.UndefOr[js.Any] = js.native
  /** Text of the multi level labels.
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the alignment of the text in multi level labels.
    * @Default {center. See TextAlignment}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.native
  /** Specifies the handling of text over flow in multi level labels.
    * @Default {center. See TextOverflow}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.native
  /** Visibility of the multi level labels.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object PrimaryXAxisMultiLevelLabel {
  @scala.inline
  def apply(): PrimaryXAxisMultiLevelLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryXAxisMultiLevelLabel]
  }
  @scala.inline
  implicit class PrimaryXAxisMultiLevelLabelOps[Self <: PrimaryXAxisMultiLevelLabel] (val x: Self) extends AnyVal {
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
    def setBorder(value: PrimaryXAxisMultiLevelLabelsBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setEnd(value: js.Any): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFont(value: PrimaryXAxisMultiLevelLabelsFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMaximumTextWidth(value: Double): Self = this.set("maximumTextWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumTextWidth: Self = this.set("maximumTextWidth", js.undefined)
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextAlignment(value: TextAlignment | String): Self = this.set("textAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlignment: Self = this.set("textAlignment", js.undefined)
    @scala.inline
    def setTextOverflow(value: TextOverflow | String): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

