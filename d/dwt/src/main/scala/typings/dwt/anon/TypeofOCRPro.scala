package typings.dwt.anon

import typings.dwt.addonDotOCRProMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOCRPro extends StObject {
  
  def NewSettings(): Settings
}
object TypeofOCRPro {
  
  inline def apply(NewSettings: () => Settings): TypeofOCRPro = {
    val __obj = js.Dynamic.literal(NewSettings = js.Any.fromFunction0(NewSettings))
    __obj.asInstanceOf[TypeofOCRPro]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofOCRPro] (val x: Self) extends AnyVal {
    
    inline def setNewSettings(value: () => Settings): Self = StObject.set(x, "NewSettings", js.Any.fromFunction0(value))
  }
}
