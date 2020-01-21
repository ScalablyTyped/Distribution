package typings.firebaseDatabase

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.queryMod.Query
import typings.firebaseDatabase.queryParamsMod.QueryParams
import typings.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassQuery extends Instantiable4[
      /* repo */ Repo, 
      /* path */ Path, 
      /* queryParams_ */ QueryParams, 
      /* orderByCalled_ */ Boolean, 
      Query
    ] {
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
  def __referenceConstructor(): Instantiable2[/* repo */ Repo, /* path */ Path, Query] = js.native
  def __referenceConstructor(`val`: Instantiable2[/* repo */ Repo, /* path */ Path, Query]): js.Any = js.native
}

