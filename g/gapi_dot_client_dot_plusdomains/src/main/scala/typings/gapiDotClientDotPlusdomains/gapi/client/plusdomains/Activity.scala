package typings.gapiDotClientDotPlusdomains.gapi.client.plusdomains

import typings.gapiDotClientDotPlusdomains.Anon_Actor
import typings.gapiDotClientDotPlusdomains.Anon_ClientSpecificActorInfo
import typings.gapiDotClientDotPlusdomains.Anon_Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  /** Identifies who has access to see this activity. */
  var access: js.UndefOr[Acl] = js.undefined
  /** The person who performed this activity. */
  var actor: js.UndefOr[Anon_ClientSpecificActorInfo] = js.undefined
  /** Street address where this activity occurred. */
  var address: js.UndefOr[String] = js.undefined
  /** Additional content added by the person who shared this activity, applicable only when resharing an activity. */
  var annotation: js.UndefOr[String] = js.undefined
  /** If this activity is a crosspost from another system, this property specifies the ID of the original activity. */
  var crosspostSource: js.UndefOr[String] = js.undefined
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** Latitude and longitude where this activity occurred. Format is latitude followed by longitude, space separated. */
  var geocode: js.UndefOr[String] = js.undefined
  /** The ID of this activity. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies this resource as an activity. Value: "plus#activity". */
  var kind: js.UndefOr[String] = js.undefined
  /** The location where this activity occurred. */
  var location: js.UndefOr[Place] = js.undefined
  /** The object of this activity. */
  var `object`: js.UndefOr[Anon_Actor] = js.undefined
  /** ID of the place where this activity occurred. */
  var placeId: js.UndefOr[String] = js.undefined
  /** Name of the place where this activity occurred. */
  var placeName: js.UndefOr[String] = js.undefined
  /** The service provider that initially published this activity. */
  var provider: js.UndefOr[Anon_Title] = js.undefined
  /** The time at which this activity was initially published. Formatted as an RFC 3339 timestamp. */
  var published: js.UndefOr[String] = js.undefined
  /** Radius, in meters, of the region where this activity occurred, centered at the latitude and longitude identified in geocode. */
  var radius: js.UndefOr[String] = js.undefined
  /** Title of this activity. */
  var title: js.UndefOr[String] = js.undefined
  /** The time at which this activity was last updated. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[String] = js.undefined
  /** The link to this activity. */
  var url: js.UndefOr[String] = js.undefined
  /**
    * This activity's verb, which indicates the action that was performed. Possible values include, but are not limited to, the following values:
    * - "post" - Publish content to the stream.
    * - "share" - Reshare an activity.
    */
  var verb: js.UndefOr[String] = js.undefined
}

object Activity {
  @scala.inline
  def apply(
    access: Acl = null,
    actor: Anon_ClientSpecificActorInfo = null,
    address: String = null,
    annotation: String = null,
    crosspostSource: String = null,
    etag: String = null,
    geocode: String = null,
    id: String = null,
    kind: String = null,
    location: Place = null,
    `object`: Anon_Actor = null,
    placeId: String = null,
    placeName: String = null,
    provider: Anon_Title = null,
    published: String = null,
    radius: String = null,
    title: String = null,
    updated: String = null,
    url: String = null,
    verb: String = null
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

