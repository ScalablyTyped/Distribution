package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an OpenUrlAction. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction")
@js.native
/**
  * Constructs a new OpenUrlAction.
  * @param [properties] Properties to set
  */
class OpenUrlAction () extends IOpenUrlAction {
  def this(properties: IOpenUrlAction) = this()
  /** OpenUrlAction urlTypeHint. */
  @JSName("urlTypeHint")
  var urlTypeHint_OpenUrlAction: UrlTypeHint | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.UrlTypeHint * / any */ String) = js.native
  /** OpenUrlAction url. */
  @JSName("url")
  var url_OpenUrlAction: String = js.native
  /**
    * Converts this OpenUrlAction to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction")
@js.native
object OpenUrlAction extends js.Object {
  @js.native
  sealed trait UrlTypeHint extends js.Object
  
  /**
    * Creates a new OpenUrlAction instance using the specified properties.
    * @param [properties] Properties to set
    * @returns OpenUrlAction instance
    */
  def create(): OpenUrlAction = js.native
  def create(properties: IOpenUrlAction): OpenUrlAction = js.native
  /**
    * Decodes an OpenUrlAction message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns OpenUrlAction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): OpenUrlAction = js.native
  def decode(reader: Reader, length: Double): OpenUrlAction = js.native
  def decode(reader: Uint8Array): OpenUrlAction = js.native
  def decode(reader: Uint8Array, length: Double): OpenUrlAction = js.native
  /**
    * Decodes an OpenUrlAction message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns OpenUrlAction
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): OpenUrlAction = js.native
  def decodeDelimited(reader: Uint8Array): OpenUrlAction = js.native
  /**
    * Encodes the specified OpenUrlAction message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.verify|verify} messages.
    * @param message OpenUrlAction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IOpenUrlAction): Writer = js.native
  def encode(message: IOpenUrlAction, writer: Writer): Writer = js.native
  /**
    * Encodes the specified OpenUrlAction message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem.OpenUrlAction.verify|verify} messages.
    * @param message OpenUrlAction message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IOpenUrlAction): Writer = js.native
  def encodeDelimited(message: IOpenUrlAction, writer: Writer): Writer = js.native
  /**
    * Creates an OpenUrlAction message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OpenUrlAction
    */
  def fromObject(`object`: StringDictionary[js.Any]): OpenUrlAction = js.native
  /**
    * Creates a plain object from an OpenUrlAction message. Also converts values to other types if specified.
    * @param message OpenUrlAction
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: OpenUrlAction): StringDictionary[js.Any] = js.native
  def toObject(message: OpenUrlAction, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies an OpenUrlAction message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** UrlTypeHint enum. */
  @js.native
  object UrlTypeHint extends js.Object {
    @js.native
    sealed trait AMP_ACTION extends UrlTypeHint
    
    @js.native
    sealed trait AMP_CONTENT extends UrlTypeHint
    
    @js.native
    sealed trait URL_TYPE_HINT_UNSPECIFIED extends UrlTypeHint
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[UrlTypeHint with Double] = js.native
    /* 1 */ @js.native
    object AMP_ACTION extends TopLevel[AMP_ACTION with Double]
    
    /* 2 */ @js.native
    object AMP_CONTENT extends TopLevel[AMP_CONTENT with Double]
    
    /* 0 */ @js.native
    object URL_TYPE_HINT_UNSPECIFIED extends TopLevel[URL_TYPE_HINT_UNSPECIFIED with Double]
    
  }
  
}

