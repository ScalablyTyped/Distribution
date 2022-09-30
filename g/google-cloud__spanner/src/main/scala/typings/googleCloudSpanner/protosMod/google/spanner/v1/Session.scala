package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Session. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.Session")
@js.native
/**
  * Constructs a new Session.
  * @param [properties] Properties to set
  */
open class Session ()
  extends StObject
     with ISession {
  def this(properties: ISession) = this()
  
  /** Session creatorRole. */
  @JSName("creatorRole")
  var creatorRole_Session: String = js.native
  
  /** Session labels. */
  @JSName("labels")
  var labels_Session: StringDictionary[String] = js.native
  
  /** Session name. */
  @JSName("name")
  var name_Session: String = js.native
  
  /**
    * Converts this Session to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Session {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.Session")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Session instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Session instance
    */
  /* static member */
  inline def create(): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Session]
  inline def create(properties: ISession): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Session]
  
  inline def decode(reader: js.typedarray.Uint8Array): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Session]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Session = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Session]
  /**
    * Decodes a Session message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Session
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Session]
  inline def decode(reader: Reader, length: Double): Session = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Session]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Session]
  /**
    * Decodes a Session message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Session
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Session]
  
  /**
    * Encodes the specified Session message. Does not implicitly {@link google.spanner.v1.Session.verify|verify} messages.
    * @param message Session message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISession): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISession, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Session message, length delimited. Does not implicitly {@link google.spanner.v1.Session.verify|verify} messages.
    * @param message Session message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISession): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISession, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Session message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Session
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Session = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Session]
  
  /**
    * Gets the default type url for Session
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a Session message. Also converts values to other types if specified.
    * @param message Session
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Session): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Session, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Session message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
