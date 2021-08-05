package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Local extends StObject {
  
  var effective: js.UndefOr[js.Array[String]] = js.undefined
  
  var local: js.UndefOr[js.Array[String]] = js.undefined
}
object Local {
  
  inline def apply(): Local = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Local]
  }
  
  extension [Self <: Local](x: Self) {
    
    inline def setEffective(value: js.Array[String]): Self = StObject.set(x, "effective", value.asInstanceOf[js.Any])
    
    inline def setEffectiveUndefined: Self = StObject.set(x, "effective", js.undefined)
    
    inline def setEffectiveVarargs(value: String*): Self = StObject.set(x, "effective", js.Array(value :_*))
    
    inline def setLocal(value: js.Array[String]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    inline def setLocalVarargs(value: String*): Self = StObject.set(x, "local", js.Array(value :_*))
  }
}
