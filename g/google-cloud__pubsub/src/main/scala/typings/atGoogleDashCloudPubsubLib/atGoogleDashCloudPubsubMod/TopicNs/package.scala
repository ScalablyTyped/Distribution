package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TopicNs {
  type CreateCallback = atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.CreateTopicCallback
  type CreateSubscriptionCallback = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub.Topic.CreateSubscriptionCallback */ js.Object
  type CreateSubscriptionOptions = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub.Topic.CreateSubscriptionOptions */ js.Object
  // Note: This is not fully documented in the link; browse the source code to find the callback parameters
  // https://googlecloudplatform.github.io/google-cloud-node/#/docs/pubsub/0.14.1/pubsub/topic?method=delete
  type DeleteCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  type ExistsCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* exists */ scala.Boolean, scala.Unit]
  // Note: This is not fully documented in the link; browse the source code to find the callback parameters
  // https://googlecloudplatform.github.io/google-cloud-node/#/docs/pubsub/0.14.1/pubsub/topic?method=get
  type GetCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* topic */ atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.Topic, 
    /* apiResponse */ js.Object, 
    scala.Unit
  ]
  type GetMetadataCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* apiResponse */ js.Object, scala.Unit]
  // Callback signature also slightly different to PubSub.getSubscriptions(callback), so we can't just reuse it
  type GetSubscriptionsCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* subscriptions */ js.Array[atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.Subscription], 
    scala.Unit
  ]
  type SubscriptionOptions = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub.Topic.SubscriptionOptions */ js.Object
}
