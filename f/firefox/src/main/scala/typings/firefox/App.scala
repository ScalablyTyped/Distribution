package typings.firefox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var installOrigin: String
  var installTime: Double
  var manifest: js.Any
  var manifestURL: String
  var origin: String
  var receipts: js.Array[_]
  def checkForUpdate(): DOMRequest[_]
  def launch(): Unit
}

object App {
  @scala.inline
  def apply(
    checkForUpdate: () => DOMRequest[_],
    installOrigin: String,
    installTime: Double,
    launch: () => Unit,
    manifest: js.Any,
    manifestURL: String,
    origin: String,
    receipts: js.Array[_]
  ): App = {
    val __obj = js.Dynamic.literal(checkForUpdate = js.Any.fromFunction0(checkForUpdate), installOrigin = installOrigin.asInstanceOf[js.Any], installTime = installTime.asInstanceOf[js.Any], launch = js.Any.fromFunction0(launch), manifest = manifest.asInstanceOf[js.Any], manifestURL = manifestURL.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], receipts = receipts.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

