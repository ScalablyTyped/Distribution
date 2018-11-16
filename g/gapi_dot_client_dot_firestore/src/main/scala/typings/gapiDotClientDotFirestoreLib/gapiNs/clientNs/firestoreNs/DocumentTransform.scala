package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DocumentTransform extends js.Object {
  /** The name of the document to transform. */
  var document: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The list of transformations to apply to the fields of the document, in
               * order.
               */
  var fieldTransforms: js.UndefOr[js.Array[FieldTransform]] = js.undefined
}

