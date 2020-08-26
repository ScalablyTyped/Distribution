package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hasTrackingTemplateBuilder[B] extends js.Object {
  def withCustomParameters(customParameters: js.Object): B = js.native
  def withTrackingTemplate(trackingTemplate: String): B = js.native
}

object hasTrackingTemplateBuilder {
  @scala.inline
  def apply[B](withCustomParameters: js.Object => B, withTrackingTemplate: String => B): hasTrackingTemplateBuilder[B] = {
    val __obj = js.Dynamic.literal(withCustomParameters = js.Any.fromFunction1(withCustomParameters), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[hasTrackingTemplateBuilder[B]]
  }
  @scala.inline
  implicit class hasTrackingTemplateBuilderOps[Self <: hasTrackingTemplateBuilder[_], B] (val x: Self with hasTrackingTemplateBuilder[B]) extends AnyVal {
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
    def setWithCustomParameters(value: js.Object => B): Self = this.set("withCustomParameters", js.Any.fromFunction1(value))
    @scala.inline
    def setWithTrackingTemplate(value: String => B): Self = this.set("withTrackingTemplate", js.Any.fromFunction1(value))
  }
  
}

