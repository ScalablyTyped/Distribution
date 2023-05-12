package typings.ethers.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subs extends StObject {
  
  var data: String
  
  var subs: String
}
object Subs {
  
  inline def apply(data: String, subs: String): Subs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], subs = subs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subs] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSubs(value: String): Self = StObject.set(x, "subs", value.asInstanceOf[js.Any])
  }
}
