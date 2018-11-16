package typings
package atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SubscriptionNs {
  type CloseCallback = js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]
  type CreateSnapshotCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* snapshot */ atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.SnapshotFromSubscription, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type DeleteCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  type ExistsCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* exists */ scala.Boolean, scala.Unit]
  type GetCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* subscription */ atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.Subscription, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type GetMetadataCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  type ModifyPushConfigCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  type SeekCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  type SetMetadataCallback = js.Function2[/* err */ nodeLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
}
