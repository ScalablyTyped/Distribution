package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indexable extends StObject {
  
  def index(): Double
}
object Indexable {
  
  inline def apply(index: () => Double): Indexable = {
    val __obj = js.Dynamic.literal(index = js.Any.fromFunction0(index))
    __obj.asInstanceOf[Indexable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Indexable] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: () => Double): Self = StObject.set(x, "index", js.Any.fromFunction0(value))
  }
}
