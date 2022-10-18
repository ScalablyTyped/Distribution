package typings.googleCloudPubsub

import typings.googleCloudPubsub.buildSrcPublisherPubsubMessageMod.Attributes
import typings.googleCloudPubsub.buildSrcPubsubMod.PubSub
import typings.googleCloudPubsub.googleCloudPubsubStrings.AVRO
import typings.googleCloudPubsub.googleCloudPubsubStrings.BASIC
import typings.googleCloudPubsub.googleCloudPubsubStrings.BINARY
import typings.googleCloudPubsub.googleCloudPubsubStrings.FULL
import typings.googleCloudPubsub.googleCloudPubsubStrings.JSON
import typings.googleCloudPubsub.googleCloudPubsubStrings.PROTOCOL_BUFFER
import typings.googleGax.buildSrcGaxMod.CallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSchemaMod {
  
  object Encodings {
    
    @JSImport("@google-cloud/pubsub/build/src/schema", "Encodings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub/build/src/schema", "Encodings.Binary")
    @js.native
    def Binary: BINARY = js.native
    inline def Binary_=(x: BINARY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/schema", "Encodings.Json")
    @js.native
    def Json: JSON = js.native
    inline def Json_=(x: JSON): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Json")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@google-cloud/pubsub/build/src/schema", "Schema")
  @js.native
  open class Schema protected () extends StObject {
    def this(pubsub: PubSub, idOrName: String) = this()
    
    /**
      * Create a schema.
      *
      * @see [Schemas: create API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.schemas/create}
      *
      * @throws {Error} if the schema type is incorrect.
      * @throws {Error} if the definition is invalid.
      *
      * @param {SchemaType} type The type of the schema (Protobuf, Avro, etc).
      * @param {string} definition The text describing the schema in terms of the type.
      * @param {object} [options] Request configuration options, outlined
      *   here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @returns {Promise<void>}
      *
      * @example Create a schema.
      * ```
      * const {PubSub} = require('@google-cloud/pubsub');
      * const pubsub = new PubSub();
      *
      * const schema = pubsub.schema('messageType');
      * await schema.create(
      *   SchemaTypes.Avro,
      *   '{...avro definition...}'
      * );
      * ```
      */
    def create(`type`: SchemaType, definition: String): js.Promise[Unit] = js.native
    def create(`type`: SchemaType, definition: String, gaxOpts: CallOptions): js.Promise[Unit] = js.native
    
    /**
      * Delete the schema from the project.
      *
      * @see [Schemas: deleteSchema API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.schemas/delete}
      *
      * @param {object} [options] Request configuration options, outlined
      *   here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @returns {Promise<void>}
      */
    def delete(): js.Promise[Unit] = js.native
    def delete(gaxOpts: CallOptions): js.Promise[Unit] = js.native
    
    /**
      * Get full information about the schema from the service.
      *
      * @see [Schemas: getSchema API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.schemas/get}
      *
      * @param {google.pubsub.v1.SchemaView} [view] The type of schema object
      *   requested, which should be an enum value from {@link SchemaViews}. Defaults
      *   to Full.
      * @param {object} [options] Request configuration options, outlined
      *   here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @returns {Promise<ISchema>}
      */
    def get(): js.Promise[ISchema] = js.native
    def get(view: Unit, gaxOpts: CallOptions): js.Promise[ISchema] = js.native
    def get(view: SchemaView): js.Promise[ISchema] = js.native
    def get(view: SchemaView, gaxOpts: CallOptions): js.Promise[ISchema] = js.native
    
    /**
      * Return the fully qualified name of this schema.
      *
      * Note that we have to verify that we have a projectId before returning this,
      * so we have to check that first.
      *
      * @return {Promise<string>} a Promise that resolves to the full schema name
      */
    def getName(): js.Promise[String] = js.native
    
    var id: String = js.native
    
    var name_ : js.UndefOr[String] = js.native
    
    var pubsub: PubSub = js.native
    
    def validateMessage(
      message: String,
      encoding: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Encoding * / any */ String
    ): js.Promise[Unit] = js.native
    def validateMessage(
      message: String,
      encoding: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Encoding * / any */ String,
      gaxOpts: CallOptions
    ): js.Promise[Unit] = js.native
    /**
      * Validate a message against this schema's definition.
      *
      * If you would like to validate a message against an arbitrary schema, please
      * use the {@link SchemaServiceClient} GAPIC class directly, using your
      * {@link PubSub} instance's configuration, via {@link PubSub#getClientConfig}.
      *
      * @see [Schemas: validateMessage API Documentation]{@link https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.schemas/validateMessage}
      *
      * @throws {Error} if the validation fails.
      * @throws {Error} if other parameters are invalid.
      *
      * @param {string} message The message to validate.
      * @param {Encoding | "JSON" | "BINARY"} encoding The encoding of the message to validate.
      * @param {object} [options] Request configuration options, outlined
      *   here: https://googleapis.github.io/gax-nodejs/interfaces/CallOptions.html.
      * @returns {Promise<void>}
      */
    def validateMessage(
      message: String,
      encoding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.Encoding */ Any
    ): js.Promise[Unit] = js.native
    def validateMessage(
      message: String,
      encoding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.Encoding */ Any,
      gaxOpts: CallOptions
    ): js.Promise[Unit] = js.native
  }
  /* static members */
  object Schema {
    
    @JSImport("@google-cloud/pubsub/build/src/schema", "Schema")
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
  
  object SchemaTypes {
    
    @JSImport("@google-cloud/pubsub/build/src/schema", "SchemaTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub/build/src/schema", "SchemaTypes.Avro")
    @js.native
    def Avro: AVRO = js.native
    inline def Avro_=(x: AVRO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Avro")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/schema", "SchemaTypes.ProtocolBuffer")
    @js.native
    def ProtocolBuffer: PROTOCOL_BUFFER = js.native
    inline def ProtocolBuffer_=(x: PROTOCOL_BUFFER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProtocolBuffer")(x.asInstanceOf[js.Any])
  }
  
  object SchemaViews {
    
    @JSImport("@google-cloud/pubsub/build/src/schema", "SchemaViews")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@google-cloud/pubsub/build/src/schema", "SchemaViews.Basic")
    @js.native
    def Basic: BASIC = js.native
    inline def Basic_=(x: BASIC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Basic")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/schema", "SchemaViews.Full")
    @js.native
    def Full: FULL = js.native
    inline def Full_=(x: FULL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Full")(x.asInstanceOf[js.Any])
  }
  
  type CreateSchemaResponse = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.Schema */ Any
  
  type ICreateSchemaRequest = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.ICreateSchemaRequest */ Any
  
  type ISchema = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.pubsub.v1.ISchema */ Any
  
  type SchemaEncoding = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Encoding * / any */ String
  
  trait SchemaMessageMetadata extends StObject {
    
    /**
      * Encoding; this will be Encodings.Json or Encodings.Binary.
      */
    var encoding: js.UndefOr[SchemaEncoding] = js.undefined
    
    /**
      * Schema name; may be queried using {@link PubSub#schema}.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object SchemaMessageMetadata {
    
    inline def apply(): SchemaMessageMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaMessageMetadata]
    }
    
    extension [Self <: SchemaMessageMetadata](x: Self) {
      
      inline def setEncoding(value: SchemaEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type SchemaType = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.Schema.Type * / any */ String
  
  type SchemaView = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.pubsub.v1.SchemaView * / any */ String
}
