package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectory extends js.Object {
  var directory: String
  var `type`: String
  var url: String
}

object AnonDirectory {
  @scala.inline
  def apply(directory: String, `type`: String, url: String): AnonDirectory = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirectory]
  }
}

