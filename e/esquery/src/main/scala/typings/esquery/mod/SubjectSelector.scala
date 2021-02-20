package typings.esquery.mod

import typings.esquery.esqueryStrings.Asterisk
import typings.esquery.esqueryStrings.`nth-child`
import typings.esquery.esqueryStrings.`nth-last-child`
import typings.esquery.esqueryStrings.adjacent
import typings.esquery.esqueryStrings.attribute
import typings.esquery.esqueryStrings.child
import typings.esquery.esqueryStrings.compound
import typings.esquery.esqueryStrings.descendant
import typings.esquery.esqueryStrings.has
import typings.esquery.esqueryStrings.identifier
import typings.esquery.esqueryStrings.not
import typings.esquery.esqueryStrings.sibling
import typings.esquery.esqueryStrings.wildcard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def Adjacent(left: SubjectSelector, right: SubjectSelector, `type`: adjacent): typings.esquery.mod.Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Adjacent]
  }
  
  @scala.inline
  def Attribute(name: String, `type`: attribute): typings.esquery.mod.Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Attribute]
  }
  
  @scala.inline
  def Child(left: SubjectSelector, right: SubjectSelector, `type`: child): typings.esquery.mod.Child = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Child]
  }
  
  @scala.inline
  def Descendant(left: SubjectSelector, right: SubjectSelector, `type`: descendant): typings.esquery.mod.Descendant = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Descendant]
  }
  
  @scala.inline
  def Has(selectors: js.Array[SubjectSelector], `type`: has): typings.esquery.mod.Has = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Has]
  }
  
  @scala.inline
  def Identifier(`type`: identifier, value: String): typings.esquery.mod.Identifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Identifier]
  }
  
  @scala.inline
  def Matches_(selectors: js.Array[SubjectSelector], `type`: typings.esquery.esqueryStrings.matches): typings.esquery.mod.Matches_ = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Matches_]
  }
  
  @scala.inline
  def Negation(selectors: js.Array[SubjectSelector], `type`: not): typings.esquery.mod.Negation = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Negation]
  }
  
  @scala.inline
  def NthChild(index: NumericLiteral, `type`: `nth-child`): typings.esquery.mod.NthChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.NthChild]
  }
  
  @scala.inline
  def NthLastChild(index: NumericLiteral, `type`: `nth-last-child`): typings.esquery.mod.NthLastChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.NthLastChild]
  }
  
  @scala.inline
  def Sequence(selectors: js.Array[SubjectSelector], `type`: compound): typings.esquery.mod.Sequence = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Sequence]
  }
  
  @scala.inline
  def Sibling(left: SubjectSelector, right: SubjectSelector, `type`: sibling): typings.esquery.mod.Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Sibling]
  }
  
  @scala.inline
  def Wildcard(`type`: wildcard, value: Asterisk): typings.esquery.mod.Wildcard = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Wildcard]
  }
}
