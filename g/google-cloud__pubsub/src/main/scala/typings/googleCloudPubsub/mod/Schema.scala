package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.pubsubMessageMod.Attributes
import typings.googleCloudPubsub.schemaMod.SchemaMessageMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/pubsub", "Schema")
@js.native
open class Schema protected ()
  extends typings.googleCloudPubsub.schemaMod.Schema {
  def this(pubsub: typings.googleCloudPubsub.pubsubMod.PubSub, idOrName: String) = this()
}
/* static members */
object Schema {
  
  @JSImport("@google-cloud/pubsub", "Schema")
  @js.native
  val ^ : js.Any = js.native
  
  /*!
    * Format the name of a schema. A schema's full name is in the
    * format of projects/{projectId}/schemas/{schemaName}.
    *
    * The GAPIC client should do this for us, but since we maintain
    * names rather than IDs, this is simpler.
    *
    * @private
    */
  inline def formatName_(projectId: String, nameOrId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], nameOrId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Translates the schema attributes in messages delivered from Pub/Sub.
    * All resulting fields may end up being blank.
    */
  inline def metadataFromMessage(attributes: Attributes): SchemaMessageMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("metadataFromMessage")(attributes.asInstanceOf[js.Any]).asInstanceOf[SchemaMessageMetadata]
}
