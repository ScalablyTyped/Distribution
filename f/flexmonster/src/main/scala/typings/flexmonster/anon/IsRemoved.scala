package typings.flexmonster.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsRemoved extends StObject {
  
  var isRemoved: Boolean
  
  var uniqueName: String
}
object IsRemoved {
  
  inline def apply(isRemoved: Boolean, uniqueName: String): IsRemoved = {
    val __obj = js.Dynamic.literal(isRemoved = isRemoved.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRemoved]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsRemoved] (val x: Self) extends AnyVal {
    
    inline def setIsRemoved(value: Boolean): Self = StObject.set(x, "isRemoved", value.asInstanceOf[js.Any])
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
