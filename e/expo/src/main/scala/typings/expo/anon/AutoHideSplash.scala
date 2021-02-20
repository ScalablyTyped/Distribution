package typings.expo.anon

import typings.expo.appLoadingMod.Props
import org.scalablytyped.runtime.StObject
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
  implicit class AutoHideSplashMutableBuilder[Self <: AutoHideSplash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoHideSplash(value: Boolean): Self = StObject.set(x, "autoHideSplash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideSplashUndefined: Self = StObject.set(x, "autoHideSplash", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ typings.std.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    
    @scala.inline
    def setStartAsync(value: () => js.Promise[Unit]): Self = StObject.set(x, "startAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartAsyncUndefined: Self = StObject.set(x, "startAsync", js.undefined)
  }
}
