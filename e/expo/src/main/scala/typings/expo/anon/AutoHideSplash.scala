package typings.expo.anon

import typings.expo.appLoadingMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoHideSplash
  extends StObject
     with Props {
  
  var autoHideSplash: js.UndefOr[Boolean] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* error */ typings.std.Error, Unit]] = js.undefined
  
  var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var startAsync: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
}
object AutoHideSplash {
  
  inline def apply(): AutoHideSplash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoHideSplash]
  }
  
  extension [Self <: AutoHideSplash](x: Self) {
    
    inline def setAutoHideSplash(value: Boolean): Self = StObject.set(x, "autoHideSplash", value.asInstanceOf[js.Any])
    
    inline def setAutoHideSplashUndefined: Self = StObject.set(x, "autoHideSplash", js.undefined)
    
    inline def setOnError(value: /* error */ typings.std.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
    
    inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    
    inline def setStartAsync(value: () => js.Promise[Unit]): Self = StObject.set(x, "startAsync", js.Any.fromFunction0(value))
    
    inline def setStartAsyncUndefined: Self = StObject.set(x, "startAsync", js.undefined)
  }
}
