package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcIamMod {
  type GetPolicyCallback = atGoogleDashCloudPubsubLib.buildSrcPubsubMod.RequestCallback[Policy, scala.Unit]
  type GetPolicyResponse = js.Array[Policy]
  type IamPermissionsMap = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type Policy = atGoogleDashCloudPubsubLib.Anon_Etag with (atGoogleDashCloudPubsubLib.buildSrcPubsubMod.Omit[
    atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.IPolicy, 
    atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.etag
  ])
  type SetPolicyCallback = atGoogleDashCloudPubsubLib.buildSrcPubsubMod.RequestCallback[Policy, scala.Unit]
  type SetPolicyResponse = js.Array[Policy]
  type TestIamPermissionsCallback = atGoogleDashCloudPubsubLib.buildSrcPubsubMod.ResourceCallback[
    IamPermissionsMap, 
    atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ITestIamPermissionsResponse
  ]
  type TestIamPermissionsResponse = js.Tuple2[
    IamPermissionsMap, 
    atGoogleDashCloudPubsubLib.buildProtoIamMod.googleNs.iamNs.v1Ns.ITestIamPermissionsResponse
  ]
}
