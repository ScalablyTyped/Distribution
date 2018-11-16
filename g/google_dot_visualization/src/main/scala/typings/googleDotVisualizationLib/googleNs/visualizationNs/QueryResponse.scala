package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.QueryResponse")
@js.native
class QueryResponse protected () extends js.Object {
  def this(responseObject: js.Object) = this()
  def getDataTable(): DataTable = js.native
  def getDetailedMessage(): java.lang.String = js.native
  def getMessage(): java.lang.String = js.native
  def getReasons(): js.Array[java.lang.String] = js.native
  def hasWarning(): scala.Boolean = js.native
  def isError(): scala.Boolean = js.native
}

