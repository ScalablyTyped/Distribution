package typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance.State
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Instance. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.Instance")
@js.native
/**
  * Constructs a new Instance.
  * @param [properties] Properties to set
  */
open class Instance ()
  extends StObject
     with IInstance {
  def this(properties: IInstance) = this()
  
  /** Instance config. */
  @JSName("config")
  var config_Instance: String = js.native
  
  /** Instance displayName. */
  @JSName("displayName")
  var displayName_Instance: String = js.native
  
  /** Instance endpointUris. */
  @JSName("endpointUris")
  var endpointUris_Instance: js.Array[String] = js.native
  
  /** Instance labels. */
  @JSName("labels")
  var labels_Instance: StringDictionary[String] = js.native
  
  /** Instance name. */
  @JSName("name")
  var name_Instance: String = js.native
  
  /** Instance nodeCount. */
  @JSName("nodeCount")
  var nodeCount_Instance: Double = js.native
  
  /** Instance processingUnits. */
  @JSName("processingUnits")
  var processingUnits_Instance: Double = js.native
  
  /** Instance state. */
  @JSName("state")
  var state_Instance: State | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.instance.v1.Instance.State * / any */ String) = js.native
  
  /**
    * Converts this Instance to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Instance {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.Instance")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait State extends StObject
  /** State enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.instance.v1.Instance.State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State & Double] = js.native
    
    @js.native
    sealed trait CREATING
      extends StObject
         with State
    /* 1 */ val CREATING: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance.State.CREATING & Double = js.native
    
    @js.native
    sealed trait READY
      extends StObject
         with State
    /* 2 */ val READY: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance.State.READY & Double = js.native
    
    @js.native
    sealed trait STATE_UNSPECIFIED
      extends StObject
         with State
    /* 0 */ val STATE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.spanner.admin.instance.v1.Instance.State.STATE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new Instance instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Instance instance
    */
  /* static member */
  inline def create(): Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Instance]
  inline def create(properties: IInstance): Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Instance]
  
  inline def decode(reader: js.typedarray.Uint8Array): Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Instance]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Instance]
  /**
    * Decodes an Instance message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Instance
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Instance]
  inline def decode(reader: Reader, length: Double): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Instance]
  /**
    * Decodes an Instance message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Instance
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Instance]
  
  /**
    * Encodes the specified Instance message. Does not implicitly {@link google.spanner.admin.instance.v1.Instance.verify|verify} messages.
    * @param message Instance message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IInstance): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IInstance, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Instance message, length delimited. Does not implicitly {@link google.spanner.admin.instance.v1.Instance.verify|verify} messages.
    * @param message Instance message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IInstance): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IInstance, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an Instance message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Instance
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Instance]
  
  /**
    * Gets the default type url for Instance
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from an Instance message. Also converts values to other types if specified.
    * @param message Instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Instance): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Instance, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an Instance message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
