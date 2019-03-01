package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var metadata: FieldMetadata
  var value: java.lang.String
}

object Locale {
  @scala.inline
  def apply(metadata: FieldMetadata, value: java.lang.String): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Locale]
  }
}

