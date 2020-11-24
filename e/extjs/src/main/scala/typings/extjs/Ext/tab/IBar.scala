package typings.extjs.Ext.tab

import typings.extjs.Ext.panel.IHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBar extends IHeader {
  
  /** [Method] Called by the layout system after the Component has been laid out
    * @param width Object
    */
  @JSName("afterComponentLayout")
  var afterComponentLayout_IBar: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Property] (Boolean) */
  var isTabBar: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var maxTabWidth: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minTabWidth: js.UndefOr[Double] = js.native
  
  /** [Method] This method is invoked after a new Component has been removed
    * @param tab Object
    */
  @JSName("onRemove")
  var onRemove_IBar: js.UndefOr[js.Function1[/* tab */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IBar: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[Boolean] = js.native
}
object IBar {
  
  @scala.inline
  def apply(): IBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBar]
  }
  
  @scala.inline
  implicit class IBarOps[Self <: IBar] (val x: Self) extends AnyVal {
    
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
    def setAfterComponentLayout(value: /* width */ js.UndefOr[js.Any] => Unit): Self = this.set("afterComponentLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterComponentLayout: Self = this.set("afterComponentLayout", js.undefined)
    
    @scala.inline
    def setIsTabBar(value: Boolean): Self = this.set("isTabBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTabBar: Self = this.set("isTabBar", js.undefined)
    
    @scala.inline
    def setMaxTabWidth(value: Double): Self = this.set("maxTabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTabWidth: Self = this.set("maxTabWidth", js.undefined)
    
    @scala.inline
    def setMinTabWidth(value: Double): Self = this.set("minTabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTabWidth: Self = this.set("minTabWidth", js.undefined)
    
    @scala.inline
    def setOnRemove(value: /* tab */ js.UndefOr[js.Any] => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setOnRender(value: () => Unit): Self = this.set("onRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
  }
}
