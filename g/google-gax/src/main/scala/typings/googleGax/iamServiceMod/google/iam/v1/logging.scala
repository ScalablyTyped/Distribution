package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace logging. */
object logging {
  
  /** Represents an AuditData. */
  @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData")
  @js.native
  /**
    * Constructs a new AuditData.
    * @param [properties] Properties to set
    */
  open class AuditData ()
    extends StObject
       with IAuditData {
    def this(properties: IAuditData) = this()
    
    /**
      * Converts this AuditData to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[Any] = js.native
  }
  object AuditData {
    
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new AuditData instance using the specified properties.
      * @param [properties] Properties to set
      * @returns AuditData instance
      */
    /* static member */
    inline def create(): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AuditData]
    inline def create(properties: IAuditData): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[AuditData]
    
    inline def decode(reader: js.typedarray.Uint8Array): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditData]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): AuditData = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AuditData]
    /**
      * Decodes an AuditData message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns AuditData
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditData]
    inline def decode(reader: Reader, length: Double): AuditData = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AuditData]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditData]
    /**
      * Decodes an AuditData message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns AuditData
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditData]
    
    /**
      * Encodes the specified AuditData message. Does not implicitly {@link google.iam.v1.logging.AuditData.verify|verify} messages.
      * @param message AuditData message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IAuditData): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IAuditData, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified AuditData message, length delimited. Does not implicitly {@link google.iam.v1.logging.AuditData.verify|verify} messages.
      * @param message AuditData message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IAuditData): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IAuditData, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an AuditData message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns AuditData
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[AuditData]
    
    /**
      * Creates a plain object from an AuditData message. Also converts values to other types if specified.
      * @param message AuditData
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: AuditData): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: AuditData, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies an AuditData message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Properties of an AuditData. */
  trait IAuditData extends StObject {
    
    /** AuditData policyDelta */
    var policyDelta: js.UndefOr[IPolicyDelta | Null] = js.undefined
  }
  object IAuditData {
    
    inline def apply(): IAuditData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAuditData]
    }
    
    extension [Self <: IAuditData](x: Self) {
      
      inline def setPolicyDelta(value: IPolicyDelta): Self = StObject.set(x, "policyDelta", value.asInstanceOf[js.Any])
      
      inline def setPolicyDeltaNull: Self = StObject.set(x, "policyDelta", null)
      
      inline def setPolicyDeltaUndefined: Self = StObject.set(x, "policyDelta", js.undefined)
    }
  }
}
