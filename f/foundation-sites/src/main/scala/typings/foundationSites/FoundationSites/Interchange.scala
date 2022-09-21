package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/interchange.html#javascript-reference
trait Interchange extends StObject {
  
  def replace(path: String): Unit
}
object Interchange {
  
  inline def apply(replace: String => Unit): Interchange = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction1(replace))
    __obj.asInstanceOf[Interchange]
  }
  
  extension [Self <: Interchange](x: Self) {
    
    inline def setReplace(value: String => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
  }
}
