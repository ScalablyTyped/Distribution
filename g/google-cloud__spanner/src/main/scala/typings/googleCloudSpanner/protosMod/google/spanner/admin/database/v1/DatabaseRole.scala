package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DatabaseRole. */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.DatabaseRole")
@js.native
/**
  * Constructs a new DatabaseRole.
  * @param [properties] Properties to set
  */
open class DatabaseRole ()
  extends StObject
     with IDatabaseRole {
  def this(properties: IDatabaseRole) = this()
  
  /** DatabaseRole name. */
  @JSName("name")
  var name_DatabaseRole: String = js.native
  
  /**
    * Converts this DatabaseRole to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DatabaseRole {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.DatabaseRole")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DatabaseRole instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DatabaseRole instance
    */
  /* static member */
  inline def create(): DatabaseRole = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DatabaseRole]
  inline def create(properties: IDatabaseRole): DatabaseRole = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DatabaseRole]
  
  inline def decode(reader: js.typedarray.Uint8Array): DatabaseRole = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DatabaseRole]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): DatabaseRole = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DatabaseRole]
  /**
    * Decodes a DatabaseRole message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DatabaseRole
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): DatabaseRole = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DatabaseRole]
  inline def decode(reader: Reader, length: Double): DatabaseRole = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DatabaseRole]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): DatabaseRole = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DatabaseRole]
  /**
    * Decodes a DatabaseRole message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DatabaseRole
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): DatabaseRole = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DatabaseRole]
  
  /**
    * Encodes the specified DatabaseRole message. Does not implicitly {@link google.spanner.admin.database.v1.DatabaseRole.verify|verify} messages.
    * @param message DatabaseRole message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDatabaseRole): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDatabaseRole, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DatabaseRole message, length delimited. Does not implicitly {@link google.spanner.admin.database.v1.DatabaseRole.verify|verify} messages.
    * @param message DatabaseRole message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDatabaseRole): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDatabaseRole, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DatabaseRole message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DatabaseRole
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DatabaseRole = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DatabaseRole]
  
  /**
    * Gets the default type url for DatabaseRole
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a DatabaseRole message. Also converts values to other types if specified.
    * @param message DatabaseRole
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DatabaseRole): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DatabaseRole, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a DatabaseRole message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
