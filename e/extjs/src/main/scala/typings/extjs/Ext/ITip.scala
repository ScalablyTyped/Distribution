package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITip
  extends StObject
     with typings.extjs.Ext.panel.IPanel {
  
  /** [Config Option] (Boolean) */
  var constrainPosition: js.UndefOr[Boolean] = js.undefined
}
object ITip {
  
  inline def apply(): ITip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITip] (val x: Self) extends AnyVal {
    
    inline def setConstrainPosition(value: Boolean): Self = StObject.set(x, "constrainPosition", value.asInstanceOf[js.Any])
    
    inline def setConstrainPositionUndefined: Self = StObject.set(x, "constrainPosition", js.undefined)
  }
}
