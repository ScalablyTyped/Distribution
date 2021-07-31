package typings.finch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandedCallback extends StObject {
  
  var load: js.UndefOr[FinchCallback] = js.undefined
  
  var setup: js.UndefOr[FinchCallback] = js.undefined
  
  var teardown: js.UndefOr[FinchCallback] = js.undefined
  
  var unload: js.UndefOr[FinchCallback] = js.undefined
}
object ExpandedCallback {
  
  @scala.inline
  def apply(): ExpandedCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandedCallback]
  }
  
  @scala.inline
  implicit class ExpandedCallbackMutableBuilder[Self <: ExpandedCallback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoad(
      value: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any
    ): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setSetup(
      value: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any
    ): Self = StObject.set(x, "setup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    
    @scala.inline
    def setTeardown(
      value: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any
    ): Self = StObject.set(x, "teardown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTeardownUndefined: Self = StObject.set(x, "teardown", js.undefined)
    
    @scala.inline
    def setUnload(
      value: (/* bindings */ js.UndefOr[js.Any], /* childCallback */ js.UndefOr[js.Function0[Unit]]) => js.Any
    ): Self = StObject.set(x, "unload", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnloadUndefined: Self = StObject.set(x, "unload", js.undefined)
  }
}
