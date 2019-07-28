package typings.dropboxjs.DropboxNs.UtilNs

import typings.dropboxjs.DropboxNs.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Util.Oauth")
@js.native
class Oauth () extends js.Object {
  def checkAuthStateParam(stateParam: String): Boolean = js.native
}

/* static members */
@JSGlobal("Dropbox.Util.Oauth")
@js.native
object Oauth extends js.Object {
  def queryParamsFromUrl(url: String): QueryParams = js.native
  def randomAuthStateParam(): String = js.native
}

