package typings.googleGax.mod.operationsProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.IEnumReservedRange
import typings.googleGax.operationsMod.google.protobuf.IEnumDescriptorProto
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumDescriptorProto. */
@JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto")
@js.native
/**
  * Constructs a new EnumDescriptorProto.
  * @param [properties] Properties to set
  */
class EnumDescriptorProto ()
  extends typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto {
  def this(properties: IEnumDescriptorProto) = this()
}
object EnumDescriptorProto {
  
  /** Represents an EnumReservedRange. */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange")
  @js.native
  /**
    * Constructs a new EnumReservedRange.
    * @param [properties] Properties to set
    */
  class EnumReservedRange ()
    extends typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange {
    def this(properties: IEnumReservedRange) = this()
  }
  object EnumReservedRange {
    
    /**
      * Creates a new EnumReservedRange instance using the specified properties.
      * @param [properties] Properties to set
      * @returns EnumReservedRange instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.create")
    @js.native
    def create(properties: IEnumReservedRange): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    
    /**
      * Decodes an EnumReservedRange message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns EnumReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    
    /**
      * Decodes an EnumReservedRange message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns EnumReservedRange
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    
    /**
      * Encodes the specified EnumReservedRange message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
      * @param message EnumReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.encode")
    @js.native
    def encode(message: IEnumReservedRange): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.encode")
    @js.native
    def encode(message: IEnumReservedRange, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified EnumReservedRange message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.EnumReservedRange.verify|verify} messages.
      * @param message EnumReservedRange message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.encodeDelimited")
    @js.native
    def encodeDelimited(message: IEnumReservedRange): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.encodeDelimited")
    @js.native
    def encodeDelimited(message: IEnumReservedRange, writer: Writer): Writer = js.native
    
    /**
      * Creates an EnumReservedRange message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns EnumReservedRange
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange = js.native
    
    /**
      * Creates a plain object from an EnumReservedRange message. Also converts values to other types if specified.
      * @param message EnumReservedRange
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.toObject")
    @js.native
    def toObject(
      message: typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto.EnumReservedRange,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an EnumReservedRange message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.EnumReservedRange.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new EnumDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumDescriptorProto instance
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.create")
  @js.native
  def create(): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.create")
  @js.native
  def create(properties: IEnumDescriptorProto): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto = js.native
  
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.decode")
  @js.native
  def decode(reader: Reader): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto = js.native
  
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto = js.native
  
  /**
    * Encodes the specified EnumDescriptorProto message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.encode")
  @js.native
  def encode(message: IEnumDescriptorProto): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.encode")
  @js.native
  def encode(message: IEnumDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified EnumDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnumDescriptorProto): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnumDescriptorProto, writer: Writer): Writer = js.native
  
  /**
    * Creates an EnumDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumDescriptorProto
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto = js.native
  
  /**
    * Creates a plain object from an EnumDescriptorProto message. Also converts values to other types if specified.
    * @param message EnumDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.toObject")
  @js.native
  def toObject(message: typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.toObject")
  @js.native
  def toObject(
    message: typings.googleGax.operationsMod.google.protobuf.EnumDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an EnumDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.EnumDescriptorProto.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
