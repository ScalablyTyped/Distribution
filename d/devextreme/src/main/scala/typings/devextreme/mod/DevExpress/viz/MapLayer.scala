package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayer extends js.Object {
  /** @name MapLayer.elementType */
  var elementType: String
  /** @name MapLayer.index */
  var index: Double
  /** @name MapLayer.name */
  var name: String
  /** @name MapLayer.type */
  var `type`: String
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
    elementType: String,
    getDataSource: () => DataSource,
    getElements: () => js.Array[MapLayerElement],
    index: Double,
    name: String,
    `type`: String
  ): MapLayer = {
    val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), elementType = elementType.asInstanceOf[js.Any], getDataSource = js.Any.fromFunction0(getDataSource), getElements = js.Any.fromFunction0(getElements), index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayer]
  }
}

