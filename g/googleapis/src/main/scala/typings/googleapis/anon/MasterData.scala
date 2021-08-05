package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterData extends StObject {
  
  var masterData: js.UndefOr[Double] = js.undefined
}
object MasterData {
  
  inline def apply(): MasterData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterData]
  }
  
  extension [Self <: MasterData](x: Self) {
    
    inline def setMasterData(value: Double): Self = StObject.set(x, "masterData", value.asInstanceOf[js.Any])
    
    inline def setMasterDataUndefined: Self = StObject.set(x, "masterData", js.undefined)
  }
}
