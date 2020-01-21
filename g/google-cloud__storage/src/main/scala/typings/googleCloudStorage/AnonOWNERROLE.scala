package typings.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOWNERROLE extends js.Object {
  var OWNER_ROLE: String
  var READER_ROLE: String
  var WRITER_ROLE: String
}

object AnonOWNERROLE {
  @scala.inline
  def apply(OWNER_ROLE: String, READER_ROLE: String, WRITER_ROLE: String): AnonOWNERROLE = {
    val __obj = js.Dynamic.literal(OWNER_ROLE = OWNER_ROLE.asInstanceOf[js.Any], READER_ROLE = READER_ROLE.asInstanceOf[js.Any], WRITER_ROLE = WRITER_ROLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOWNERROLE]
  }
}

