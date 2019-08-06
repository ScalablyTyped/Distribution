package typings.gapiDotPeople.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Birthday extends js.Object {
  var date: Date
  var metadata: FieldMetadata
  var text: String
}

object Birthday {
  @scala.inline
  def apply(date: Date, metadata: FieldMetadata, text: String): Birthday = {
    val __obj = js.Dynamic.literal(date = date, metadata = metadata, text = text)
  
    __obj.asInstanceOf[Birthday]
  }
}

