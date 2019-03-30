package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var pageObjectId: js.UndefOr[java.lang.String] = js.undefined
  var relativeLink: js.UndefOr[java.lang.String] = js.undefined
  var slideIndex: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    pageObjectId: java.lang.String = null,
    relativeLink: java.lang.String = null,
    slideIndex: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): Link = {
    val __obj = js.Dynamic.literal()
    if (pageObjectId != null) __obj.updateDynamic("pageObjectId")(pageObjectId)
    if (relativeLink != null) __obj.updateDynamic("relativeLink")(relativeLink)
    if (slideIndex != null) __obj.updateDynamic("slideIndex")(slideIndex.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Link]
  }
}

