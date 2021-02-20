package typings.esquery.mod

import typings.esquery.esqueryStrings.compound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sequence
  extends MultiSelectorAtom
     with MultiSelector
     with Selector {
  
  @JSName("type")
  var type_Sequence: compound = js.native
}
object Sequence {
  
  @scala.inline
  def apply(selectors: js.Array[SubjectSelector], `type`: compound): Sequence = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sequence]
  }
  
  @scala.inline
  implicit class SequenceMutableBuilder[Self <: Sequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: compound): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
