package typings.forms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetParameters extends js.Object {
  /** Custom classes to add to the rendered widget. */
  var classes: js.UndefOr[js.Array[String]] = js.native
  /** Custom classes to add to the choices label when applicable (multipleRadio and multipleCheckbox) */
  var labelClasses: js.UndefOr[js.Array[String]] = js.native
  /** A string representing the widget type, e.g. 'text' or 'checkbox' */
  var `type`: js.UndefOr[String] = js.native
}

object WidgetParameters {
  @scala.inline
  def apply(): WidgetParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetParameters]
  }
  @scala.inline
  implicit class WidgetParametersOps[Self <: WidgetParameters] (val x: Self) extends AnyVal {
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
    def setClassesVarargs(value: String*): Self = this.set("classes", js.Array(value :_*))
    @scala.inline
    def setClasses(value: js.Array[String]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setLabelClassesVarargs(value: String*): Self = this.set("labelClasses", js.Array(value :_*))
    @scala.inline
    def setLabelClasses(value: js.Array[String]): Self = this.set("labelClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelClasses: Self = this.set("labelClasses", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

