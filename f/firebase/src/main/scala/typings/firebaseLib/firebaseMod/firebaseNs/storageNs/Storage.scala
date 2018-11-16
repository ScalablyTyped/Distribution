package typings
package firebaseLib.firebaseMod.firebaseNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  var app: firebaseLib.firebaseMod.firebaseNs.appNs.App = js.native
  var maxOperationRetryTime: scala.Double = js.native
  var maxUploadRetryTime: scala.Double = js.native
  def ref(): Reference = js.native
  def ref(path: java.lang.String): Reference = js.native
  def refFromURL(url: java.lang.String): Reference = js.native
  def setMaxOperationRetryTime(time: scala.Double): js.Any = js.native
  def setMaxUploadRetryTime(time: scala.Double): js.Any = js.native
}

