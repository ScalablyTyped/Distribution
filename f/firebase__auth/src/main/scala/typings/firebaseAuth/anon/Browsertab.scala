package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Browsertab extends StObject {
  
  var browsertab: Close
}
object Browsertab {
  
  inline def apply(browsertab: Close): Browsertab = {
    val __obj = js.Dynamic.literal(browsertab = browsertab.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browsertab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Browsertab] (val x: Self) extends AnyVal {
    
    inline def setBrowsertab(value: Close): Self = StObject.set(x, "browsertab", value.asInstanceOf[js.Any])
  }
}
