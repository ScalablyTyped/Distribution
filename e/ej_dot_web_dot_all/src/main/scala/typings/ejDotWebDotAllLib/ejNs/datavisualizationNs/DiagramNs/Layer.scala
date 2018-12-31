package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends js.Object {
  /** Enable or disable diagram objects to be added to the specific layer.
    * @Default {false}
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disable the interaction of the specific diagram objects.
    * @Default {false}
    */
  var lock: js.UndefOr[scala.Boolean] = js.undefined
  /** To specify the name of the diagram layer. Layer name should be unique.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** To Specify the collection of the object names belongs to the layer.
    * @Default {[]}
    */
  var objects: js.UndefOr[js.Array[_]] = js.undefined
  /** Enable or disable the specific layer objects to be visible on printing or exporting.
    * @Default {true}
    */
  var print: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disable the specific layer objects to be visible.
    * @Default {true}
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

