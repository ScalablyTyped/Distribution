package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access the chart's position within a sheet. Can be updated using the EmbeddedChart.modify() function.
  *
  *     chart = chart.modify().setPosition(5, 5, 0, 0).build();
  *     sheet.updateChart(chart);
  */
trait ContainerInfo extends StObject {
  
  def getAnchorColumn(): Integer
  
  def getAnchorRow(): Integer
  
  def getOffsetX(): Integer
  
  def getOffsetY(): Integer
}
object ContainerInfo {
  
  inline def apply(
    getAnchorColumn: () => Integer,
    getAnchorRow: () => Integer,
    getOffsetX: () => Integer,
    getOffsetY: () => Integer
  ): ContainerInfo = {
    val __obj = js.Dynamic.literal(getAnchorColumn = js.Any.fromFunction0(getAnchorColumn), getAnchorRow = js.Any.fromFunction0(getAnchorRow), getOffsetX = js.Any.fromFunction0(getOffsetX), getOffsetY = js.Any.fromFunction0(getOffsetY))
    __obj.asInstanceOf[ContainerInfo]
  }
  
  extension [Self <: ContainerInfo](x: Self) {
    
    inline def setGetAnchorColumn(value: () => Integer): Self = StObject.set(x, "getAnchorColumn", js.Any.fromFunction0(value))
    
    inline def setGetAnchorRow(value: () => Integer): Self = StObject.set(x, "getAnchorRow", js.Any.fromFunction0(value))
    
    inline def setGetOffsetX(value: () => Integer): Self = StObject.set(x, "getOffsetX", js.Any.fromFunction0(value))
    
    inline def setGetOffsetY(value: () => Integer): Self = StObject.set(x, "getOffsetY", js.Any.fromFunction0(value))
  }
}
