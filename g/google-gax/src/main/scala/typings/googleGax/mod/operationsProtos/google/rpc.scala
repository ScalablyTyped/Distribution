package typings.googleGax.mod.operationsProtos.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.rpc.IStatus
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
  @JSImport("google-gax", "operationsProtos.google.rpc.Status")
  @js.native
  /**
    * Constructs a new Status.
    * @param [properties] Properties to set
    */
  class Status ()
    extends typings.googleGax.operationsMod.google.rpc.Status {
    def this(properties: IStatus) = this()
  }
  object Status {
    
    /**
      * Creates a new Status instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Status instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.rpc.Status = js.native
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.create")
    @js.native
    def create(properties: IStatus): typings.googleGax.operationsMod.google.rpc.Status = js.native
    
    /**
      * Decodes a Status message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Status
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.rpc.Status = js.native
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.rpc.Status = js.native
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.rpc.Status = js.native
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.rpc.Status = js.native
    
    /**
      * Decodes a Status message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Status
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.rpc.Status = js.native
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.rpc.Status = js.native
    
    /**
      * Encodes the specified Status message. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
      * @param message Status message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.encode")
    @js.native
    def encode(message: IStatus): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.encode")
    @js.native
    def encode(message: IStatus, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Status message, length delimited. Does not implicitly {@link google.rpc.Status.verify|verify} messages.
      * @param message Status message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.encodeDelimited")
    @js.native
    def encodeDelimited(message: IStatus): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.encodeDelimited")
    @js.native
    def encodeDelimited(message: IStatus, writer: Writer): Writer = js.native
    
    /**
      * Creates a Status message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Status
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.rpc.Status = js.native
    
    /**
      * Creates a plain object from a Status message. Also converts values to other types if specified.
      * @param message Status
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.rpc.Status): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.rpc.Status, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Status message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.rpc.Status.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
