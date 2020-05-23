package typings.dropboxjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectFile extends js.Object {
  var redirectFile: String
  var redirectUrl: String
  var rememberUser: Boolean
  var scope: String
}

object RedirectFile {
  @scala.inline
  def apply(redirectFile: String, redirectUrl: String, rememberUser: Boolean, scope: String): RedirectFile = {
    val __obj = js.Dynamic.literal(redirectFile = redirectFile.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], rememberUser = rememberUser.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectFile]
  }
}

