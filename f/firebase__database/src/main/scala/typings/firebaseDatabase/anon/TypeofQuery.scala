package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import typings.firebaseDatabase.queryMod.Query
import typings.firebaseDatabase.queryParamsMod.QueryParams
import typings.firebaseDatabase.repoMod.Repo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofQuery
  extends StObject
     with Instantiable4[
      /* repo */ Repo, 
      /* path */ typings.firebaseDatabase.pathMod.Path, 
      /* queryParams_ */ QueryParams, 
      /* orderByCalled_ */ Boolean, 
      Query
    ] {
  
  def __referenceConstructor: Instantiable2[/* repo */ Repo, /* path */ typings.firebaseDatabase.pathMod.Path, Query] = js.native
  def __referenceConstructor_=(`val`: Instantiable2[/* repo */ Repo, /* path */ typings.firebaseDatabase.pathMod.Path, Query]): Unit = js.native
  
  /**
    * Helper used by .on and .once to extract the context and or cancel arguments.
    * @param {!string} fnName The function name (on or once)
    * @param {(function(Error)|Object)=} cancelOrContext
    * @param {Object=} context
    * @return {{cancel: ?function(Error), context: ?Object}}
    * @private
    */
  /* private */ var getCancelAndContextArgs_ : js.Any = js.native
  
  /**
    * Validates that limit* has been called with the correct combination of parameters
    * @param {!QueryParams} params
    * @private
    */
  /* private */ var validateLimit_ : js.Any = js.native
  
  /**
    * Validates start/end values for queries.
    * @param {!QueryParams} params
    * @private
    */
  /* private */ var validateQueryEndpoints_ : js.Any = js.native
}
