package typings.extjs.Ext.chart

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMask
  extends StObject
     with IBase {
  
  /** [Config Option] (Boolean/String) */
  var mask: js.UndefOr[Any] = js.undefined
}
object IMask {
  
  inline def apply(): IMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMask]
  }
  
  extension [Self <: IMask](x: Self) {
    
    inline def setMask(value: Any): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
