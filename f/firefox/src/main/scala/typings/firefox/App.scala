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
    val __obj = js.Dynamic.literal(checkForUpdate = js.Any.fromFunction0(checkForUpdate), installOrigin = installOrigin, installTime = installTime, launch = js.Any.fromFunction0(launch), manifest = manifest, manifestURL = manifestURL, origin = origin, receipts = receipts)
  
    __obj.asInstanceOf[App]
  }
}

