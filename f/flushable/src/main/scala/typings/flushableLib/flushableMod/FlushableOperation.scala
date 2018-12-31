package typings
package flushableLib.flushableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushableOperation extends js.Object {
  /** Stops the callback from being executed */
  def cancel(): scala.Unit
  /** Immediately executes the callback */
  def flush(): scala.Unit
  /** Returns whether or not the callback has been executed */
  def pending(): scala.Boolean
}

