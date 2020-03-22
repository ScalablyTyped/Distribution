package typings.firebaseDatabase

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.firebaseDatabase.browserPollConnectionMod.BrowserPollConnection
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBrowserPollConnecti
  extends Instantiable2[/* connId */ String, /* repoInfo */ RepoInfo, BrowserPollConnection]
     with Instantiable3[
      /* connId */ String, 
      /* repoInfo */ RepoInfo, 
      /* transportSessionId */ String, 
      BrowserPollConnection
    ]
     with Instantiable4[
      /* connId */ String, 
      /* repoInfo */ RepoInfo, 
      /* transportSessionId */ String, 
      /* lastSessionId */ String, 
      BrowserPollConnection
    ] {
  var forceAllow_ : js.Any = js.native
  var forceDisallow_ : js.Any = js.native
  /**
    * Forces long polling to be considered as a potential transport
    */
  def forceAllow(): Unit = js.native
  /**
    * Forces longpolling to not be considered as a potential transport
    */
  def forceDisallow(): Unit = js.native
  def isAvailable(): Boolean = js.native
}

