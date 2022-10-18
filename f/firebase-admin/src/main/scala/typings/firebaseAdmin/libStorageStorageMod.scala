package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import typings.googleCloudStorage.mod.Bucket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStorageStorageMod {
  
  @JSImport("firebase-admin/lib/storage/storage", "Storage")
  @js.native
  open class Storage () extends StObject {
    
    /**
      * Optional app whose `Storage` service to
      * return. If not provided, the default `Storage` service will be returned.
      */
    def app: App = js.native
    
    /* private */ val appInternal: Any = js.native
    
    /**
      * Gets a reference to a Cloud Storage bucket.
      *
      * @param name - Optional name of the bucket to be retrieved. If name is not specified,
      * retrieves a reference to the default bucket.
      * @returns A {@link https://cloud.google.com/nodejs/docs/reference/storage/latest/Bucket | Bucket}
      * instance as defined in the `@google-cloud/storage` package.
      */
    def bucket(): Bucket = js.native
    def bucket(name: String): Bucket = js.native
    
    /* private */ val storageClient: Any = js.native
  }
}
