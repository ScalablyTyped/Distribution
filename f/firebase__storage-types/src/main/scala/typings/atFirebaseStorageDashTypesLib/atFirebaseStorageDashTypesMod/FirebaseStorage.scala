package typings
package atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage-types", "FirebaseStorage")
@js.native
class FirebaseStorage protected () extends js.Object {
  var app: atFirebaseAppDashTypesLib.atFirebaseAppDashTypesMod.FirebaseApp = js.native
  var maxOperationRetryTime: scala.Double = js.native
  var maxUploadRetryTime: scala.Double = js.native
  def ref(): Reference = js.native
  def ref(path: java.lang.String): Reference = js.native
  def refFromURL(url: java.lang.String): Reference = js.native
  def setMaxOperationRetryTime(time: scala.Double): scala.Unit = js.native
  def setMaxUploadRetryTime(time: scala.Double): scala.Unit = js.native
}

