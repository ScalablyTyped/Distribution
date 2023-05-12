package typings.enhancedResolve.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorWithDetail
  extends StObject
     with Error {
  
  var details: js.UndefOr[String] = js.undefined
}
object ErrorWithDetail {
  
  inline def apply(message: String, name: String): ErrorWithDetail = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorWithDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorWithDetail] (val x: Self) extends AnyVal {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
