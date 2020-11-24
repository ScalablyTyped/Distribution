package typings.googleCloudDatastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object queryMod {
  
  type MoreResultsAfterCursor = typings.googleCloudDatastore.googleCloudDatastoreStrings.MORE_RESULTS_AFTER_CURSOR
  
  type MoreResultsAfterLimit = typings.googleCloudDatastore.googleCloudDatastoreStrings.MORE_RESULTS_AFTER_LIMIT
  
  type NoMoreResults = typings.googleCloudDatastore.googleCloudDatastoreStrings.NO_MORE_RESULTS
  
  type QueryCallback = js.Function3[
    /* err */ typings.std.Error, 
    /* entities */ js.Array[js.Object], 
    /* info */ typings.googleCloudDatastore.queryMod.QueryInfo, 
    scala.Unit
  ]
  
  type QueryResult = js.Tuple2[js.Array[js.Object], typings.googleCloudDatastore.queryMod.QueryInfo]
}
