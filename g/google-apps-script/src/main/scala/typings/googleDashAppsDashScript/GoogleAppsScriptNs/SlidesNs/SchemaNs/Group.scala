package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  var children: js.UndefOr[
    js.Array[
      typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.PageElement
    ]
  ] = js.undefined
}

object Group {
  @scala.inline
  def apply(
    children: js.Array[
      typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.PageElement
    ] = null
  ): Group = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Group]
  }
}

