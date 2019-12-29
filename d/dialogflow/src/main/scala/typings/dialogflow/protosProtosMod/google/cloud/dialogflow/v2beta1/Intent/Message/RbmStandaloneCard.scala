package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.CardOrientation
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.ThumbnailImageAlignment
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a RbmStandaloneCard. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard")
@js.native
/**
  * Constructs a new RbmStandaloneCard.
  * @param [properties] Properties to set
  */
class RbmStandaloneCard () extends IRbmStandaloneCard {
  def this(properties: IRbmStandaloneCard) = this()
  /** RbmStandaloneCard cardOrientation. */
  @JSName("cardOrientation")
  var cardOrientation_RbmStandaloneCard: CardOrientation = js.native
  /** RbmStandaloneCard thumbnailImageAlignment. */
  @JSName("thumbnailImageAlignment")
  var thumbnailImageAlignment_RbmStandaloneCard: ThumbnailImageAlignment = js.native
  /**
    * Converts this RbmStandaloneCard to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard")
@js.native
object RbmStandaloneCard extends js.Object {
  @js.native
  sealed trait CardOrientation extends js.Object
  
  @js.native
  sealed trait ThumbnailImageAlignment extends js.Object
  
  /**
    * Creates a new RbmStandaloneCard instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RbmStandaloneCard instance
    */
  def create(): RbmStandaloneCard = js.native
  def create(properties: IRbmStandaloneCard): RbmStandaloneCard = js.native
  /**
    * Decodes a RbmStandaloneCard message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RbmStandaloneCard
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): RbmStandaloneCard = js.native
  def decode(reader: Reader, length: Double): RbmStandaloneCard = js.native
  def decode(reader: Uint8Array): RbmStandaloneCard = js.native
  def decode(reader: Uint8Array, length: Double): RbmStandaloneCard = js.native
  /**
    * Decodes a RbmStandaloneCard message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RbmStandaloneCard
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): RbmStandaloneCard = js.native
  def decodeDelimited(reader: Uint8Array): RbmStandaloneCard = js.native
  /**
    * Encodes the specified RbmStandaloneCard message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.verify|verify} messages.
    * @param message RbmStandaloneCard message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRbmStandaloneCard): Writer = js.native
  def encode(message: IRbmStandaloneCard, writer: Writer): Writer = js.native
  /**
    * Encodes the specified RbmStandaloneCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmStandaloneCard.verify|verify} messages.
    * @param message RbmStandaloneCard message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRbmStandaloneCard): Writer = js.native
  def encodeDelimited(message: IRbmStandaloneCard, writer: Writer): Writer = js.native
  /**
    * Creates a RbmStandaloneCard message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RbmStandaloneCard
    */
  def fromObject(`object`: StringDictionary[js.Any]): RbmStandaloneCard = js.native
  /**
    * Creates a plain object from a RbmStandaloneCard message. Also converts values to other types if specified.
    * @param message RbmStandaloneCard
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: RbmStandaloneCard): StringDictionary[js.Any] = js.native
  def toObject(message: RbmStandaloneCard, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a RbmStandaloneCard message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** CardOrientation enum. */
  @js.native
  object CardOrientation extends js.Object {
    @js.native
    sealed trait CARD_ORIENTATION_UNSPECIFIED extends CardOrientation
    
    @js.native
    sealed trait HORIZONTAL extends CardOrientation
    
    @js.native
    sealed trait VERTICAL extends CardOrientation
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CardOrientation with Double] = js.native
    /* 0 */ @js.native
    object CARD_ORIENTATION_UNSPECIFIED extends TopLevel[CARD_ORIENTATION_UNSPECIFIED with Double]
    
    /* 1 */ @js.native
    object HORIZONTAL extends TopLevel[HORIZONTAL with Double]
    
    /* 2 */ @js.native
    object VERTICAL extends TopLevel[VERTICAL with Double]
    
  }
  
  /** ThumbnailImageAlignment enum. */
  @js.native
  object ThumbnailImageAlignment extends js.Object {
    @js.native
    sealed trait LEFT extends ThumbnailImageAlignment
    
    @js.native
    sealed trait RIGHT extends ThumbnailImageAlignment
    
    @js.native
    sealed trait THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED extends ThumbnailImageAlignment
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ThumbnailImageAlignment with Double] = js.native
    /* 1 */ @js.native
    object LEFT extends TopLevel[LEFT with Double]
    
    /* 2 */ @js.native
    object RIGHT extends TopLevel[RIGHT with Double]
    
    /* 0 */ @js.native
    object THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED extends TopLevel[THUMBNAIL_IMAGE_ALIGNMENT_UNSPECIFIED with Double]
    
  }
  
}

