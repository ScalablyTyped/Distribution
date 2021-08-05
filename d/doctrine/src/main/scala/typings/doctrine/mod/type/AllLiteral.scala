package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllLiteral
  extends StObject
     with Type_ {
  
  var `type`: typings.doctrine.doctrineStrings.AllLiteral
}
object AllLiteral {
  
  inline def apply(): AllLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AllLiteral")
    __obj.asInstanceOf[AllLiteral]
  }
  
  extension [Self <: AllLiteral](x: Self) {
    
    inline def setType(value: typings.doctrine.doctrineStrings.AllLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
