package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSettings extends js.Object {
  /** Specifies the print layout orientation.
    * @Default {null}
    */
  var orientation: js.UndefOr[Orientation | String] = js.undefined
  /** Specifies the paper size of print layout.
    * @Default {null}
    */
  var paperSize: js.UndefOr[PaperSize | String] = js.undefined
}

object PageSettings {
  @scala.inline
  def apply(orientation: Orientation | String = null, paperSize: PaperSize | String = null): PageSettings = {
    val __obj = js.Dynamic.literal()
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (paperSize != null) __obj.updateDynamic("paperSize")(paperSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSettings]
  }
}

