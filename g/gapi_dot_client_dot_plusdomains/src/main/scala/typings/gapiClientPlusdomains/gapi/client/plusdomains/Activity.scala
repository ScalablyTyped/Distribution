package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClientPlusdomains.anon.Actor
import typings.gapiClientPlusdomains.anon.ClientSpecificActorInfo
import typings.gapiClientPlusdomains.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends js.Object {
  /** Identifies who has access to see this activity. */
  var access: js.UndefOr[Acl] = js.native
  /** The person who performed this activity. */
  var actor: js.UndefOr[ClientSpecificActorInfo] = js.native
  /** Street address where this activity occurred. */
  var address: js.UndefOr[String] = js.native
  /** Additional content added by the person who shared this activity, applicable only when resharing an activity. */
  var annotation: js.UndefOr[String] = js.native
  /** If this activity is a crosspost from another system, this property specifies the ID of the original activity. */
  var crosspostSource: js.UndefOr[String] = js.native
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /** Latitude and longitude where this activity occurred. Format is latitude followed by longitude, space separated. */
  var geocode: js.UndefOr[String] = js.native
  /** The ID of this activity. */
  var id: js.UndefOr[String] = js.native
  /** Identifies this resource as an activity. Value: "plus#activity". */
  var kind: js.UndefOr[String] = js.native
  /** The location where this activity occurred. */
  var location: js.UndefOr[Place] = js.native
  /** The object of this activity. */
  var `object`: js.UndefOr[Actor] = js.native
  /** ID of the place where this activity occurred. */
  var placeId: js.UndefOr[String] = js.native
  /** Name of the place where this activity occurred. */
  var placeName: js.UndefOr[String] = js.native
  /** The service provider that initially published this activity. */
  var provider: js.UndefOr[Title] = js.native
  /** The time at which this activity was initially published. Formatted as an RFC 3339 timestamp. */
  var published: js.UndefOr[String] = js.native
  /** Radius, in meters, of the region where this activity occurred, centered at the latitude and longitude identified in geocode. */
  var radius: js.UndefOr[String] = js.native
  /** Title of this activity. */
  var title: js.UndefOr[String] = js.native
  /** The time at which this activity was last updated. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[String] = js.native
  /** The link to this activity. */
  var url: js.UndefOr[String] = js.native
  /**
    * This activity's verb, which indicates the action that was performed. Possible values include, but are not limited to, the following values:
    * - "post" - Publish content to the stream.
    * - "share" - Reshare an activity.
    */
  var verb: js.UndefOr[String] = js.native
}

object Activity {
  @scala.inline
  def apply(): Activity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccess(value: Acl): Self = this.set("access", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    @scala.inline
    def setActor(value: ClientSpecificActorInfo): Self = this.set("actor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setAnnotation(value: String): Self = this.set("annotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotation: Self = this.set("annotation", js.undefined)
    @scala.inline
    def setCrosspostSource(value: String): Self = this.set("crosspostSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrosspostSource: Self = this.set("crosspostSource", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setGeocode(value: String): Self = this.set("geocode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeocode: Self = this.set("geocode", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocation(value: Place): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setObject(value: Actor): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceId: Self = this.set("placeId", js.undefined)
    @scala.inline
    def setPlaceName(value: String): Self = this.set("placeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceName: Self = this.set("placeName", js.undefined)
    @scala.inline
    def setProvider(value: Title): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setPublished(value: String): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    @scala.inline
    def setRadius(value: String): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVerb(value: String): Self = this.set("verb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
  }
  
}

