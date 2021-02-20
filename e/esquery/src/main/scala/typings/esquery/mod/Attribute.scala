package typings.esquery.mod

import typings.esquery.esqueryStrings.Equalssign
import typings.esquery.esqueryStrings.ExclamationmarkEqualssign
import typings.esquery.esqueryStrings.Greaterthansign
import typings.esquery.esqueryStrings.GreaterthansignEqualssign
import typings.esquery.esqueryStrings.Lessthansign
import typings.esquery.esqueryStrings.LessthansignEqualssign
import typings.esquery.esqueryStrings.attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attribute
  extends SubjectSelectorAtom
     with Selector
     with SubjectSelector {
  
  var name: String = js.native
  
  var operator: js.UndefOr[
    Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
  ] = js.native
  
  @JSName("type")
  var type_Attribute: attribute = js.native
  
  var value: js.UndefOr[Literal | RegExpLiteral | Type] = js.native
}
object Attribute {
  
  @scala.inline
  def apply(name: String, `type`: attribute): Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(
      value: Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setType(value: attribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Literal | RegExpLiteral | Type): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
