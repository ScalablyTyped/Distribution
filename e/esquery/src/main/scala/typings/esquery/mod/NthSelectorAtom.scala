package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NthSelectorAtom
  extends StObject
     with SubjectSelectorAtom {
  
  var index: NumericLiteral
}
object NthSelectorAtom {
  
  inline def apply(index: NumericLiteral, `type`: String): NthSelectorAtom = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthSelectorAtom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NthSelectorAtom] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: NumericLiteral): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
