package typings.firebaseFirestore.platformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/platform/platform", "PlatformSupport")
@js.native
class PlatformSupport () extends js.Object

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/src/platform/platform", "PlatformSupport")
@js.native
object PlatformSupport extends js.Object {
  var platform: js.Any = js.native
  def getPlatform(): Platform = js.native
  def setPlatform(platform: Platform): Unit = js.native
}

