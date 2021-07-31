package typings.googleGax.operationsMod.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.IAny
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace rpc. */
object rpc {
  
  /** Represents a Status. */
  @JSImport("google-gax/build/protos/operations", "google.rpc.Status")
  @js.native
  /**
    * Constructs a new Status.
    * @param [properties] Properties to set
    */
  class Status ()
    extends StObject
       with IStatus {
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
    
    @JSImport("google-gax/build/protos/operations", "google.rpc.Status")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Status instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Status instance
      */
    /* static member */
    @scala.inline
    def create(): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Status]
    @scala.inline
    def create(properties: IStatus): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Status]
    
    /**
      * Decodes a Status message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Status
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Status]
    @scala.inline
    def decode(reader: Reader, length: Double): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Status]
    @scala.inline
    def decode(reader: Uint8Array): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Status]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): Status = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Status]
    
    /**
      * Decodes a Status message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Status
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Status]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Status]
    
    /**
      * Encodes the specified Status message. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
      * @param message Status message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IStatus): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IStatus, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Status message, length delimited. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
      * @param message Status message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IStatus): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IStatus, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Status message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Status
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Status]
    
    /**
      * Creates a plain object from a Status message. Also converts values to other types if specified.
      * @param message Status
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: Status): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: Status, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Status message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Properties of a Status. */
  trait IStatus extends StObject {
    
    /** Status code */
    var code: js.UndefOr[Double | Null] = js.undefined
    
    /** Status details */
    var details: js.UndefOr[js.Array[IAny] | Null] = js.undefined
    
    /** Status message */
    var message: js.UndefOr[String | Null] = js.undefined
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
