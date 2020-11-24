package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxGalleryOptions extends CollectionWidgetOptions[dxGallery] {
  
  /**
    * [descr:dxGallery.Options.animationDuration]
    */
  var animationDuration: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxGallery.Options.animationEnabled]
    */
  var animationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxGallery.Options.dataSource]
    */
  @JSName("dataSource")
  var dataSource_dxGalleryOptions: js.UndefOr[String | (js.Array[String | dxGalleryItem | _]) | DataSource | DataSourceOptions] = js.native
  
  /**
    * [descr:dxGallery.Options.indicatorEnabled]
    */
  var indicatorEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxGallery.Options.initialItemWidth]
    */
  var initialItemWidth: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxGallery.Options.items]
    */
  @JSName("items")
  var items_dxGalleryOptions: js.UndefOr[js.Array[String | dxGalleryItem | _]] = js.native
  
  /**
    * [descr:dxGallery.Options.loop]
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxGallery.Options.showIndicator]
    */
  var showIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxGallery.Options.showNavButtons]
    */
  var showNavButtons: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxGallery.Options.slideshowDelay]
    */
  var slideshowDelay: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxGallery.Options.stretchImages]
    */
  var stretchImages: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxGallery.Options.swipeEnabled]
    */
  var swipeEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxGallery.Options.wrapAround]
    */
  var wrapAround: js.UndefOr[Boolean] = js.native
}
object dxGalleryOptions {
  
  @scala.inline
  def apply(): dxGalleryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGalleryOptions]
  }
  
  @scala.inline
  implicit class dxGalleryOptionsOps[Self <: dxGalleryOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEnabled(value: Boolean): Self = this.set("animationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationEnabled: Self = this.set("animationEnabled", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: (String | dxGalleryItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | (js.Array[String | dxGalleryItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setIndicatorEnabled(value: Boolean): Self = this.set("indicatorEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicatorEnabled: Self = this.set("indicatorEnabled", js.undefined)
    
    @scala.inline
    def setInitialItemWidth(value: Double): Self = this.set("initialItemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialItemWidth: Self = this.set("initialItemWidth", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: (String | dxGalleryItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String | dxGalleryItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setShowIndicator(value: Boolean): Self = this.set("showIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowIndicator: Self = this.set("showIndicator", js.undefined)
    
    @scala.inline
    def setShowNavButtons(value: Boolean): Self = this.set("showNavButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNavButtons: Self = this.set("showNavButtons", js.undefined)
    
    @scala.inline
    def setSlideshowDelay(value: Double): Self = this.set("slideshowDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideshowDelay: Self = this.set("slideshowDelay", js.undefined)
    
    @scala.inline
    def setStretchImages(value: Boolean): Self = this.set("stretchImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretchImages: Self = this.set("stretchImages", js.undefined)
    
    @scala.inline
    def setSwipeEnabled(value: Boolean): Self = this.set("swipeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeEnabled: Self = this.set("swipeEnabled", js.undefined)
    
    @scala.inline
    def setWrapAround(value: Boolean): Self = this.set("wrapAround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapAround: Self = this.set("wrapAround", js.undefined)
  }
}
