package typings.googleMarkerclustererplus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents the object for values in the <code>styles</code> array passed
  * to the {@link MarkerClusterer} constructor. The element in this array that is used to
  * style the cluster icon is determined by calling the <code>calculator</code> function.
  */
@js.native
trait ClusterIconStyle extends js.Object {
  /**
    * [anchorIcon] The anchor position (in pixels) of the cluster icon. This is the
    * spot on the cluster icon that is to be aligned with the cluster position. The format is
    * <code>[yoffset, xoffset]</code> where <code>yoffset</code> increases as you go down and
    * <code>xoffset</code> increases to the right of the top-left corner of the icon. The default
    * anchor position is the center of the cluster icon.
    */
  var anchorIcon: js.UndefOr[js.Array[Double]] = js.native
  /**
    * [anchorText] The position (in pixels) from the center of the cluster icon to
    * where the text label is to be centered and drawn. The format is <code>[yoffset, xoffset]</code>
    * where <code>yoffset</code> increases as you go down from center and <code>xoffset</code>
    * increases to the right of center. The default is <code>[0, 0]</code>.
    */
  var anchorText: js.UndefOr[js.Array[Double]] = js.native
  /**
    * [backgroundPosition="0 0"] The position of the cluster icon image
    * within the image defined by <code>url</code>. The format is <code>"xpos ypos"</code>
    * (the same format as for the CSS <code>background-position</code> property). You must set
    * this property appropriately when the image defined by <code>url</code> represents a sprite
    * containing multiple images. Note that the position <i>must</i> be specified in px units.
    */
  var backgroundPosition: js.UndefOr[java.lang.String] = js.native
  /**
    * [fontFamily="Arial,sans-serif"] The value of the CSS <code>font-family</code>
    *  property for the label text shown on the cluster icon.
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.native
  /**
    * [fontStyle="normal"] The value of the CSS <code>font-style</code>
    *  property for the label text shown on the cluster icon.
    */
  var fontStyle: js.UndefOr[java.lang.String] = js.native
  /**
    * [fontWeight="bold"] The value of the CSS <code>font-weight</code>
    * property for the label text shown on the cluster icon.
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.native
  /** Height The display height (in pixels) of the cluster icon. Required. */
  var height: Double = js.native
  /** [textColor="black"] The color of the label text shown on the cluster icon. */
  var textColor: js.UndefOr[java.lang.String] = js.native
  /**
    * [textDecoration="none"] The value of the CSS <code>text-decoration</code>
    * property for the label text shown on the cluster icon.
    */
  var textDecoration: js.UndefOr[java.lang.String] = js.native
  /** textSize=11] The size (in pixels) of the label text shown on the cluster icon. */
  var textSize: js.UndefOr[Double] = js.native
  /** The URL of the cluster icon image file. Required. */
  var url: java.lang.String = js.native
  /** Width The display width (in pixels) of the cluster icon. Required. */
  var width: Double = js.native
}

object ClusterIconStyle {
  @scala.inline
  def apply(height: Double, url: java.lang.String, width: Double): ClusterIconStyle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterIconStyle]
  }
  @scala.inline
  implicit class ClusterIconStyleOps[Self <: ClusterIconStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchorIconVarargs(value: Double*): Self = this.set("anchorIcon", js.Array(value :_*))
    @scala.inline
    def setAnchorIcon(value: js.Array[Double]): Self = this.set("anchorIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorIcon: Self = this.set("anchorIcon", js.undefined)
    @scala.inline
    def setAnchorTextVarargs(value: Double*): Self = this.set("anchorText", js.Array(value :_*))
    @scala.inline
    def setAnchorText(value: js.Array[Double]): Self = this.set("anchorText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorText: Self = this.set("anchorText", js.undefined)
    @scala.inline
    def setBackgroundPosition(value: java.lang.String): Self = this.set("backgroundPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundPosition: Self = this.set("backgroundPosition", js.undefined)
    @scala.inline
    def setFontFamily(value: java.lang.String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontStyle(value: java.lang.String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: java.lang.String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setTextColor(value: java.lang.String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTextDecoration(value: java.lang.String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    @scala.inline
    def setTextSize(value: Double): Self = this.set("textSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextSize: Self = this.set("textSize", js.undefined)
  }
  
}

