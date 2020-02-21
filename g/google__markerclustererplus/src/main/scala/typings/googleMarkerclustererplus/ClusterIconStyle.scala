package typings.googleMarkerclustererplus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents the object for values in the <code>styles</code> array passed
  * to the {@link MarkerClusterer} constructor. The element in this array that is used to
  * style the cluster icon is determined by calling the <code>calculator</code> function.
  */
trait ClusterIconStyle extends js.Object {
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
  def apply(
    height: Double,
    url: java.lang.String,
    width: Double,
    anchorIcon: js.Array[Double] = null,
    anchorText: js.Array[Double] = null,
    backgroundPosition: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontStyle: java.lang.String = null,
    fontWeight: java.lang.String = null,
    textColor: java.lang.String = null,
    textDecoration: java.lang.String = null,
    textSize: Int | Double = null
  ): ClusterIconStyle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (anchorIcon != null) __obj.updateDynamic("anchorIcon")(anchorIcon.asInstanceOf[js.Any])
    if (anchorText != null) __obj.updateDynamic("anchorText")(anchorText.asInstanceOf[js.Any])
    if (backgroundPosition != null) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textSize != null) __obj.updateDynamic("textSize")(textSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterIconStyle]
  }
}

