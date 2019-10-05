package typings.donna.donnaMod.DonnaTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  var bindingType: String
  var classProperties: js.UndefOr[js.Array[_]] = js.undefined
  var doc: js.UndefOr[String] = js.undefined
  var name: String
  var paramNames: js.UndefOr[js.Array[String]] = js.undefined
  var prototypeProperties: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var range: js.Array[js.Array[Double]]
  var `type`: String
}

object Object {
  @scala.inline
  def apply(
    bindingType: String,
    name: String,
    range: js.Array[js.Array[Double]],
    `type`: String,
    classProperties: js.Array[_] = null,
    doc: String = null,
    paramNames: js.Array[String] = null,
    prototypeProperties: js.Array[js.Array[Double]] = null
  ): Object = {
    val __obj = js.Dynamic.literal(bindingType = bindingType, name = name, range = range)
    __obj.updateDynamic("type")(`type`)
    if (classProperties != null) __obj.updateDynamic("classProperties")(classProperties)
    if (doc != null) __obj.updateDynamic("doc")(doc)
    if (paramNames != null) __obj.updateDynamic("paramNames")(paramNames)
    if (prototypeProperties != null) __obj.updateDynamic("prototypeProperties")(prototypeProperties)
    __obj.asInstanceOf[Object]
  }
}

