package typings
package freedomLib.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A Freedom module sub is both a function and an object with members. The
// type |T| is the type of the module's stub interface.
@js.native
trait FreedomModuleFactoryManager[T] extends js.Object {
  var api: java.lang.String = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def apply(args: js.Any*): T = js.native
  // This is the call to close a particular stub's channel and resources. It
  // is assumed that the argument is a result of the factory constructor. If
  // no argument is supplied, all stubs are closed.
  def close(): js.Promise[scala.Unit] = js.native
  // This is the call to close a particular stub's channel and resources. It
  // is assumed that the argument is a result of the factory constructor. If
  // no argument is supplied, all stubs are closed.
  def close(freedomModuleStubInstance: T): js.Promise[scala.Unit] = js.native
}

