package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Effective extends StObject {
  
  var effective: js.UndefOr[js.Array[String]] = js.undefined
}
object Effective {
  
  inline def apply(): Effective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Effective]
  }
  
  extension [Self <: Effective](x: Self) {
    
    inline def setEffective(value: js.Array[String]): Self = StObject.set(x, "effective", value.asInstanceOf[js.Any])
    
    inline def setEffectiveUndefined: Self = StObject.set(x, "effective", js.undefined)
    
    inline def setEffectiveVarargs(value: String*): Self = StObject.set(x, "effective", js.Array(value*))
  }
}
