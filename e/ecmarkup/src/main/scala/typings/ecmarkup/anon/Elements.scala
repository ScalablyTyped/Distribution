package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elements
  extends StObject
     with typings.ecmarkup.libBiblioMod.Type {
  
  var elements: typings.ecmarkup.libBiblioMod.Type | Null
  
  var kind: list
}
object Elements {
  
  inline def apply(): Elements = {
    val __obj = js.Dynamic.literal(kind = "list", elements = null)
    __obj.asInstanceOf[Elements]
  }
  
  extension [Self <: Elements](x: Self) {
    
    inline def setElements(value: typings.ecmarkup.libBiblioMod.Type): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsNull: Self = StObject.set(x, "elements", null)
    
    inline def setKind(value: list): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
