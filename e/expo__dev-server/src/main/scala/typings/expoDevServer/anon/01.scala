package typings.expoDevServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `01` extends StObject {
  
  var `0`: AppId
  
  var `1`: AppId
}
object `01` {
  
  inline def apply(`0`: AppId, `1`: AppId): `01` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`01`]
  }
  
  extension [Self <: `01`](x: Self) {
    
    inline def set0(value: AppId): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: AppId): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
