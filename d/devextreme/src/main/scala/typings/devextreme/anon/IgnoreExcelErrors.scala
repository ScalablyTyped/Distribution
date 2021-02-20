package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreExcelErrors extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var ignoreExcelErrors: js.UndefOr[Boolean] = js.native
  
  var proxyUrl: js.UndefOr[String] = js.native
}
object IgnoreExcelErrors {
  
  @scala.inline
  def apply(): IgnoreExcelErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreExcelErrors]
  }
  
  @scala.inline
  implicit class IgnoreExcelErrorsMutableBuilder[Self <: IgnoreExcelErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setIgnoreExcelErrors(value: Boolean): Self = StObject.set(x, "ignoreExcelErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreExcelErrorsUndefined: Self = StObject.set(x, "ignoreExcelErrors", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
  }
}
