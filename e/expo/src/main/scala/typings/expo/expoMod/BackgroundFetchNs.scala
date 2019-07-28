package typings.expo.expoMod

import typings.expo.expoMod.BackgroundFetchNs.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "BackgroundFetch")
@js.native
object BackgroundFetchNs extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  def getStatusAsync(): js.Promise[Status] = js.native
  def registerTaskAsync(taskName: String): js.Promise[Unit] = js.native
  def setMinimumIntervalAsync(minimumInterval: Double): js.Promise[Unit] = js.native
  def unregisterTaskAsync(taskName: String): js.Promise[Unit] = js.native
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait Available extends Status
    
    @js.native
    sealed trait Denied extends Status
    
    @js.native
    sealed trait Restricted extends Status
    
    /* 3 */ val Available: typings.expo.expoMod.BackgroundFetchNs.Status.Available with Double = js.native
    /* 2 */ val Denied: typings.expo.expoMod.BackgroundFetchNs.Status.Denied with Double = js.native
    /* 1 */ val Restricted: typings.expo.expoMod.BackgroundFetchNs.Status.Restricted with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
  }
  
}

