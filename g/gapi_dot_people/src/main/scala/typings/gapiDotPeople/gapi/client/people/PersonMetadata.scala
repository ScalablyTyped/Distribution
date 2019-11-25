package typings.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersonMetadata extends js.Object {
  var deleted: Boolean
  var linkedPeopleResourceNames: js.Array[String]
  var objectType: ObjectType
  var previousResourceNames: js.Array[String]
  var sources: js.Array[Source]
}

object PersonMetadata {
  @scala.inline
  def apply(
    deleted: Boolean,
    linkedPeopleResourceNames: js.Array[String],
    objectType: ObjectType,
    previousResourceNames: js.Array[String],
    sources: js.Array[Source]
  ): PersonMetadata = {
    val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], linkedPeopleResourceNames = linkedPeopleResourceNames.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], previousResourceNames = previousResourceNames.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PersonMetadata]
  }
}

