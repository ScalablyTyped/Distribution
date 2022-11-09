package typings.expoDevServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var `0`: js.Array[String]
  
  var `1`: js.Array[String]
}
object `0` {
  
  inline def apply(`0`: js.Array[String], `1`: js.Array[String]): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def set0(value: js.Array[String]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set0Varargs(value: String*): Self = StObject.set(x, "0", js.Array(value*))
    
    inline def set1(value: js.Array[String]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set1Varargs(value: String*): Self = StObject.set(x, "1", js.Array(value*))
  }
}
