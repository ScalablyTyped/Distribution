package typings.estree.mod

import typings.estree.anon.Flags
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegExpLiteral
  extends Literal
     with BaseNode {
  
  var raw: js.UndefOr[String] = js.native
  
  var regex: Flags = js.native
  
  @JSName("type")
  var type_RegExpLiteral: typings.estree.estreeStrings.Literal = js.native
  
  var value: js.UndefOr[RegExp | Null] = js.native
}
object RegExpLiteral {
  
  @scala.inline
  def apply(regex: Flags, `type`: typings.estree.estreeStrings.Literal): RegExpLiteral = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
  
  @scala.inline
  implicit class RegExpLiteralMutableBuilder[Self <: RegExpLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setRegex(value: Flags): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.Literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: RegExp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
