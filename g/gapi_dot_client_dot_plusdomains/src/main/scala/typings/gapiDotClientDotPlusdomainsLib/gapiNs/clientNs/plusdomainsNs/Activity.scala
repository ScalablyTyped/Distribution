package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  /** Identifies who has access to see this activity. */
  var access: js.UndefOr[Acl] = js.undefined
  /** The person who performed this activity. */
  var actor: js.UndefOr[gapiDotClientDotPlusdomainsLib.Anon_DisplayName] = js.undefined
  /** Street address where this activity occurred. */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** Additional content added by the person who shared this activity, applicable only when resharing an activity. */
  var annotation: js.UndefOr[java.lang.String] = js.undefined
  /** If this activity is a crosspost from another system, this property specifies the ID of the original activity. */
  var crosspostSource: js.UndefOr[java.lang.String] = js.undefined
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Latitude and longitude where this activity occurred. Format is latitude followed by longitude, space separated. */
  var geocode: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of this activity. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this resource as an activity. Value: "plus#activity". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The location where this activity occurred. */
  var location: js.UndefOr[Place] = js.undefined
  /** The object of this activity. */
  var `object`: js.UndefOr[gapiDotClientDotPlusdomainsLib.Anon_Actor] = js.undefined
  /** ID of the place where this activity occurred. */
  var placeId: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the place where this activity occurred. */
  var placeName: js.UndefOr[java.lang.String] = js.undefined
  /** The service provider that initially published this activity. */
  var provider: js.UndefOr[gapiDotClientDotPlusdomainsLib.Anon_Title] = js.undefined
  /** The time at which this activity was initially published. Formatted as an RFC 3339 timestamp. */
  var published: js.UndefOr[java.lang.String] = js.undefined
  /** Radius, in meters, of the region where this activity occurred, centered at the latitude and longitude identified in geocode. */
  var radius: js.UndefOr[java.lang.String] = js.undefined
  /** Title of this activity. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which this activity was last updated. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** The link to this activity. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This activity's verb, which indicates the action that was performed. Possible values include, but are not limited to, the following values:
    * - "post" - Publish content to the stream.
    * - "share" - Reshare an activity.
    */
  var verb: js.UndefOr[java.lang.String] = js.undefined
}

