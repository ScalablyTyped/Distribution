package typings
package atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SnapshotNs {
  type CreateCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* snapshot */ atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.Snapshot, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type DeleteCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  type SeekCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
}
