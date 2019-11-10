package typings.fridaDashGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyEventCallbacks[D, T, S] extends js.Object {
  /**
    * Gets notified right after the object has been deallocated.
    *
    * This is where you might clean up any associated state.
    */
  var dealloc: js.UndefOr[js.ThisFunction0[/* this */ UserMethodInvocation[D, T, S], Unit]] = js.undefined
  /**
    * Gets notified about the method name that we’re about to forward
    * a call to.
    *
    * This might be where you’d start out with a temporary callback
    * that just logs the names to help you decide which methods to
    * override.
    *
    * @param name Name of method that is about to get called.
    */
  var forward: js.UndefOr[
    js.ThisFunction1[/* this */ UserMethodInvocation[D, T, S], /* name */ String, Unit]
  ] = js.undefined
}

object ProxyEventCallbacks {
  @scala.inline
  def apply[D, T, S](
    dealloc: js.ThisFunction0[/* this */ UserMethodInvocation[D, T, S], Unit] = null,
    forward: js.ThisFunction1[/* this */ UserMethodInvocation[D, T, S], /* name */ String, Unit] = null
  ): ProxyEventCallbacks[D, T, S] = {
    val __obj = js.Dynamic.literal()
    if (dealloc != null) __obj.updateDynamic("dealloc")(dealloc)
    if (forward != null) __obj.updateDynamic("forward")(forward)
    __obj.asInstanceOf[ProxyEventCallbacks[D, T, S]]
  }
}

