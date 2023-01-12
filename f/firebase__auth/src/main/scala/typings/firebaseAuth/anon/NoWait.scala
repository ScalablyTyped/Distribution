package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoWait extends StObject {
  
  var noWait: js.UndefOr[Boolean] = js.undefined
}
object NoWait {
  
  inline def apply(): NoWait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoWait]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoWait] (val x: Self) extends AnyVal {
    
    inline def setNoWait(value: Boolean): Self = StObject.set(x, "noWait", value.asInstanceOf[js.Any])
    
    inline def setNoWaitUndefined: Self = StObject.set(x, "noWait", js.undefined)
  }
}
