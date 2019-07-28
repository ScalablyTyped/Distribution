package typings.gapiDotPeople.gapiNs.clientNs.peopleNs

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
    val __obj = js.Dynamic.literal(metadata = metadata, url = url)
  
    __obj.asInstanceOf[Photo]
  }
}

