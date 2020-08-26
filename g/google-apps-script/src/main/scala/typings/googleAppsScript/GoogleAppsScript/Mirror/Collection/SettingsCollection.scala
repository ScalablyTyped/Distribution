package typings.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsCollection extends js.Object {
  // Gets a single setting by ID.
  def get(id: String): Setting = js.native
}

object SettingsCollection {
  @scala.inline
  def apply(get: String => Setting): SettingsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[SettingsCollection]
  }
  @scala.inline
  implicit class SettingsCollectionOps[Self <: SettingsCollection] (val x: Self) extends AnyVal {
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
    def setGet(value: String => Setting): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

