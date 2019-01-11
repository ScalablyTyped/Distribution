package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Allow this interface to start with 'I', since it's an acronym!
// tslint:disable-next-line interface-name
@js.native
trait IAM extends js.Object {
  def getPolicy(): js.Promise[js.Array[_]] = js.native
  def getPolicy(callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.IAMNs.GetPolicyCallback): scala.Unit = js.native
  def setPolicy(policy: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.IAMNs.Policy): js.Promise[js.Array[_]] = js.native
  def setPolicy(
    policy: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.IAMNs.Policy,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.IAMNs.SetPolicyCallback
  ): scala.Unit = js.native
  def testPermissions(permissions: java.lang.String): js.Promise[js.Array[_]] = js.native
  def testPermissions(
    permissions: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.IAMNs.TestPermissionsCallback
  ): scala.Unit = js.native
  def testPermissions(permissions: js.Array[java.lang.String]): js.Promise[js.Array[_]] = js.native
  def testPermissions(
    permissions: js.Array[java.lang.String],
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.IAMNs.TestPermissionsCallback
  ): scala.Unit = js.native
}

