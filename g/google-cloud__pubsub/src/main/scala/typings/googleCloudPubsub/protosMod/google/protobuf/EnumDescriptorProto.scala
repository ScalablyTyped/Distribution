package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.protosMod.google.protobuf.EnumDescriptorProto.IEnumReservedRange
import typings.googleGax.mod.protobuf.Reader
import typings.googleGax.mod.protobuf.Writer
import typings.protobufjs.mod.IConversionOptions
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumDescriptorProto. */
@JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto")
@js.native
/**
  * Constructs a new EnumDescriptorProto.
  * @param [properties] Properties to set
  */
class EnumDescriptorProto () extends IEnumDescriptorProto {
  def this(properties: IEnumDescriptorProto) = this()
  
  /** EnumDescriptorProto name. */
  @JSName("name")
  var name_EnumDescriptorProto: String = js.native
  
  /** EnumDescriptorProto reservedName. */
  @JSName("reservedName")
  var reservedName_EnumDescriptorProto: js.Array[String] = js.native
  
  /** EnumDescriptorProto reservedRange. */
  @JSName("reservedRange")
  var reservedRange_EnumDescriptorProto: js.Array[IEnumReservedRange] = js.native
  
  /**
    * Converts this EnumDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** EnumDescriptorProto value. */
  @JSName("value")
  var value_EnumDescriptorProto: js.Array[IEnumValueDescriptorProto] = js.native
}
object EnumDescriptorProto {
  
  /** Represents an EnumReservedRange. */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange")
  @js.native
  /**
    * Constructs a new EnumReservedRange.
    * @param [properties] Properties to set
    */
  class EnumReservedRange () extends IEnumReservedRange {
    def this(properties: IEnumReservedRange) = this()
    
    /** EnumReservedRange end. */
    @JSName("end")
    var end_EnumReservedRange: Double = js.native
    
    /** EnumReservedRange start. */
    @JSName("start")
    var start_EnumReservedRange: Double = js.native
    
    /**
      * Converts this EnumReservedRange to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object EnumReservedRange {
    
    /**
      * Creates a new EnumReservedRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns EnumReservedRange instance
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.create")
    @js.native
    def create(): EnumReservedRange = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.create")
    @js.native
    def create(properties: IEnumReservedRange): EnumReservedRange = js.native
    
    /**
      * Decodes an EnumReservedRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns EnumReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.decode")
    @js.native
    def decode(reader: Reader): EnumReservedRange = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.decode")
    @js.native
    def decode(reader: Reader, length: Double): EnumReservedRange = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.decode")
    @js.native
    def decode(reader: Uint8Array): EnumReservedRange = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): EnumReservedRange = js.native
    
    /**
      * Decodes an EnumReservedRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns EnumReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): EnumReservedRange = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): EnumReservedRange = js.native
    
    /**
      * Encodes the specified EnumReservedRange message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
      * @param message EnumReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.encode")
    @js.native
    def encode(message: IEnumReservedRange): Writer = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.encode")
    @js.native
    def encode(message: IEnumReservedRange, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified EnumReservedRange message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
      * @param message EnumReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.encodeDelimited")
    @js.native
    def encodeDelimited(message: IEnumReservedRange): Writer = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.encodeDelimited")
    @js.native
    def encodeDelimited(message: IEnumReservedRange, writer: Writer): Writer = js.native
    
    /**
      * Creates an EnumReservedRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns EnumReservedRange
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): EnumReservedRange = js.native
    
    /**
      * Creates a plain object from an EnumReservedRange message. Also converts values to other types if specified.
      * @param message EnumReservedRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.toObject")
    @js.native
    def toObject(message: EnumReservedRange): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.toObject")
    @js.native
    def toObject(message: EnumReservedRange, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an EnumReservedRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new EnumDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumDescriptorProto instance
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.create")
  @js.native
  def create(): EnumDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.create")
  @js.native
  def create(properties: IEnumDescriptorProto): EnumDescriptorProto = js.native
  
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.decode")
  @js.native
  def decode(reader: Reader): EnumDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.decode")
  @js.native
  def decode(reader: Reader, length: Double): EnumDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array): EnumDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): EnumDescriptorProto = js.native
  
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): EnumDescriptorProto = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): EnumDescriptorProto = js.native
  
  /**
    * Encodes the specified EnumDescriptorProto message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.encode")
  @js.native
  def encode(message: IEnumDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.encode")
  @js.native
  def encode(message: IEnumDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EnumDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnumDescriptorProto): Writer = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnumDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates an EnumDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumDescriptorProto
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): EnumDescriptorProto = js.native
  
  /**
    * Creates a plain object from an EnumDescriptorProto message. Also converts values to other types if specified.
    * @param message EnumDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.toObject")
  @js.native
  def toObject(message: EnumDescriptorProto): StringDictionary[js.Any] = js.native
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.toObject")
  @js.native
  def toObject(message: EnumDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EnumDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("@google-cloud/pubsub/build/protos/protos", "google.protobuf.EnumDescriptorProto.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of an EnumReservedRange. */
  @js.native
  trait IEnumReservedRange extends StObject {
    
    /** EnumReservedRange end */
    var end: js.UndefOr[Double | Null] = js.native
    
    /** EnumReservedRange start */
    var start: js.UndefOr[Double | Null] = js.native
  }
  object IEnumReservedRange {
    
    @scala.inline
    def apply(): IEnumReservedRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEnumReservedRange]
    }
    
    @scala.inline
    implicit class IEnumReservedRangeMutableBuilder[Self <: IEnumReservedRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndNull: Self = StObject.set(x, "end", null)
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartNull: Self = StObject.set(x, "start", null)
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
