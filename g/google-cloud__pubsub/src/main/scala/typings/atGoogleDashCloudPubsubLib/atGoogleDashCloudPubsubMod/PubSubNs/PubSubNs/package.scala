package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PubSubNs {
  type CreateSubscriptionCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* subscription */ atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.Subscription, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type CreateTopicCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* topic */ atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.Topic, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type GetSnapshotsCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* snapshots */ js.Array[atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.Snapshot], 
    scala.Unit
  ]
  type GetSubscriptionsCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* subscriptions */ js.Array[atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.Subscription], 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type GetTopicsCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* topics */ js.Array[atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.Topic], 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
}
