package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullLiteral extends Type_ {
  
  var `type`: typings.doctrine.doctrineStrings.NullLiteral = js.native
}
object NullLiteral {
  
  @scala.inline
  def apply(`type`: typings.doctrine.doctrineStrings.NullLiteral): NullLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLiteral]
  }
  
  @scala.inline
  implicit class NullLiteralMutableBuilder[Self <: NullLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.NullLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
