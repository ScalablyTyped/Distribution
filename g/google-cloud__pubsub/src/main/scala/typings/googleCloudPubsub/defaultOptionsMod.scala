package typings.googleCloudPubsub

import typings.googleCloudPubsub.anon.MaxDelayMillis
import typings.googleCloudPubsub.anon.MaxExtensionMinutes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultOptionsMod {
  
  object defaultOptions {
    
    @JSImport("@google-cloud/pubsub/build/src/default-options", "defaultOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub/build/src/default-options", "defaultOptions.publish")
    @js.native
    def publish: MaxDelayMillis = js.native
    @scala.inline
    def publish_=(x: MaxDelayMillis): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("publish")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/default-options", "defaultOptions.subscription")
    @js.native
    def subscription: MaxExtensionMinutes = js.native
    @scala.inline
    def subscription_=(x: MaxExtensionMinutes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subscription")(x.asInstanceOf[js.Any])
  }
}
