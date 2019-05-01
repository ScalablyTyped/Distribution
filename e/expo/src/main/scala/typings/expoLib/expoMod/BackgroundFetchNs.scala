package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "BackgroundFetch")
@js.native
object BackgroundFetchNs extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  def getStatusAsync(): js.Promise[Status] = js.native
  def registerTaskAsync(taskName: java.lang.String): js.Promise[scala.Unit] = js.native
  def setMinimumIntervalAsync(minimumInterval: scala.Double): js.Promise[scala.Unit] = js.native
  def unregisterTaskAsync(taskName: java.lang.String): js.Promise[scala.Unit] = js.native
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait Available
      extends expoLib.expoMod.BackgroundFetchNs.Status
    
    @js.native
    sealed trait Denied
      extends expoLib.expoMod.BackgroundFetchNs.Status
    
    @js.native
    sealed trait Restricted
      extends expoLib.expoMod.BackgroundFetchNs.Status
    
    /* 3 */ val Available: Available with scala.Double = js.native
    /* 2 */ val Denied: Denied with scala.Double = js.native
    /* 1 */ val Restricted: Restricted with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[expoLib.expoMod.BackgroundFetchNs.Status with scala.Double] = js.native
  }
  
}

