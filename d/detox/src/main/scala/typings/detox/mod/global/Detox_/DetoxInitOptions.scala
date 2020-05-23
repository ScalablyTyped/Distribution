package typings.detox.mod.global.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetoxInitOptions extends js.Object {
  /**
    * Detox exports device, expect, element, by and waitFor as globals by default, if you want to control their initialization manually, set init detox with initGlobals set to false.
    * This is useful when during E2E tests you also need to run regular expectations in node. jest Expect for instance, will not be overriden by Detox when this option is used.
    */
  var initGlobals: js.UndefOr[Boolean] = js.undefined
  /**
    * By default await detox.init(config); will launch the installed app. If you wish to control when your app is launched, add {launchApp: false} param to your init.
    */
  var launchApp: js.UndefOr[Boolean] = js.undefined
  /**
    * By default await detox.init(config); will uninstall and install the app. If you wish to reuse the existing app for a faster run, add {reuse: true} param to your init.
    */
  var reuse: js.UndefOr[Boolean] = js.undefined
}

object DetoxInitOptions {
  @scala.inline
  def apply(
    initGlobals: js.UndefOr[Boolean] = js.undefined,
    launchApp: js.UndefOr[Boolean] = js.undefined,
    reuse: js.UndefOr[Boolean] = js.undefined
  ): DetoxInitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(initGlobals)) __obj.updateDynamic("initGlobals")(initGlobals.get.asInstanceOf[js.Any])
    if (!js.isUndefined(launchApp)) __obj.updateDynamic("launchApp")(launchApp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reuse)) __obj.updateDynamic("reuse")(reuse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetoxInitOptions]
  }
}

