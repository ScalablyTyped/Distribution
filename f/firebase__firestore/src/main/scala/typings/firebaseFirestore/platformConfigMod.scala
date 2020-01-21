package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAppTypes.mod.FirebaseNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform/config", JSImport.Namespace)
@js.native
object platformConfigMod extends js.Object {
  def configureForFirebase(firebase: FirebaseNamespace): Unit = js.native
  def configureForStandalone(exportObject: StringDictionary[js.Object]): Unit = js.native
}

