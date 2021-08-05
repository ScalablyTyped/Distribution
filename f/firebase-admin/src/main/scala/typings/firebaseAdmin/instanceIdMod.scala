package typings.firebaseAdmin

import typings.firebaseAdmin.firebaseNamespaceApiMod.app.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceIdMod {
  
  object instanceId {
    
    inline def apply(): InstanceId = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[InstanceId]
    inline def apply(app: App): InstanceId = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[InstanceId]
    
    @JSImport("firebase-admin/lib/instance-id", "instanceId")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the {@link InstanceId `InstanceId`} service for the
      * current app.
      *
      * @example
      * ```javascript
      * var instanceId = app.instanceId();
      * // The above is shorthand for:
      * // var instanceId = admin.instanceId(app);
      * ```
      *
      * @return The `InstanceId` service for the
      *   current app.
      */
    trait InstanceId extends StObject {
      
      var app: App
      
      /**
        * Deletes the specified instance ID and the associated data from Firebase.
        *
        * Note that Google Analytics for Firebase uses its own form of Instance ID to
        * keep track of analytics data. Therefore deleting a Firebase Instance ID does
        * not delete Analytics data. See
        * [Delete an Instance ID](/support/privacy/manage-iids#delete_an_instance_id)
        * for more information.
        *
        * @param instanceId The instance ID to be deleted.
        *
        * @return A promise fulfilled when the instance ID is deleted.
        */
      def deleteInstanceId(instanceId: String): js.Promise[Unit]
    }
    object InstanceId {
      
      inline def apply(app: App, deleteInstanceId: String => js.Promise[Unit]): InstanceId = {
        val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], deleteInstanceId = js.Any.fromFunction1(deleteInstanceId))
        __obj.asInstanceOf[InstanceId]
      }
      
      extension [Self <: InstanceId](x: Self) {
        
        inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
        
        inline def setDeleteInstanceId(value: String => js.Promise[Unit]): Self = StObject.set(x, "deleteInstanceId", js.Any.fromFunction1(value))
      }
    }
  }
}
