package typings.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMetadata extends js.Object {
  var primary: Boolean
  var source: Source
  var verified: Boolean
}

object FieldMetadata {
  @scala.inline
  def apply(primary: Boolean, source: Source, verified: Boolean): FieldMetadata = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldMetadata]
  }
}

