package typings.extjs.Ext.layout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISizePolicy extends StObject {
  
  /** [Property] (Boolean) */
  var readsHeight: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var readsWidth: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var setsHeight: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var setsWidth: js.UndefOr[Boolean] = js.undefined
}
object ISizePolicy {
  
  inline def apply(): ISizePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISizePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISizePolicy] (val x: Self) extends AnyVal {
    
    inline def setReadsHeight(value: Boolean): Self = StObject.set(x, "readsHeight", value.asInstanceOf[js.Any])
    
    inline def setReadsHeightUndefined: Self = StObject.set(x, "readsHeight", js.undefined)
    
    inline def setReadsWidth(value: Boolean): Self = StObject.set(x, "readsWidth", value.asInstanceOf[js.Any])
    
    inline def setReadsWidthUndefined: Self = StObject.set(x, "readsWidth", js.undefined)
    
    inline def setSetsHeight(value: Boolean): Self = StObject.set(x, "setsHeight", value.asInstanceOf[js.Any])
    
    inline def setSetsHeightUndefined: Self = StObject.set(x, "setsHeight", js.undefined)
    
    inline def setSetsWidth(value: Boolean): Self = StObject.set(x, "setsWidth", value.asInstanceOf[js.Any])
    
    inline def setSetsWidthUndefined: Self = StObject.set(x, "setsWidth", js.undefined)
  }
}
