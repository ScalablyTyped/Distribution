package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.CardWidth
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a RbmCarouselCard. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard")
@js.native
/**
  * Constructs a new RbmCarouselCard.
  * @param [properties] Properties to set
  */
class RbmCarouselCard () extends IRbmCarouselCard {
  def this(properties: IRbmCarouselCard) = this()
  /** RbmCarouselCard cardContents. */
  @JSName("cardContents")
  var cardContents_RbmCarouselCard: js.Array[IRbmCardContent] = js.native
  /** RbmCarouselCard cardWidth. */
  @JSName("cardWidth")
  var cardWidth_RbmCarouselCard: CardWidth | String = js.native
  /**
    * Converts this RbmCarouselCard to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard")
@js.native
object RbmCarouselCard extends js.Object {
  @js.native
  sealed trait CardWidth extends js.Object
  
  /**
    * Creates a new RbmCarouselCard instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RbmCarouselCard instance
    */
  def create(): RbmCarouselCard = js.native
  def create(properties: IRbmCarouselCard): RbmCarouselCard = js.native
  /**
    * Decodes a RbmCarouselCard message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RbmCarouselCard
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): RbmCarouselCard = js.native
  def decode(reader: Reader, length: Double): RbmCarouselCard = js.native
  def decode(reader: Uint8Array): RbmCarouselCard = js.native
  def decode(reader: Uint8Array, length: Double): RbmCarouselCard = js.native
  /**
    * Decodes a RbmCarouselCard message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RbmCarouselCard
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): RbmCarouselCard = js.native
  def decodeDelimited(reader: Uint8Array): RbmCarouselCard = js.native
  /**
    * Encodes the specified RbmCarouselCard message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.verify|verify} messages.
    * @param message RbmCarouselCard message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRbmCarouselCard): Writer = js.native
  def encode(message: IRbmCarouselCard, writer: Writer): Writer = js.native
  /**
    * Encodes the specified RbmCarouselCard message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmCarouselCard.verify|verify} messages.
    * @param message RbmCarouselCard message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRbmCarouselCard): Writer = js.native
  def encodeDelimited(message: IRbmCarouselCard, writer: Writer): Writer = js.native
  /**
    * Creates a RbmCarouselCard message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RbmCarouselCard
    */
  def fromObject(`object`: StringDictionary[js.Any]): RbmCarouselCard = js.native
  /**
    * Creates a plain object from a RbmCarouselCard message. Also converts values to other types if specified.
    * @param message RbmCarouselCard
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: RbmCarouselCard): StringDictionary[js.Any] = js.native
  def toObject(message: RbmCarouselCard, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a RbmCarouselCard message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** CardWidth enum. */
  @js.native
  object CardWidth extends js.Object {
    @js.native
    sealed trait CARD_WIDTH_UNSPECIFIED extends CardWidth
    
    @js.native
    sealed trait MEDIUM extends CardWidth
    
    @js.native
    sealed trait SMALL extends CardWidth
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CardWidth with Double] = js.native
    /* 0 */ @js.native
    object CARD_WIDTH_UNSPECIFIED extends TopLevel[CARD_WIDTH_UNSPECIFIED with Double]
    
    /* 2 */ @js.native
    object MEDIUM extends TopLevel[MEDIUM with Double]
    
    /* 1 */ @js.native
    object SMALL extends TopLevel[SMALL with Double]
    
  }
  
}

