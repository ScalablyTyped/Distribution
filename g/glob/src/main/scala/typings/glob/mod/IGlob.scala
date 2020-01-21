package typings.glob.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlob
  extends EventEmitter
     with IGlobBase {
  def abort(): Unit = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
}

