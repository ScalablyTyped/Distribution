package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcSnapshotMod {
  type CreateSnapshotCallback = atGoogleDashCloudPubsubLib.buildSrcPubsubMod.ResourceCallback[
    Snapshot, 
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISnapshot
  ]
  type CreateSnapshotResponse = js.Tuple2[
    Snapshot, 
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISnapshot
  ]
  type SeekCallback = atGoogleDashCloudPubsubLib.buildSrcPubsubMod.RequestCallback[
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISeekResponse, 
    scala.Unit
  ]
  type SeekResponse = js.Array[
    atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISeekResponse
  ]
}
