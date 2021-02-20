package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  class AuditData () extends IAuditData {
    def this(properties: IAuditData) = this()
    
    /**
      * Converts this AuditData to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object AuditData {
    
    /**
      * Creates a new AuditData instance using the specified properties.
      * @param [properties] Properties to set
      * @returns AuditData instance
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.create")
    @js.native
    def create(): AuditData = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.create")
    @js.native
    def create(properties: IAuditData): AuditData = js.native
    
    /**
      * Decodes an AuditData message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns AuditData
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.decode")
    @js.native
    def decode(reader: Reader): AuditData = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.decode")
    @js.native
    def decode(reader: Reader, length: Double): AuditData = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.decode")
    @js.native
    def decode(reader: Uint8Array): AuditData = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): AuditData = js.native
    
    /**
      * Decodes an AuditData message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns AuditData
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): AuditData = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): AuditData = js.native
    
    /**
      * Encodes the specified AuditData message. Does not implicitly {@link google.iam.v1.logging.AuditData.verify|verify} messages.
      * @param message AuditData message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.encode")
    @js.native
    def encode(message: IAuditData): Writer = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.encode")
    @js.native
    def encode(message: IAuditData, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified AuditData message, length delimited. Does not implicitly {@link google.iam.v1.logging.AuditData.verify|verify} messages.
      * @param message AuditData message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.encodeDelimited")
    @js.native
    def encodeDelimited(message: IAuditData): Writer = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.encodeDelimited")
    @js.native
    def encodeDelimited(message: IAuditData, writer: Writer): Writer = js.native
    
    /**
      * Creates an AuditData message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns AuditData
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): AuditData = js.native
    
    /**
      * Creates a plain object from an AuditData message. Also converts values to other types if specified.
      * @param message AuditData
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.toObject")
    @js.native
    def toObject(message: AuditData): StringDictionary[js.Any] = js.native
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.toObject")
    @js.native
    def toObject(message: AuditData, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an AuditData message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax/build/protos/iam_service", "google.iam.v1.logging.AuditData.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Properties of an AuditData. */
  @js.native
  trait IAuditData extends StObject {
    
    /** AuditData policyDelta */
    var policyDelta: js.UndefOr[IPolicyDelta | Null] = js.native
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
