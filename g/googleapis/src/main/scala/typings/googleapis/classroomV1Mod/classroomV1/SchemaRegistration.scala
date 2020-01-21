package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction to Classroom to send notifications from the `feed` to the
  * provided destination.
  */
@js.native
trait SchemaRegistration extends js.Object {
  /**
    * The Cloud Pub/Sub topic that notifications are to be sent to.
    */
  var cloudPubsubTopic: js.UndefOr[SchemaCloudPubsubTopic] = js.native
  /**
    * The time until which the `Registration` is effective.  This is a
    * read-only field assigned by the server.
    */
  var expiryTime: js.UndefOr[String] = js.native
  /**
    * Specification for the class of notifications that Classroom should
    * deliver to the destination.
    */
  var feed: js.UndefOr[SchemaFeed] = js.native
  /**
    * A server-generated unique identifier for this `Registration`.  Read-only.
    */
  var registrationId: js.UndefOr[String] = js.native
}

object SchemaRegistration {
  @scala.inline
  def apply(
    cloudPubsubTopic: SchemaCloudPubsubTopic = null,
    expiryTime: String = null,
    feed: SchemaFeed = null,
    registrationId: String = null
  ): SchemaRegistration = {
    val __obj = js.Dynamic.literal()
    if (cloudPubsubTopic != null) __obj.updateDynamic("cloudPubsubTopic")(cloudPubsubTopic.asInstanceOf[js.Any])
    if (expiryTime != null) __obj.updateDynamic("expiryTime")(expiryTime.asInstanceOf[js.Any])
    if (feed != null) __obj.updateDynamic("feed")(feed.asInstanceOf[js.Any])
    if (registrationId != null) __obj.updateDynamic("registrationId")(registrationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegistration]
  }
}

