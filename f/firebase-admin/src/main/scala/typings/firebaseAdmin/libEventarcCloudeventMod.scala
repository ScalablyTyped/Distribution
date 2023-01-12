package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.firebaseAdminStrings.`1Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventarcCloudeventMod {
  
  trait CloudEvent
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * Data payload of the event. Objects are stringified with JSON and strings are be passed along as-is.
      */
    var data: js.UndefOr[js.Object | String] = js.undefined
    
    /**
      * MIME type of the data being sent with the event in the `data` field. Only `application/json` and `text/plain`
      * are currently supported. If not specified, it is automatically inferred from the type of provided data.
      *
      * @see https://github.com/cloudevents/spec/blob/v1.0/spec.md#datacontenttype
      */
    var datacontenttype: js.UndefOr[String] = js.undefined
    
    /**
      * Identifier for the event. If not provided, it is auto-populated with a UUID.
      *
      * @see https://github.com/cloudevents/spec/blob/v1.0/spec.md#id
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Identifies the context in which an event happened. If not provided, the value of `EVENTARC_CLOUD_EVENT_SOURCE`
      * environment variable is used and if that is not set, a validation error is thrown.
      *
      * @see https://github.com/cloudevents/spec/blob/v1.0/spec.md#source-1
      */
    var source: js.UndefOr[String] = js.undefined
    
    /**
      * The version of the CloudEvents specification which the event uses. If not provided, is set to `1.0` --
      * the only supported value.
      *
      * @see https://github.com/cloudevents/spec/blob/v1.0/spec.md#specversion
      */
    var specversion: js.UndefOr[CloudEventVersion] = js.undefined
    
    /**
      * Subject (context) of the event in the context of the event producer.
      *
      * @see https://github.com/cloudevents/spec/blob/v1.0/spec.md#subject
      */
    var subject: js.UndefOr[String] = js.undefined
    
    /**
      * Timestamp of the event. Must be in ISO time format. If not specified, current time (at the moment of publishing)
      * is used.
      *
      * @see https://github.com/cloudevents/spec/blob/v1.0/spec.md#time
      */
    var time: js.UndefOr[String] = js.undefined
    
    /**
      * Type of the event. Should be prefixed with a reverse-DNS name (`com.my-org.v1.something.happended`).
      *
      * @see https://github.com/cloudevents/spec/blob/v1.0/spec.md#type
      */
    var `type`: String
  }
  object CloudEvent {
    
    inline def apply(`type`: String): CloudEvent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CloudEvent] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Object | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDatacontenttype(value: String): Self = StObject.set(x, "datacontenttype", value.asInstanceOf[js.Any])
      
      inline def setDatacontenttypeUndefined: Self = StObject.set(x, "datacontenttype", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSpecversion(value: CloudEventVersion): Self = StObject.set(x, "specversion", value.asInstanceOf[js.Any])
      
      inline def setSpecversionUndefined: Self = StObject.set(x, "specversion", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CloudEventVersion = `1Dot0`
}
