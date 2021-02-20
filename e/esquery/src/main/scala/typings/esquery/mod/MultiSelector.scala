package typings.esquery.mod

import typings.esquery.esqueryStrings.compound
import typings.esquery.esqueryStrings.has
import typings.esquery.esqueryStrings.not
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.esquery.mod.Sequence
  - typings.esquery.mod.Negation
  - typings.esquery.mod.Matches_
  - typings.esquery.mod.Has
*/
trait MultiSelector extends SubjectSelector
object MultiSelector {
  
  @scala.inline
  def Has(selectors: js.Array[SubjectSelector], `type`: has): typings.esquery.mod.Has = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Has]
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
  def Sequence(selectors: js.Array[SubjectSelector], `type`: compound): typings.esquery.mod.Sequence = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Sequence]
  }
}
