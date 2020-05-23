package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertySet extends js.Object {
  var propertySet: js.UndefOr[String] = js.undefined
  var stateProperties: js.UndefOr[js.Array[_]] = js.undefined
}

object PropertySet {
  @scala.inline
  def apply(propertySet: String = null, stateProperties: js.Array[_] = null): PropertySet = {
    val __obj = js.Dynamic.literal()
    if (propertySet != null) __obj.updateDynamic("propertySet")(propertySet.asInstanceOf[js.Any])
    if (stateProperties != null) __obj.updateDynamic("stateProperties")(stateProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertySet]
  }
}

