package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.Query")
@js.native
class Query protected () extends js.Object {
  def this(dataSourceUrl: java.lang.String) = this()
  def this(dataSourceUrl: java.lang.String, options: QueryOptions) = this()
  def abort(): scala.Unit = js.native
  def send(callback: js.Function1[/* response */ QueryResponse, scala.Unit]): scala.Unit = js.native
  def setQuery(queryString: java.lang.String): scala.Unit = js.native
  def setRefreshInterval(intervalSeconds: scala.Double): scala.Unit = js.native
  def setTimeout(timeoutSeconds: scala.Double): scala.Unit = js.native
}

