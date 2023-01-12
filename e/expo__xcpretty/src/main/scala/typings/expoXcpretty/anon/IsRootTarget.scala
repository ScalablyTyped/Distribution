package typings.expoXcpretty.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsRootTarget extends StObject {
  
  var isRootTarget: Boolean
  
  var name: String
}
object IsRootTarget {
  
  inline def apply(isRootTarget: Boolean, name: String): IsRootTarget = {
    val __obj = js.Dynamic.literal(isRootTarget = isRootTarget.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRootTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsRootTarget] (val x: Self) extends AnyVal {
    
    inline def setIsRootTarget(value: Boolean): Self = StObject.set(x, "isRootTarget", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
