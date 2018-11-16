package typings
package gapiDotClientDotBigquerydatatransferLib.gapiNs.clientNs.bigquerydatatransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListDataSourcesResponse extends js.Object {
  /** List of supported data sources and their transfer settings. */
  var dataSources: js.UndefOr[js.Array[DataSource]] = js.undefined
  /**
               * Output only. The next-pagination token. For multiple-page list results,
               * this token can be used as the
               * `ListDataSourcesRequest.page_token`
               * to request the next page of list results.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

