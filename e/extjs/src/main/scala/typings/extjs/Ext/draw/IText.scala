package typings.extjs.Ext.draw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IText extends IComponent {
  /** [Config Option] (Number) */
  var degrees: js.UndefOr[Double] = js.native
  /** [Method] Sets the clockwise rotation angle relative to the horizontal axis
    * @param degrees Number The clockwise angle (in degrees) from the horizontal axis by which the text should be rotated.
    */
  var setAngle: js.UndefOr[js.Function1[/* degrees */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Updates this item s text
    * @param t String The text to display (html not accepted).
    */
  var setText: js.UndefOr[js.Function1[/* t */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var styleSelector: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
}

object IText {
  @scala.inline
  def apply(): IText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IText]
  }
  @scala.inline
  implicit class ITextOps[Self <: IText] (val x: Self) extends AnyVal {
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
    def setDegrees(value: Double): Self = this.set("degrees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDegrees: Self = this.set("degrees", js.undefined)
    @scala.inline
    def setSetAngle(value: /* degrees */ js.UndefOr[Double] => Unit): Self = this.set("setAngle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAngle: Self = this.set("setAngle", js.undefined)
    @scala.inline
    def setSetText(value: /* t */ js.UndefOr[String] => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetText: Self = this.set("setText", js.undefined)
    @scala.inline
    def setStyleSelector(value: String): Self = this.set("styleSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleSelector: Self = this.set("styleSelector", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

