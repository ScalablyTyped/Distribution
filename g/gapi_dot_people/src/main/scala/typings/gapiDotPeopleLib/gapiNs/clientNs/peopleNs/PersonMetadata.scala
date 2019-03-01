package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonMetadata extends js.Object {
  var deleted: scala.Boolean
  var linkedPeopleResourceNames: js.Array[java.lang.String]
  var objectType: ObjectType
  var previousResourceNames: js.Array[java.lang.String]
  var sources: js.Array[Source]
}

object PersonMetadata {
  @scala.inline
  def apply(
    deleted: scala.Boolean,
    linkedPeopleResourceNames: js.Array[java.lang.String],
    objectType: ObjectType,
    previousResourceNames: js.Array[java.lang.String],
    sources: js.Array[Source]
  ): PersonMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleted")(deleted)
    __obj.updateDynamic("linkedPeopleResourceNames")(linkedPeopleResourceNames)
    __obj.updateDynamic("objectType")(objectType)
    __obj.updateDynamic("previousResourceNames")(previousResourceNames)
    __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[PersonMetadata]
  }
}

