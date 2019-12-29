package typings.atFirebaseDatabase.atFirebaseDatabaseMod

import org.scalablytyped.runtime.Instantiable2
import typings.atFirebaseDatabase.distSrcCoreRepoMod.Repo
import typings.atFirebaseDatabase.distSrcCoreUtilPathMod.Path
import typings.atFirebaseDatabase.distSrcCoreViewQueryParamsMod.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", "Query")
@js.native
class Query protected ()
  extends typings.atFirebaseDatabase.distSrcApiQueryMod.Query {
  def this(repo: Repo, path: Path, queryParams_ : QueryParams, orderByCalled_ : Boolean) = this()
}

/* static members */
@JSImport("@firebase/database", "Query")
@js.native
object Query extends js.Object {
  /**
    * Helper used by .on and .once to extract the context and or cancel arguments.
    * @param {!string} fnName The function name (on or once)
    * @param {(function(Error)|Object)=} cancelOrContext
    * @param {Object=} context
    * @return {{cancel: ?function(Error), context: ?Object}}
    * @private
    */
  var getCancelAndContextArgs_ : js.Any = js.native
  /**
    * Validates that limit* has been called with the correct combination of parameters
    * @param {!QueryParams} params
    * @private
    */
  var validateLimit_ : js.Any = js.native
  /**
    * Validates start/end values for queries.
    * @param {!QueryParams} params
    * @private
    */
  var validateQueryEndpoints_ : js.Any = js.native
  def __referenceConstructor(): Instantiable2[
    /* repo */ Repo, 
    /* path */ Path, 
    typings.atFirebaseDatabase.distSrcApiQueryMod.Query
  ] = js.native
  def __referenceConstructor(
    `val`: Instantiable2[
      /* repo */ Repo, 
      /* path */ Path, 
      typings.atFirebaseDatabase.distSrcApiQueryMod.Query
    ]
  ): js.Any = js.native
}

