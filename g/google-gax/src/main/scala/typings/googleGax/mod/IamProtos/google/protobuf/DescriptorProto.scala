package typings.googleGax.mod.IamProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.IExtensionRange
import typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.IReservedRange
import typings.googleGax.iamServiceMod.google.protobuf.IDescriptorProto
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DescriptorProto. */
@JSImport("google-gax", "IamProtos.google.protobuf.DescriptorProto")
@js.native
/**
  * Constructs a new DescriptorProto.
  * @param [properties] Properties to set
  */
class DescriptorProto ()
  extends typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto {
  def this(properties: IDescriptorProto) = this()
}
object DescriptorProto {
  
  @JSImport("google-gax", "IamProtos.google.protobuf.DescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents an ExtensionRange. */
  @JSImport("google-gax", "IamProtos.google.protobuf.DescriptorProto.ExtensionRange")
  @js.native
  /**
    * Constructs a new ExtensionRange.
    * @param [properties] Properties to set
    */
  class ExtensionRange ()
    extends typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange {
    def this(properties: IExtensionRange) = this()
  }
  object ExtensionRange {
    
    @JSImport("google-gax", "IamProtos.google.protobuf.DescriptorProto.ExtensionRange")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ExtensionRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ExtensionRange instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange]
    @scala.inline
    def create(properties: IExtensionRange): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange]
    
    /**
      * Decodes an ExtensionRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ExtensionRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange]
    
    /**
      * Decodes an ExtensionRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ExtensionRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange]
    
    /**
      * Encodes the specified ExtensionRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
      * @param message ExtensionRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IExtensionRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IExtensionRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ExtensionRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ExtensionRange.verify|verify} messages.
      * @param message ExtensionRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IExtensionRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IExtensionRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an ExtensionRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ExtensionRange
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange]
    
    /**
      * Creates a plain object from an ExtensionRange message. Also converts values to other types if specified.
      * @param message ExtensionRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ExtensionRange,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies an ExtensionRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a ReservedRange. */
  @JSImport("google-gax", "IamProtos.google.protobuf.DescriptorProto.ReservedRange")
  @js.native
  /**
    * Constructs a new ReservedRange.
    * @param [properties] Properties to set
    */
  class ReservedRange ()
    extends typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange {
    def this(properties: IReservedRange) = this()
  }
  object ReservedRange {
    
    @JSImport("google-gax", "IamProtos.google.protobuf.DescriptorProto.ReservedRange")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ReservedRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns ReservedRange instance
      */
    /* static member */
    @scala.inline
    def create(): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange]
    @scala.inline
    def create(properties: IReservedRange): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange]
    
    /**
      * Decodes a ReservedRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns ReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decode(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange]
    @scala.inline
    def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange]
    @scala.inline
    def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange]
    @scala.inline
    def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange]
    
    /**
      * Decodes a ReservedRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns ReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @scala.inline
    def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange]
    @scala.inline
    def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange]
    
    /**
      * Encodes the specified ReservedRange message. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
      * @param message ReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encode(message: IReservedRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encode(message: IReservedRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified ReservedRange message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.ReservedRange.verify|verify} messages.
      * @param message ReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @scala.inline
    def encodeDelimited(message: IReservedRange): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    @scala.inline
    def encodeDelimited(message: IReservedRange, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a ReservedRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns ReservedRange
      */
    /* static member */
    @scala.inline
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange]
    
    /**
      * Creates a plain object from a ReservedRange message. Also converts values to other types if specified.
      * @param message ReservedRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @scala.inline
    def toObject(message: typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def toObject(
      message: typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto.ReservedRange,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a ReservedRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @scala.inline
    def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new DescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DescriptorProto instance
    */
  /* static member */
  @scala.inline
  def create(): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto]
  @scala.inline
  def create(properties: IDescriptorProto): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto]
  
  /**
    * Decodes a DescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decode(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto]
  @scala.inline
  def decode(reader: Reader, length: Double): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto]
  @scala.inline
  def decode(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto]
  
  /**
    * Decodes a DescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @scala.inline
  def decodeDelimited(reader: Reader): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto]
  
  /**
    * Encodes the specified DescriptorProto message. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
    * @param message DescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encode(message: IDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.DescriptorProto.verify|verify} messages.
    * @param message DescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @scala.inline
  def encodeDelimited(message: IDescriptorProto): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IDescriptorProto, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DescriptorProto
    */
  /* static member */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto]
  
  /**
    * Creates a plain object from a DescriptorProto message. Also converts values to other types if specified.
    * @param message DescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @scala.inline
  def toObject(message: typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(
    message: typings.googleGax.iamServiceMod.google.protobuf.DescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a DescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
