package typings.firebaseAdmin

import typings.firebaseAdmin.firebaseNamespaceApiMod.app.App
import typings.googleCloudStorage.mod.Bucket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storageMod {
  
  object storage {
    
    @JSImport("firebase-admin/lib/storage", "storage")
    @js.native
    def apply(): Storage = js.native
    @JSImport("firebase-admin/lib/storage", "storage")
    @js.native
    def apply(app: App): Storage = js.native
    
    /**
      * The default `Storage` service if no
      * app is provided or the `Storage` service associated with the provided
      * app.
      */
    @js.native
    trait Storage extends StObject {
      
      /**
        * Optional app whose `Storage` service to
        * return. If not provided, the default `Storage` service will be returned.
        */
      var app: App = js.native
      
      /**
        * @returns A [Bucket](https://cloud.google.com/nodejs/docs/reference/storage/latest/Bucket)
        * instance as defined in the `@google-cloud/storage` package.
        */
      def bucket(): Bucket = js.native
      def bucket(name: String): Bucket = js.native
    }
  }
}
