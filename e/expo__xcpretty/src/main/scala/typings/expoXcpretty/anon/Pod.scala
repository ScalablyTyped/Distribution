package typings.expoXcpretty.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pod extends StObject {
  
  var pod: String
  
  var source: String
}
object Pod {
  
  inline def apply(pod: String, source: String): Pod = {
    val __obj = js.Dynamic.literal(pod = pod.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pod] (val x: Self) extends AnyVal {
    
    inline def setPod(value: String): Self = StObject.set(x, "pod", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
