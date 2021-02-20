package typings.dialogflow.mod.google

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.protobuf.IAny
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace rpc. */
object rpc {
  
  /** Represents a Status. */
  @JSImport("dialogflow/protos/protos", "google.rpc.Status")
  @js.native
  /**
    * Constructs a new Status.
    * @param [properties] Properties to set
    */
  class Status () extends IStatus {
    def this(properties: IStatus) = this()
    
    /** Status code. */
    @JSName("code")
    var code_Status: Double = js.native
    
    /** Status details. */
    @JSName("details")
    var details_Status: js.Array[IAny] = js.native
    
    /** Status message. */
    @JSName("message")
    var message_Status: String = js.native
    
    /**
      * Converts this Status to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object Status {
    
    /**
      * Creates a new Status instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Status instance
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.create")
    @js.native
    def create(): Status = js.native
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.create")
    @js.native
    def create(properties: IStatus): Status = js.native
    
    /**
      * Decodes a Status message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Status
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.decode")
    @js.native
    def decode(reader: Reader): Status = js.native
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.decode")
    @js.native
    def decode(reader: Reader, length: Double): Status = js.native
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.decode")
    @js.native
    def decode(reader: Uint8Array): Status = js.native
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): Status = js.native
    
    /**
      * Decodes a Status message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Status
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): Status = js.native
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): Status = js.native
    
    /**
      * Encodes the specified Status message. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
      * @param message Status message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.encode")
    @js.native
    def encode(message: IStatus): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.encode")
    @js.native
    def encode(message: IStatus, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Status message, length delimited. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
      * @param message Status message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.encodeDelimited")
    @js.native
    def encodeDelimited(message: IStatus): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.encodeDelimited")
    @js.native
    def encodeDelimited(message: IStatus, writer: Writer): Writer = js.native
    
    /**
      * Creates a Status message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Status
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): Status = js.native
    
    /**
      * Creates a plain object from a Status message. Also converts values to other types if specified.
      * @param message Status
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.toObject")
    @js.native
    def toObject(message: Status): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.toObject")
    @js.native
    def toObject(message: Status, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Status message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.rpc.Status.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Properties of a Status. */
  @js.native
  trait IStatus extends StObject {
    
    /** Status code */
    var code: js.UndefOr[Double | Null] = js.native
    
    /** Status details */
    var details: js.UndefOr[js.Array[IAny] | Null] = js.native
    
    /** Status message */
    var message: js.UndefOr[String | Null] = js.native
  }
  object IStatus {
    
    @scala.inline
    def apply(): IStatus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStatus]
    }
    
    @scala.inline
    implicit class IStatusMutableBuilder[Self <: IStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeNull: Self = StObject.set(x, "code", null)
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDetails(value: js.Array[IAny]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsNull: Self = StObject.set(x, "details", null)
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setDetailsVarargs(value: IAny*): Self = StObject.set(x, "details", js.Array(value :_*))
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageNull: Self = StObject.set(x, "message", null)
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
