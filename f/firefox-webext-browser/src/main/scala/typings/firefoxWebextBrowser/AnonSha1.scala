package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSha1 extends js.Object {
  var sha1: String
  var sha256: String
}

object AnonSha1 {
  @scala.inline
  def apply(sha1: String, sha256: String): AnonSha1 = {
    val __obj = js.Dynamic.literal(sha1 = sha1.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSha1]
  }
}

