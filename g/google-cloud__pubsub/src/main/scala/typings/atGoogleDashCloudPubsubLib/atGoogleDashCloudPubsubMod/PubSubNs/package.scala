package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PubSubNs {
  type CreateSubscriptionCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* subscription */ atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.Subscription, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type CreateTopicCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* topic */ atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.Topic, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type GetSnapshotsCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* snapshots */ js.Array[atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.Snapshot], 
    scala.Unit
  ]
  type GetSubscriptionsCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* subscriptions */ js.Array[atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.Subscription], 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type GetTopicsCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* topics */ js.Array[atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.Topic], 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
}
