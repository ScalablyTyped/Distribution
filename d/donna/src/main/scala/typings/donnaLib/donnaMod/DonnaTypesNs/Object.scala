package typings
package donnaLib.donnaMod.DonnaTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  var bindingType: java.lang.String
  var classProperties: js.UndefOr[js.Array[_]] = js.undefined
  var doc: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var paramNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var prototypeProperties: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  var range: js.Array[js.Array[scala.Double]]
  var `type`: java.lang.String
}

object Object {
  @scala.inline
  def apply(
    bindingType: java.lang.String,
    name: java.lang.String,
    range: js.Array[js.Array[scala.Double]],
    `type`: java.lang.String,
    classProperties: js.Array[_] = null,
    doc: java.lang.String = null,
    paramNames: js.Array[java.lang.String] = null,
    prototypeProperties: js.Array[js.Array[scala.Double]] = null
  ): Object = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bindingType")(bindingType)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("range")(range)
    if (classProperties != null) __obj.updateDynamic("classProperties")(classProperties)
    if (doc != null) __obj.updateDynamic("doc")(doc)
    if (paramNames != null) __obj.updateDynamic("paramNames")(paramNames)
    if (prototypeProperties != null) __obj.updateDynamic("prototypeProperties")(prototypeProperties)
    __obj.asInstanceOf[Object]
  }
}

