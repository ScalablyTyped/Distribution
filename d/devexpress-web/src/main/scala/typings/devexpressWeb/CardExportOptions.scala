package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Card dashboard item is exported.
  */
trait CardExportOptions extends js.Object {
  /** @deprecated The CardExportOptions.AutoArrangeContent property is obsolete now. Use the DashboardPdfExportOptions.CardAutoArrangeContent property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether dashboard item elements are arranged automatically on the exported page.
    */
  var AutoArrangeContent: Boolean
}

object CardExportOptions {
  @scala.inline
  def apply(AutoArrangeContent: Boolean): CardExportOptions = {
    val __obj = js.Dynamic.literal(AutoArrangeContent = AutoArrangeContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardExportOptions]
  }
}

