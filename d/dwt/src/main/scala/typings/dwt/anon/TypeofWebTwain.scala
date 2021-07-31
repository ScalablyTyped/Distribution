package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWebTwain extends StObject {
  
  val Addon: TypeofAddon
}
object TypeofWebTwain {
  
  @scala.inline
  def apply(Addon: TypeofAddon): TypeofWebTwain = {
    val __obj = js.Dynamic.literal(Addon = Addon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWebTwain]
  }
  
  @scala.inline
  implicit class TypeofWebTwainMutableBuilder[Self <: TypeofWebTwain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddon(value: TypeofAddon): Self = StObject.set(x, "Addon", value.asInstanceOf[js.Any])
  }
}
