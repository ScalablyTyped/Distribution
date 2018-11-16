package typings
package atGoogleDashCloudStorageLib.storageMod.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An object of convenience methods to add or delete reader ACL permissions for a given entity.
     */

trait AclEntity extends AclActions {
  def addAllAuthenticatedUsers(): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def addAllUsers(): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def addDomain(entity: java.lang.String): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def addGroup(entity: java.lang.String): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def addProject(entity: java.lang.String): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def addUser(entity: java.lang.String): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def deleteAllAuthenticatedUsers(): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def deleteAllUsers(): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def deleteDomain(entity: java.lang.String): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def deleteGroup(entity: java.lang.String): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def deleteProject(entity: java.lang.String): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
  def deleteUser(entity: java.lang.String): stdLib.Promise[js.Tuple2[Acl, ApiResponse]]
}

