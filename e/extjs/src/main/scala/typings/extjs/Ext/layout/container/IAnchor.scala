package typings.extjs.Ext.layout.container

import typings.extjs.Ext.layout.ISizePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnchor extends IAuto {
  
  /** [Config Option] (String) */
  var anchor: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var defaultAnchor: js.UndefOr[String] = js.native
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IAnchor: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], ISizePolicy]] = js.native
}
object IAnchor {
  
  @scala.inline
  def apply(): IAnchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnchor]
  }
  
  @scala.inline
  implicit class IAnchorOps[Self <: IAnchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnchor(value: String): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setDefaultAnchor(value: String): Self = this.set("defaultAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAnchor: Self = this.set("defaultAnchor", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: /* item */ js.UndefOr[js.Any] => ISizePolicy): Self = this.set("getItemSizePolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetItemSizePolicy: Self = this.set("getItemSizePolicy", js.undefined)
  }
}
