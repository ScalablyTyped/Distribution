package typings.divaJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludePadding extends StObject {
  
  var includePadding: Boolean
}
object IncludePadding {
  
  @scala.inline
  def apply(includePadding: Boolean): IncludePadding = {
    val __obj = js.Dynamic.literal(includePadding = includePadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludePadding]
  }
  
  @scala.inline
  implicit class IncludePaddingMutableBuilder[Self <: IncludePadding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludePadding(value: Boolean): Self = StObject.set(x, "includePadding", value.asInstanceOf[js.Any])
  }
}
