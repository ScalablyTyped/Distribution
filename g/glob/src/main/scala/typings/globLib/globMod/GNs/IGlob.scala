package typings
package globLib.globMod.GNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGlob
  extends nodeLib.eventsMod.EventEmitter
     with IGlobBase {
  def abort(): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
}

