package typings
package eventsourceLib.eventsourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSource extends js.Object {
  val CLOSED: scala.Double = js.native
  val CONNECTING: scala.Double = js.native
  val OPEN: scala.Double = js.native
  val readyState: scala.Double = js.native
  val url: java.lang.String = js.native
  val withCredentials: scala.Boolean = js.native
  def addEventListener(`type`: java.lang.String, listener: eventsourceLib.EventListener): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def dispatchEvent(evt: eventsourceLib.Event): scala.Boolean = js.native
  def onerror(evt: eventsourceLib.MessageEvent): js.Any = js.native
  def onmessage(evt: eventsourceLib.MessageEvent): js.Any = js.native
  def onopen(evt: eventsourceLib.MessageEvent): js.Any = js.native
  def removeEventListener(`type`: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: eventsourceLib.EventListener): scala.Unit = js.native
}

