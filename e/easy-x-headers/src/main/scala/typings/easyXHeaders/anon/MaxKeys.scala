package typings.easyXHeaders.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxKeys extends StObject {
  
  var maxKeys: js.UndefOr[Double] = js.undefined
}
object MaxKeys {
  
  inline def apply(): MaxKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxKeys]
  }
  
  extension [Self <: MaxKeys](x: Self) {
    
    inline def setMaxKeys(value: Double): Self = StObject.set(x, "maxKeys", value.asInstanceOf[js.Any])
    
    inline def setMaxKeysUndefined: Self = StObject.set(x, "maxKeys", js.undefined)
  }
}
