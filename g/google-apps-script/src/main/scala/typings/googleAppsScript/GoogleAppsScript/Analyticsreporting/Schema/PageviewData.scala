package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageviewData extends js.Object {
  var pagePath: js.UndefOr[String] = js.native
  var pageTitle: js.UndefOr[String] = js.native
}

object PageviewData {
  @scala.inline
  def apply(): PageviewData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageviewData]
  }
  @scala.inline
  implicit class PageviewDataOps[Self <: PageviewData] (val x: Self) extends AnyVal {
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
    def setPagePath(value: String): Self = this.set("pagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagePath: Self = this.set("pagePath", js.undefined)
    @scala.inline
    def setPageTitle(value: String): Self = this.set("pageTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageTitle: Self = this.set("pageTitle", js.undefined)
  }
  
}

