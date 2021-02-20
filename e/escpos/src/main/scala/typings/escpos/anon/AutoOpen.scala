package typings.escpos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoOpen extends StObject {
  
  var autoOpen: Boolean = js.native
  
  var baudRate: Double = js.native
}
object AutoOpen {
  
  @scala.inline
  def apply(autoOpen: Boolean, baudRate: Double): AutoOpen = {
    val __obj = js.Dynamic.literal(autoOpen = autoOpen.asInstanceOf[js.Any], baudRate = baudRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoOpen]
  }
  
  @scala.inline
  implicit class AutoOpenMutableBuilder[Self <: AutoOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaudRate(value: Double): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
  }
}
