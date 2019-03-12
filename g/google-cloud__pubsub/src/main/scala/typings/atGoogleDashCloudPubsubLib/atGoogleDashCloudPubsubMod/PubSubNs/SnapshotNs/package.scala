package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SnapshotNs {
  type CreateCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* snapshot */ atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.Snapshot, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type DeleteCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  type SeekCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
}
