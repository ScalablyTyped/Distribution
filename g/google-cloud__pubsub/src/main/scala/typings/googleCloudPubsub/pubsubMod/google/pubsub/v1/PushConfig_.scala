package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.googleCloudPubsubStrings.oidcToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a PushConfig. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.pubsub.v1.PushConfig")
@js.native
/**
  * Constructs a new PushConfig.
  * @param [properties] Properties to set
  */
class PushConfig_ () extends IPushConfig {
  def this(properties: IPushConfig) = this()
  /** PushConfig attributes. */
  @JSName("attributes")
  var attributes_PushConfig_ : StringDictionary[String] = js.native
  /** PushConfig authenticationMethod. */
  var authenticationMethod: js.UndefOr[oidcToken] = js.native
  /** PushConfig pushEndpoint. */
  @JSName("pushEndpoint")
  var pushEndpoint_PushConfig_ : String = js.native
  /**
    * Converts this PushConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

