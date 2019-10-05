package typings.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverPhoto extends js.Object {
  var metadata: FieldMetadata
  var url: String
}

object CoverPhoto {
  @scala.inline
  def apply(metadata: FieldMetadata, url: String): CoverPhoto = {
    val __obj = js.Dynamic.literal(metadata = metadata, url = url)
  
    __obj.asInstanceOf[CoverPhoto]
  }
}

