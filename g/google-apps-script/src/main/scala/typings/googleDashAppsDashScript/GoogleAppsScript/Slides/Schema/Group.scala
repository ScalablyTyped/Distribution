package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var children: js.UndefOr[
    js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.PageElement]
  ] = js.undefined
}

object Group {
  @scala.inline
  def apply(
    children: js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema.PageElement] = null
  ): Group = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Group]
  }
}

