package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullLiteral
  extends StObject
     with Type_ {
  
  var `type`: typings.doctrine.doctrineStrings.NullLiteral
}
object NullLiteral {
  
  inline def apply(): NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[NullLiteral]
  }
  
  extension [Self <: NullLiteral](x: Self) {
    
    inline def setType(value: typings.doctrine.doctrineStrings.NullLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
