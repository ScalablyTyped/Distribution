package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageProperties extends js.Object {
  var colorScheme: js.UndefOr[ColorScheme] = js.native
  var pageBackgroundFill: js.UndefOr[PageBackgroundFill] = js.native
}

object PageProperties {
  @scala.inline
  def apply(): PageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageProperties]
  }
  @scala.inline
  implicit class PagePropertiesOps[Self <: PageProperties] (val x: Self) extends AnyVal {
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
    def setColorScheme(value: ColorScheme): Self = this.set("colorScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorScheme: Self = this.set("colorScheme", js.undefined)
    @scala.inline
    def setPageBackgroundFill(value: PageBackgroundFill): Self = this.set("pageBackgroundFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageBackgroundFill: Self = this.set("pageBackgroundFill", js.undefined)
  }
  
}

