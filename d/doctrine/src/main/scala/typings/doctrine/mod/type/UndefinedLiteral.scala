package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndefinedLiteral
  extends StObject
     with Type_ {
  
  var `type`: typings.doctrine.doctrineStrings.UndefinedLiteral
}
object UndefinedLiteral {
  
  @scala.inline
  def apply(): UndefinedLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UndefinedLiteral")
    __obj.asInstanceOf[UndefinedLiteral]
  }
  
  @scala.inline
  implicit class UndefinedLiteralMutableBuilder[Self <: UndefinedLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.UndefinedLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
