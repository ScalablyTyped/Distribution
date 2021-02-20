package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Topic. */
@js.native
trait ITopic extends StObject {
  
  /** Topic kmsKeyName */
  var kmsKeyName: js.UndefOr[String | Null] = js.native
  
  /** Topic labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.native
  
  /** Topic messageStoragePolicy */
  var messageStoragePolicy: js.UndefOr[IMessageStoragePolicy | Null] = js.native
  
  /** Topic name */
  var name: js.UndefOr[String | Null] = js.native
}
object ITopic {
  
  @scala.inline
  def apply(): ITopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITopic]
  }
  
  @scala.inline
  implicit class ITopicMutableBuilder[Self <: ITopic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    @scala.inline
    def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMessageStoragePolicy(value: IMessageStoragePolicy): Self = StObject.set(x, "messageStoragePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageStoragePolicyNull: Self = StObject.set(x, "messageStoragePolicy", null)
    
    @scala.inline
    def setMessageStoragePolicyUndefined: Self = StObject.set(x, "messageStoragePolicy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
