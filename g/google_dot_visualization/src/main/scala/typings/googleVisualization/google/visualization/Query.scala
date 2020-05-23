package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  def abort(): Unit
  def send(callback: js.Function1[/* response */ QueryResponse, Unit]): Unit
  def setQuery(queryString: String): Unit
  def setRefreshInterval(intervalSeconds: Double): Unit
  def setTimeout(timeoutSeconds: Double): Unit
}

object Query {
  @scala.inline
  def apply(
    abort: () => Unit,
    send: js.Function1[/* response */ QueryResponse, Unit] => Unit,
    setQuery: String => Unit,
    setRefreshInterval: Double => Unit,
    setTimeout: Double => Unit
  ): Query = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), send = js.Any.fromFunction1(send), setQuery = js.Any.fromFunction1(setQuery), setRefreshInterval = js.Any.fromFunction1(setRefreshInterval), setTimeout = js.Any.fromFunction1(setTimeout))
    __obj.asInstanceOf[Query]
  }
}

