package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalStorageClass extends StObject {
  
  def clear(): Unit
  
  def getAllKeys(): js.Array[String]
  
  def getItem(key: String): String
  
  def isSupported(): Boolean
  
  def removeItem(key: String): Unit
  
  def setItem(key: String, value: String): Unit
}
object LocalStorageClass {
  
  inline def apply(
    clear: () => Unit,
    getAllKeys: () => js.Array[String],
    getItem: String => String,
    isSupported: () => Boolean,
    removeItem: String => Unit,
    setItem: (String, String) => Unit
  ): LocalStorageClass = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getAllKeys = js.Any.fromFunction0(getAllKeys), getItem = js.Any.fromFunction1(getItem), isSupported = js.Any.fromFunction0(isSupported), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[LocalStorageClass]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalStorageClass] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetAllKeys(value: () => js.Array[String]): Self = StObject.set(x, "getAllKeys", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: String => String): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setIsSupported(value: () => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction0(value))
    
    inline def setRemoveItem(value: String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setSetItem(value: (String, String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
  }
}
