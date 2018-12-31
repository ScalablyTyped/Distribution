package typings
package atGoogleDashCloudStorageLib.buildSrcAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attach functionality to a {@link Storage.acl} instance. This will add an
  * object for each role group (owners, readers, and writers), with each object
  * containing methods to add or delete a type of entity.
  *
  * As an example, here are a few methods that are created.
  *
  *   myBucket.acl.readers.deleteGroup('groupId', function(err) {});
  *
  *   myBucket.acl.owners.addUser('email@example.com', function(err, acl) {});
  *
  *   myBucket.acl.writers.addDomain('example.com', function(err, acl) {});
  *
  * @private
  */
@JSImport("@google-cloud/storage/build/src/acl", "AclRoleAccessorMethods")
@js.native
class AclRoleAccessorMethods () extends js.Object {
  def _assignAccessMethods(role: java.lang.String): scala.Unit = js.native
}

/**
  * Attach functionality to a {@link Storage.acl} instance. This will add an
  * object for each role group (owners, readers, and writers), with each object
  * containing methods to add or delete a type of entity.
  *
  * As an example, here are a few methods that are created.
  *
  *   myBucket.acl.readers.deleteGroup('groupId', function(err) {});
  *
  *   myBucket.acl.owners.addUser('email@example.com', function(err, acl) {});
  *
  *   myBucket.acl.writers.addDomain('example.com', function(err, acl) {});
  *
  * @private
  */
@JSImport("@google-cloud/storage/build/src/acl", "AclRoleAccessorMethods")
@js.native
object AclRoleAccessorMethods extends js.Object {
  var accessMethods: js.Any = js.native
  var entities: js.Any = js.native
  var roles: js.Any = js.native
}

