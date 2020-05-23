package typings.dropboxjs.global.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.AccountInfo")
@js.native
class AccountInfo ()
  extends typings.dropboxjs.Dropbox.AccountInfo {
  /* CompleteClass */
  override var countryCode: String = js.native
  /* CompleteClass */
  override var email: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var privateBytes: Double = js.native
  /* CompleteClass */
  override var publicAppUrl: String = js.native
  /* CompleteClass */
  override var quota: Double = js.native
  /* CompleteClass */
  override var referralUrl: String = js.native
  /* CompleteClass */
  override var sharedBytes: Double = js.native
  /* CompleteClass */
  override var uid: String = js.native
  /* CompleteClass */
  override var usedQuota: Double = js.native
  /* CompleteClass */
  override def json(): js.Object = js.native
}

/* static members */
@JSGlobal("Dropbox.AccountInfo")
@js.native
object AccountInfo extends js.Object {
  def parse(acountInfo: js.Object): typings.dropboxjs.Dropbox.AccountInfo = js.native
}

