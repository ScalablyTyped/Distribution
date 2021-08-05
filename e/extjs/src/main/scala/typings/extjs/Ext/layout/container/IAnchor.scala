package typings.extjs.Ext.layout.container

import typings.extjs.Ext.layout.ISizePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnchor
  extends StObject
     with IAuto {
  
  /** [Config Option] (String) */
  var anchor: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var defaultAnchor: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IAnchor: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], ISizePolicy]] = js.undefined
}
object IAnchor {
  
  inline def apply(): IAnchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnchor]
  }
  
  extension [Self <: IAnchor](x: Self) {
    
    inline def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setDefaultAnchor(value: String): Self = StObject.set(x, "defaultAnchor", value.asInstanceOf[js.Any])
    
    inline def setDefaultAnchorUndefined: Self = StObject.set(x, "defaultAnchor", js.undefined)
    
    inline def setGetItemSizePolicy(value: /* item */ js.UndefOr[js.Any] => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction1(value))
    
    inline def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
  }
}
