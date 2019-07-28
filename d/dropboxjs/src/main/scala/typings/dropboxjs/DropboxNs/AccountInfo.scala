package typings.dropboxjs.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AccountInfo")
@js.native
class AccountInfo () extends js.Object {
  var countryCode: String = js.native
  var email: String = js.native
  var name: String = js.native
  var privateBytes: Double = js.native
  var publicAppUrl: String = js.native
  var quota: Double = js.native
  var referralUrl: String = js.native
  var sharedBytes: Double = js.native
  var uid: String = js.native
  var usedQuota: Double = js.native
  def json(): js.Object = js.native
}

/* static members */
@JSGlobal("Dropbox.AccountInfo")
@js.native
object AccountInfo extends js.Object {
  def parse(acountInfo: js.Object): AccountInfo = js.native
}

