package typings
package atFirebaseDatabaseLib.databaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", "Query")
@js.native
class Query protected ()
  extends atFirebaseDatabaseLib.distSrcApiQueryMod.Query {
  def this(repo: atFirebaseDatabaseLib.distSrcCoreRepoMod.Repo, path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path, `queryParams_`: atFirebaseDatabaseLib.distSrcCoreViewQueryParamsMod.QueryParams, `orderByCalled_`: scala.Boolean) = this()
}

@JSImport("@firebase/database", "Query")
@js.native
object Query extends js.Object {
  var __referenceConstructor: org.scalablytyped.runtime.Instantiable2[
    /* repo */ atFirebaseDatabaseLib.distSrcCoreRepoMod.Repo, 
    /* path */ atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path, 
    atFirebaseDatabaseLib.distSrcApiQueryMod.Query
  ] = js.native
  /**
    * Helper used by .on and .once to extract the context and or cancel arguments.
    * @param {!string} fnName The function name (on or once)
    * @param {(function(Error)|Object)=} cancelOrContext
    * @param {Object=} context
    * @return {{cancel: ?function(Error), context: ?Object}}
    * @private
    */
  /* private */ def `getCancelAndContextArgs_`(fnName: js.Any): js.Any = js.native
  /* private */ def `getCancelAndContextArgs_`(fnName: js.Any, cancelOrContext: js.Any): js.Any = js.native
  /* private */ def `getCancelAndContextArgs_`(fnName: js.Any, cancelOrContext: js.Any, context: js.Any): js.Any = js.native
  /**
    * Validates that limit* has been called with the correct combination of parameters
    * @param {!QueryParams} params
    * @private
    */
  /* private */ def `validateLimit_`(params: js.Any): js.Any = js.native
  /**
    * Validates start/end values for queries.
    * @param {!QueryParams} params
    * @private
    */
  /* private */ def `validateQueryEndpoints_`(params: js.Any): js.Any = js.native
}

