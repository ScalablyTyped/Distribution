package typings
package dropboxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RedirectFile extends js.Object {
  var redirectFile: java.lang.String
  var redirectUrl: java.lang.String
  var rememberUser: scala.Boolean
  var scope: java.lang.String
}

object Anon_RedirectFile {
  @scala.inline
  def apply(
    redirectFile: java.lang.String,
    redirectUrl: java.lang.String,
    rememberUser: scala.Boolean,
    scope: java.lang.String
  ): Anon_RedirectFile = {
    val __obj = js.Dynamic.literal(redirectFile = redirectFile, redirectUrl = redirectUrl, rememberUser = rememberUser, scope = scope)
  
    __obj.asInstanceOf[Anon_RedirectFile]
  }
}

