package typings.ethBlockTracker

import typings.ethBlockTracker.pollingBlockTrackerMod.PollingBlockTrackerOptions
import typings.ethBlockTracker.subscribeBlockTrackerMod.SubscribeBlockTrackerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eth-block-tracker", "PollingBlockTracker")
  @js.native
  open class PollingBlockTracker ()
    extends typings.ethBlockTracker.pollingBlockTrackerMod.PollingBlockTracker {
    def this(opts: PollingBlockTrackerOptions) = this()
  }
  
  @JSImport("eth-block-tracker", "SubscribeBlockTracker")
  @js.native
  open class SubscribeBlockTracker ()
    extends typings.ethBlockTracker.subscribeBlockTrackerMod.SubscribeBlockTracker {
    def this(opts: SubscribeBlockTrackerOptions) = this()
  }
}
