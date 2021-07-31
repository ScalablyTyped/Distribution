package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instruction to Classroom to send notifications from the `feed` to the
  * provided destination.
  */
trait SchemaRegistration extends StObject {
  
  /**
    * The Cloud Pub/Sub topic that notifications are to be sent to.
    */
  var cloudPubsubTopic: js.UndefOr[SchemaCloudPubsubTopic] = js.undefined
  
  /**
    * The time until which the `Registration` is effective.  This is a
    * read-only field assigned by the server.
    */
  var expiryTime: js.UndefOr[String] = js.undefined
  
  /**
    * Specification for the class of notifications that Classroom should
    * deliver to the destination.
    */
  var feed: js.UndefOr[SchemaFeed] = js.undefined
  
  /**
    * A server-generated unique identifier for this `Registration`.  Read-only.
    */
  var registrationId: js.UndefOr[String] = js.undefined
}
object SchemaRegistration {
  
  @scala.inline
  def apply(): SchemaRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegistration]
  }
  
  @scala.inline
  implicit class SchemaRegistrationMutableBuilder[Self <: SchemaRegistration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudPubsubTopic(value: SchemaCloudPubsubTopic): Self = StObject.set(x, "cloudPubsubTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudPubsubTopicUndefined: Self = StObject.set(x, "cloudPubsubTopic", js.undefined)
    
    @scala.inline
    def setExpiryTime(value: String): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryTimeUndefined: Self = StObject.set(x, "expiryTime", js.undefined)
    
    @scala.inline
    def setFeed(value: SchemaFeed): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedUndefined: Self = StObject.set(x, "feed", js.undefined)
    
    @scala.inline
    def setRegistrationId(value: String): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationIdUndefined: Self = StObject.set(x, "registrationId", js.undefined)
  }
}
