package typings
package atGoogleDashCloudStorageLib.storageMod.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Actions that can be performed on all ACL entities, including the root Acl.
     */

trait AclActions extends js.Object {
  def add(options: AclOptions): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def delete(options: AclOptions): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def get(options: AclOptions): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def update(options: AclOptions): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
}

