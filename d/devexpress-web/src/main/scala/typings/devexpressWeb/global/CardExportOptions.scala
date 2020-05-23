package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Card dashboard item is exported.
  */
@JSGlobal("CardExportOptions")
@js.native
class CardExportOptions ()
  extends typings.devexpressWeb.CardExportOptions {
  /** @deprecated The CardExportOptions.AutoArrangeContent property is obsolete now. Use the DashboardPdfExportOptions.CardAutoArrangeContent property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets whether dashboard item elements are arranged automatically on the exported page.
    */
  /* CompleteClass */
  override var AutoArrangeContent: Boolean = js.native
}

