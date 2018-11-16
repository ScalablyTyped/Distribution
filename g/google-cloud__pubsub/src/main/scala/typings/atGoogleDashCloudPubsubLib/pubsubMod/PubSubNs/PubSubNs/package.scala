package typings
package atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PubSubNs {
  type CreateSubscriptionCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* subscription */ atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.Subscription, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type CreateTopicCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* topic */ atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.Topic, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type GetSnapshotsCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* snapshots */ js.Array[atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.Snapshot], 
    scala.Unit
  ]
  type GetSubscriptionsCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* subscriptions */ js.Array[atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.Subscription], 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type GetTopicsCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* topics */ js.Array[atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.Topic], 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
}
