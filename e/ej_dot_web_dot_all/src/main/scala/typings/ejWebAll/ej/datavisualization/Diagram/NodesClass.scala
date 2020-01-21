package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesClass extends js.Object {
  /** Defines the collection of attributes
    * @Default {[]}
    */
  var attributes: js.UndefOr[js.Array[NodesClassAttribute]] = js.undefined
  /** Defines the collection of methods of a Class.
    * @Default {[]}
    */
  var methods: js.UndefOr[js.Array[NodesClassMethod]] = js.undefined
  /** Sets the name of class.
    */
  var name: js.UndefOr[String] = js.undefined
}

object NodesClass {
  @scala.inline
  def apply(
    attributes: js.Array[NodesClassAttribute] = null,
    methods: js.Array[NodesClassMethod] = null,
    name: String = null
  ): NodesClass = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesClass]
  }
}

