package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Topic. */
trait ITopic extends StObject {
  
  /** Topic kmsKeyName */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
  
  /** Topic labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** Topic messageStoragePolicy */
  var messageStoragePolicy: js.UndefOr[IMessageStoragePolicy | Null] = js.undefined
  
  /** Topic name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object ITopic {
  
  inline def apply(): ITopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITopic]
  }
  
  extension [Self <: ITopic](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMessageStoragePolicy(value: IMessageStoragePolicy): Self = StObject.set(x, "messageStoragePolicy", value.asInstanceOf[js.Any])
    
    inline def setMessageStoragePolicyNull: Self = StObject.set(x, "messageStoragePolicy", null)
    
    inline def setMessageStoragePolicyUndefined: Self = StObject.set(x, "messageStoragePolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
