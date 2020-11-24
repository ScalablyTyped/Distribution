package typings.firebasePerformance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/performance/dist/src/services/initialization_service", JSImport.Namespace)
@js.native
object initializationServiceMod extends js.Object {
  
  def getInitializationPromise(): js.Promise[Unit] = js.native
  
  def isPerfInitialized(): Boolean = js.native
}
