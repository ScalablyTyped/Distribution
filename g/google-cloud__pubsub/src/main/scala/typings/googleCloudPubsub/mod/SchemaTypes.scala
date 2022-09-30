package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.googleCloudPubsubStrings.AVRO
import typings.googleCloudPubsub.googleCloudPubsubStrings.PROTOCOL_BUFFER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SchemaTypes {
  
  @JSImport("@google-cloud/pubsub", "SchemaTypes")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google-cloud/pubsub", "SchemaTypes.Avro")
  @js.native
  def Avro: AVRO = js.native
  inline def Avro_=(x: AVRO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Avro")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/pubsub", "SchemaTypes.ProtocolBuffer")
  @js.native
  def ProtocolBuffer: PROTOCOL_BUFFER = js.native
  inline def ProtocolBuffer_=(x: PROTOCOL_BUFFER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProtocolBuffer")(x.asInstanceOf[js.Any])
}
