package typings.extjs.Ext.chart

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMask extends IBase {
  
  /** [Config Option] (Boolean/String) */
  var mask: js.UndefOr[js.Any] = js.native
}
object IMask {
  
  @scala.inline
  def apply(): IMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMask]
  }
  
  @scala.inline
  implicit class IMaskMutableBuilder[Self <: IMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMask(value: js.Any): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
