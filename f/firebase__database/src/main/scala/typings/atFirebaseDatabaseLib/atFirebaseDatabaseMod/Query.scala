package typings
package atFirebaseDatabaseLib.atFirebaseDatabaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database", "Query")
@js.native
class Query protected ()
  extends atFirebaseDatabaseLib.distSrcApiQueryMod.Query {
  def this(repo: atFirebaseDatabaseLib.distSrcCoreRepoMod.Repo, path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path, queryParams_ : atFirebaseDatabaseLib.distSrcCoreViewQueryParamsMod.QueryParams, orderByCalled_ : scala.Boolean) = this()
}

/* static members */
@JSImport("@firebase/database", "Query")
@js.native
object Query extends js.Object {
  var __referenceConstructor: js.Any = js.native
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
}

