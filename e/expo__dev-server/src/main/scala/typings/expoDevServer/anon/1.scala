package typings.expoDevServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var `0`: String
  
  var `1`: String
}
object `1` {
  
  inline def apply(`0`: String, `1`: String): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: String): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
