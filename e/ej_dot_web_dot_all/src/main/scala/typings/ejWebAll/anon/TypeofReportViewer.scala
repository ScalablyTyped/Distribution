package typings.ejWebAll.anon

import typings.ejWebAll.ej.ReportViewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofReportViewer extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: ReportViewer = js.native
}
object TypeofReportViewer {
  
  @scala.inline
  def apply(Locale: js.Any, fn: ReportViewer): TypeofReportViewer = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReportViewer]
  }
  
  @scala.inline
  implicit class TypeofReportViewerMutableBuilder[Self <: TypeofReportViewer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: ReportViewer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
