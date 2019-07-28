package typings.egg.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBoot extends js.Object {
  /**
    * Do some thing before app close
    */
  var beforeClose: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  /**
    * Config, plugin files have loaded
    */
  var configDidLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Ready to call configDidLoad,
    * Config, plugin files are referred,
    * this is the last chance to modify the config.
    */
  var configWillLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * All files have loaded, start plugin here
    */
  var didLoad: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  /**
    * Worker is ready, can do some things,
    * don't need to block the app boot
    */
  var didReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  /**
    * Server is listening
    */
  var serverDidReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  /**
    * All plugins have started, can do some thing before app ready
    */
  var willReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
}

object IBoot {
  @scala.inline
  def apply(
    beforeClose: () => js.Promise[Unit] = null,
    configDidLoad: () => Unit = null,
    configWillLoad: () => Unit = null,
    didLoad: () => js.Promise[Unit] = null,
    didReady: () => js.Promise[Unit] = null,
    serverDidReady: () => js.Promise[Unit] = null,
    willReady: () => js.Promise[Unit] = null
  ): IBoot = {
    val __obj = js.Dynamic.literal()
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction0(beforeClose))
    if (configDidLoad != null) __obj.updateDynamic("configDidLoad")(js.Any.fromFunction0(configDidLoad))
    if (configWillLoad != null) __obj.updateDynamic("configWillLoad")(js.Any.fromFunction0(configWillLoad))
    if (didLoad != null) __obj.updateDynamic("didLoad")(js.Any.fromFunction0(didLoad))
    if (didReady != null) __obj.updateDynamic("didReady")(js.Any.fromFunction0(didReady))
    if (serverDidReady != null) __obj.updateDynamic("serverDidReady")(js.Any.fromFunction0(serverDidReady))
    if (willReady != null) __obj.updateDynamic("willReady")(js.Any.fromFunction0(willReady))
    __obj.asInstanceOf[IBoot]
  }
}

