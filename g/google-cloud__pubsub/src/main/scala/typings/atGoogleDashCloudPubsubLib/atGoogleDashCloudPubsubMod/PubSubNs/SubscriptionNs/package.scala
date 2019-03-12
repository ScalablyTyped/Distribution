package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SubscriptionNs {
  type CloseCallback = js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  type CreateSnapshotCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* snapshot */ atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SnapshotFromSubscription, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type DeleteCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  type ExistsCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* exists */ scala.Boolean, scala.Unit]
  type GetCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* subscription */ atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.Subscription, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type GetMetadataCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  type ModifyPushConfigCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  type SeekCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  type SetMetadataCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
}
