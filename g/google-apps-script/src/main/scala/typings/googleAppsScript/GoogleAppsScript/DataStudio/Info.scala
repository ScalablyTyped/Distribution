package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains info data for the config. Its properties determine how the info is displayed in Data
  * Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info1 = config.newInfo()
  *       .setId("info1")
  *       .setText("This text gives some context on the configuration.");
  */
@js.native
trait Info extends js.Object {
  def setId(id: String): Info = js.native
  def setText(text: String): Info = js.native
}

object Info {
  @scala.inline
  def apply(setId: String => Info, setText: String => Info): Info = {
    val __obj = js.Dynamic.literal(setId = js.Any.fromFunction1(setId), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[Info]
  }
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
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
    def setSetId(value: String => Info): Self = this.set("setId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetText(value: String => Info): Self = this.set("setText", js.Any.fromFunction1(value))
  }
  
}

