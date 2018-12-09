package typings
package atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Allow this interface to start with 'I', since it's an acronym!
// tslint:disable-next-line interface-name
@js.native
trait IAM extends js.Object {
  def getPolicy(): js.Promise[js.Array[_]] = js.native
  def getPolicy(callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.IAMNs.GetPolicyCallback): scala.Unit = js.native
  def setPolicy(policy: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.IAMNs.Policy): js.Promise[js.Array[_]] = js.native
  def setPolicy(
    policy: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.IAMNs.Policy,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.IAMNs.SetPolicyCallback
  ): scala.Unit = js.native
  def testPermissions(permissions: java.lang.String): js.Promise[js.Array[_]] = js.native
  def testPermissions(
    permissions: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.IAMNs.TestPermissionsCallback
  ): scala.Unit = js.native
  def testPermissions(permissions: js.Array[java.lang.String]): js.Promise[js.Array[_]] = js.native
  def testPermissions(
    permissions: js.Array[java.lang.String],
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.IAMNs.TestPermissionsCallback
  ): scala.Unit = js.native
}

