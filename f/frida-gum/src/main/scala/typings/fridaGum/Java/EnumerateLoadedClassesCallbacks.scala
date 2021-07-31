package typings.fridaGum.Java

import typings.fridaGum.NativePointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumerateLoadedClassesCallbacks extends StObject {
  
  /**
    * Called when all loaded classes have been enumerated.
    */
  def onComplete(): Unit
  
  /**
    * Called with the name of each currently loaded class, and a JNI
    * reference for its Java Class object.
    *
    * Pass the `name` to `Java.use()` to get a JavaScript wrapper.
    * You may also `Java.cast()` the `handle` to `java.lang.Class`.
    */
  def onMatch(name: String, handle: NativePointer): Unit
}
object EnumerateLoadedClassesCallbacks {
  
  @scala.inline
  def apply(onComplete: () => Unit, onMatch: (String, NativePointer) => Unit): EnumerateLoadedClassesCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction2(onMatch))
    __obj.asInstanceOf[EnumerateLoadedClassesCallbacks]
  }
  
  @scala.inline
  implicit class EnumerateLoadedClassesCallbacksMutableBuilder[Self <: EnumerateLoadedClassesCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMatch(value: (String, NativePointer) => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction2(value))
  }
}
