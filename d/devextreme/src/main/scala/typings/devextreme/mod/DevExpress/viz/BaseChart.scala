package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseChart extends BaseWidget {
  
  /**
    * [descr:BaseChart.clearSelection()]
    */
  def clearSelection(): Unit = js.native
  
  /**
    * [descr:BaseChart.getAllSeries()]
    */
  def getAllSeries(): js.Array[baseSeriesObject] = js.native
  
  /**
    * [descr:DataHelperMixin.getDataSource()]
    */
  def getDataSource(): DataSource = js.native
  
  /**
    * [descr:BaseChart.getSeriesByName(seriesName)]
    */
  def getSeriesByName(seriesName: js.Any): chartSeriesObject = js.native
  
  /**
    * [descr:BaseChart.getSeriesByPos(seriesIndex)]
    */
  def getSeriesByPos(seriesIndex: Double): chartSeriesObject = js.native
  
  /**
    * [descr:BaseChart.hideTooltip()]
    */
  def hideTooltip(): Unit = js.native
  
  /**
    * [descr:BaseChart.refresh()]
    */
  def refresh(): Unit = js.native
  
  /**
    * [descr:BaseChart.render(renderOptions)]
    */
  def render(renderOptions: js.Any): Unit = js.native
}
