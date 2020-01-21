package typings.enquireJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If set to true, defers execution of the setup function until the first time the media query is matched
    */
  var deferSetup: js.UndefOr[Boolean] = js.undefined
  /**
    * If supplied, triggered when handler is unregistered. Place cleanup code here
    */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If supplied, triggered when a media query matches.
    */
  var `match`: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If supplied, triggered once, when the handler is registered.
    */
  var setup: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If supplied, triggered when the media query transitions from a matched state to an unmatched state.
    */
  var unmatch: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    deferSetup: js.UndefOr[Boolean] = js.undefined,
    destroy: () => Unit = null,
    `match`: () => Unit = null,
    setup: () => Unit = null,
    unmatch: () => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deferSetup)) __obj.updateDynamic("deferSetup")(deferSetup.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction0(`match`))
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction0(setup))
    if (unmatch != null) __obj.updateDynamic("unmatch")(js.Any.fromFunction0(unmatch))
    __obj.asInstanceOf[Options]
  }
}

