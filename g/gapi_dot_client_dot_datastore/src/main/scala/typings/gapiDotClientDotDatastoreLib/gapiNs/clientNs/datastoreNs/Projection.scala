package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  /** The property to project. */
  var property: js.UndefOr[PropertyReference] = js.undefined
}

object Projection {
  @scala.inline
  def apply(property: PropertyReference = null): Projection = {
    val __obj = js.Dynamic.literal()
    if (property != null) __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[Projection]
  }
}

