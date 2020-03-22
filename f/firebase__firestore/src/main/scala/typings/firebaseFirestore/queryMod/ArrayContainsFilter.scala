package typings.firebaseFirestore.queryMod

import typings.firebaseFirestore.modelFieldValueMod.FieldValue
import typings.firebaseFirestore.pathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/query", "ArrayContainsFilter")
@js.native
class ArrayContainsFilter protected () extends FieldFilter {
  def this(field: FieldPath, value: FieldValue) = this()
}

