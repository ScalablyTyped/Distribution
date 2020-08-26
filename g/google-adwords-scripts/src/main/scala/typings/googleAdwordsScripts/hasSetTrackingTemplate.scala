package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasSetTrackingTemplate extends js.Object {
  def setCustomParameters(customParameters: js.Object): Unit = js.native
  def setTrackingTemplate(trackingTemplate: String): Unit = js.native
}

object hasSetTrackingTemplate {
  @scala.inline
  def apply(setCustomParameters: js.Object => Unit, setTrackingTemplate: String => Unit): hasSetTrackingTemplate = {
    val __obj = js.Dynamic.literal(setCustomParameters = js.Any.fromFunction1(setCustomParameters), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
    __obj.asInstanceOf[hasSetTrackingTemplate]
  }
  @scala.inline
  implicit class hasSetTrackingTemplateOps[Self <: hasSetTrackingTemplate] (val x: Self) extends AnyVal {
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
    def setSetCustomParameters(value: js.Object => Unit): Self = this.set("setCustomParameters", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTrackingTemplate(value: String => Unit): Self = this.set("setTrackingTemplate", js.Any.fromFunction1(value))
  }
  
}

