package typings.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcIamMod {
  type GetPolicyCallback = typings.googleCloudPubsub.srcPubsubMod.RequestCallback[typings.googleCloudPubsub.srcIamMod.Policy, scala.Unit]
  type GetPolicyResponse = js.Array[typings.googleCloudPubsub.srcIamMod.Policy]
  type IamPermissionsMap = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type SetPolicyCallback = typings.googleCloudPubsub.srcPubsubMod.RequestCallback[typings.googleCloudPubsub.srcIamMod.Policy, scala.Unit]
  type SetPolicyResponse = js.Array[typings.googleCloudPubsub.srcIamMod.Policy]
  type TestIamPermissionsCallback = typings.googleCloudPubsub.srcPubsubMod.ResourceCallback[
    typings.googleCloudPubsub.srcIamMod.IamPermissionsMap, 
    typings.googleCloudPubsub.iamMod.google.iam.v1.ITestIamPermissionsResponse
  ]
  type TestIamPermissionsResponse = js.Tuple2[
    typings.googleCloudPubsub.srcIamMod.IamPermissionsMap, 
    typings.googleCloudPubsub.iamMod.google.iam.v1.ITestIamPermissionsResponse
  ]
}
