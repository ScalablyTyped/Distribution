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

