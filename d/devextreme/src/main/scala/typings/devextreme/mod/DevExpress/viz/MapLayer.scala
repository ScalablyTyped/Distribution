package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayer extends js.Object {
  /** @name MapLayer.elementType */
  var elementType: js.UndefOr[String] = js.undefined
  /** @name MapLayer.index */
  var index: js.UndefOr[Double] = js.undefined
  /** @name MapLayer.name */
  var name: js.UndefOr[String] = js.undefined
  /** @name MapLayer.type */
  var `type`: js.UndefOr[String] = js.undefined
  /** @name MapLayer.clearSelection() */
  def clearSelection(): Unit
  /** @name MapLayer.getDataSource() */
  def getDataSource(): DataSource
  /** @name MapLayer.getElements() */
  def getElements(): js.Array[MapLayerElement]
}

object MapLayer {
  @scala.inline
  def apply(
    clearSelection: () => Unit,
    getDataSource: () => DataSource,
    getElements: () => js.Array[MapLayerElement],
    elementType: String = null,
    index: js.UndefOr[Double] = js.undefined,
    name: String = null,
    `type`: String = null
  ): MapLayer = {
    val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), getDataSource = js.Any.fromFunction0(getDataSource), getElements = js.Any.fromFunction0(getElements))
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayer]
  }
}

