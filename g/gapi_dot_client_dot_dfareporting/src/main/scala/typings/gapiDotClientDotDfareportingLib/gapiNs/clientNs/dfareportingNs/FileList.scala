package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FileList extends js.Object {
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The files returned in this response. */
  var items: js.UndefOr[js.Array[File]] = js.undefined
  /** The kind of list this is, in this case dfareporting#fileList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Continuation token used to page through files. To retrieve the next page of results, set the next request's "pageToken" to the value of this field. The
               * page token is only valid for a limited amount of time and should not be persisted.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

