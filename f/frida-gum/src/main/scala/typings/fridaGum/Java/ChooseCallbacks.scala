package typings.fridaGum.Java

import typings.fridaGum.EnumerateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseCallbacks extends StObject {
  
  /**
    * Called when all instances have been enumerated.
    */
  def onComplete(): Unit = js.native
  
  /**
    * Called with each live instance found with a ready-to-use `instance`
    * just as if you would have called `Java.cast()` with a raw handle to
    * this particular instance.
    *
    * May return `EnumerateAction.Stop` to stop the enumeration early.
    */
  def onMatch(instance: typings.fridaGum.anon.Wrapper): Unit | EnumerateAction = js.native
}
object ChooseCallbacks {
  
  @scala.inline
  def apply(onComplete: () => Unit, onMatch: typings.fridaGum.anon.Wrapper => Unit | EnumerateAction): ChooseCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
    __obj.asInstanceOf[ChooseCallbacks]
  }
  
  @scala.inline
  implicit class ChooseCallbacksMutableBuilder[Self <: ChooseCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMatch(value: typings.fridaGum.anon.Wrapper => Unit | EnumerateAction): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
  }
}
