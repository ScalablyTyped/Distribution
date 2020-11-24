package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.CancelComponentElementModel
import typings.devextreme.anon.ComponentElementModel
import typings.devextreme.anon.Delay
import typings.devextreme.anon.Position
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.positionConfig
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxContextMenuOptions extends dxMenuBaseOptions[dxContextMenu] {
  
  /**
    * [descr:dxContextMenu.Options.closeOnOutsideClick]
    */
  var closeOnOutsideClick: js.UndefOr[Boolean | (js.Function1[/* event */ event, Boolean])] = js.native
  
  /**
    * [descr:dxContextMenu.Options.dataSource]
    */
  @JSName("dataSource")
  var dataSource_dxContextMenuOptions: js.UndefOr[String | js.Array[dxContextMenuItem] | DataSource | DataSourceOptions] = js.native
  
  /**
    * [descr:dxContextMenu.Options.items]
    */
  @JSName("items")
  var items_dxContextMenuOptions: js.UndefOr[js.Array[dxContextMenuItem]] = js.native
  
  /**
    * [descr:dxContextMenu.Options.onHidden]
    */
  var onHidden: js.UndefOr[js.Function1[/* e */ ComponentElementModel, _]] = js.native
  
  /**
    * [descr:dxContextMenu.Options.onHiding]
    */
  var onHiding: js.UndefOr[js.Function1[/* e */ CancelComponentElementModel, _]] = js.native
  
  /**
    * [descr:dxContextMenu.Options.onPositioning]
    */
  var onPositioning: js.UndefOr[js.Function1[/* e */ Position, _]] = js.native
  
  /**
    * [descr:dxContextMenu.Options.onShowing]
    */
  var onShowing: js.UndefOr[js.Function1[/* e */ CancelComponentElementModel, _]] = js.native
  
  /**
    * [descr:dxContextMenu.Options.onShown]
    */
  var onShown: js.UndefOr[js.Function1[/* e */ ComponentElementModel, _]] = js.native
  
  /**
    * [descr:dxContextMenu.Options.position]
    */
  var position: js.UndefOr[positionConfig] = js.native
  
  /**
    * [descr:dxContextMenu.Options.showEvent]
    */
  var showEvent: js.UndefOr[Delay | String] = js.native
  
  /**
    * [descr:dxContextMenu.Options.submenuDirection]
    */
  var submenuDirection: js.UndefOr[auto | left | right] = js.native
  
  /**
    * [descr:dxContextMenu.Options.target]
    */
  var target: js.UndefOr[String | Element | JQuery] = js.native
}
object dxContextMenuOptions {
  
  @scala.inline
  def apply(): dxContextMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxContextMenuOptions]
  }
  
  @scala.inline
  implicit class dxContextMenuOptionsOps[Self <: dxContextMenuOptions] (val x: Self) extends AnyVal {
    
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
    def setCloseOnOutsideClickFunction1(value: /* event */ event => Boolean): Self = this.set("closeOnOutsideClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseOnOutsideClick(value: Boolean | (js.Function1[/* event */ event, Boolean])): Self = this.set("closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnOutsideClick: Self = this.set("closeOnOutsideClick", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: dxContextMenuItem*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | js.Array[dxContextMenuItem] | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: dxContextMenuItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[dxContextMenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOnHidden(value: /* e */ ComponentElementModel => _): Self = this.set("onHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHidden: Self = this.set("onHidden", js.undefined)
    
    @scala.inline
    def setOnHiding(value: /* e */ CancelComponentElementModel => _): Self = this.set("onHiding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHiding: Self = this.set("onHiding", js.undefined)
    
    @scala.inline
    def setOnPositioning(value: /* e */ Position => _): Self = this.set("onPositioning", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPositioning: Self = this.set("onPositioning", js.undefined)
    
    @scala.inline
    def setOnShowing(value: /* e */ CancelComponentElementModel => _): Self = this.set("onShowing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShowing: Self = this.set("onShowing", js.undefined)
    
    @scala.inline
    def setOnShown(value: /* e */ ComponentElementModel => _): Self = this.set("onShown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShown: Self = this.set("onShown", js.undefined)
    
    @scala.inline
    def setPosition(value: positionConfig): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShowEvent(value: Delay | String): Self = this.set("showEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowEvent: Self = this.set("showEvent", js.undefined)
    
    @scala.inline
    def setSubmenuDirection(value: auto | left | right): Self = this.set("submenuDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmenuDirection: Self = this.set("submenuDirection", js.undefined)
    
    @scala.inline
    def setTarget(value: String | Element | JQuery): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
