package typings.ejWebAll.anon

import typings.ejWebAll.ej.ReportDesigner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofReportDesigner extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: ReportDesigner = js.native
}
object TypeofReportDesigner {
  
  @scala.inline
  def apply(Locale: js.Any, fn: ReportDesigner): TypeofReportDesigner = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReportDesigner]
  }
  
  @scala.inline
  implicit class TypeofReportDesignerMutableBuilder[Self <: TypeofReportDesigner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: ReportDesigner): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
