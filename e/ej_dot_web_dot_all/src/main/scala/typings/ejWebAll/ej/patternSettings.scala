package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait patternSettings extends StObject {
  
  var D: String
  
  var F: String
  
  var M: String
  
  var S: String
  
  var T: String
  
  var Y: String
  
  var d: String
  
  var f: String
  
  var t: String
}
object patternSettings {
  
  inline def apply(D: String, F: String, M: String, S: String, T: String, Y: String, d: String, f: String, t: String): patternSettings = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[patternSettings]
  }
  
  extension [Self <: patternSettings](x: Self) {
    
    inline def setD(value: String): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
    
    inline def setF(value: String): Self = StObject.set(x, "F", value.asInstanceOf[js.Any])
    
    inline def setM(value: String): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
    
    inline def setS(value: String): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
    
    inline def setT(value: String): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    
    inline def setY(value: String): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
