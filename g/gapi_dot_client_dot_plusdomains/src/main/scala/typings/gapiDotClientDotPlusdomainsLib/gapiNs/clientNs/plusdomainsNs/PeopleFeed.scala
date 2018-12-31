package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleFeed extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The people in this page of results. Each item includes the id, displayName, image, and url for the person. To retrieve additional profile data, see the
    * people.get method.
    */
  var items: js.UndefOr[js.Array[Person]] = js.undefined
  /** Identifies this resource as a collection of people. Value: "plus#peopleFeed". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Link to this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The title of this collection of people. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The total number of people available in this list. The number of people in a response might be smaller due to paging. This might not be set for all
    * collections.
    */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

