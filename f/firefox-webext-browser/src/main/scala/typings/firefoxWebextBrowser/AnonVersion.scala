package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVersion extends js.Object {
  /** The version number of the available update. */
  var version: String
}

object AnonVersion {
  @scala.inline
  def apply(version: String): AnonVersion = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonVersion]
  }
}

