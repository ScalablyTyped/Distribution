package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagelocation
  extends /* key */ StringDictionary[js.Any] {
  var page_location: js.UndefOr[String] = js.native
  var page_path: js.UndefOr[String] = js.native
  var page_title: js.UndefOr[String] = js.native
}

object Pagelocation {
  @scala.inline
  def apply(): Pagelocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pagelocation]
  }
  @scala.inline
  implicit class PagelocationOps[Self <: Pagelocation] (val x: Self) extends AnyVal {
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
    def setPage_location(value: String): Self = this.set("page_location", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage_location: Self = this.set("page_location", js.undefined)
    @scala.inline
    def setPage_path(value: String): Self = this.set("page_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage_path: Self = this.set("page_path", js.undefined)
    @scala.inline
    def setPage_title(value: String): Self = this.set("page_title", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage_title: Self = this.set("page_title", js.undefined)
  }
  
}

