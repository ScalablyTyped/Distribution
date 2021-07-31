package typings.dropboxjs.global.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.AccountInfo")
@js.native
class AccountInfo ()
  extends StObject
     with typings.dropboxjs.Dropbox.AccountInfo {
  
  /* CompleteClass */
  var countryCode: String = js.native
  
  /* CompleteClass */
  var email: String = js.native
  
  /* CompleteClass */
  override def json(): js.Object = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var privateBytes: Double = js.native
  
  /* CompleteClass */
  var publicAppUrl: String = js.native
  
  /* CompleteClass */
  var quota: Double = js.native
  
  /* CompleteClass */
  var referralUrl: String = js.native
  
  /* CompleteClass */
  var sharedBytes: Double = js.native
  
  /* CompleteClass */
  var uid: String = js.native
  
  /* CompleteClass */
  var usedQuota: Double = js.native
}
object AccountInfo {
  
  @JSGlobal("Dropbox.AccountInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def parse(acountInfo: js.Object): typings.dropboxjs.Dropbox.AccountInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(acountInfo.asInstanceOf[js.Any]).asInstanceOf[typings.dropboxjs.Dropbox.AccountInfo]
}
