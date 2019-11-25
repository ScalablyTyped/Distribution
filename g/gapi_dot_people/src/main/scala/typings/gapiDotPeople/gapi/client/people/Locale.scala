package typings.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var metadata: FieldMetadata
  var value: String
}

object Locale {
  @scala.inline
  def apply(metadata: FieldMetadata, value: String): Locale = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Locale]
  }
}

