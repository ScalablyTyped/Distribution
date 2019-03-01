package typings
package atGoogleDashCloudDatastoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queryMod {
  type MoreResultsAfterCursor = atGoogleDashCloudDatastoreLib.atGoogleDashCloudDatastoreLibStrings.MORE_RESULTS_AFTER_CURSOR
  type MoreResultsAfterLimit = atGoogleDashCloudDatastoreLib.atGoogleDashCloudDatastoreLibStrings.MORE_RESULTS_AFTER_LIMIT
  type NoMoreResults = atGoogleDashCloudDatastoreLib.atGoogleDashCloudDatastoreLibStrings.NO_MORE_RESULTS
  type QueryCallback = js.Function3[
    /* err */ nodeLib.Error, 
    /* entities */ js.Array[js.Object], 
    /* info */ QueryInfo, 
    scala.Unit
  ]
  type QueryResult = js.Tuple2[js.Array[js.Object], QueryInfo]
}
