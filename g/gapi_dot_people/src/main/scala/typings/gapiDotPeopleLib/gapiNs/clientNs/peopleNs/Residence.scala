package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Residence extends js.Object {
  var current: scala.Boolean
  var metadata: FieldMetadata
  var value: java.lang.String
}

object Residence {
  @scala.inline
  def apply(current: scala.Boolean, metadata: FieldMetadata, value: java.lang.String): Residence = {
    val __obj = js.Dynamic.literal(current = current, metadata = metadata, value = value)
  
    __obj.asInstanceOf[Residence]
  }
}

