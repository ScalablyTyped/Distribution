package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.opaque
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind
  extends StObject
     with typings.ecmarkup.libBiblioMod.Type {
  
  var kind: opaque
  
  var `type`: String
}
object Kind {
  
  inline def apply(`type`: String): Kind = {
    val __obj = js.Dynamic.literal(kind = "opaque")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  
  extension [Self <: Kind](x: Self) {
    
    inline def setKind(value: opaque): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
