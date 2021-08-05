package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeEmpty extends StObject {
  
  var includeEmpty: Boolean
}
object IncludeEmpty {
  
  inline def apply(includeEmpty: Boolean): IncludeEmpty = {
    val __obj = js.Dynamic.literal(includeEmpty = includeEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeEmpty]
  }
  
  extension [Self <: IncludeEmpty](x: Self) {
    
    inline def setIncludeEmpty(value: Boolean): Self = StObject.set(x, "includeEmpty", value.asInstanceOf[js.Any])
  }
}
