package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Encoding extends StObject
/** Encoding enum. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.Encoding")
@js.native
object Encoding extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Encoding & Double] = js.native
  
  @js.native
  sealed trait BINARY
    extends StObject
       with Encoding
  /* 2 */ val BINARY: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Encoding.BINARY & Double = js.native
  
  @js.native
  sealed trait ENCODING_UNSPECIFIED
    extends StObject
       with Encoding
  /* 0 */ val ENCODING_UNSPECIFIED: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Encoding.ENCODING_UNSPECIFIED & Double = js.native
  
  @js.native
  sealed trait JSON
    extends StObject
       with Encoding
  /* 1 */ val JSON: typings.googleCloudPubsub.protosMod.google.pubsub.v1.Encoding.JSON & Double = js.native
}
