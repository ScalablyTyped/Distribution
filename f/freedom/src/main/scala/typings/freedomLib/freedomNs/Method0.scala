package typings
package freedomLib.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This generic interface represents any freedom method. Its purpose is to extend
// the basic definition to include the reckless call method, which does not
// produce a reply message.
@js.native
trait Method0[R] extends js.Object {
  def apply(): stdLib.Promise[R] = js.native
  def reckless(): scala.Unit = js.native
}

