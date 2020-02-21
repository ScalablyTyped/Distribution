package typings.dockerEvents.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DockerEvents extends EventEmitter {
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

