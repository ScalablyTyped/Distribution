package typings.ftPoller.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Poller[PollerData, ExternalData] extends js.Object {
  def fetch(): Unit = js.native
  def getData(): PollerData = js.native
  def isRunning(): Boolean = js.native
  def retry(): Unit = js.native
  def start(): js.Promise[PollerData] = js.native
  def start(options: Options): js.Promise[PollerData] = js.native
  def stop(): Boolean = js.native
}

