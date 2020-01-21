package typings.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  var metadata: FieldMetadata
  var url: String
}

object Photo {
  @scala.inline
  def apply(metadata: FieldMetadata, url: String): Photo = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Photo]
  }
}

