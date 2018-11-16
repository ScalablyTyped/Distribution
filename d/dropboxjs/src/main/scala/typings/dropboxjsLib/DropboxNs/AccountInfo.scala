package typings
package dropboxjsLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AccountInfo")
@js.native
class AccountInfo () extends js.Object {
  var countryCode: java.lang.String = js.native
  var email: java.lang.String = js.native
  var name: java.lang.String = js.native
  var privateBytes: scala.Double = js.native
  var publicAppUrl: java.lang.String = js.native
  var quota: scala.Double = js.native
  var referralUrl: java.lang.String = js.native
  var sharedBytes: scala.Double = js.native
  var uid: java.lang.String = js.native
  var usedQuota: scala.Double = js.native
  def json(): js.Object = js.native
}

@JSGlobal("Dropbox.AccountInfo")
@js.native
object AccountInfo extends js.Object {
  def parse(acountInfo: js.Object): dropboxjsLib.DropboxNs.AccountInfo = js.native
}

