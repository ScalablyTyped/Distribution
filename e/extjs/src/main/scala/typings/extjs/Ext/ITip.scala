package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITip
  extends typings.extjs.Ext.panel.IPanel {
  
  /** [Config Option] (Boolean) */
  var constrainPosition: js.UndefOr[Boolean] = js.native
}
object ITip {
  
  @scala.inline
  def apply(): ITip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITip]
  }
  
  @scala.inline
  implicit class ITipMutableBuilder[Self <: ITip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstrainPosition(value: Boolean): Self = StObject.set(x, "constrainPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrainPositionUndefined: Self = StObject.set(x, "constrainPosition", js.undefined)
  }
}
