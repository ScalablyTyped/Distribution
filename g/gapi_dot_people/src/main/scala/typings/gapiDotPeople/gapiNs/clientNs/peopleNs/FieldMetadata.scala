package typings.gapiDotPeople.gapiNs.clientNs.peopleNs

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
    val __obj = js.Dynamic.literal(primary = primary, source = source, verified = verified)
  
    __obj.asInstanceOf[FieldMetadata]
  }
}

