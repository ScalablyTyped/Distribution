package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateSnapshotRequest. */
trait ICreateSnapshotRequest extends StObject {
  
  /** CreateSnapshotRequest labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** CreateSnapshotRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** CreateSnapshotRequest subscription */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object ICreateSnapshotRequest {
  
  @scala.inline
  def apply(): ICreateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateSnapshotRequest]
  }
  
  @scala.inline
  implicit class ICreateSnapshotRequestMutableBuilder[Self <: ICreateSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
