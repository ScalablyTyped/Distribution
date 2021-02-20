package typings.googleVisualization.global.google

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object visualization {
  
  @scala.inline
  def arrayToDataTable(data: js.Array[_]): typings.googleVisualization.google.visualization.DataTable = typings.googleVisualization.global.google.visualization.^.asInstanceOf[js.Dynamic].applyDynamic("arrayToDataTable")(data.asInstanceOf[js.Any]).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  @scala.inline
  def arrayToDataTable(data: js.Array[_], firstRowIsData: scala.Boolean): typings.googleVisualization.google.visualization.DataTable = (typings.googleVisualization.global.google.visualization.^.asInstanceOf[js.Dynamic].applyDynamic("arrayToDataTable")(data.asInstanceOf[js.Any], firstRowIsData.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  
  @scala.inline
  def dataTableToCsv(data: typings.googleVisualization.google.visualization.DataTable): java.lang.String = typings.googleVisualization.global.google.visualization.^.asInstanceOf[js.Dynamic].applyDynamic("dataTableToCsv")(data.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def dataTableToCsv(data: typings.googleVisualization.google.visualization.DataView): java.lang.String = typings.googleVisualization.global.google.visualization.^.asInstanceOf[js.Dynamic].applyDynamic("dataTableToCsv")(data.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
