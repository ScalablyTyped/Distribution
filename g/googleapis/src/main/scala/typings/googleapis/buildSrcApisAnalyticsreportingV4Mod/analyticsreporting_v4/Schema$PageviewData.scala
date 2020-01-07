package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents details collected when the visitor views a page.
  */
@js.native
trait Schema$PageviewData extends js.Object {
  /**
    * The URL of the page that the visitor viewed.
    */
  var pagePath: js.UndefOr[String] = js.native
  /**
    * The title of the page that the visitor viewed.
    */
  var pageTitle: js.UndefOr[String] = js.native
}

object Schema$PageviewData {
  @scala.inline
  def apply(pagePath: String = null, pageTitle: String = null): Schema$PageviewData = {
    val __obj = js.Dynamic.literal()
    if (pagePath != null) __obj.updateDynamic("pagePath")(pagePath.asInstanceOf[js.Any])
    if (pageTitle != null) __obj.updateDynamic("pageTitle")(pageTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PageviewData]
  }
}

