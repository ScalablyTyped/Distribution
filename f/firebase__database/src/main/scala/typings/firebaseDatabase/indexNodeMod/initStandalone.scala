package typings.firebaseDatabase.indexNodeMod

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseDatabase.anon.Namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/index.node", "initStandalone")
@js.native
object initStandalone extends js.Object {
  
  def apply(app: FirebaseApp, url: String, version: String): Namespace = js.native
  def apply(app: FirebaseApp, url: String, version: String, nodeAdmin: Boolean): Namespace = js.native
}
