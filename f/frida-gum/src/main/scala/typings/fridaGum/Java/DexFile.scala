package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexFile extends StObject {
  
  /**
    * Determines available class names.
    */
  def getClassNames(): js.Array[String]
  
  /**
    * Loads the contained classes into the VM.
    */
  def load(): Unit
}
object DexFile {
  
  inline def apply(getClassNames: () => js.Array[String], load: () => Unit): DexFile = {
    val __obj = js.Dynamic.literal(getClassNames = js.Any.fromFunction0(getClassNames), load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[DexFile]
  }
  
  extension [Self <: DexFile](x: Self) {
    
    inline def setGetClassNames(value: () => js.Array[String]): Self = StObject.set(x, "getClassNames", js.Any.fromFunction0(value))
    
    inline def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
  }
}
