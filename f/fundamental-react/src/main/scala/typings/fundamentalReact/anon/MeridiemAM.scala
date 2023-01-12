package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeridiemAM extends StObject {
  
  var meridiemAM: js.UndefOr[String] = js.undefined
  
  var meridiemPM: js.UndefOr[String] = js.undefined
}
object MeridiemAM {
  
  inline def apply(): MeridiemAM = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeridiemAM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeridiemAM] (val x: Self) extends AnyVal {
    
    inline def setMeridiemAM(value: String): Self = StObject.set(x, "meridiemAM", value.asInstanceOf[js.Any])
    
    inline def setMeridiemAMUndefined: Self = StObject.set(x, "meridiemAM", js.undefined)
    
    inline def setMeridiemPM(value: String): Self = StObject.set(x, "meridiemPM", value.asInstanceOf[js.Any])
    
    inline def setMeridiemPMUndefined: Self = StObject.set(x, "meridiemPM", js.undefined)
  }
}
