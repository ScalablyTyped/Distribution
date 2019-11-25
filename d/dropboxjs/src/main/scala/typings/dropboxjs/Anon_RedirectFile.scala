package typings.dropboxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RedirectFile extends js.Object {
  var redirectFile: String
  var redirectUrl: String
  var rememberUser: Boolean
  var scope: String
}

object Anon_RedirectFile {
  @scala.inline
  def apply(redirectFile: String, redirectUrl: String, rememberUser: Boolean, scope: String): Anon_RedirectFile = {
    val __obj = js.Dynamic.literal(redirectFile = redirectFile.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], rememberUser = rememberUser.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RedirectFile]
  }
}

