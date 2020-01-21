package typings.firebaseDatabase

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseDatabase.databaseMod.Database
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import typings.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/RepoManager", JSImport.Namespace)
@js.native
object repoManagerMod extends js.Object {
  @js.native
  class RepoManager () extends js.Object {
    /**
      * @private {!Object.<string, Object<string, !fb.core.Repo>>}
      */
    var repos_ : js.Any = js.native
    /**
      * If true, new Repos will be created to use ReadonlyRestClient (for testing purposes).
      * @private {boolean}
      */
    var useRestClient_ : js.Any = js.native
    /**
      * Ensures a repo doesn't already exist and then creates one using the
      * provided app.
      *
      * @param {!RepoInfo} repoInfo The metadata about the Repo
      * @param {!FirebaseApp} app
      * @return {!Repo} The Repo object for the specified server / repoName.
      */
    def createRepo(repoInfo: RepoInfo, app: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]): Repo = js.native
    /**
      * This function should only ever be called to CREATE a new database instance.
      *
      * @param {!FirebaseApp} app
      * @return {!Database}
      */
    def databaseFromApp(app: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]): Database = js.native
    def databaseFromApp(app: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName], url: String): Database = js.native
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
    def resume(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object RepoManager extends js.Object {
    def getInstance(): RepoManager = js.native
  }
  
}

