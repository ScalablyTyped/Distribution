package typings.googleCloudSpanner.protosMod.google.api

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.api.ResourceDescriptor.Style
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ResourceDescriptor. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.api.ResourceDescriptor")
@js.native
/**
  * Constructs a new ResourceDescriptor.
  * @param [properties] Properties to set
  */
open class ResourceDescriptor ()
  extends StObject
     with IResourceDescriptor {
  def this(properties: IResourceDescriptor) = this()
  
  /** ResourceDescriptor history. */
  @JSName("history")
  var history_ResourceDescriptor: History | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.api.ResourceDescriptor.History * / any */ String) = js.native
  
  /** ResourceDescriptor nameField. */
  @JSName("nameField")
  var nameField_ResourceDescriptor: String = js.native
  
  /** ResourceDescriptor pattern. */
  @JSName("pattern")
  var pattern_ResourceDescriptor: js.Array[String] = js.native
  
  /** ResourceDescriptor plural. */
  @JSName("plural")
  var plural_ResourceDescriptor: String = js.native
  
  /** ResourceDescriptor singular. */
  @JSName("singular")
  var singular_ResourceDescriptor: String = js.native
  
  /** ResourceDescriptor style. */
  @JSName("style")
  var style_ResourceDescriptor: js.Array[Style] = js.native
  
  /**
    * Converts this ResourceDescriptor to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** ResourceDescriptor type. */
  @JSName("type")
  var type_ResourceDescriptor: String = js.native
}
object ResourceDescriptor {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.api.ResourceDescriptor")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait History extends StObject
  /** History enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.api.ResourceDescriptor.History")
  @js.native
  object History extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleCloudSpanner.protosMod.google.api.ResourceDescriptor.History & Double
      ] = js.native
    
    @js.native
    sealed trait FUTURE_MULTI_PATTERN
      extends StObject
         with typings.googleCloudSpanner.protosMod.google.api.ResourceDescriptor.History
    /* 2 */ val FUTURE_MULTI_PATTERN: typings.googleCloudSpanner.protosMod.google.api.ResourceDescriptor.History.FUTURE_MULTI_PATTERN & Double = js.native
    
    @js.native
    sealed trait HISTORY_UNSPECIFIED
      extends StObject
         with typings.googleCloudSpanner.protosMod.google.api.ResourceDescriptor.History
    /* 0 */ val HISTORY_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.api.ResourceDescriptor.History.HISTORY_UNSPECIFIED & Double = js.native
    
    @js.native
    sealed trait ORIGINALLY_SINGLE_PATTERN
      extends StObject
         with typings.googleCloudSpanner.protosMod.google.api.ResourceDescriptor.History
    /* 1 */ val ORIGINALLY_SINGLE_PATTERN: typings.googleCloudSpanner.protosMod.google.api.ResourceDescriptor.History.ORIGINALLY_SINGLE_PATTERN & Double = js.native
  }
  
  @js.native
  sealed trait Style extends StObject
  /** Style enum. */
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.api.ResourceDescriptor.Style")
  @js.native
  object Style extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Style & Double] = js.native
    
    @js.native
    sealed trait DECLARATIVE_FRIENDLY
      extends StObject
         with Style
    /* 1 */ val DECLARATIVE_FRIENDLY: typings.googleCloudSpanner.protosMod.google.api.ResourceDescriptor.Style.DECLARATIVE_FRIENDLY & Double = js.native
    
    @js.native
    sealed trait STYLE_UNSPECIFIED
      extends StObject
         with Style
    /* 0 */ val STYLE_UNSPECIFIED: typings.googleCloudSpanner.protosMod.google.api.ResourceDescriptor.Style.STYLE_UNSPECIFIED & Double = js.native
  }
  
  /**
    * Creates a new ResourceDescriptor instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ResourceDescriptor instance
    */
  /* static member */
  inline def create(): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ResourceDescriptor]
  inline def create(properties: IResourceDescriptor): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
  
  inline def decode(reader: js.typedarray.Uint8Array): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ResourceDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResourceDescriptor]
  /**
    * Decodes a ResourceDescriptor message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ResourceDescriptor
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
  inline def decode(reader: Reader, length: Double): ResourceDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ResourceDescriptor]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
  /**
    * Decodes a ResourceDescriptor message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ResourceDescriptor
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
  
  /**
    * Encodes the specified ResourceDescriptor message. Does not implicitly {@link google.api.ResourceDescriptor.verify|verify} messages.
    * @param message ResourceDescriptor message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IResourceDescriptor): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IResourceDescriptor, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ResourceDescriptor message, length delimited. Does not implicitly {@link google.api.ResourceDescriptor.verify|verify} messages.
    * @param message ResourceDescriptor message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IResourceDescriptor): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IResourceDescriptor, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ResourceDescriptor message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ResourceDescriptor
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ResourceDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ResourceDescriptor]
  
  /**
    * Gets the default type url for ResourceDescriptor
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a ResourceDescriptor message. Also converts values to other types if specified.
    * @param message ResourceDescriptor
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ResourceDescriptor): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ResourceDescriptor, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ResourceDescriptor message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
