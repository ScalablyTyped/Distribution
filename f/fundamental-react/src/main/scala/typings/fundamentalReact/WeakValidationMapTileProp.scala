package typings.fundamentalReact

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> */
trait WeakValidationMapTileProp extends js.Object {
  var active: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var backgroundImage: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var onClick: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.undefined
  var productTile: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var tabIndex: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
}

object WeakValidationMapTileProp {
  @scala.inline
  def apply(
    active: Validator[js.UndefOr[Boolean | Null]] = null,
    backgroundImage: Validator[js.UndefOr[Null | String]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    disableStyles: Validator[js.UndefOr[Boolean | Null]] = null,
    disabled: Validator[js.UndefOr[Boolean | Null]] = null,
    onClick: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]] = null,
    productTile: Validator[js.UndefOr[Boolean | Null]] = null,
    tabIndex: Validator[js.UndefOr[Double | Null]] = null
  ): WeakValidationMapTileProp = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (disableStyles != null) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (productTile != null) __obj.updateDynamic("productTile")(productTile.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapTileProp]
  }
}

