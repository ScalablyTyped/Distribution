package typings.googleVisualization.global.google.visualization

import typings.googleVisualization.google.visualization.QueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.Query")
@js.native
class Query protected ()
  extends typings.googleVisualization.google.visualization.Query {
  def this(dataSourceUrl: String) = this()
  def this(dataSourceUrl: String, options: QueryOptions) = this()
  /* CompleteClass */
  override def abort(): Unit = js.native
  /* CompleteClass */
  override def send(
    callback: js.Function1[
      /* response */ typings.googleVisualization.google.visualization.QueryResponse, 
      Unit
    ]
  ): Unit = js.native
  /* CompleteClass */
  override def setQuery(queryString: String): Unit = js.native
  /* CompleteClass */
  override def setRefreshInterval(intervalSeconds: Double): Unit = js.native
  /* CompleteClass */
  override def setTimeout(timeoutSeconds: Double): Unit = js.native
}

