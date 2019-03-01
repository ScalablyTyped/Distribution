package typings
package gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  /** Identifies who has access to see this activity. */
  var access: js.UndefOr[Acl] = js.undefined
  /** The person who performed this activity. */
  var actor: js.UndefOr[gapiDotClientDotPlusLib.Anon_ClientSpecificActorInfo] = js.undefined
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
  var `object`: js.UndefOr[gapiDotClientDotPlusLib.Anon_Actor] = js.undefined
  /** ID of the place where this activity occurred. */
  var placeId: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the place where this activity occurred. */
  var placeName: js.UndefOr[java.lang.String] = js.undefined
  /** The service provider that initially published this activity. */
  var provider: js.UndefOr[gapiDotClientDotPlusLib.Anon_Title] = js.undefined
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

object Activity {
  @scala.inline
  def apply(
    access: Acl = null,
    actor: gapiDotClientDotPlusLib.Anon_ClientSpecificActorInfo = null,
    address: java.lang.String = null,
    annotation: java.lang.String = null,
    crosspostSource: java.lang.String = null,
    etag: java.lang.String = null,
    geocode: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    location: Place = null,
    `object`: gapiDotClientDotPlusLib.Anon_Actor = null,
    placeId: java.lang.String = null,
    placeName: java.lang.String = null,
    provider: gapiDotClientDotPlusLib.Anon_Title = null,
    published: java.lang.String = null,
    radius: java.lang.String = null,
    title: java.lang.String = null,
    updated: java.lang.String = null,
    url: java.lang.String = null,
    verb: java.lang.String = null
  ): Activity = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access)
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (address != null) __obj.updateDynamic("address")(address)
    if (annotation != null) __obj.updateDynamic("annotation")(annotation)
    if (crosspostSource != null) __obj.updateDynamic("crosspostSource")(crosspostSource)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (geocode != null) __obj.updateDynamic("geocode")(geocode)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (location != null) __obj.updateDynamic("location")(location)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (placeId != null) __obj.updateDynamic("placeId")(placeId)
    if (placeName != null) __obj.updateDynamic("placeName")(placeName)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (published != null) __obj.updateDynamic("published")(published)
    if (radius != null) __obj.updateDynamic("radius")(radius)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (url != null) __obj.updateDynamic("url")(url)
    if (verb != null) __obj.updateDynamic("verb")(verb)
    __obj.asInstanceOf[Activity]
  }
}

