package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumerateClassLoadersCallbacks extends StObject {
  
  /**
    * Called when all class loaders have been enumerated.
    */
  def onComplete(): Unit
  
  /**
    * Called with a `java.lang.ClassLoader` wrapper for each class loader
    * found in the VM.
    */
  def onMatch(loader: typings.fridaGum.anon.Wrapper): Unit
}
object EnumerateClassLoadersCallbacks {
  
  inline def apply(onComplete: () => Unit, onMatch: typings.fridaGum.anon.Wrapper => Unit): EnumerateClassLoadersCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
    __obj.asInstanceOf[EnumerateClassLoadersCallbacks]
  }
  
  extension [Self <: EnumerateClassLoadersCallbacks](x: Self) {
    
    inline def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
    
    inline def setOnMatch(value: typings.fridaGum.anon.Wrapper => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
  }
}
