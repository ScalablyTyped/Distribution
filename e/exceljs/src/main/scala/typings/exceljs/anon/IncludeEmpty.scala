package typings.exceljs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludeEmpty extends StObject {
  
  var includeEmpty: Boolean
}
object IncludeEmpty {
  
  @scala.inline
  def apply(includeEmpty: Boolean): IncludeEmpty = {
    val __obj = js.Dynamic.literal(includeEmpty = includeEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeEmpty]
  }
  
  @scala.inline
  implicit class IncludeEmptyMutableBuilder[Self <: IncludeEmpty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeEmpty(value: Boolean): Self = StObject.set(x, "includeEmpty", value.asInstanceOf[js.Any])
  }
}
