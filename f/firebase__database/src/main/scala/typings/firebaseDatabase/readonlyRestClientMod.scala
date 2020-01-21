package typings.firebaseDatabase

import typings.firebaseDatabase.authTokenProviderMod.AuthTokenProvider
import typings.firebaseDatabase.queryMod.Query
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import typings.firebaseDatabase.serverActionsMod.ServerActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/ReadonlyRestClient", JSImport.Namespace)
@js.native
object readonlyRestClientMod extends js.Object {
  @js.native
  class ReadonlyRestClient protected () extends ServerActions {
    /**
      * @param {!RepoInfo} repoInfo_ Data about the namespace we are connecting to
      * @param {function(string, *, boolean, ?number)} onDataUpdate_ A callback for new data from the server
      * @param {AuthTokenProvider} authTokenProvider_
      * @implements {ServerActions}
      */
    def this(
      repoInfo_ : RepoInfo,
      onDataUpdate_ : js.Function4[/* a */ String, /* b */ js.Any, /* c */ Boolean, /* d */ Double | Null, Unit],
      authTokenProvider_ : AuthTokenProvider
    ) = this()
    var authTokenProvider_ : js.Any = js.native
    /**
      * We don't actually need to track listens, except to prevent us calling an onComplete for a listen
      * that's been removed. :-/
      *
      * @private {!Object.<string, !Object>}
      */
    var listens_ : js.Any = js.native
    /** @private {function(...[*])} */
    var log_ : js.Any = js.native
    var onDataUpdate_ : js.Any = js.native
    var repoInfo_ : js.Any = js.native
    /**
      * Performs a REST request to the given path, with the provided query string parameters,
      * and any auth credentials we have.
      *
      * @param {!string} pathString
      * @param {!Object.<string, *>} queryStringParameters
      * @param {?function(?number, *=)} callback
      * @private
      */
    var restRequest_ : js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ReadonlyRestClient extends js.Object {
    /**
      * @param {!Query} query
      * @param {?number=} tag
      * @return {string}
      * @private
      */
    def getListenId_(query: Query): String = js.native
    def getListenId_(query: Query, tag: Double): String = js.native
  }
  
}

