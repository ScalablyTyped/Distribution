package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.googleCloudPubsubStrings.BASIC
import typings.googleCloudPubsub.googleCloudPubsubStrings.FULL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SchemaViews {
  
  @JSImport("@google-cloud/pubsub", "SchemaViews")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google-cloud/pubsub", "SchemaViews.Basic")
  @js.native
  def Basic: BASIC = js.native
  inline def Basic_=(x: BASIC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Basic")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/pubsub", "SchemaViews.Full")
  @js.native
  def Full: FULL = js.native
  inline def Full_=(x: FULL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Full")(x.asInstanceOf[js.Any])
}
