package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldReference extends js.Object {
  var fieldPath: js.UndefOr[java.lang.String] = js.undefined
}

object FieldReference {
  @scala.inline
  def apply(fieldPath: java.lang.String = null): FieldReference = {
    val __obj = js.Dynamic.literal()
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath)
    __obj.asInstanceOf[FieldReference]
  }
}

