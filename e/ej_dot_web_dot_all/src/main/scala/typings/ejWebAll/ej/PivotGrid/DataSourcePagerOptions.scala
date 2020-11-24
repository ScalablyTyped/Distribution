package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourcePagerOptions extends js.Object {
  
  /** Allows to set the page number to be loaded in the categorical axis by default.
    * @Default {1}
    */
  var categoricalCurrentPage: js.UndefOr[Double] = js.native
  
  /** Allows to set the number of categorical columns to be displayed in each page on applying the paging.
    * @Default {0}
    */
  var categoricalPageSize: js.UndefOr[Double] = js.native
  
  /** Allows to set the page number to be loaded in the series axis by default.
    * @Default {1}
    */
  var seriesCurrentPage: js.UndefOr[Double] = js.native
  
  /** Allows to set the number of series rows to be displayed in each page on applying the paging.
    * @Default {0}
    */
  var seriesPageSize: js.UndefOr[Double] = js.native
}
object DataSourcePagerOptions {
  
  @scala.inline
  def apply(): DataSourcePagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourcePagerOptions]
  }
  
  @scala.inline
  implicit class DataSourcePagerOptionsOps[Self <: DataSourcePagerOptions] (val x: Self) extends AnyVal {
    
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
    def setCategoricalPageSize(value: Double): Self = this.set("categoricalPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoricalPageSize: Self = this.set("categoricalPageSize", js.undefined)
    
    @scala.inline
    def setSeriesCurrentPage(value: Double): Self = this.set("seriesCurrentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesCurrentPage: Self = this.set("seriesCurrentPage", js.undefined)
    
    @scala.inline
    def setSeriesPageSize(value: Double): Self = this.set("seriesPageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesPageSize: Self = this.set("seriesPageSize", js.undefined)
  }
}
