package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldMetadata extends js.Object {
  var primary: scala.Boolean
  var source: Source
  var verified: scala.Boolean
}

object FieldMetadata {
  @scala.inline
  def apply(primary: scala.Boolean, source: Source, verified: scala.Boolean): FieldMetadata = {
    val __obj = js.Dynamic.literal(primary = primary, source = source, verified = verified)
  
    __obj.asInstanceOf[FieldMetadata]
  }
}

