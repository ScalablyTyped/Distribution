package typings.expo.anon

import typings.expo.appLoadingMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoHideSplash extends Props {
  
  var autoHideSplash: js.UndefOr[Boolean] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ typings.std.Error, Unit]] = js.native
  
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.native
  
  var startAsync: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.native
}
object AutoHideSplash {
  
  @scala.inline
  def apply(): AutoHideSplash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoHideSplash]
  }
  
  @scala.inline
  implicit class AutoHideSplashOps[Self <: AutoHideSplash] (val x: Self) extends AnyVal {
    
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
    def setAutoHideSplash(value: Boolean): Self = this.set("autoHideSplash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHideSplash: Self = this.set("autoHideSplash", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ typings.std.Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnFinish(value: () => Unit): Self = this.set("onFinish", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFinish: Self = this.set("onFinish", js.undefined)
    
    @scala.inline
    def setStartAsync(value: () => js.Promise[Unit]): Self = this.set("startAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStartAsync: Self = this.set("startAsync", js.undefined)
  }
}
