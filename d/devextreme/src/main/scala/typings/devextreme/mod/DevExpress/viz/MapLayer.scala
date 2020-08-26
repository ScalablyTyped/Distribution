package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapLayer extends js.Object {
  /** @name MapLayer.elementType */
  var elementType: js.UndefOr[String] = js.native
  /** @name MapLayer.index */
  var index: js.UndefOr[Double] = js.native
  /** @name MapLayer.name */
  var name: js.UndefOr[String] = js.native
  /** @name MapLayer.type */
  var `type`: js.UndefOr[String] = js.native
  /** @name MapLayer.clearSelection() */
  def clearSelection(): Unit = js.native
  /** @name MapLayer.getDataSource() */
  def getDataSource(): DataSource = js.native
  /** @name MapLayer.getElements() */
  def getElements(): js.Array[MapLayerElement] = js.native
}

object MapLayer {
  @scala.inline
  def apply(
    clearSelection: () => Unit,
    getDataSource: () => DataSource,
    getElements: () => js.Array[MapLayerElement]
  ): MapLayer = {
    val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), getDataSource = js.Any.fromFunction0(getDataSource), getElements = js.Any.fromFunction0(getElements))
    __obj.asInstanceOf[MapLayer]
  }
  @scala.inline
  implicit class MapLayerOps[Self <: MapLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClearSelection(value: () => Unit): Self = this.set("clearSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDataSource(value: () => DataSource): Self = this.set("getDataSource", js.Any.fromFunction0(value))
    @scala.inline
    def setGetElements(value: () => js.Array[MapLayerElement]): Self = this.set("getElements", js.Any.fromFunction0(value))
    @scala.inline
    def setElementType(value: String): Self = this.set("elementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementType: Self = this.set("elementType", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

