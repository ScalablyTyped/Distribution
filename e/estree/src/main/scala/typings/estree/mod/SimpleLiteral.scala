package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleLiteral
  extends Literal
     with BaseNode {
  
  var raw: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_SimpleLiteral: typings.estree.estreeStrings.Literal = js.native
  
  var value: String | Boolean | Double | Null = js.native
}
object SimpleLiteral {
  
  @scala.inline
  def apply(`type`: typings.estree.estreeStrings.Literal): SimpleLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleLiteral]
  }
  
  @scala.inline
  implicit class SimpleLiteralMutableBuilder[Self <: SimpleLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.Literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Boolean | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
