package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInfo extends js.Object {
  var countryCode: String
  var email: String
  var name: String
  var privateBytes: Double
  var publicAppUrl: String
  var quota: Double
  var referralUrl: String
  var sharedBytes: Double
  var uid: String
  var usedQuota: Double
  def json(): js.Object
}

object AccountInfo {
  @scala.inline
  def apply(
    countryCode: String,
    email: String,
    json: () => js.Object,
    name: String,
    privateBytes: Double,
    publicAppUrl: String,
    quota: Double,
    referralUrl: String,
    sharedBytes: Double,
    uid: String,
    usedQuota: Double
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), name = name.asInstanceOf[js.Any], privateBytes = privateBytes.asInstanceOf[js.Any], publicAppUrl = publicAppUrl.asInstanceOf[js.Any], quota = quota.asInstanceOf[js.Any], referralUrl = referralUrl.asInstanceOf[js.Any], sharedBytes = sharedBytes.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], usedQuota = usedQuota.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
}

