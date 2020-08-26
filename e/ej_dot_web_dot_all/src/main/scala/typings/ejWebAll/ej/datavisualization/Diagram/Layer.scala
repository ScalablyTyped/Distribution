package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends js.Object {
  /** Enable or disable diagram objects to be added to the specific layer.
    * @Default {false}
    */
  var active: js.UndefOr[Boolean] = js.native
  /** Enable or disable the interaction of the specific diagram objects.
    * @Default {false}
    */
  var lock: js.UndefOr[Boolean] = js.native
  /** To specify the name of the diagram layer. Layer name should be unique.
    */
  var name: js.UndefOr[String] = js.native
  /** To Specify the collection of the object names belongs to the layer.
    * @Default {[]}
    */
  var objects: js.UndefOr[js.Array[_]] = js.native
  /** Enable or disable the specific layer objects to be visible on printing or exporting.
    * @Default {true}
    */
  var print: js.UndefOr[Boolean] = js.native
  /** Enable or disable the specific layer objects to be visible.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object Layer {
  @scala.inline
  def apply(): Layer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layer]
  }
  @scala.inline
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setLock(value: Boolean): Self = this.set("lock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setObjectsVarargs(value: js.Any*): Self = this.set("objects", js.Array(value :_*))
    @scala.inline
    def setObjects(value: js.Array[_]): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    @scala.inline
    def setPrint(value: Boolean): Self = this.set("print", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

