package typings.domNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationDestination extends StObject {
  
  def getState(): Any
  
  val id: String | Null
  
  val index: Double
  
  val key: String | Null
  
  val sameDocument: Boolean
  
  val url: String
}
object NavigationDestination {
  
  inline def apply(getState: () => Any, index: Double, sameDocument: Boolean, url: String): NavigationDestination = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), index = index.asInstanceOf[js.Any], sameDocument = sameDocument.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], id = null, key = null)
    __obj.asInstanceOf[NavigationDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationDestination] (val x: Self) extends AnyVal {
    
    inline def setGetState(value: () => Any): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setSameDocument(value: Boolean): Self = StObject.set(x, "sameDocument", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
