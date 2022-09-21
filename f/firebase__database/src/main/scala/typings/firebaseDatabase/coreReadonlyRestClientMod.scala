package typings.firebaseDatabase

import typings.firebaseDatabase.coreAppCheckTokenProviderMod.AppCheckTokenProvider
import typings.firebaseDatabase.coreAuthTokenProviderMod.AuthTokenProvider
import typings.firebaseDatabase.coreRepoInfoMod.RepoInfo
import typings.firebaseDatabase.coreServerActionsMod.ServerActions
import typings.firebaseDatabase.viewEventRegistrationMod.QueryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreReadonlyRestClientMod {
  
  @JSImport("@firebase/database/dist/src/core/ReadonlyRestClient", "ReadonlyRestClient")
  @js.native
  open class ReadonlyRestClient protected () extends ServerActions {
    /**
      * @param repoInfo_ - Data about the namespace we are connecting to
      * @param onDataUpdate_ - A callback for new data from the server
      */
    def this(
      repoInfo_ : RepoInfo,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      authTokenProvider_ : AuthTokenProvider,
      appCheckTokenProvider_ : AppCheckTokenProvider
    ) = this()
    
    /* private */ var appCheckTokenProvider_ : Any = js.native
    
    /* private */ var authTokenProvider_ : Any = js.native
    
    /**
      * We don't actually need to track listens, except to prevent us calling an onComplete for a listen
      * that's been removed. :-/
      */
    /* private */ var listens_ : Any = js.native
    
    /** @private {function(...[*])} */
    /* private */ var log_ : Any = js.native
    
    /* private */ var onDataUpdate_ : Any = js.native
    
    /* private */ var repoInfo_ : Any = js.native
    
    /**
      * Performs a REST request to the given path, with the provided query string parameters,
      * and any auth credentials we have.
      */
    /* private */ var restRequest_ : Any = js.native
  }
  /* static members */
  object ReadonlyRestClient {
    
    @JSImport("@firebase/database/dist/src/core/ReadonlyRestClient", "ReadonlyRestClient")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getListenId_(query: QueryContext): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListenId_")(query.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getListenId_(query: QueryContext, tag: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getListenId_")(query.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
