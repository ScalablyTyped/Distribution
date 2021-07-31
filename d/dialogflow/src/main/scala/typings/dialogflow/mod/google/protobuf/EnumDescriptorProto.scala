package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.protobuf.EnumDescriptorProto.IEnumReservedRange
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumDescriptorProto. */
@JSImport("dialogflow/protos/protos", "google.protobuf.EnumDescriptorProto")
@js.native
/**
  * Constructs a new EnumDescriptorProto.
  * @param [properties] Properties to set
  */
class EnumDescriptorProto ()
  extends StObject
     with IEnumDescriptorProto {
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
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.EnumDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an EnumReservedRange. */
  @JSImport("dialogflow/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange")
  @js.native
  /**
    * Constructs a new EnumReservedRange.
    * @param [properties] Properties to set
    */
  class EnumReservedRange ()
    extends StObject
       with IEnumReservedRange {
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
    
    @JSImport("dialogflow/protos/protos", "google.protobuf.EnumDescriptorProto.EnumReservedRange")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new EnumReservedRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns EnumReservedRange instance
      */
    /* static member */
    @scala.inline
    def create(): EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EnumReservedRange]
    @scala.inline
    def create(properties: IEnumReservedRange): EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[EnumReservedRange]
    
    /**
      * Decodes an EnumReservedRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns EnumReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumReservedRange]
    @scala.inline
    def decode(reader: Reader, length: Double): EnumReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EnumReservedRange]
    @scala.inline
    def decode(reader: Uint8Array): EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumReservedRange]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): EnumReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EnumReservedRange]
    
    /**
      * Decodes an EnumReservedRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns EnumReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumReservedRange]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumReservedRange]
    
    /**
      * Encodes the specified EnumReservedRange message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
      * @param message EnumReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IEnumReservedRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IEnumReservedRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified EnumReservedRange message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
      * @param message EnumReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IEnumReservedRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IEnumReservedRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an EnumReservedRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns EnumReservedRange
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): EnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EnumReservedRange]
    
    /**
      * Creates a plain object from an EnumReservedRange message. Also converts values to other types if specified.
      * @param message EnumReservedRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: EnumReservedRange): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(message: EnumReservedRange, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies an EnumReservedRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new EnumDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumDescriptorProto instance
    */
  /* static member */
  @scala.inline
  def create(): EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EnumDescriptorProto]
  @scala.inline
  def create(properties: IEnumDescriptorProto): EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProto]
  
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProto]
  @scala.inline
  def decode(reader: Reader, length: Double): EnumDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EnumDescriptorProto]
  @scala.inline
  def decode(reader: Uint8Array): EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProto]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): EnumDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EnumDescriptorProto]
  
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProto]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProto]
  
  /**
    * Encodes the specified EnumDescriptorProto message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IEnumDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IEnumDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EnumDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IEnumDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IEnumDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EnumDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumDescriptorProto
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProto]
  
  /**
    * Creates a plain object from an EnumDescriptorProto message. Also converts values to other types if specified.
    * @param message EnumDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: EnumDescriptorProto): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: EnumDescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies an EnumDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of an EnumReservedRange. */
  trait IEnumReservedRange extends StObject {
    
    /** EnumReservedRange end */
    var end: js.UndefOr[Double | Null] = js.undefined
    
    /** EnumReservedRange start */
    var start: js.UndefOr[Double | Null] = js.undefined
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
