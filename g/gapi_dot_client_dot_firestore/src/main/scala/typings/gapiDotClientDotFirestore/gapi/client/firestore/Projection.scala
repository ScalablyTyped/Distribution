package typings.gapiDotClientDotFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  /**
    * The fields to return.
    *
    * If empty, all fields are returned. To only return the name
    * of the document, use `['__name__']`.
    */
  var fields: js.UndefOr[js.Array[FieldReference]] = js.undefined
}

object Projection {
  @scala.inline
  def apply(fields: js.Array[FieldReference] = null): Projection = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
}

