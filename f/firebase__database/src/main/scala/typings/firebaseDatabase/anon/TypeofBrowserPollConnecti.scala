package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.firebaseDatabase.browserPollConnectionMod.BrowserPollConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBrowserPollConnecti
  extends StObject
     with Instantiable2[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      BrowserPollConnection
    ]
     with Instantiable3[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      /* applicationId */ String, 
      BrowserPollConnection
    ]
     with Instantiable4[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      (/* applicationId */ String) | (/* applicationId */ Unit), 
      /* transportSessionId */ String, 
      BrowserPollConnection
    ]
     with Instantiable5[
      /* connId */ String, 
      /* repoInfo */ typings.firebaseDatabase.repoInfoMod.RepoInfo, 
      (/* applicationId */ String) | (/* applicationId */ Unit), 
      (/* transportSessionId */ String) | (/* transportSessionId */ Unit), 
      /* lastSessionId */ String, 
      BrowserPollConnection
    ] {
  
  /**
    * Forces long polling to be considered as a potential transport
    */
  def forceAllow(): Unit = js.native
  
  /* private */ var forceAllow_ : js.Any = js.native
  
  /**
    * Forces longpolling to not be considered as a potential transport
    */
  def forceDisallow(): Unit = js.native
  
  /* private */ var forceDisallow_ : js.Any = js.native
  
  def isAvailable(): Boolean = js.native
}
