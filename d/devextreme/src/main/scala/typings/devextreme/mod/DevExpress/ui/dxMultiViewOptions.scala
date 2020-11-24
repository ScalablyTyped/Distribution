package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxMultiViewOptions[T] extends CollectionWidgetOptions[T] {
  
  /**
    * [descr:dxMultiView.Options.animationEnabled]
    */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxMultiView.Options.dataSource]
    */
  @JSName("dataSource")
  var dataSource_dxMultiViewOptions: js.UndefOr[
    String | (js.Array[String | dxMultiViewItem | _]) | DataSource | DataSourceOptions
  ] = js.native
  
  /**
    * [descr:dxMultiView.Options.deferRendering]
    */
  var deferRendering: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxMultiView.Options.items]
    */
  @JSName("items")
  var items_dxMultiViewOptions: js.UndefOr[js.Array[String | dxMultiViewItem | _]] = js.native
  
  /**
    * [descr:dxMultiView.Options.loop]
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxMultiView.Options.swipeEnabled]
    */
  var swipeEnabled: js.UndefOr[Boolean] = js.native
}
object dxMultiViewOptions {
  
  @scala.inline
  def apply[T](): dxMultiViewOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMultiViewOptions[T]]
  }
  
  @scala.inline
  implicit class dxMultiViewOptionsOps[Self <: dxMultiViewOptions[_], T] (val x: Self with dxMultiViewOptions[T]) extends AnyVal {
    
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
    def setAnimationEnabled(value: Boolean): Self = this.set("animationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEnabled: Self = this.set("animationEnabled", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: (String | dxMultiViewItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | (js.Array[String | dxMultiViewItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDeferRendering(value: Boolean): Self = this.set("deferRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferRendering: Self = this.set("deferRendering", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (String | dxMultiViewItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String | dxMultiViewItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setSwipeEnabled(value: Boolean): Self = this.set("swipeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeEnabled: Self = this.set("swipeEnabled", js.undefined)
  }
}
