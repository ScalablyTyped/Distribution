package typings.detox.mod.global.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetoxInitOptions extends js.Object {
  
  /**
    * Detox exports device, expect, element, by and waitFor as globals by default, if you want to control their initialization manually, set init detox with initGlobals set to false.
    * This is useful when during E2E tests you also need to run regular expectations in node. jest Expect for instance, will not be overriden by Detox when this option is used.
    */
  var initGlobals: js.UndefOr[Boolean] = js.native
  
  /**
    * By default await detox.init(config); will launch the installed app. If you wish to control when your app is launched, add {launchApp: false} param to your init.
    */
  var launchApp: js.UndefOr[Boolean] = js.native
  
  /**
    * By default await detox.init(config); will uninstall and install the app. If you wish to reuse the existing app for a faster run, add {reuse: true} param to your init.
    */
  var reuse: js.UndefOr[Boolean] = js.native
}
object DetoxInitOptions {
  
  @scala.inline
  def apply(): DetoxInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetoxInitOptions]
  }
  
  @scala.inline
  implicit class DetoxInitOptionsOps[Self <: DetoxInitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInitGlobals(value: Boolean): Self = this.set("initGlobals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitGlobals: Self = this.set("initGlobals", js.undefined)
    
    @scala.inline
    def setLaunchApp(value: Boolean): Self = this.set("launchApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchApp: Self = this.set("launchApp", js.undefined)
    
    @scala.inline
    def setReuse(value: Boolean): Self = this.set("reuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReuse: Self = this.set("reuse", js.undefined)
  }
}
