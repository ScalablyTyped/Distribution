package typings.googleGax.mod.operationsProtos.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.protobuf.IUninterpretedOption
import typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.INamePart
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UninterpretedOption. */
@JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption")
@js.native
/**
  * Constructs a new UninterpretedOption.
  * @param [properties] Properties to set
  */
class UninterpretedOption ()
  extends typings.googleGax.operationsMod.google.protobuf.UninterpretedOption {
  def this(properties: IUninterpretedOption) = this()
}
object UninterpretedOption {
  
  /** Represents a NamePart. */
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart")
  @js.native
  /**
    * Constructs a new NamePart.
    * @param [properties] Properties to set
    */
  class NamePart ()
    extends typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.NamePart {
    def this(properties: INamePart) = this()
  }
  object NamePart {
    
    /**
      * Creates a new NamePart instance using the specified properties.
      * @param [properties] Properties to set
      * @returns NamePart instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.NamePart = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.create")
    @js.native
    def create(properties: INamePart): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.NamePart = js.native
    
    /**
      * Decodes a NamePart message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns NamePart
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.NamePart = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.NamePart = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.NamePart = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.NamePart = js.native
    
    /**
      * Decodes a NamePart message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns NamePart
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.NamePart = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.NamePart = js.native
    
    /**
      * Encodes the specified NamePart message. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
      * @param message NamePart message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.encode")
    @js.native
    def encode(message: INamePart): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.encode")
    @js.native
    def encode(message: INamePart, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified NamePart message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.NamePart.verify|verify} messages.
      * @param message NamePart message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.encodeDelimited")
    @js.native
    def encodeDelimited(message: INamePart): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.encodeDelimited")
    @js.native
    def encodeDelimited(message: INamePart, writer: Writer): Writer = js.native
    
    /**
      * Creates a NamePart message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns NamePart
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.NamePart = js.native
    
    /**
      * Creates a plain object from a NamePart message. Also converts values to other types if specified.
      * @param message NamePart
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.NamePart): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.toObject")
    @js.native
    def toObject(
      message: typings.googleGax.operationsMod.google.protobuf.UninterpretedOption.NamePart,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a NamePart message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.NamePart.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new UninterpretedOption instance using the specified properties.
    * @param [properties] Properties to set
    * @returns UninterpretedOption instance
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.create")
  @js.native
  def create(): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.create")
  @js.native
  def create(properties: IUninterpretedOption): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption = js.native
  
  /**
    * Decodes an UninterpretedOption message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns UninterpretedOption
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.decode")
  @js.native
  def decode(reader: Reader): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.decode")
  @js.native
  def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption = js.native
  
  /**
    * Decodes an UninterpretedOption message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns UninterpretedOption
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption = js.native
  
  /**
    * Encodes the specified UninterpretedOption message. Does not implicitly {@link google.protobuf.UninterpretedOption.verify|verify} messages.
    * @param message UninterpretedOption message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.encode")
  @js.native
  def encode(message: IUninterpretedOption): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.encode")
  @js.native
  def encode(message: IUninterpretedOption, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified UninterpretedOption message, length delimited. Does not implicitly {@link google.protobuf.UninterpretedOption.verify|verify} messages.
    * @param message UninterpretedOption message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUninterpretedOption): Writer = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.encodeDelimited")
  @js.native
  def encodeDelimited(message: IUninterpretedOption, writer: Writer): Writer = js.native
  
  /**
    * Creates an UninterpretedOption message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UninterpretedOption
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.protobuf.UninterpretedOption = js.native
  
  /**
    * Creates a plain object from an UninterpretedOption message. Also converts values to other types if specified.
    * @param message UninterpretedOption
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.toObject")
  @js.native
  def toObject(message: typings.googleGax.operationsMod.google.protobuf.UninterpretedOption): StringDictionary[js.Any] = js.native
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.toObject")
  @js.native
  def toObject(
    message: typings.googleGax.operationsMod.google.protobuf.UninterpretedOption,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an UninterpretedOption message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax", "operationsProtos.google.protobuf.UninterpretedOption.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
