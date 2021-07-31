package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationOptions extends StObject {
  
  var limit: Double
  
  var offset: Double
}
object PaginationOptions {
  
  @scala.inline
  def apply(limit: Double, offset: Double): PaginationOptions = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
  
  @scala.inline
  implicit class PaginationOptionsMutableBuilder[Self <: PaginationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
