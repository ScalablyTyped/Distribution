package typings.googleGax.mod.operationsProtos.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.operationsMod.google.api.ICustomHttpPattern
import typings.googleGax.operationsMod.google.api.IHttp
import typings.googleGax.operationsMod.google.api.IHttpRule
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace api. */
object api {
  
  /** Represents a CustomHttpPattern. */
  @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern")
  @js.native
  /**
    * Constructs a new CustomHttpPattern.
    * @param [properties] Properties to set
    */
  class CustomHttpPattern ()
    extends typings.googleGax.operationsMod.google.api.CustomHttpPattern {
    def this(properties: ICustomHttpPattern) = this()
  }
  object CustomHttpPattern {
    
    /**
      * Creates a new CustomHttpPattern instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CustomHttpPattern instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.api.CustomHttpPattern = js.native
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.create")
    @js.native
    def create(properties: ICustomHttpPattern): typings.googleGax.operationsMod.google.api.CustomHttpPattern = js.native
    
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.api.CustomHttpPattern = js.native
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.api.CustomHttpPattern = js.native
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.api.CustomHttpPattern = js.native
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.api.CustomHttpPattern = js.native
    
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.api.CustomHttpPattern = js.native
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.api.CustomHttpPattern = js.native
    
    /**
      * Encodes the specified CustomHttpPattern message. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.encode")
    @js.native
    def encode(message: ICustomHttpPattern): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.encode")
    @js.native
    def encode(message: ICustomHttpPattern, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified CustomHttpPattern message, length delimited. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICustomHttpPattern): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICustomHttpPattern, writer: Writer): Writer = js.native
    
    /**
      * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CustomHttpPattern
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.api.CustomHttpPattern = js.native
    
    /**
      * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
      * @param message CustomHttpPattern
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.api.CustomHttpPattern): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.api.CustomHttpPattern, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a CustomHttpPattern message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.CustomHttpPattern.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a Http. */
  @JSImport("google-gax", "operationsProtos.google.api.Http")
  @js.native
  /**
    * Constructs a new Http.
    * @param [properties] Properties to set
    */
  class Http ()
    extends typings.googleGax.operationsMod.google.api.Http {
    def this(properties: IHttp) = this()
  }
  object Http {
    
    /**
      * Creates a new Http instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Http instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.Http.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.api.Http = js.native
    @JSImport("google-gax", "operationsProtos.google.api.Http.create")
    @js.native
    def create(properties: IHttp): typings.googleGax.operationsMod.google.api.Http = js.native
    
    /**
      * Decodes a Http message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.Http.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.api.Http = js.native
    @JSImport("google-gax", "operationsProtos.google.api.Http.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.api.Http = js.native
    @JSImport("google-gax", "operationsProtos.google.api.Http.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.api.Http = js.native
    @JSImport("google-gax", "operationsProtos.google.api.Http.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.api.Http = js.native
    
    /**
      * Decodes a Http message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.Http.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.api.Http = js.native
    @JSImport("google-gax", "operationsProtos.google.api.Http.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.api.Http = js.native
    
    /**
      * Encodes the specified Http message. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.Http.encode")
    @js.native
    def encode(message: IHttp): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.api.Http.encode")
    @js.native
    def encode(message: IHttp, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Http message, length delimited. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.Http.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttp): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.api.Http.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttp, writer: Writer): Writer = js.native
    
    /**
      * Creates a Http message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Http
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.Http.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.api.Http = js.native
    
    /**
      * Creates a plain object from a Http message. Also converts values to other types if specified.
      * @param message Http
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.Http.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.api.Http): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.api.Http.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.api.Http, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Http message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.Http.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a HttpRule. */
  @JSImport("google-gax", "operationsProtos.google.api.HttpRule")
  @js.native
  /**
    * Constructs a new HttpRule.
    * @param [properties] Properties to set
    */
  class HttpRule ()
    extends typings.googleGax.operationsMod.google.api.HttpRule {
    def this(properties: IHttpRule) = this()
  }
  object HttpRule {
    
    /**
      * Creates a new HttpRule instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HttpRule instance
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.create")
    @js.native
    def create(): typings.googleGax.operationsMod.google.api.HttpRule = js.native
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.create")
    @js.native
    def create(properties: IHttpRule): typings.googleGax.operationsMod.google.api.HttpRule = js.native
    
    /**
      * Decodes a HttpRule message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.decode")
    @js.native
    def decode(reader: Reader): typings.googleGax.operationsMod.google.api.HttpRule = js.native
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.googleGax.operationsMod.google.api.HttpRule = js.native
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.decode")
    @js.native
    def decode(reader: Uint8Array): typings.googleGax.operationsMod.google.api.HttpRule = js.native
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.googleGax.operationsMod.google.api.HttpRule = js.native
    
    /**
      * Decodes a HttpRule message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.googleGax.operationsMod.google.api.HttpRule = js.native
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.googleGax.operationsMod.google.api.HttpRule = js.native
    
    /**
      * Encodes the specified HttpRule message. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.encode")
    @js.native
    def encode(message: IHttpRule): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.encode")
    @js.native
    def encode(message: IHttpRule, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified HttpRule message, length delimited. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttpRule): Writer = js.native
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttpRule, writer: Writer): Writer = js.native
    
    /**
      * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HttpRule
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.googleGax.operationsMod.google.api.HttpRule = js.native
    
    /**
      * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
      * @param message HttpRule
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.api.HttpRule): StringDictionary[js.Any] = js.native
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.toObject")
    @js.native
    def toObject(message: typings.googleGax.operationsMod.google.api.HttpRule, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a HttpRule message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("google-gax", "operationsProtos.google.api.HttpRule.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
