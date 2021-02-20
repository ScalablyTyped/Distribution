package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/interchange.html#javascript-reference
@js.native
trait Interchange extends StObject {
  
  def destroy(): Unit = js.native
  
  def replace(path: String): Unit = js.native
}
object Interchange {
  
  @scala.inline
  def apply(destroy: () => Unit, replace: String => Unit): Interchange = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), replace = js.Any.fromFunction1(replace))
    __obj.asInstanceOf[Interchange]
  }
  
  @scala.inline
  implicit class InterchangeMutableBuilder[Self <: Interchange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplace(value: String => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
  }
}
