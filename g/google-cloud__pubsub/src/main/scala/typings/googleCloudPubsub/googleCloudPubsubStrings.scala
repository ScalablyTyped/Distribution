package typings.googleCloudPubsub

import typings.googleCloudPubsub.buildSrcSubscriberMod.AckResponse
import typings.googleCloudPubsub.buildSrcTemporalMod.TotalOfUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleCloudPubsubStrings {
  
  @js.native
  sealed trait AVRO extends StObject
  inline def AVRO: AVRO = "AVRO".asInstanceOf[AVRO]
  
  @js.native
  sealed trait BASIC extends StObject
  inline def BASIC: BASIC = "BASIC".asInstanceOf[BASIC]
  
  @js.native
  sealed trait BINARY extends StObject
  inline def BINARY: BINARY = "BINARY".asInstanceOf[BINARY]
  
  @js.native
  sealed trait FAILED_PRECONDITION
    extends StObject
       with AckResponse
  inline def FAILED_PRECONDITION: FAILED_PRECONDITION = "FAILED_PRECONDITION".asInstanceOf[FAILED_PRECONDITION]
  
  @js.native
  sealed trait FULL extends StObject
  inline def FULL: FULL = "FULL".asInstanceOf[FULL]
  
  @js.native
  sealed trait INVALID
    extends StObject
       with AckResponse
  inline def INVALID: INVALID = "INVALID".asInstanceOf[INVALID]
  
  @js.native
  sealed trait JSON extends StObject
  inline def JSON: JSON = "JSON".asInstanceOf[JSON]
  
  @js.native
  sealed trait OTHER
    extends StObject
       with AckResponse
  inline def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait PERMISSION_DENIED
    extends StObject
       with AckResponse
  inline def PERMISSION_DENIED: PERMISSION_DENIED = "PERMISSION_DENIED".asInstanceOf[PERMISSION_DENIED]
  
  @js.native
  sealed trait PROTOCOL_BUFFER extends StObject
  inline def PROTOCOL_BUFFER: PROTOCOL_BUFFER = "PROTOCOL_BUFFER".asInstanceOf[PROTOCOL_BUFFER]
  
  @js.native
  sealed trait PublisherClient extends StObject
  inline def PublisherClient: PublisherClient = "PublisherClient".asInstanceOf[PublisherClient]
  
  @js.native
  sealed trait SUCCESS
    extends StObject
       with AckResponse
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait SubscriberClient extends StObject
  inline def SubscriberClient: SubscriberClient = "SubscriberClient".asInstanceOf[SubscriberClient]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait etag extends StObject
  inline def etag: etag = "etag".asInstanceOf[etag]
  
  @js.native
  sealed trait hour
    extends StObject
       with TotalOfUnit
  inline def hour: hour = "hour".asInstanceOf[hour]
  
  @js.native
  sealed trait messageRetentionDuration extends StObject
  inline def messageRetentionDuration: messageRetentionDuration = "messageRetentionDuration".asInstanceOf[messageRetentionDuration]
  
  @js.native
  sealed trait millisecond
    extends StObject
       with TotalOfUnit
  inline def millisecond: millisecond = "millisecond".asInstanceOf[millisecond]
  
  @js.native
  sealed trait minute
    extends StObject
       with TotalOfUnit
  inline def minute: minute = "minute".asInstanceOf[minute]
  
  @js.native
  sealed trait second
    extends StObject
       with TotalOfUnit
  inline def second: second = "second".asInstanceOf[second]
}
