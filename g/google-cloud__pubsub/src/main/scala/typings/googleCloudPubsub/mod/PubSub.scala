package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.pubsubMod.ClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/pubsub", "PubSub")
@js.native
open class PubSub ()
  extends typings.googleCloudPubsub.pubsubMod.PubSub {
  def this(options: ClientConfig) = this()
}
/* static members */
object PubSub {
  
  @JSImport("@google-cloud/pubsub", "PubSub")
  @js.native
  val ^ : js.Any = js.native
  
  /*!
    * Format the name of a project. A project's full name is in the
    * format of projects/{projectId}.
    *
    * The GAPIC client should do this for us, but since we maintain
    * names rather than IDs, this is simpler.
    *
    * @private
    */
  inline def formatName_(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
