package typings.esquery.mod

import typings.esquery.esqueryStrings.compound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sequence
  extends StObject
     with MultiSelectorAtom
     with MultiSelector
     with Selector {
  
  @JSName("type")
  var type_Sequence: compound
}
object Sequence {
  
  inline def apply(selectors: js.Array[SubjectSelector]): Sequence = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("compound")
    __obj.asInstanceOf[Sequence]
  }
  
  extension [Self <: Sequence](x: Self) {
    
    inline def setType(value: compound): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
