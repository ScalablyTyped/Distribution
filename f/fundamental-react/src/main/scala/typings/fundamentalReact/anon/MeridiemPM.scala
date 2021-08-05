package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeridiemPM extends StObject {
  
  var meridiemAM: String
  
  var meridiemPM: String
}
object MeridiemPM {
  
  inline def apply(meridiemAM: String, meridiemPM: String): MeridiemPM = {
    val __obj = js.Dynamic.literal(meridiemAM = meridiemAM.asInstanceOf[js.Any], meridiemPM = meridiemPM.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeridiemPM]
  }
  
  extension [Self <: MeridiemPM](x: Self) {
    
    inline def setMeridiemAM(value: String): Self = StObject.set(x, "meridiemAM", value.asInstanceOf[js.Any])
    
    inline def setMeridiemPM(value: String): Self = StObject.set(x, "meridiemPM", value.asInstanceOf[js.Any])
  }
}
