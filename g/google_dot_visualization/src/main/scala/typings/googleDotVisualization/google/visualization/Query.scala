package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.Query")
@js.native
class Query protected () extends js.Object {
  def this(dataSourceUrl: String) = this()
  def this(dataSourceUrl: String, options: QueryOptions) = this()
  def abort(): Unit = js.native
  def send(callback: js.Function1[/* response */ QueryResponse, Unit]): Unit = js.native
  def setQuery(queryString: String): Unit = js.native
  def setRefreshInterval(intervalSeconds: Double): Unit = js.native
  def setTimeout(timeoutSeconds: Double): Unit = js.native
}

