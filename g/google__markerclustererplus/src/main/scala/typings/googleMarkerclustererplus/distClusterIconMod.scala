package typings.googleMarkerclustererplus

import typings.googleMarkerclustererplus.distClusterMod.Cluster
import typings.googleMarkerclustererplus.distOverlayViewSafeMod.OverlayViewSafe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClusterIconMod {
  
  @JSImport("@google/markerclustererplus/dist/cluster-icon", "ClusterIcon")
  @js.native
  open class ClusterIcon protected () extends OverlayViewSafe {
    /**
      * @param cluster_ The cluster with which the icon is to be associated.
      * @param styles_ An array of {@link ClusterIconStyle} defining the cluster icons
      *  to use for various cluster sizes.
      */
    def this(cluster_ : Cluster, styles_ : js.Array[ClusterIconStyle]) = this()
    
    /* private */ var anchorIcon_ : Any = js.native
    
    /* private */ var anchorText_ : Any = js.native
    
    /* private */ var boundsChangedListener_ : Any = js.native
    
    /* private */ var center_ : Any = js.native
    
    /* private */ var className_ : Any = js.native
    
    /* private */ var cluster_ : Any = js.native
    
    /**
      * Creates the `cssText` style parameter based on the position of the icon.
      *
      * @param pos The position of the icon.
      * @return The CSS style text.
      */
    /* private */ var createCss_ : Any = js.native
    
    /* private */ var div_ : Any = js.native
    
    /**
      * Draws the icon.
      */
    def draw(): Unit = js.native
    
    /* private */ var getImageElementHtml: Any = js.native
    
    /* private */ var getLabelDivHtml: Any = js.native
    
    /**
      * Returns the position at which to place the DIV depending on the latlng.
      *
      * @param latlng The position in latlng.
      * @return The position in pixels.
      */
    /* private */ var getPosFromLatLng_ : Any = js.native
    
    /**
      * Hides the icon.
      */
    def hide(): Unit = js.native
    
    /**
      * Adds the icon to the DOM.
      */
    def onAdd(): Unit = js.native
    
    /**
      * Removes the icon from the DOM.
      */
    def onRemove(): Unit = js.native
    
    /**
      * Sets the position at which to center the icon.
      *
      * @param center The latlng to set as the center.
      */
    def setCenter(
      center: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLng */ Any
    ): Unit = js.native
    
    /**
      * Positions and shows the icon.
      */
    def show(): Unit = js.native
    
    /* private */ var style: Any = js.native
    
    /* private */ var styles_ : Any = js.native
    
    /* private */ var sums_ : Any = js.native
    
    /**
      * Sets the icon styles to the appropriate element in the styles array.
      *
      * @ignore
      * @param sums The icon label text and styles index.
      */
    def useStyle(sums: ClusterIconInfo): Unit = js.native
    
    /* private */ var visible_ : Any = js.native
  }
  
  trait ClusterIconInfo extends StObject {
    
    /**
      * The index plus 1 of the element in the `styles`
      */
    var index: Double
    
    /**
      * The text of the label to be shown on the cluster icon.
      */
    var text: String
    
    /**
      * The tooltip to display when the mouse moves over the cluster icon.
      * If this value is `undefined` or `""`, `title` is set to the
      * value of the `title` property passed to the MarkerClusterer.
      */
    var title: String
  }
  object ClusterIconInfo {
    
    inline def apply(index: Double, text: String, title: String): ClusterIconInfo = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterIconInfo]
    }
    
    extension [Self <: ClusterIconInfo](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClusterIconStyle extends StObject {
    
    /**
      * The anchor position (in pixels) of the cluster icon. This is the
      * spot on the cluster icon that is to be aligned with the cluster position. The format is
      * `[yoffset, xoffset]` where `yoffset` increases as you go down and
      * `xoffset` increases to the right of the top-left corner of the icon. The default
      * anchor position is the center of the cluster icon.
      */
    var anchorIcon: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    /**
      * The position (in pixels) from the center of the cluster icon to
      * where the text label is to be centered and drawn. The format is `[yoffset, xoffset]`
      * where `yoffset` increases as you go down from center and `xoffset`
      * increases to the right of center. The default is `[0, 0]`.
      */
    var anchorText: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    /**
      * The position of the cluster icon image
      * within the image defined by `url`. The format is `"xpos ypos"`
      * (the same format as for the CSS `background-position` property). You must set
      * this property appropriately when the image defined by `url` represents a sprite
      * containing multiple images. Note that the position <i>must</i> be specified in px units.
      *
      * @default `"0 0"`
      */
    var backgroundPosition: js.UndefOr[String] = js.undefined
    
    /** The name of the CSS class defining styles for the cluster markers. */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      *  The value of the CSS `font-family`
      *  property for the label text shown on the cluster icon.
      *  @default `"Arial,sans-serif"`
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /**
      *  The value of the CSS `font-style`
      *  property for the label text shown on the cluster icon.
      *
      *  @default `"normal"`
      */
    var fontStyle: js.UndefOr[String] = js.undefined
    
    /**
      * The value of the CSS `font-weight`
      * property for the label text shown on the cluster icon.
      *
      *  @default `"bold"`
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /** Height The display height (in pixels) of the cluster icon. Required. */
    var height: Double
    
    /**
      * The color of the label text shown on the cluster icon.
      * @default `"black"`
      */
    var textColor: js.UndefOr[String] = js.undefined
    
    /**
      * The value of the CSS `text-decoration`
      * property for the label text shown on the cluster icon.
      *
      * @default `"none"`
      */
    var textDecoration: js.UndefOr[String] = js.undefined
    
    /** The line height (in pixels) of the label text shown on the cluster icon.
      * @default the same as cluster icon height
      */
    var textLineHeight: js.UndefOr[Double] = js.undefined
    
    /** The size (in pixels) of the label text shown on the cluster icon.
      * @default `11`
      */
    var textSize: js.UndefOr[Double] = js.undefined
    
    /** The URL of the cluster icon image file. If not set, img element will not be created */
    var url: js.UndefOr[String] = js.undefined
    
    /** Width The display width (in pixels) of the cluster icon. Required. */
    var width: Double
  }
  object ClusterIconStyle {
    
    inline def apply(height: Double, width: Double): ClusterIconStyle = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterIconStyle]
    }
    
    extension [Self <: ClusterIconStyle](x: Self) {
      
      inline def setAnchorIcon(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "anchorIcon", value.asInstanceOf[js.Any])
      
      inline def setAnchorIconUndefined: Self = StObject.set(x, "anchorIcon", js.undefined)
      
      inline def setAnchorText(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "anchorText", value.asInstanceOf[js.Any])
      
      inline def setAnchorTextUndefined: Self = StObject.set(x, "anchorText", js.undefined)
      
      inline def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setTextLineHeight(value: Double): Self = StObject.set(x, "textLineHeight", value.asInstanceOf[js.Any])
      
      inline def setTextLineHeightUndefined: Self = StObject.set(x, "textLineHeight", js.undefined)
      
      inline def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
