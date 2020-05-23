package typings.firebaseAdmin.admin

import typings.firebaseAdmin.admin.app.App
import typings.googleCloudStorage.mod.Bucket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin.storage")
@js.native
object storage extends js.Object {
  /**
    * The default `Storage` service if no
    * app is provided or the `Storage` service associated with the provided
    * app.
    */
  @js.native
  trait Storage extends js.Object {
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

