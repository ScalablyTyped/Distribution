package typings.atFirebaseFunctions.distSrcContextMod

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/functions/dist/src/context", "ContextProvider")
@js.native
class ContextProvider protected () extends js.Object {
  def this(app: FirebaseApp) = this()
  val app: js.Any = js.native
  def getAuthToken(): js.Promise[js.UndefOr[String]] = js.native
  def getContext(): js.Promise[Context] = js.native
  def getInstanceIdToken(): js.Promise[js.UndefOr[String]] = js.native
}

