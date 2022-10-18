package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  def matches(doc: Document2): Boolean
}
object Filter {
  
  inline def apply(matches: Document2 => Boolean): Filter = {
    val __obj = js.Dynamic.literal(matches = js.Any.fromFunction1(matches))
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setMatches(value: Document2 => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
  }
}
