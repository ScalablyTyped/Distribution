package typings.firebaseDashAdmin.admin

import typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageMod.Bucket
import typings.firebaseDashAdmin.admin.app.App
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
  
  /**
    * Gets the {@link admin.storage.Storage `Storage`} service for the
    * default app or a given app.
    *
    * `admin.storage()` can be called with no arguments to access the default
    * app's {@link admin.storage.Storage `Storage`} service or as
    * `admin.storage(app)` to access the
    * {@link admin.storage.Storage `Storage`} service associated with a
    * specific app.
    *
    * @example
    * ```javascript
    * // Get the Storage service for the default app
    * var defaultStorage = admin.storage();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Storage service for a given app
    * var otherStorage = admin.storage(otherApp);
    * ```
    */
  def apply(): Storage = js.native
  def apply(app: App): Storage = js.native
}

