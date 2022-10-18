package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.ApiVersion
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.MatchMode
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.Tier
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Agent. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Agent")
@js.native
/**
  * Constructs a new Agent.
  * @param [properties] Properties to set
  */
open class Agent ()
  extends StObject
     with IAgent {
  def this(properties: IAgent) = this()
  
  /** Agent apiVersion. */
  @JSName("apiVersion")
  var apiVersion_Agent: ApiVersion | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Agent.ApiVersion * / any */ String) = js.native
  
  /** Agent avatarUri. */
  @JSName("avatarUri")
  var avatarUri_Agent: String = js.native
  
  /** Agent classificationThreshold. */
  @JSName("classificationThreshold")
  var classificationThreshold_Agent: Double = js.native
  
  /** Agent defaultLanguageCode. */
  @JSName("defaultLanguageCode")
  var defaultLanguageCode_Agent: String = js.native
  
  /** Agent description. */
  @JSName("description")
  var description_Agent: String = js.native
  
  /** Agent displayName. */
  @JSName("displayName")
  var displayName_Agent: String = js.native
  
  /** Agent enableLogging. */
  @JSName("enableLogging")
  var enableLogging_Agent: Boolean = js.native
  
  /** Agent matchMode. */
  @JSName("matchMode")
  var matchMode_Agent: MatchMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Agent.MatchMode * / any */ String) = js.native
  
  /** Agent parent. */
  @JSName("parent")
  var parent_Agent: String = js.native
  
  /** Agent supportedLanguageCodes. */
  @JSName("supportedLanguageCodes")
  var supportedLanguageCodes_Agent: js.Array[String] = js.native
  
  /** Agent tier. */
  @JSName("tier")
  var tier_Agent: Tier | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Agent.Tier * / any */ String) = js.native
  
  /** Agent timeZone. */
  @JSName("timeZone")
  var timeZone_Agent: String = js.native
  
  /**
    * Converts this Agent to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Agent {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Agent")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ApiVersion extends StObject
  /** ApiVersion enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Agent.ApiVersion")
  @js.native
  object ApiVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ApiVersion & Double] = js.native
    
    @js.native
    sealed trait API_VERSION_UNSPECIFIED
      extends StObject
         with ApiVersion
    /* 0 */ val API_VERSION_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.ApiVersion.API_VERSION_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait API_VERSION_V1
      extends StObject
         with ApiVersion
    /* 1 */ val API_VERSION_V1: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.ApiVersion.API_VERSION_V1 & Double = js.native
    
    @js.native
    sealed trait API_VERSION_V2
      extends StObject
         with ApiVersion
    /* 2 */ val API_VERSION_V2: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.ApiVersion.API_VERSION_V2 & Double = js.native
    
    @js.native
    sealed trait API_VERSION_V2_BETA_1
      extends StObject
         with ApiVersion
    /* 3 */ val API_VERSION_V2_BETA_1: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.ApiVersion.API_VERSION_V2_BETA_1 & Double = js.native
  }
  
  @js.native
  sealed trait MatchMode extends StObject
  /** MatchMode enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Agent.MatchMode")
  @js.native
  object MatchMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MatchMode & Double] = js.native
    
    @js.native
    sealed trait MATCH_MODE_HYBRID
      extends StObject
         with MatchMode
    /* 1 */ val MATCH_MODE_HYBRID: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.MatchMode.MATCH_MODE_HYBRID & Double = js.native
    
    @js.native
    sealed trait MATCH_MODE_ML_ONLY
      extends StObject
         with MatchMode
    /* 2 */ val MATCH_MODE_ML_ONLY: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.MatchMode.MATCH_MODE_ML_ONLY & Double = js.native
    
    @js.native
    sealed trait MATCH_MODE_UNSPECIFIED
      extends StObject
         with MatchMode
    /* 0 */ val MATCH_MODE_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.MatchMode.MATCH_MODE_UNSPECIFIED & Double = js.native
  }
  
  @js.native
  sealed trait Tier extends StObject
  /** Tier enum. */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Agent.Tier")
  @js.native
  object Tier extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Tier & Double] = js.native
    
    @js.native
    sealed trait TIER_ENTERPRISE
      extends StObject
         with Tier
    /* 2 */ val TIER_ENTERPRISE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.Tier.TIER_ENTERPRISE & Double = js.native
    
    @js.native
    sealed trait TIER_ENTERPRISE_PLUS
      extends StObject
         with Tier
    /* 3 */ val TIER_ENTERPRISE_PLUS: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.Tier.TIER_ENTERPRISE_PLUS & Double = js.native
    
    @js.native
    sealed trait TIER_STANDARD
      extends StObject
         with Tier
    /* 1 */ val TIER_STANDARD: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.Tier.TIER_STANDARD & Double = js.native
    
    @js.native
    sealed trait TIER_UNSPECIFIED
      extends StObject
         with Tier
    /* 0 */ val TIER_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Agent.Tier.TIER_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new Agent instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Agent instance
    */
  /* static member */
  inline def create(): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Agent]
  inline def create(properties: IAgent): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Agent]
  
  inline def decode(reader: js.typedarray.Uint8Array): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Agent]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Agent = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Agent]
  /**
    * Decodes an Agent message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Agent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Agent]
  inline def decode(reader: Reader, length: Double): Agent = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Agent]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Agent]
  /**
    * Decodes an Agent message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Agent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Agent]
  
  /**
    * Encodes the specified Agent message. Does not implicitly {@link google.cloud.dialogflow.v2.Agent.verify|verify} messages.
    * @param message Agent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IAgent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IAgent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Agent message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Agent.verify|verify} messages.
    * @param message Agent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IAgent): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IAgent, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an Agent message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Agent
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Agent]
  
  /**
    * Creates a plain object from an Agent message. Also converts values to other types if specified.
    * @param message Agent
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Agent): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Agent, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an Agent message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
