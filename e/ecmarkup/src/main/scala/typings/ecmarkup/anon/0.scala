package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.unused
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with typings.ecmarkup.libBiblioMod.Type {
  
  var kind: unused
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(kind = "unused")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setKind(value: unused): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
