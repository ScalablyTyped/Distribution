package typings
package dropboxjsLib.DropboxNs.UtilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Util.Oauth")
@js.native
class Oauth () extends js.Object {
  def checkAuthStateParam(stateParam: java.lang.String): scala.Boolean = js.native
}

/* static members */
@JSGlobal("Dropbox.Util.Oauth")
@js.native
object Oauth extends js.Object {
  def queryParamsFromUrl(url: java.lang.String): dropboxjsLib.DropboxNs.QueryParams = js.native
  def randomAuthStateParam(): java.lang.String = js.native
}

