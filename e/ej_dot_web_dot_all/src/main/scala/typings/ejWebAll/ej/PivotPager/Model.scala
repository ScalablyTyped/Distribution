package typings.ejWebAll.ej.PivotPager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Contains the current page number in categorical axis.
    * @Default {1}
    */
  var categoricalCurrentPage: js.UndefOr[Double] = js.native
  /** Contains the total page count in categorical axis.
    * @Default {1}
    */
  var categoricalPageCount: js.UndefOr[Double] = js.native
  /** Allows the user to set the localized language for the widget.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the pager mode (Only Categorical Pager/Only Series Pager/Both) for the PivotPager.
    * @Default {ej.PivotPager.Mode.Both}
    */
  var mode: js.UndefOr[Mode | String] = js.native
  /** Contains the current page number in series axis.
    * @Default {1}
    */
  var seriesCurrentPage: js.UndefOr[Double] = js.native
  /** Contains the total page count in series axis.
    * @Default {1}
    */
  var seriesPageCount: js.UndefOr[Double] = js.native
  /** Contains the ID of the target element for which paging needs to be done.
    * @Default {â€œâ€}
    */
  var targetControlID: js.UndefOr[String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setCategoricalCurrentPage(value: Double): Self = this.set("categoricalCurrentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoricalCurrentPage: Self = this.set("categoricalCurrentPage", js.undefined)
    @scala.inline
    def setCategoricalPageCount(value: Double): Self = this.set("categoricalPageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoricalPageCount: Self = this.set("categoricalPageCount", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMode(value: Mode | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setSeriesCurrentPage(value: Double): Self = this.set("seriesCurrentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesCurrentPage: Self = this.set("seriesCurrentPage", js.undefined)
    @scala.inline
    def setSeriesPageCount(value: Double): Self = this.set("seriesPageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesPageCount: Self = this.set("seriesPageCount", js.undefined)
    @scala.inline
    def setTargetControlID(value: String): Self = this.set("targetControlID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetControlID: Self = this.set("targetControlID", js.undefined)
  }
  
}

