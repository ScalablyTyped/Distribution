package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDismissStart extends StObject {
  
  def onDismissStart(): Unit = js.native
}
object OnDismissStart {
  
  @scala.inline
  def apply(onDismissStart: () => Unit): OnDismissStart = {
    val __obj = js.Dynamic.literal(onDismissStart = js.Any.fromFunction0(onDismissStart))
    __obj.asInstanceOf[OnDismissStart]
  }
  
  @scala.inline
  implicit class OnDismissStartMutableBuilder[Self <: OnDismissStart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDismissStart(value: () => Unit): Self = StObject.set(x, "onDismissStart", js.Any.fromFunction0(value))
  }
}
