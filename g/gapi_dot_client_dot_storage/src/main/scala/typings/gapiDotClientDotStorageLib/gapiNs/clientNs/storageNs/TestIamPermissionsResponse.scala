package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIamPermissionsResponse extends js.Object {
  /** The kind of item this is. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The permissions held by the caller. Permissions are always of the format storage.resource.capability, where resource is one of buckets or objects. The
    * supported permissions are as follows:
    * - storage.buckets.delete — Delete bucket.
    * - storage.buckets.get — Read bucket metadata.
    * - storage.buckets.getIamPolicy — Read bucket IAM policy.
    * - storage.buckets.create — Create bucket.
    * - storage.buckets.list — List buckets.
    * - storage.buckets.setIamPolicy — Update bucket IAM policy.
    * - storage.buckets.update — Update bucket metadata.
    * - storage.objects.delete — Delete object.
    * - storage.objects.get — Read object data and metadata.
    * - storage.objects.getIamPolicy — Read object IAM policy.
    * - storage.objects.create — Create object.
    * - storage.objects.list — List objects.
    * - storage.objects.setIamPolicy — Update object IAM policy.
    * - storage.objects.update — Update object metadata.
    */
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

