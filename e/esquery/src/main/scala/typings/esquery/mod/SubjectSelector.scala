package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.esquery.mod.NthSelector
  - typings.esquery.mod.BinarySelector
  - typings.esquery.mod.MultiSelector
  - typings.esquery.mod.Identifier
  - typings.esquery.mod.Wildcard
  - typings.esquery.mod.Attribute
*/
trait SubjectSelector extends StObject
object SubjectSelector {
  
  @scala.inline
  def Adjacent(left: SubjectSelector, right: SubjectSelector): typings.esquery.mod.Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("adjacent")
    __obj.asInstanceOf[typings.esquery.mod.Adjacent]
  }
  
  @scala.inline
  def Attribute(name: String): typings.esquery.mod.Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[typings.esquery.mod.Attribute]
  }
  
  @scala.inline
  def Child(left: SubjectSelector, right: SubjectSelector): typings.esquery.mod.Child = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("child")
    __obj.asInstanceOf[typings.esquery.mod.Child]
  }
  
  @scala.inline
  def Descendant(left: SubjectSelector, right: SubjectSelector): typings.esquery.mod.Descendant = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("descendant")
    __obj.asInstanceOf[typings.esquery.mod.Descendant]
  }
  
  @scala.inline
  def Has(selectors: js.Array[SubjectSelector]): typings.esquery.mod.Has = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("has")
    __obj.asInstanceOf[typings.esquery.mod.Has]
  }
  
  @scala.inline
  def Identifier(value: String): typings.esquery.mod.Identifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier")
    __obj.asInstanceOf[typings.esquery.mod.Identifier]
  }
  
  @scala.inline
  def Matches_(selectors: js.Array[SubjectSelector]): typings.esquery.mod.Matches_ = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("matches")
    __obj.asInstanceOf[typings.esquery.mod.Matches_]
  }
  
  @scala.inline
  def Negation(selectors: js.Array[SubjectSelector]): typings.esquery.mod.Negation = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("not")
    __obj.asInstanceOf[typings.esquery.mod.Negation]
  }
  
  @scala.inline
  def NthChild(index: NumericLiteral): typings.esquery.mod.NthChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth-child")
    __obj.asInstanceOf[typings.esquery.mod.NthChild]
  }
  
  @scala.inline
  def NthLastChild(index: NumericLiteral): typings.esquery.mod.NthLastChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth-last-child")
    __obj.asInstanceOf[typings.esquery.mod.NthLastChild]
  }
  
  @scala.inline
  def Sequence(selectors: js.Array[SubjectSelector]): typings.esquery.mod.Sequence = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("compound")
    __obj.asInstanceOf[typings.esquery.mod.Sequence]
  }
  
  @scala.inline
  def Sibling(left: SubjectSelector, right: SubjectSelector): typings.esquery.mod.Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sibling")
    __obj.asInstanceOf[typings.esquery.mod.Sibling]
  }
  
  @scala.inline
  def Wildcard(): typings.esquery.mod.Wildcard = {
    val __obj = js.Dynamic.literal(value = "*")
    __obj.updateDynamic("type")("wildcard")
    __obj.asInstanceOf[typings.esquery.mod.Wildcard]
  }
}
