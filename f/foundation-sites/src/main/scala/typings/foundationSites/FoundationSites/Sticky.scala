package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/sticky.html#javascript-reference
@js.native
trait Sticky extends StObject {
  
  def destroy(): Unit = js.native
}
object Sticky {
  
  @scala.inline
  def apply(destroy: () => Unit): Sticky = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Sticky]
  }
  
  @scala.inline
  implicit class StickyMutableBuilder[Self <: Sticky] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
