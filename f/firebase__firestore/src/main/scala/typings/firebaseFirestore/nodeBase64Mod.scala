package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/platform/node/base64", JSImport.Namespace)
@js.native
object nodeBase64Mod extends js.Object {
  def decodeBase64(encoded: String): String = js.native
  def encodeBase64(raw: String): String = js.native
  def isBase64Available(): Boolean = js.native
}

