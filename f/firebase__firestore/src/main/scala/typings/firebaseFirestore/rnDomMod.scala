package typings.firebaseFirestore

import typings.std.Document
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/platform/rn/dom", JSImport.Namespace)
@js.native
object rnDomMod extends js.Object {
  def getDocument(): Document | Null = js.native
  def getWindow(): Window | Null = js.native
}

