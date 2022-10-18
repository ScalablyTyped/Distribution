package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInstanceIdInstanceIdMod {
  
  @JSImport("firebase-admin/lib/instance-id/instance-id", "InstanceId")
  @js.native
  open class InstanceId () extends StObject {
    
    /**
      * Returns the app associated with this InstanceId instance.
      *
      * @returns The app associated with this InstanceId instance.
      */
    def app: App = js.native
    
    /* private */ var app_ : Any = js.native
    
    /**
      * Deletes the specified instance ID and the associated data from Firebase.
      *
      * Note that Google Analytics for Firebase uses its own form of Instance ID to
      * keep track of analytics data. Therefore deleting a Firebase Instance ID does
      * not delete Analytics data. See
      * {@link https://firebase.google.com/support/privacy/manage-iids#delete_an_instance_id |
      * Delete an Instance ID}
      * for more information.
      *
      * @param instanceId - The instance ID to be deleted.
      *
      * @returns A promise fulfilled when the instance ID is deleted.
      */
    def deleteInstanceId(instanceId: String): js.Promise[Unit] = js.native
  }
}
