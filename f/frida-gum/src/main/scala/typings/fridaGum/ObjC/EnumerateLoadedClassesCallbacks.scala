package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumerateLoadedClassesCallbacks extends StObject {
  
  def onComplete(): Unit = js.native
  
  def onMatch(name: String, owner: String): Unit = js.native
}
object EnumerateLoadedClassesCallbacks {
  
  @scala.inline
  def apply(onComplete: () => Unit, onMatch: (String, String) => Unit): EnumerateLoadedClassesCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction2(onMatch))
    __obj.asInstanceOf[EnumerateLoadedClassesCallbacks]
  }
  
  @scala.inline
  implicit class EnumerateLoadedClassesCallbacksMutableBuilder[Self <: EnumerateLoadedClassesCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMatch(value: (String, String) => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction2(value))
  }
}
