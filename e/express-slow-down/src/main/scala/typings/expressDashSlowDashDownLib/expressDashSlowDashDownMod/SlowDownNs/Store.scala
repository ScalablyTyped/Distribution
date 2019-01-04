package typings
package expressDashSlowDashDownLib.expressDashSlowDashDownMod.SlowDownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  def decrement(key: java.lang.String): scala.Unit
  def incr(key: java.lang.String, cb: StoreIncrementCallback): scala.Unit
  def resetKey(key: java.lang.String): scala.Unit
}

