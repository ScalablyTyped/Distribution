package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.esquery.mod.Descendant
  - typings.esquery.mod.Child
  - typings.esquery.mod.Sibling
  - typings.esquery.mod.Adjacent
*/
trait BinarySelector
  extends StObject
     with SubjectSelector
object BinarySelector {
  
  @scala.inline
  def Adjacent(left: SubjectSelector, right: SubjectSelector): typings.esquery.mod.Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("adjacent")
    __obj.asInstanceOf[typings.esquery.mod.Adjacent]
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
  def Sibling(left: SubjectSelector, right: SubjectSelector): typings.esquery.mod.Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sibling")
    __obj.asInstanceOf[typings.esquery.mod.Sibling]
  }
}
