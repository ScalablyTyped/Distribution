package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyReference extends js.Object {
  /**
    * The name of the property.
    * If name includes "."s, it may be interpreted as a property name path.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object PropertyReference {
  @scala.inline
  def apply(name: java.lang.String = null): PropertyReference = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PropertyReference]
  }
}

