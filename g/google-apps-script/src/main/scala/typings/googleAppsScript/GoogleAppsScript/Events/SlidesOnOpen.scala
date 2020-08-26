package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import typings.googleAppsScript.GoogleAppsScript.Slides.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlidesOnOpen extends AppsScriptEvent {
  var source: Presentation = js.native
}

object SlidesOnOpen {
  @scala.inline
  def apply(authMode: AuthMode, source: Presentation, triggerUid: String, user: User): SlidesOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlidesOnOpen]
  }
  @scala.inline
  implicit class SlidesOnOpenOps[Self <: SlidesOnOpen] (val x: Self) extends AnyVal {
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
    def setSource(value: Presentation): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

