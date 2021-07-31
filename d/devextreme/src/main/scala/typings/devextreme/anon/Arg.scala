package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arg extends StObject {
  
  var arg: js.UndefOr[typings.std.Date | Double | String] = js.undefined
  
  var `val`: js.UndefOr[typings.std.Date | Double | String] = js.undefined
}
object Arg {
  
  @scala.inline
  def apply(): Arg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arg]
  }
  
  @scala.inline
  implicit class ArgMutableBuilder[Self <: Arg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArg(value: typings.std.Date | Double | String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
    
    @scala.inline
    def setVal(value: typings.std.Date | Double | String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValUndefined: Self = StObject.set(x, "val", js.undefined)
  }
}
