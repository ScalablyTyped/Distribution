package typings
package firebaseDashAdminLib.adminNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var app: firebaseDashAdminLib.adminNs.appNs.App = js.native
  /**
    * @returns A [Bucket](https://cloud.google.com/nodejs/docs/reference/storage/latest/Bucket)
    * instance as defined in the `@google-cloud/storage` package.
    */
  def bucket(): atGoogleDashCloudStorageLib.atGoogleDashCloudStorageMod.Bucket = js.native
  def bucket(name: java.lang.String): atGoogleDashCloudStorageLib.atGoogleDashCloudStorageMod.Bucket = js.native
}

