package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.QueryResponse")
@js.native
class QueryResponse protected () extends js.Object {
  def this(responseObject: js.Object) = this()
  def getDataTable(): DataTable = js.native
  def getDetailedMessage(): String = js.native
  def getMessage(): String = js.native
  def getReasons(): js.Array[String] = js.native
  def hasWarning(): Boolean = js.native
  def isError(): Boolean = js.native
}

