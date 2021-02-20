package typings.googleGax.operationsMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.DescriptorProto.IExtensionRange
import typings.googleGax.operationsMod.google.protobuf.DescriptorProto.IReservedRange
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DescriptorProto. */
@JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto")
@js.native
/**
  * Constructs a new DescriptorProto.
  * @param [properties] Properties to set
  */
class DescriptorProto () extends IDescriptorProto {
  def this(properties: IDescriptorProto) = this()
  
  /** DescriptorProto enumType. */
  @JSName("enumType")
  var enumType_DescriptorProto: js.Array[IEnumDescriptorProto] = js.native
  
  /** DescriptorProto extensionRange. */
  @JSName("extensionRange")
  var extensionRange_DescriptorProto: js.Array[IExtensionRange] = js.native
  
  /** DescriptorProto extension. */
  @JSName("extension")
  var extension_DescriptorProto: js.Array[IFieldDescriptorProto] = js.native
  
  /** DescriptorProto field. */
  @JSName("field")
  var field_DescriptorProto: js.Array[IFieldDescriptorProto] = js.native
  
  /** DescriptorProto name. */
  @JSName("name")
  var name_DescriptorProto: String = js.native
  
  /** DescriptorProto nestedType. */
  @JSName("nestedType")
  var nestedType_DescriptorProto: js.Array[IDescriptorProto] = js.native
  
  /** DescriptorProto oneofDecl. */
  @JSName("oneofDecl")
  var oneofDecl_DescriptorProto: js.Array[IOneofDescriptorProto] = js.native
  
  /** DescriptorProto reservedName. */
  @JSName("reservedName")
  var reservedName_DescriptorProto: js.Array[String] = js.native
  
  /** DescriptorProto reservedRange. */
  @JSName("reservedRange")
  var reservedRange_DescriptorProto: js.Array[IReservedRange] = js.native
  
  /**
    * Converts this DescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DescriptorProto {
  
  /** Represents an ExtensionRange. */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange")
  @js.native
  /**
    * Constructs a new ExtensionRange.
    * @param [properties] Properties to set
    */
  class ExtensionRange () extends IExtensionRange {
    def this(properties: IExtensionRange) = this()
    
    /** ExtensionRange end. */
    @JSName("end")
    var end_ExtensionRange: Double = js.native
    
    /** ExtensionRange start. */
    @JSName("start")
    var start_ExtensionRange: Double = js.native
    
    /**
      * Converts this ExtensionRange to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object ExtensionRange {
    
    /**
      * Creates a new ExtensionRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ExtensionRange instance
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.create")
    @js.native
    def create(): ExtensionRange = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.create")
    @js.native
    def create(properties: IExtensionRange): ExtensionRange = js.native
    
    /**
      * Decodes an ExtensionRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ExtensionRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.decode")
    @js.native
    def decode(reader: Reader): ExtensionRange = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.decode")
    @js.native
    def decode(reader: Reader, length: Double): ExtensionRange = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.decode")
    @js.native
    def decode(reader: Uint8Array): ExtensionRange = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): ExtensionRange = js.native
    
    /**
      * Decodes an ExtensionRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ExtensionRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): ExtensionRange = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): ExtensionRange = js.native
    
    /**
      * Encodes the specified ExtensionRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
      * @param message ExtensionRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.encode")
    @js.native
    def encode(message: IExtensionRange): Writer = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.encode")
    @js.native
    def encode(message: IExtensionRange, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ExtensionRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
      * @param message ExtensionRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.encodeDelimited")
    @js.native
    def encodeDelimited(message: IExtensionRange): Writer = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.encodeDelimited")
    @js.native
    def encodeDelimited(message: IExtensionRange, writer: Writer): Writer = js.native
    
    /**
      * Creates an ExtensionRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ExtensionRange
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): ExtensionRange = js.native
    
    /**
      * Creates a plain object from an ExtensionRange message. Also converts values to other types if specified.
      * @param message ExtensionRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.toObject")
    @js.native
    def toObject(message: ExtensionRange): StringDictionary[js.Any] = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.toObject")
    @js.native
    def toObject(message: ExtensionRange, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an ExtensionRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ExtensionRange.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a ReservedRange. */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange")
  @js.native
  /**
    * Constructs a new ReservedRange.
    * @param [properties] Properties to set
    */
  class ReservedRange () extends IReservedRange {
    def this(properties: IReservedRange) = this()
    
    /** ReservedRange end. */
    @JSName("end")
    var end_ReservedRange: Double = js.native
    
    /** ReservedRange start. */
    @JSName("start")
    var start_ReservedRange: Double = js.native
    
    /**
      * Converts this ReservedRange to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object ReservedRange {
    
    /**
      * Creates a new ReservedRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ReservedRange instance
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.create")
    @js.native
    def create(): ReservedRange = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.create")
    @js.native
    def create(properties: IReservedRange): ReservedRange = js.native
    
    /**
      * Decodes a ReservedRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.decode")
    @js.native
    def decode(reader: Reader): ReservedRange = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.decode")
    @js.native
    def decode(reader: Reader, length: Double): ReservedRange = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.decode")
    @js.native
    def decode(reader: Uint8Array): ReservedRange = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): ReservedRange = js.native
    
    /**
      * Decodes a ReservedRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): ReservedRange = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): ReservedRange = js.native
    
    /**
      * Encodes the specified ReservedRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
      * @param message ReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.encode")
    @js.native
    def encode(message: IReservedRange): Writer = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.encode")
    @js.native
    def encode(message: IReservedRange, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified ReservedRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
      * @param message ReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.encodeDelimited")
    @js.native
    def encodeDelimited(message: IReservedRange): Writer = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.encodeDelimited")
    @js.native
    def encodeDelimited(message: IReservedRange, writer: Writer): Writer = js.native
    
    /**
      * Creates a ReservedRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ReservedRange
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): ReservedRange = js.native
    
    /**
      * Creates a plain object from a ReservedRange message. Also converts values to other types if specified.
      * @param message ReservedRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.toObject")
    @js.native
    def toObject(message: ReservedRange): StringDictionary[js.Any] = js.native
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.toObject")
    @js.native
    def toObject(message: ReservedRange, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a ReservedRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.ReservedRange.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new DescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DescriptorProto instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.create")
  @js.native
  def create(): DescriptorProto = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.create")
  @js.native
  def create(properties: IDescriptorProto): DescriptorProto = js.native
  
  /**
    * Decodes a DescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.decode")
  @js.native
  def decode(reader: Reader): DescriptorProto = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.decode")
  @js.native
  def decode(reader: Reader, length: Double): DescriptorProto = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array): DescriptorProto = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): DescriptorProto = js.native
  
  /**
    * Decodes a DescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DescriptorProto = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): DescriptorProto = js.native
  
  /**
    * Encodes the specified DescriptorProto message. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
    * @param message DescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.encode")
  @js.native
  def encode(message: IDescriptorProto): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.encode")
  @js.native
  def encode(message: IDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
    * @param message DescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDescriptorProto): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates a DescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DescriptorProto
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DescriptorProto = js.native
  
  /**
    * Creates a plain object from a DescriptorProto message. Also converts values to other types if specified.
    * @param message DescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.toObject")
  @js.native
  def toObject(message: DescriptorProto): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.toObject")
  @js.native
  def toObject(message: DescriptorProto, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.protobuf.DescriptorProto.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of an ExtensionRange. */
  @js.native
  trait IExtensionRange extends StObject {
    
    /** ExtensionRange end */
    var end: js.UndefOr[Double | Null] = js.native
    
    /** ExtensionRange options */
    var options: js.UndefOr[IExtensionRangeOptions | Null] = js.native
    
    /** ExtensionRange start */
    var start: js.UndefOr[Double | Null] = js.native
  }
  object IExtensionRange {
    
    @scala.inline
    def apply(): IExtensionRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IExtensionRange]
    }
    
    @scala.inline
    implicit class IExtensionRangeMutableBuilder[Self <: IExtensionRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndNull: Self = StObject.set(x, "end", null)
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setOptions(value: IExtensionRangeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsNull: Self = StObject.set(x, "options", null)
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartNull: Self = StObject.set(x, "start", null)
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  /** Properties of a ReservedRange. */
  @js.native
  trait IReservedRange extends StObject {
    
    /** ReservedRange end */
    var end: js.UndefOr[Double | Null] = js.native
    
    /** ReservedRange start */
    var start: js.UndefOr[Double | Null] = js.native
  }
  object IReservedRange {
    
    @scala.inline
    def apply(): IReservedRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IReservedRange]
    }
    
    @scala.inline
    implicit class IReservedRangeMutableBuilder[Self <: IReservedRange] (val x: Self) extends AnyVal {
      
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
