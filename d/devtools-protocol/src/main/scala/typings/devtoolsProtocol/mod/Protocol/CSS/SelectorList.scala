package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorList extends StObject {
  
  /**
    * Selectors in the list.
    */
  var selectors: js.Array[Value] = js.native
  
  /**
    * Rule selector text.
    */
  var text: String = js.native
}
object SelectorList {
  
  @scala.inline
  def apply(selectors: js.Array[Value], text: String): SelectorList = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorList]
  }
  
  @scala.inline
  implicit class SelectorListMutableBuilder[Self <: SelectorList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectors(value: js.Array[Value]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsVarargs(value: Value*): Self = StObject.set(x, "selectors", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
