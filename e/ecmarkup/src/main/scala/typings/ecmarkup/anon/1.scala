package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var kind: union
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(kind = "union")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setKind(value: union): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
