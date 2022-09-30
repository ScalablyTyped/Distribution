package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.googleCloudSpannerStrings.begin
import typings.googleCloudSpanner.googleCloudSpannerStrings.id
import typings.googleCloudSpanner.googleCloudSpannerStrings.singleUse
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TransactionSelector. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.TransactionSelector")
@js.native
/**
  * Constructs a new TransactionSelector.
  * @param [properties] Properties to set
  */
open class TransactionSelector ()
  extends StObject
     with ITransactionSelector {
  def this(properties: ITransactionSelector) = this()
  
  /** TransactionSelector selector. */
  var selector: js.UndefOr[singleUse | id | begin] = js.native
  
  /**
    * Converts this TransactionSelector to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object TransactionSelector {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.TransactionSelector")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TransactionSelector instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TransactionSelector instance
    */
  /* static member */
  inline def create(): TransactionSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TransactionSelector]
  inline def create(properties: ITransactionSelector): TransactionSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TransactionSelector]
  
  inline def decode(reader: js.typedarray.Uint8Array): TransactionSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionSelector]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): TransactionSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TransactionSelector]
  /**
    * Decodes a TransactionSelector message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TransactionSelector
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): TransactionSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionSelector]
  inline def decode(reader: Reader, length: Double): TransactionSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TransactionSelector]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): TransactionSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionSelector]
  /**
    * Decodes a TransactionSelector message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TransactionSelector
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): TransactionSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionSelector]
  
  /**
    * Encodes the specified TransactionSelector message. Does not implicitly {@link google.spanner.v1.TransactionSelector.verify|verify} messages.
    * @param message TransactionSelector message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ITransactionSelector): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITransactionSelector, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TransactionSelector message, length delimited. Does not implicitly {@link google.spanner.v1.TransactionSelector.verify|verify} messages.
    * @param message TransactionSelector message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ITransactionSelector): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITransactionSelector, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TransactionSelector message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TransactionSelector
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): TransactionSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TransactionSelector]
  
  /**
    * Gets the default type url for TransactionSelector
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a TransactionSelector message. Also converts values to other types if specified.
    * @param message TransactionSelector
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: TransactionSelector): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: TransactionSelector, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TransactionSelector message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
