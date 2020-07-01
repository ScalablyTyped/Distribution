package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-notarize", "notarize")
@js.native
object notarize extends js.Object {
  def apply(hasAppBundleIdAppPathAscProviderAuthOptions: NotarizeOptions): js.Promise[Unit] = js.native
}

