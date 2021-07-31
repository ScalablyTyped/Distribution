package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var emptyValue: js.UndefOr[String] = js.undefined
  
  var ok: js.UndefOr[String] = js.undefined
}
object Cancel {
  
  @scala.inline
  def apply(): Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setEmptyValue(value: String): Self = StObject.set(x, "emptyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyValueUndefined: Self = StObject.set(x, "emptyValue", js.undefined)
    
    @scala.inline
    def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
  }
}
