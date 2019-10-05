package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.saveAsPDF")
@js.native
object saveAsPDF extends js.Object {
  /**
    * Saves page in active tab as a PDF file.
    * @param pageSettings The page settings used to save the PDF file.
    */
  def apply(pageSettings: PageSettings): js.Promise[js.UndefOr[String]] = js.native
}

