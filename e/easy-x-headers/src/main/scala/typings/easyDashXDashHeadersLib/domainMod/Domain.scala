package typings
package easyDashXDashHeadersLib.domainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domain", "Domain")
@js.native
class Domain ()
  extends easyDashXDashHeadersLib.eventsMod.EventEmitter {
  def add(emitter: easyDashXDashHeadersLib.eventsMod.EventEmitter): scala.Unit = js.native
  def bind(cb: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, _]): js.Any = js.native
  def dispose(): scala.Unit = js.native
  def intercept(cb: js.Function1[/* data */ js.Any, _]): js.Any = js.native
  def remove(emitter: easyDashXDashHeadersLib.eventsMod.EventEmitter): scala.Unit = js.native
  def run(fn: js.Function): scala.Unit = js.native
}

