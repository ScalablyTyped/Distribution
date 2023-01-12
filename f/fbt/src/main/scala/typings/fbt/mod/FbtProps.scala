package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtProps
  extends StObject
     with FbtOptions {
  
  var desc: String
}
object FbtProps {
  
  inline def apply(desc: String): FbtProps = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[FbtProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FbtProps] (val x: Self) extends AnyVal {
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
  }
}
