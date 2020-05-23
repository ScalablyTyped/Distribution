package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends js.Object {
  /** Enable or disable diagram objects to be added to the specific layer.
    * @Default {false}
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Enable or disable the interaction of the specific diagram objects.
    * @Default {false}
    */
  var lock: js.UndefOr[Boolean] = js.undefined
  /** To specify the name of the diagram layer. Layer name should be unique.
    */
  var name: js.UndefOr[String] = js.undefined
  /** To Specify the collection of the object names belongs to the layer.
    * @Default {[]}
    */
  var objects: js.UndefOr[js.Array[_]] = js.undefined
  /** Enable or disable the specific layer objects to be visible on printing or exporting.
    * @Default {true}
    */
  var print: js.UndefOr[Boolean] = js.undefined
  /** Enable or disable the specific layer objects to be visible.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Layer {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    lock: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    objects: js.Array[_] = null,
    print: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): Layer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lock)) __obj.updateDynamic("lock")(lock.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
}

