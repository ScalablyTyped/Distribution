package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtension extends js.Object {
  var extension: js.Array[String]
  var reportDir: String
}

object AnonExtension {
  @scala.inline
  def apply(extension: js.Array[String], reportDir: String): AnonExtension = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], reportDir = reportDir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExtension]
  }
}

