package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullableLiteral
  extends StObject
     with Type_ {
  
  var `type`: typings.doctrine.doctrineStrings.NullableLiteral
}
object NullableLiteral {
  
  inline def apply(): NullableLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullableLiteral")
    __obj.asInstanceOf[NullableLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullableLiteral] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.doctrine.doctrineStrings.NullableLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
