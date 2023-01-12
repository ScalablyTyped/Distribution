package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoidLiteral
  extends StObject
     with Type_ {
  
  var `type`: typings.doctrine.doctrineStrings.VoidLiteral
}
object VoidLiteral {
  
  inline def apply(): VoidLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VoidLiteral")
    __obj.asInstanceOf[VoidLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoidLiteral] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.doctrine.doctrineStrings.VoidLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
