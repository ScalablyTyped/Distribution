package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ListenRequest. */
trait IListenRequest extends StObject {
  
  /** ListenRequest addTarget */
  var addTarget: js.UndefOr[ITarget | Null] = js.undefined
  
  /** ListenRequest database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** ListenRequest labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** ListenRequest removeTarget */
  var removeTarget: js.UndefOr[Double | Null] = js.undefined
}
object IListenRequest {
  
  inline def apply(): IListenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListenRequest]
  }
  
  extension [Self <: IListenRequest](x: Self) {
    
    inline def setAddTarget(value: ITarget): Self = StObject.set(x, "addTarget", value.asInstanceOf[js.Any])
    
    inline def setAddTargetNull: Self = StObject.set(x, "addTarget", null)
    
    inline def setAddTargetUndefined: Self = StObject.set(x, "addTarget", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setRemoveTarget(value: Double): Self = StObject.set(x, "removeTarget", value.asInstanceOf[js.Any])
    
    inline def setRemoveTargetNull: Self = StObject.set(x, "removeTarget", null)
    
    inline def setRemoveTargetUndefined: Self = StObject.set(x, "removeTarget", js.undefined)
  }
}
