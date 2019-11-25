package typings.ejDotWebDotAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
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
  var imagePosition: js.UndefOr[typings.ejDotWebDotAll.ej.Tile.ImagePosition | String] = js.undefined
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
  @scala.inline
  def apply(
    allowSelection: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    badge: Badge = null,
    caption: Caption = null,
    cssClass: String = null,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    height: String | Double = null,
    imageClass: String = null,
    imagePosition: typings.ejDotWebDotAll.ej.Tile.ImagePosition | String = null,
    imageTemplateId: String = null,
    imageUrl: String = null,
    liveTile: LiveTile = null,
    locale: String = null,
    mouseDown: /* e */ MouseDownEventArgs => Unit = null,
    mouseUp: /* e */ MouseUpEventArgs => Unit = null,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    tileSize: TileSize | String = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass.asInstanceOf[js.Any])
    if (imagePosition != null) __obj.updateDynamic("imagePosition")(imagePosition.asInstanceOf[js.Any])
    if (imageTemplateId != null) __obj.updateDynamic("imageTemplateId")(imageTemplateId.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (liveTile != null) __obj.updateDynamic("liveTile")(liveTile.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (mouseDown != null) __obj.updateDynamic("mouseDown")(js.Any.fromFunction1(mouseDown))
    if (mouseUp != null) __obj.updateDynamic("mouseUp")(js.Any.fromFunction1(mouseUp))
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

