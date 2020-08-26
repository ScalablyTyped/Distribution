package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The connection site on a PageElement that can connect to a connector.
  */
@js.native
trait ConnectionSite extends js.Object {
  def getIndex(): Integer = js.native
  def getPageElement(): PageElement = js.native
}

object ConnectionSite {
  @scala.inline
  def apply(getIndex: () => Integer, getPageElement: () => PageElement): ConnectionSite = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex), getPageElement = js.Any.fromFunction0(getPageElement))
    __obj.asInstanceOf[ConnectionSite]
  }
  @scala.inline
  implicit class ConnectionSiteOps[Self <: ConnectionSite] (val x: Self) extends AnyVal {
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
    def setGetIndex(value: () => Integer): Self = this.set("getIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPageElement(value: () => PageElement): Self = this.set("getPageElement", js.Any.fromFunction0(value))
  }
  
}

