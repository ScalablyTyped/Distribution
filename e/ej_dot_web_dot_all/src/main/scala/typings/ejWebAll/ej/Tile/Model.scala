package typings.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Sets allowSelection to  tile.
    * @Default {false}
    */
  var allowSelection: js.UndefOr[Boolean] = js.native
  
  /** Sets the background color to  tile.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** Section for badge specific functionalities and it represents the notification for tile items.
    */
  var badge: js.UndefOr[Badge] = js.native
  
  /** Section for caption specific functionalities and it represents the notification for tile items.
    */
  var caption: js.UndefOr[Caption] = js.native
  
  /** Sets the root class for Tile theme. This cssClass API helps to use custom skinning option for Tile control. By defining the root class using this API, we need to include this root
    * class in CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Saves current model value to browser cookies for state maintains. While refreshing the page retains the model value applies from browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  
  /** Customize the tile size height.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /** Specifies Tile imageClass, using this property we can give images for each tile through CSS classes.
    * @Default {null}
    */
  var imageClass: js.UndefOr[String] = js.native
  
  /** Specifies the position of tile image.
    * @Default {center}
    */
  var imagePosition: js.UndefOr[ImagePosition | String] = js.native
  
  /** Specifies the tile image in outside of template content.
    * @Default {null}
    */
  var imageTemplateId: js.UndefOr[String] = js.native
  
  /** Specifies the URL of tile image.
    * @Default {null}
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /** Section for liveTile specific functionalities.
    */
  var liveTile: js.UndefOr[LiveTile] = js.native
  
  /** Set the localization culture for Tile Widget.
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Event triggers when the mouseDown happens in the tile
    */
  var mouseDown: js.UndefOr[js.Function1[/* e */ MouseDownEventArgs, Unit]] = js.native
  
  /** Event triggers when the mouseUp happens in the tile
    */
  var mouseUp: js.UndefOr[js.Function1[/* e */ MouseUpEventArgs, Unit]] = js.native
  
  /** Sets the rounded corner to  tile.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Specifies the size of a tile.  See tileSize
    * @Default {small}
    */
  var tileSize: js.UndefOr[TileSize | String] = js.native
  
  /** Customize the tile size width.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setAllowSelection(value: Boolean): Self = this.set("allowSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSelection: Self = this.set("allowSelection", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBadge(value: Badge): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setCaption(value: Caption): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setImageClass(value: String): Self = this.set("imageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageClass: Self = this.set("imageClass", js.undefined)
    
    @scala.inline
    def setImagePosition(value: ImagePosition | String): Self = this.set("imagePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePosition: Self = this.set("imagePosition", js.undefined)
    
    @scala.inline
    def setImageTemplateId(value: String): Self = this.set("imageTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTemplateId: Self = this.set("imageTemplateId", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setLiveTile(value: LiveTile): Self = this.set("liveTile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveTile: Self = this.set("liveTile", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMouseDown(value: /* e */ MouseDownEventArgs => Unit): Self = this.set("mouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseDown: Self = this.set("mouseDown", js.undefined)
    
    @scala.inline
    def setMouseUp(value: /* e */ MouseUpEventArgs => Unit): Self = this.set("mouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseUp: Self = this.set("mouseUp", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setTileSize(value: TileSize | String): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
