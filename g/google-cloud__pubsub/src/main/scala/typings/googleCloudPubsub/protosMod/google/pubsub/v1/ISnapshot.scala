package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Snapshot. */
trait ISnapshot extends StObject {
  
  /** Snapshot expireTime */
  var expireTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Snapshot labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** Snapshot name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Snapshot topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object ISnapshot {
  
  inline def apply(): ISnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISnapshot]
  }
  
  extension [Self <: ISnapshot](x: Self) {
    
    inline def setExpireTime(value: ITimestamp): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
