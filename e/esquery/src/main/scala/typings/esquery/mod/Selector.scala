package typings.esquery.mod

import typings.esquery.esqueryStrings.declaration
import typings.esquery.esqueryStrings.expression
import typings.esquery.esqueryStrings.function
import typings.esquery.esqueryStrings.pattern
import typings.esquery.esqueryStrings.statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Unions
//
/* Rewritten from type alias, can be one of: 
  - typings.esquery.mod.Field
  - typings.esquery.mod.Type
  - typings.esquery.mod.Sequence
  - typings.esquery.mod.Identifier
  - typings.esquery.mod.Wildcard
  - typings.esquery.mod.Attribute
  - typings.esquery.mod.NthChild
  - typings.esquery.mod.NthLastChild
  - typings.esquery.mod.Descendant
  - typings.esquery.mod.Child
  - typings.esquery.mod.Sibling
  - typings.esquery.mod.Adjacent
  - typings.esquery.mod.Negation
  - typings.esquery.mod.Matches_
  - typings.esquery.mod.Has
  - typings.esquery.mod.Class
*/
trait Selector extends StObject
object Selector {
  
  inline def Adjacent(left: SubjectSelector, right: SubjectSelector): typings.esquery.mod.Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("adjacent")
    __obj.asInstanceOf[typings.esquery.mod.Adjacent]
  }
  
  inline def Attribute(name: String): typings.esquery.mod.Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[typings.esquery.mod.Attribute]
  }
  
  inline def Child(left: SubjectSelector, right: SubjectSelector): typings.esquery.mod.Child = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("child")
    __obj.asInstanceOf[typings.esquery.mod.Child]
  }
  
  inline def Class(name: declaration | expression | function | pattern | statement): typings.esquery.mod.Class = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("class")
    __obj.asInstanceOf[typings.esquery.mod.Class]
  }
  
  inline def Descendant(left: SubjectSelector, right: SubjectSelector): typings.esquery.mod.Descendant = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("descendant")
    __obj.asInstanceOf[typings.esquery.mod.Descendant]
  }
  
  inline def Field(name: String): typings.esquery.mod.Field = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("field")
    __obj.asInstanceOf[typings.esquery.mod.Field]
  }
  
  inline def Has(selectors: js.Array[SubjectSelector]): typings.esquery.mod.Has = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("has")
    __obj.asInstanceOf[typings.esquery.mod.Has]
  }
  
  inline def Identifier(value: String): typings.esquery.mod.Identifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier")
    __obj.asInstanceOf[typings.esquery.mod.Identifier]
  }
  
  inline def Matches_(selectors: js.Array[SubjectSelector]): typings.esquery.mod.Matches_ = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("matches")
    __obj.asInstanceOf[typings.esquery.mod.Matches_]
  }
  
  inline def Negation(selectors: js.Array[SubjectSelector]): typings.esquery.mod.Negation = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("not")
    __obj.asInstanceOf[typings.esquery.mod.Negation]
  }
  
  inline def NthChild(index: NumericLiteral): typings.esquery.mod.NthChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth-child")
    __obj.asInstanceOf[typings.esquery.mod.NthChild]
  }
  
  inline def NthLastChild(index: NumericLiteral): typings.esquery.mod.NthLastChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth-last-child")
    __obj.asInstanceOf[typings.esquery.mod.NthLastChild]
  }
  
  inline def Sequence(selectors: js.Array[SubjectSelector]): typings.esquery.mod.Sequence = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("compound")
    __obj.asInstanceOf[typings.esquery.mod.Sequence]
  }
  
  inline def Sibling(left: SubjectSelector, right: SubjectSelector): typings.esquery.mod.Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sibling")
    __obj.asInstanceOf[typings.esquery.mod.Sibling]
  }
  
  inline def Type(value: String): typings.esquery.mod.Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[typings.esquery.mod.Type]
  }
  
  inline def Wildcard(): typings.esquery.mod.Wildcard = {
    val __obj = js.Dynamic.literal(value = "*")
    __obj.updateDynamic("type")("wildcard")
    __obj.asInstanceOf[typings.esquery.mod.Wildcard]
  }
}
