package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  def abort(): Unit = js.native
  def send(callback: js.Function1[/* response */ QueryResponse, Unit]): Unit = js.native
  def setQuery(queryString: String): Unit = js.native
  def setRefreshInterval(intervalSeconds: Double): Unit = js.native
  def setTimeout(timeoutSeconds: Double): Unit = js.native
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
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def setSend(value: js.Function1[/* response */ QueryResponse, Unit] => Unit): Self = this.set("send", js.Any.fromFunction1(value))
    @scala.inline
    def setSetQuery(value: String => Unit): Self = this.set("setQuery", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRefreshInterval(value: Double => Unit): Self = this.set("setRefreshInterval", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTimeout(value: Double => Unit): Self = this.set("setTimeout", js.Any.fromFunction1(value))
  }
  
}

