package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SchemaView extends StObject
/** SchemaView enum. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.pubsub.v1.SchemaView")
@js.native
object SchemaView extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SchemaView & Double] = js.native
  
  @js.native
  sealed trait BASIC
    extends StObject
       with SchemaView
  /* 1 */ val BASIC: typings.googleCloudPubsub.protosMod.google.pubsub.v1.SchemaView.BASIC & Double = js.native
  
  @js.native
  sealed trait FULL
    extends StObject
       with SchemaView
  /* 2 */ val FULL: typings.googleCloudPubsub.protosMod.google.pubsub.v1.SchemaView.FULL & Double = js.native
  
  @js.native
  sealed trait SCHEMA_VIEW_UNSPECIFIED
    extends StObject
       with SchemaView
  /* 0 */ val SCHEMA_VIEW_UNSPECIFIED: typings.googleCloudPubsub.protosMod.google.pubsub.v1.SchemaView.SCHEMA_VIEW_UNSPECIFIED & Double = js.native
}
