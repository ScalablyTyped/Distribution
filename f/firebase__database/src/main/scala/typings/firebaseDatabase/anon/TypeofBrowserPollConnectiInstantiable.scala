package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.Instantiable7
import typings.firebaseDatabase.realtimeBrowserPollConnectionMod.BrowserPollConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBrowserPollConnectiInstantiable
  extends StObject
     with Instantiable2[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.coreRepoInfoMod.RepoInfo, 
      BrowserPollConnection
    ]
     with Instantiable3[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.coreRepoInfoMod.RepoInfo, 
      /* applicationId */ String, 
      BrowserPollConnection
    ]
     with Instantiable4[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.coreRepoInfoMod.RepoInfo, 
      (/* applicationId */ String) | (/* applicationId */ Unit), 
      /* appCheckToken */ String, 
      BrowserPollConnection
    ]
     with Instantiable5[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.coreRepoInfoMod.RepoInfo, 
      (/* applicationId */ String) | (/* applicationId */ Unit), 
      (/* appCheckToken */ String) | (/* appCheckToken */ Unit), 
      /* authToken */ String, 
      BrowserPollConnection
    ]
     with Instantiable6[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.coreRepoInfoMod.RepoInfo, 
      (/* applicationId */ String) | (/* applicationId */ Unit), 
      (/* appCheckToken */ String) | (/* appCheckToken */ Unit), 
      (/* authToken */ String) | (/* authToken */ Unit), 
      /* transportSessionId */ String, 
      BrowserPollConnection
    ]
     with Instantiable7[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.coreRepoInfoMod.RepoInfo, 
      (/* applicationId */ String) | (/* applicationId */ Unit), 
      (/* appCheckToken */ String) | (/* appCheckToken */ Unit), 
      (/* authToken */ String) | (/* authToken */ Unit), 
      (/* transportSessionId */ String) | (/* transportSessionId */ Unit), 
      /* lastSessionId */ String, 
      BrowserPollConnection
    ] {
  
  /**
    * Forces long polling to be considered as a potential transport
    */
  def forceAllow(): Unit = js.native
  
  var forceAllow_ : Boolean = js.native
  
  /**
    * Forces longpolling to not be considered as a potential transport
    */
  def forceDisallow(): Unit = js.native
  
  var forceDisallow_ : Boolean = js.native
  
  def isAvailable(): Boolean = js.native
}
