package typings.atFirebaseStorageDashTypes.atFirebaseStorageDashTypesMod

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage-types", "FirebaseStorage")
@js.native
class FirebaseStorage protected () extends js.Object {
  var app: FirebaseApp = js.native
  var maxOperationRetryTime: Double = js.native
  var maxUploadRetryTime: Double = js.native
  def ref(): Reference = js.native
  def ref(path: String): Reference = js.native
  def refFromURL(url: String): Reference = js.native
  def setMaxOperationRetryTime(time: Double): Unit = js.native
  def setMaxUploadRetryTime(time: Double): Unit = js.native
}

