package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
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
  class AuditData ()
    extends StObject
       with IAuditData {
    def this(properties: IAuditData) = this()
    
    /**
      * Converts this AuditData to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
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
    @scala.inline
    def create(): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[AuditData]
    @scala.inline
    def create(properties: IAuditData): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[AuditData]
    
    /**
      * Decodes an AuditData message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns AuditData
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditData]
    @scala.inline
    def decode(reader: Reader, length: Double): AuditData = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AuditData]
    @scala.inline
    def decode(reader: Uint8Array): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditData]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): AuditData = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[AuditData]
    
    /**
      * Decodes an AuditData message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns AuditData
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditData]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[AuditData]
    
    /**
      * Encodes the specified AuditData message. Does not implicitly {@link google.iam.v1.logging.AuditData.verify|verify} messages.
      * @param message AuditData message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IAuditData): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IAuditData, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified AuditData message, length delimited. Does not implicitly {@link google.iam.v1.logging.AuditData.verify|verify} messages.
      * @param message AuditData message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IAuditData): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IAuditData, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an AuditData message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns AuditData
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): AuditData = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[AuditData]
    
    /**
      * Creates a plain object from an AuditData message. Also converts values to other types if specified.
      * @param message AuditData
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: AuditData): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: AuditData, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies an AuditData message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Properties of an AuditData. */
  trait IAuditData extends StObject {
    
    /** AuditData policyDelta */
    var policyDelta: js.UndefOr[IPolicyDelta | Null] = js.undefined
  }
  object IAuditData {
    
    @scala.inline
    def apply(): IAuditData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAuditData]
    }
    
    @scala.inline
    implicit class IAuditDataMutableBuilder[Self <: IAuditData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicyDelta(value: IPolicyDelta): Self = StObject.set(x, "policyDelta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyDeltaNull: Self = StObject.set(x, "policyDelta", null)
      
      @scala.inline
      def setPolicyDeltaUndefined: Self = StObject.set(x, "policyDelta", js.undefined)
    }
  }
}
