package typings.gapiClientDatastore.gapi.client.datastore

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
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}

