package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullableLiteral extends Type_ {
  
  var `type`: typings.doctrine.doctrineStrings.NullableLiteral = js.native
}
object NullableLiteral {
  
  @scala.inline
  def apply(`type`: typings.doctrine.doctrineStrings.NullableLiteral): NullableLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableLiteral]
  }
  
  @scala.inline
  implicit class NullableLiteralMutableBuilder[Self <: NullableLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.NullableLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
