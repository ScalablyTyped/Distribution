package typings.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnsureOptions extends StObject {
  
  var mode: js.UndefOr[Double] = js.native
}
object EnsureOptions {
  
  @scala.inline
  def apply(): EnsureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnsureOptions]
  }
  
  @scala.inline
  implicit class EnsureOptionsMutableBuilder[Self <: EnsureOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
