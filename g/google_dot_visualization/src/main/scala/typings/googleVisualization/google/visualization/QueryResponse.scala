package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResponse extends js.Object {
  def getDataTable(): DataTable
  def getDetailedMessage(): String
  def getMessage(): String
  def getReasons(): js.Array[String]
  def hasWarning(): Boolean
  def isError(): Boolean
}

object QueryResponse {
  @scala.inline
  def apply(
    getDataTable: () => DataTable,
    getDetailedMessage: () => String,
    getMessage: () => String,
    getReasons: () => js.Array[String],
    hasWarning: () => Boolean,
    isError: () => Boolean
  ): QueryResponse = {
    val __obj = js.Dynamic.literal(getDataTable = js.Any.fromFunction0(getDataTable), getDetailedMessage = js.Any.fromFunction0(getDetailedMessage), getMessage = js.Any.fromFunction0(getMessage), getReasons = js.Any.fromFunction0(getReasons), hasWarning = js.Any.fromFunction0(hasWarning), isError = js.Any.fromFunction0(isError))
    __obj.asInstanceOf[QueryResponse]
  }
}

