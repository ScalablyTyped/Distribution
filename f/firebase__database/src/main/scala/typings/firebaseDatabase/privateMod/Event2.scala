package typings.firebaseDatabase.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the data needed to raise an event
  * @interface
  */
trait Event2 extends StObject {
  
  def getEventRunner(): js.Function0[Unit]
  
  def getEventType(): String
  
  def getPath(): Path
}
object Event2 {
  
  inline def apply(getEventRunner: () => js.Function0[Unit], getEventType: () => String, getPath: () => Path): Event2 = {
    val __obj = js.Dynamic.literal(getEventRunner = js.Any.fromFunction0(getEventRunner), getEventType = js.Any.fromFunction0(getEventType), getPath = js.Any.fromFunction0(getPath))
    __obj.asInstanceOf[Event2]
  }
  
  extension [Self <: Event2](x: Self) {
    
    inline def setGetEventRunner(value: () => js.Function0[Unit]): Self = StObject.set(x, "getEventRunner", js.Any.fromFunction0(value))
    
    inline def setGetEventType(value: () => String): Self = StObject.set(x, "getEventType", js.Any.fromFunction0(value))
    
    inline def setGetPath(value: () => Path): Self = StObject.set(x, "getPath", js.Any.fromFunction0(value))
  }
}
