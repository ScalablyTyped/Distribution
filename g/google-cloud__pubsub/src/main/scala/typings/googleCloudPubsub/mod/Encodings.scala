package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.googleCloudPubsubStrings.BINARY
import typings.googleCloudPubsub.googleCloudPubsubStrings.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Encodings {
  
  @JSImport("@google-cloud/pubsub", "Encodings")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google-cloud/pubsub", "Encodings.Binary")
  @js.native
  def Binary: BINARY = js.native
  inline def Binary_=(x: BINARY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/pubsub", "Encodings.Json")
  @js.native
  def Json: JSON = js.native
  inline def Json_=(x: JSON): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Json")(x.asInstanceOf[js.Any])
}
