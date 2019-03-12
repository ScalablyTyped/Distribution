package typings
package ejDotWebDotAllLib.ejNs.TileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Sets allowSelection to  tile.
    * @Default {false}
    */
  var allowSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the background color to  tile.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Section for badge specific functionalities and it represents the notification for tile items.
    */
  var badge: js.UndefOr[Badge] = js.undefined
  /** Section for caption specific functionalities and it represents the notification for tile items.
    */
  var caption: js.UndefOr[Caption] = js.undefined
  /** Sets the root class for Tile theme. This cssClass API helps to use custom skinning option for Tile control. By defining the root class using this API, we need to include this root
    * class in CSS.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Saves current model value to browser cookies for state maintains. While refreshing the page retains the model value applies from browser cookies.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Customize the tile size height.
    * @Default {null}
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies Tile imageClass, using this property we can give images for each tile through CSS classes.
    * @Default {null}
    */
  var imageClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the position of tile image.
    * @Default {center}
    */
  var imagePosition: js.UndefOr[ImagePosition | java.lang.String] = js.undefined
  /** Specifies the tile image in outside of template content.
    * @Default {null}
    */
  var imageTemplateId: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the URL of tile image.
    * @Default {null}
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Section for liveTile specific functionalities.
    */
  var liveTile: js.UndefOr[LiveTile] = js.undefined
  /** Set the localization culture for Tile Widget.
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Event triggers when the mouseDown happens in the tile
    */
  var mouseDown: js.UndefOr[js.Function1[/* e */ MouseDownEventArgs, scala.Unit]] = js.undefined
  /** Event triggers when the mouseUp happens in the tile
    */
  var mouseUp: js.UndefOr[js.Function1[/* e */ MouseUpEventArgs, scala.Unit]] = js.undefined
  /** Sets the rounded corner to  tile.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the size of a tile.  See tileSize
    * @Default {small}
    */
  var tileSize: js.UndefOr[TileSize | java.lang.String] = js.undefined
  /** Customize the tile size width.
    * @Default {null}
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowSelection: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String = null,
    badge: Badge = null,
    caption: Caption = null,
    cssClass: java.lang.String = null,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String | scala.Double = null,
    imageClass: java.lang.String = null,
    imagePosition: ImagePosition | java.lang.String = null,
    imageTemplateId: java.lang.String = null,
    imageUrl: java.lang.String = null,
    liveTile: LiveTile = null,
    locale: java.lang.String = null,
    mouseDown: /* e */ MouseDownEventArgs => scala.Unit = null,
    mouseUp: /* e */ MouseUpEventArgs => scala.Unit = null,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    tileSize: TileSize | java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass)
    if (imagePosition != null) __obj.updateDynamic("imagePosition")(imagePosition.asInstanceOf[js.Any])
    if (imageTemplateId != null) __obj.updateDynamic("imageTemplateId")(imageTemplateId)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (liveTile != null) __obj.updateDynamic("liveTile")(liveTile)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mouseDown != null) __obj.updateDynamic("mouseDown")(js.Any.fromFunction1(mouseDown))
    if (mouseUp != null) __obj.updateDynamic("mouseUp")(js.Any.fromFunction1(mouseUp))
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

