package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tile
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_Tile: Model = js.native
  
  /** Update the image template of tile item to another one.
    * @param {string} UpdateTemplate by using id
    * @param {number} index of the tile
    * @returns {void}
    */
  def updateTemplate(id: String, index: Double): Unit = js.native
}
object Tile {
  
  @js.native
  sealed trait BadgePosition extends StObject
  @JSGlobal("ej.Tile.BadgePosition")
  @js.native
  object BadgePosition extends StObject {
    
    ///To set the bottomright of tile badge
    @js.native
    sealed trait Bottomright
      extends StObject
         with BadgePosition
    
    ///To set the topright position of tile badge
    @js.native
    sealed trait Topright
      extends StObject
         with BadgePosition
  }
  
  @js.native
  sealed trait CaptionAlignment extends StObject
  @JSGlobal("ej.Tile.CaptionAlignment")
  @js.native
  object CaptionAlignment extends StObject {
    
    ///To set the center alignment of text in tile control
    @js.native
    sealed trait Center
      extends StObject
         with CaptionAlignment
    
    ///To set the left alignment of text in tile control
    @js.native
    sealed trait Left
      extends StObject
         with CaptionAlignment
    
    ///To set the normal alignment of text in tile control
    @js.native
    sealed trait Normal
      extends StObject
         with CaptionAlignment
    
    ///To set the right alignment of text in tile control
    @js.native
    sealed trait Right
      extends StObject
         with CaptionAlignment
  }
  
  @js.native
  sealed trait CaptionPosition extends StObject
  @JSGlobal("ej.Tile.CaptionPosition")
  @js.native
  object CaptionPosition extends StObject {
    
    ///To set the inner bottom position of the tile text
    @js.native
    sealed trait Innerbottom
      extends StObject
         with CaptionPosition
    
    ///To set the inner top position of the tile text
    @js.native
    sealed trait Innertop
      extends StObject
         with CaptionPosition
    
    ///To set the outer position of the tile text
    @js.native
    sealed trait Outer
      extends StObject
         with CaptionPosition
  }
  
  @js.native
  sealed trait ImagePosition extends StObject
  @JSGlobal("ej.Tile.ImagePosition")
  @js.native
  object ImagePosition extends StObject {
    
    ///To set the bottom center position of tile image
    @js.native
    sealed trait BottomCenter
      extends StObject
         with typings.ejWebAll.ej.Tile.ImagePosition
    
    ///To set the bottomleft position of tile image
    @js.native
    sealed trait BottomLeft
      extends StObject
         with typings.ejWebAll.ej.Tile.ImagePosition
    
    ///To set the bottomright position of tile image
    @js.native
    sealed trait BottomRight
      extends StObject
         with typings.ejWebAll.ej.Tile.ImagePosition
    
    ///To set the center position of tile image
    @js.native
    sealed trait Center
      extends StObject
         with typings.ejWebAll.ej.Tile.ImagePosition
    
    ///To set the fill position of tile image
    @js.native
    sealed trait Fill
      extends StObject
         with typings.ejWebAll.ej.Tile.ImagePosition
    
    ///To set the left center position of tile image
    @js.native
    sealed trait LeftCenter
      extends StObject
         with typings.ejWebAll.ej.Tile.ImagePosition
    
    ///To set the right center position of tile image
    @js.native
    sealed trait RightCenter
      extends StObject
         with typings.ejWebAll.ej.Tile.ImagePosition
    
    ///To set the top center position of tile image
    @js.native
    sealed trait TopCenter
      extends StObject
         with typings.ejWebAll.ej.Tile.ImagePosition
    
    ///To set the topleft position of tile image
    @js.native
    sealed trait TopLeft
      extends StObject
         with typings.ejWebAll.ej.Tile.ImagePosition
    
    ///To set the topright position of tile image
    @js.native
    sealed trait TopRight
      extends StObject
         with typings.ejWebAll.ej.Tile.ImagePosition
  }
  
  @js.native
  sealed trait TileSize extends StObject
  @JSGlobal("ej.Tile.TileSize")
  @js.native
  object TileSize extends StObject {
    
    ///To set the large size for tile control
    @js.native
    sealed trait Large
      extends StObject
         with TileSize
    
    ///To set the medium size for tile control
    @js.native
    sealed trait Medium
      extends StObject
         with TileSize
    
    ///To set the small size for tile control
    @js.native
    sealed trait Small
      extends StObject
         with TileSize
    
    ///To set the wide size for tile control
    @js.native
    sealed trait Wide
      extends StObject
         with TileSize
  }
  
  @js.native
  sealed trait liveTileType extends StObject
  @JSGlobal("ej.Tile.liveTileType")
  @js.native
  object liveTileType extends StObject {
    
    ///To set carousel type of liveTile for tile control
    @js.native
    sealed trait Carousel
      extends StObject
         with liveTileType
    
    ///To set flip type of liveTile for tile control
    @js.native
    sealed trait Flip
      extends StObject
         with liveTileType
    
    ///To set slide type of liveTile for tile control
    @js.native
    sealed trait Slide
      extends StObject
         with liveTileType
  }
  
  trait Badge extends StObject {
    
    /** Specifies whether to enable badge or not.
      * @Default {false}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies maximum value for tile badge.
      * @Default {100}
      */
    var maxValue: js.UndefOr[Double] = js.undefined
    
    /** Specifies minimum value for tile badge.
      * @Default {1}
      */
    var minValue: js.UndefOr[Double] = js.undefined
    
    /** Sets position for tile badge.
      * @Default {â€œbottomrightâ€}
      */
    var position: js.UndefOr[BadgePosition | String] = js.undefined
    
    /** Specifies text instead of number for tile badge.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Sets value for tile badge.
      * @Default {1}
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object Badge {
    
    inline def apply(): Badge = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Badge]
    }
    
    extension [Self <: Badge](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setPosition(value: BadgePosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Caption extends StObject {
    
    /** It is used to align the text of a tile.
      * @Default {normal}
      */
    var alignment: js.UndefOr[CaptionAlignment | String] = js.undefined
    
    /** Specifies whether the tile text to be shown or hidden.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** sets the icon instead of text.
      * @Default {null}
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /** It is used to specify the caption position like Inner top,  inner bottom and outer.
      * @Default {Innerbottom}
      */
    var position: js.UndefOr[CaptionPosition | String] = js.undefined
    
    /** Changes the text of a tile.
      * @Default {Text}
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object Caption {
    
    inline def apply(): Caption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Caption]
    }
    
    extension [Self <: Caption](x: Self) {
      
      inline def setAlignment(value: CaptionAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setPosition(value: CaptionPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait LiveTile extends StObject {
    
    /** Specifies whether to enable liveTile or not.
      * @Default {false}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies liveTile images in CSS classes.
      * @Default {null}
      */
    var imageClass: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Specifies liveTile images in templates.
      * @Default {null}
      */
    var imageTemplateId: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Specifies liveTile images in CSS classes.
      * @Default {null}
      */
    var imageUrl: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Sets the text to each living tile
      * @Default {Null}
      */
    var text: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Specifies liveTile type for Tile. See orientation
      * @Default {flip}
      */
    var `type`: js.UndefOr[liveTileType | String] = js.undefined
    
    /** Specifies time interval between two successive liveTile animation
      * @Default {2000}
      */
    var updateInterval: js.UndefOr[Double] = js.undefined
  }
  object LiveTile {
    
    inline def apply(): LiveTile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LiveTile]
    }
    
    extension [Self <: LiveTile](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setImageClass(value: js.Array[js.Any]): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
      
      inline def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
      
      inline def setImageClassVarargs(value: js.Any*): Self = StObject.set(x, "imageClass", js.Array(value :_*))
      
      inline def setImageTemplateId(value: js.Array[js.Any]): Self = StObject.set(x, "imageTemplateId", value.asInstanceOf[js.Any])
      
      inline def setImageTemplateIdUndefined: Self = StObject.set(x, "imageTemplateId", js.undefined)
      
      inline def setImageTemplateIdVarargs(value: js.Any*): Self = StObject.set(x, "imageTemplateId", js.Array(value :_*))
      
      inline def setImageUrl(value: js.Array[js.Any]): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setImageUrlVarargs(value: js.Any*): Self = StObject.set(x, "imageUrl", js.Array(value :_*))
      
      inline def setText(value: js.Array[js.Any]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: js.Any*): Self = StObject.set(x, "text", js.Array(value :_*))
      
      inline def setType(value: liveTileType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
      
      inline def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Sets allowSelection to  tile.
      * @Default {false}
      */
    var allowSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the background color to  tile.
      * @Default {null}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Section for badge specific functionalities and it represents the notification for tile items.
      */
    var badge: js.UndefOr[Badge] = js.undefined
    
    /** Section for caption specific functionalities and it represents the notification for tile items.
      */
    var caption: js.UndefOr[Caption] = js.undefined
    
    /** Sets the root class for Tile theme. This cssClass API helps to use custom skinning option for Tile control. By defining the root class using this API, we need to include this root
      * class in CSS.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Saves current model value to browser cookies for state maintains. While refreshing the page retains the model value applies from browser cookies.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Customize the tile size height.
      * @Default {null}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies Tile imageClass, using this property we can give images for each tile through CSS classes.
      * @Default {null}
      */
    var imageClass: js.UndefOr[String] = js.undefined
    
    /** Specifies the position of tile image.
      * @Default {center}
      */
    var imagePosition: js.UndefOr[typings.ejWebAll.ej.ImagePosition | String] = js.undefined
    
    /** Specifies the tile image in outside of template content.
      * @Default {null}
      */
    var imageTemplateId: js.UndefOr[String] = js.undefined
    
    /** Specifies the URL of tile image.
      * @Default {null}
      */
    var imageUrl: js.UndefOr[String] = js.undefined
    
    /** Section for liveTile specific functionalities.
      */
    var liveTile: js.UndefOr[LiveTile] = js.undefined
    
    /** Set the localization culture for Tile Widget.
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Event triggers when the mouseDown happens in the tile
      */
    var mouseDown: js.UndefOr[js.Function1[/* e */ MouseDownEventArgs, Unit]] = js.undefined
    
    /** Event triggers when the mouseUp happens in the tile
      */
    var mouseUp: js.UndefOr[js.Function1[/* e */ MouseUpEventArgs, Unit]] = js.undefined
    
    /** Sets the rounded corner to  tile.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the size of a tile.  See tileSize
      * @Default {small}
      */
    var tileSize: js.UndefOr[TileSize | String] = js.undefined
    
    /** Customize the tile size width.
      * @Default {null}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Tile.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Tile.Model]
    }
    
    extension [Self <: typings.ejWebAll.ej.Tile.Model](x: Self) {
      
      inline def setAllowSelection(value: Boolean): Self = StObject.set(x, "allowSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowSelectionUndefined: Self = StObject.set(x, "allowSelection", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBadge(value: Badge): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setCaption(value: Caption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImageClass(value: String): Self = StObject.set(x, "imageClass", value.asInstanceOf[js.Any])
      
      inline def setImageClassUndefined: Self = StObject.set(x, "imageClass", js.undefined)
      
      inline def setImagePosition(value: typings.ejWebAll.ej.ImagePosition | String): Self = StObject.set(x, "imagePosition", value.asInstanceOf[js.Any])
      
      inline def setImagePositionUndefined: Self = StObject.set(x, "imagePosition", js.undefined)
      
      inline def setImageTemplateId(value: String): Self = StObject.set(x, "imageTemplateId", value.asInstanceOf[js.Any])
      
      inline def setImageTemplateIdUndefined: Self = StObject.set(x, "imageTemplateId", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setLiveTile(value: LiveTile): Self = StObject.set(x, "liveTile", value.asInstanceOf[js.Any])
      
      inline def setLiveTileUndefined: Self = StObject.set(x, "liveTile", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMouseDown(value: /* e */ MouseDownEventArgs => Unit): Self = StObject.set(x, "mouseDown", js.Any.fromFunction1(value))
      
      inline def setMouseDownUndefined: Self = StObject.set(x, "mouseDown", js.undefined)
      
      inline def setMouseUp(value: /* e */ MouseUpEventArgs => Unit): Self = StObject.set(x, "mouseUp", js.Any.fromFunction1(value))
      
      inline def setMouseUpUndefined: Self = StObject.set(x, "mouseUp", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setTileSize(value: TileSize | String): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MouseDownEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the index of current tile item
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the tile model
      */
    var model: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current tile text
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Boolean] = js.undefined
  }
  object MouseDownEventArgs {
    
    inline def apply(): MouseDownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseDownEventArgs]
    }
    
    extension [Self <: MouseDownEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setModel(value: Boolean): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MouseUpEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the index of current tile item
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** returns the tile model
      */
    var model: js.UndefOr[Boolean] = js.undefined
    
    /** returns the current tile text
      */
    var text: js.UndefOr[Boolean] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[Boolean] = js.undefined
  }
  object MouseUpEventArgs {
    
    inline def apply(): MouseUpEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseUpEventArgs]
    }
    
    extension [Self <: MouseUpEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setModel(value: Boolean): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
