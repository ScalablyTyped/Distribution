package typings.esquery.mod

import typings.esquery.esqueryStrings.has
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Has
  extends StObject
     with MultiSelectorAtom
     with MultiSelector
     with Selector {
  
  @JSName("type")
  var type_Has: has
}
object Has {
  
  @scala.inline
  def apply(selectors: js.Array[SubjectSelector]): Has = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("has")
    __obj.asInstanceOf[Has]
  }
  
  @scala.inline
  implicit class HasMutableBuilder[Self <: Has] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: has): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
