package typings.extjs.Ext.layout

import typings.extjs.Ext.layout.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBoxLayout extends IContainer {
  
  /** [Method] This method is called to re cache our understanding of flexes
    * @param ownerContext Object
    */
  var cacheFlexes: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IBoxLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
    * @param ownerContext Object
    */
  @JSName("completeLayout")
  var completeLayout_IBoxLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Object) */
  var defaultMargins: js.UndefOr[js.Any] = js.native
  
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
    * @param ownerContext Object
    */
  @JSName("finishedLayout")
  var finishedLayout_IBoxLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var flex: js.UndefOr[Double] = js.native
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @param ownerSizeModel Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IBoxLayout: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.native
  
  /** [Config Option] (String) */
  var pack: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var padding: js.UndefOr[String] = js.native
  
  /** [Config Option] (String/Ext.Component) */
  var stretchMaxPartner: js.UndefOr[js.Any] = js.native
}
object IBoxLayout {
  
  @scala.inline
  def apply(): IBoxLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoxLayout]
  }
  
  @scala.inline
  implicit class IBoxLayoutOps[Self <: IBoxLayout] (val x: Self) extends AnyVal {
    
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
    def setCacheFlexes(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("cacheFlexes", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCacheFlexes: Self = this.set("cacheFlexes", js.undefined)
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculate: Self = this.set("calculate", js.undefined)
    
    @scala.inline
    def setCompleteLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("completeLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCompleteLayout: Self = this.set("completeLayout", js.undefined)
    
    @scala.inline
    def setDefaultMargins(value: js.Any): Self = this.set("defaultMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMargins: Self = this.set("defaultMargins", js.undefined)
    
    @scala.inline
    def setFinishedLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("finishedLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFinishedLayout: Self = this.set("finishedLayout", js.undefined)
    
    @scala.inline
    def setFlex(value: Double): Self = this.set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: (/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any]) => ISizePolicy): Self = this.set("getItemSizePolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetItemSizePolicy: Self = this.set("getItemSizePolicy", js.undefined)
    
    @scala.inline
    def setPack(value: String): Self = this.set("pack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePack: Self = this.set("pack", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setStretchMaxPartner(value: js.Any): Self = this.set("stretchMaxPartner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretchMaxPartner: Self = this.set("stretchMaxPartner", js.undefined)
  }
}
