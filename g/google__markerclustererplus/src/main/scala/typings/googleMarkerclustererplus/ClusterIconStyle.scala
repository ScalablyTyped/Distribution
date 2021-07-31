package typings.googleMarkerclustererplus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents the object for values in the <code>styles</code> array passed
  * to the {@link MarkerClusterer} constructor. The element in this array that is used to
  * style the cluster icon is determined by calling the <code>calculator</code> function.
  */
trait ClusterIconStyle extends StObject {
  
  /**
    * [anchorIcon] The anchor position (in pixels) of the cluster icon. This is the
    * spot on the cluster icon that is to be aligned with the cluster position. The format is
    * <code>[yoffset, xoffset]</code> where <code>yoffset</code> increases as you go down and
    * <code>xoffset</code> increases to the right of the top-left corner of the icon. The default
    * anchor position is the center of the cluster icon.
    */
  var anchorIcon: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * [anchorText] The position (in pixels) from the center of the cluster icon to
    * where the text label is to be centered and drawn. The format is <code>[yoffset, xoffset]</code>
    * where <code>yoffset</code> increases as you go down from center and <code>xoffset</code>
    * increases to the right of center. The default is <code>[0, 0]</code>.
    */
  var anchorText: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * [backgroundPosition="0 0"] The position of the cluster icon image
    * within the image defined by <code>url</code>. The format is <code>"xpos ypos"</code>
    * (the same format as for the CSS <code>background-position</code> property). You must set
    * this property appropriately when the image defined by <code>url</code> represents a sprite
    * containing multiple images. Note that the position <i>must</i> be specified in px units.
    */
  var backgroundPosition: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * [fontFamily="Arial,sans-serif"] The value of the CSS <code>font-family</code>
    *  property for the label text shown on the cluster icon.
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * [fontStyle="normal"] The value of the CSS <code>font-style</code>
    *  property for the label text shown on the cluster icon.
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * [fontWeight="bold"] The value of the CSS <code>font-weight</code>
    * property for the label text shown on the cluster icon.
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  
  /** Height The display height (in pixels) of the cluster icon. Required. */
  var height: Double
  
  /** [textColor="black"] The color of the label text shown on the cluster icon. */
  var textColor: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * [textDecoration="none"] The value of the CSS <code>text-decoration</code>
    * property for the label text shown on the cluster icon.
    */
  var textDecoration: js.UndefOr[java.lang.String] = js.undefined
  
  /** textSize=11] The size (in pixels) of the label text shown on the cluster icon. */
  var textSize: js.UndefOr[Double] = js.undefined
  
  /** The URL of the cluster icon image file. Required. */
  var url: java.lang.String
  
  /** Width The display width (in pixels) of the cluster icon. Required. */
  var width: Double
}
object ClusterIconStyle {
  
  @scala.inline
  def apply(height: Double, url: java.lang.String, width: Double): ClusterIconStyle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterIconStyle]
  }
  
  @scala.inline
  implicit class ClusterIconStyleMutableBuilder[Self <: ClusterIconStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchorIcon(value: js.Array[Double]): Self = StObject.set(x, "anchorIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorIconUndefined: Self = StObject.set(x, "anchorIcon", js.undefined)
    
    @scala.inline
    def setAnchorIconVarargs(value: Double*): Self = StObject.set(x, "anchorIcon", js.Array(value :_*))
    
    @scala.inline
    def setAnchorText(value: js.Array[Double]): Self = StObject.set(x, "anchorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorTextUndefined: Self = StObject.set(x, "anchorText", js.undefined)
    
    @scala.inline
    def setAnchorTextVarargs(value: Double*): Self = StObject.set(x, "anchorText", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundPosition(value: java.lang.String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
    
    @scala.inline
    def setFontFamily(value: java.lang.String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontStyle(value: java.lang.String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: java.lang.String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: java.lang.String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: java.lang.String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    @scala.inline
    def setTextSize(value: Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
