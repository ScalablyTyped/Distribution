package typings.firebaseDatabase

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseDatabase.authTokenProviderMod.AuthTokenProvider
import typings.firebaseDatabase.databaseMod.Database
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import typings.firebaseDatabase.repoMod.Repo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repoManagerMod {
  
  @JSImport("@firebase/database/dist/src/core/RepoManager", "RepoManager")
  @js.native
  class RepoManager () extends StObject {
    
    /**
      * Update an existing repo in place to point to a new host/port.
      */
    def applyEmulatorSettings(repo: Repo, host: String, port: Double): Unit = js.native
    
    /**
      * Ensures a repo doesn't already exist and then creates one using the
      * provided app.
      *
      * @param {!RepoInfo} repoInfo The metadata about the Repo
      * @param {!FirebaseApp} app
      * @return {!Repo} The Repo object for the specified server / repoName.
      */
    def createRepo(repoInfo: RepoInfo, app: FirebaseApp, authTokenProvider: AuthTokenProvider): Repo = js.native
    
    /**
      * This function should only ever be called to CREATE a new database instance.
      *
      * @param {!FirebaseApp} app
      * @return {!Database}
      */
    def databaseFromApp(app: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]): Database = js.native
    def databaseFromApp(app: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName], url: String): Database = js.native
    def databaseFromApp(
      app: FirebaseApp,
      authProvider: Provider[FirebaseAuthInternalName],
      url: String,
      nodeAdmin: Boolean
    ): Database = js.native
    def databaseFromApp(app: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName], url: Unit, nodeAdmin: Boolean): Database = js.native
    
    /**
      * Remove the repo and make sure it is disconnected.
      *
      * @param {!Repo} repo
      */
    def deleteRepo(repo: Repo): Unit = js.native
    
    /**
      * Forces us to use ReadonlyRestClient instead of PersistentConnection for new Repos.
      * @param {boolean} forceRestClient
      */
    def forceRestClient(forceRestClient: Boolean): Unit = js.native
    
    def interrupt(): Unit = js.native
    
    /**
      * @private {!Object.<string, Object<string, !fb.core.Repo>>}
      */
    var repos_ : js.Any = js.native
    
    def resume(): Unit = js.native
    
    /**
      * If true, new Repos will be created to use ReadonlyRestClient (for testing purposes).
      * @private {boolean}
      */
    var useRestClient_ : js.Any = js.native
  }
  /* static members */
  object RepoManager {
    
    @JSImport("@firebase/database/dist/src/core/RepoManager", "RepoManager")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getInstance(): RepoManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[RepoManager]
  }
}
