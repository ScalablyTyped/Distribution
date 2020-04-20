package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a RbmMedia. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia")
@js.native
/**
  * Constructs a new RbmMedia.
  * @param [properties] Properties to set
  */
class RbmMedia () extends IRbmMedia {
  def this(properties: IRbmMedia) = this()
  /** RbmMedia fileUri. */
  @JSName("fileUri")
  var fileUri_RbmMedia: String = js.native
  /** RbmMedia height. */
  @JSName("height")
  var height_RbmMedia: Height | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height * / any */ String) = js.native
  /** RbmMedia thumbnailUri. */
  @JSName("thumbnailUri")
  var thumbnailUri_RbmMedia: String = js.native
  /**
    * Converts this RbmMedia to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia")
@js.native
object RbmMedia extends js.Object {
  @js.native
  sealed trait Height extends js.Object
  
  /**
    * Creates a new RbmMedia instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RbmMedia instance
    */
  def create(): RbmMedia = js.native
  def create(properties: IRbmMedia): RbmMedia = js.native
  /**
    * Decodes a RbmMedia message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RbmMedia
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): RbmMedia = js.native
  def decode(reader: Reader, length: Double): RbmMedia = js.native
  def decode(reader: Uint8Array): RbmMedia = js.native
  def decode(reader: Uint8Array, length: Double): RbmMedia = js.native
  /**
    * Decodes a RbmMedia message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RbmMedia
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): RbmMedia = js.native
  def decodeDelimited(reader: Uint8Array): RbmMedia = js.native
  /**
    * Encodes the specified RbmMedia message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.verify|verify} messages.
    * @param message RbmMedia message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRbmMedia): Writer = js.native
  def encode(message: IRbmMedia, writer: Writer): Writer = js.native
  /**
    * Encodes the specified RbmMedia message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.verify|verify} messages.
    * @param message RbmMedia message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRbmMedia): Writer = js.native
  def encodeDelimited(message: IRbmMedia, writer: Writer): Writer = js.native
  /**
    * Creates a RbmMedia message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RbmMedia
    */
  def fromObject(`object`: StringDictionary[js.Any]): RbmMedia = js.native
  /**
    * Creates a plain object from a RbmMedia message. Also converts values to other types if specified.
    * @param message RbmMedia
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: RbmMedia): StringDictionary[js.Any] = js.native
  def toObject(message: RbmMedia, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a RbmMedia message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Height enum. */
  @js.native
  object Height extends js.Object {
    @js.native
    sealed trait HEIGHT_UNSPECIFIED extends Height
    
    @js.native
    sealed trait MEDIUM extends Height
    
    @js.native
    sealed trait SHORT extends Height
    
    @js.native
    sealed trait TALL extends Height
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Height with Double] = js.native
    /* 0 */ @js.native
    object HEIGHT_UNSPECIFIED extends TopLevel[HEIGHT_UNSPECIFIED with Double]
    
    /* 2 */ @js.native
    object MEDIUM extends TopLevel[MEDIUM with Double]
    
    /* 1 */ @js.native
    object SHORT extends TopLevel[SHORT with Double]
    
    /* 3 */ @js.native
    object TALL extends TopLevel[TALL with Double]
    
  }
  
}

