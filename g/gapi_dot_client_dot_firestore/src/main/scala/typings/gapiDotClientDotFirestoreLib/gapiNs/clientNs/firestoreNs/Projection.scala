package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

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

