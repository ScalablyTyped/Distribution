package typings.googleGax.mod.LocationProtos.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.locationsMod.google.cloud.location.IGetLocationRequest
import typings.googleGax.locationsMod.google.cloud.location.IListLocationsRequest
import typings.googleGax.locationsMod.google.cloud.location.IListLocationsResponse
import typings.googleGax.locationsMod.google.cloud.location.ILocation
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace cloud. */
object cloud {
  
  /** Namespace location. */
  object location {
    
    /** Represents a GetLocationRequest. */
    @JSImport("google-gax", "LocationProtos.google.cloud.location.GetLocationRequest")
    @js.native
    /**
      * Constructs a new GetLocationRequest.
      * @param [properties] Properties to set
      */
    open class GetLocationRequest ()
      extends typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest {
      def this(properties: IGetLocationRequest) = this()
    }
    object GetLocationRequest {
      
      @JSImport("google-gax", "LocationProtos.google.cloud.location.GetLocationRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new GetLocationRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns GetLocationRequest instance
        */
      /* static member */
      inline def create(): typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest]
      inline def create(properties: IGetLocationRequest): typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest]
      /**
        * Decodes a GetLocationRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns GetLocationRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest]
      inline def decode(reader: Reader, length: Double): typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest]
      /**
        * Decodes a GetLocationRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns GetLocationRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest]
      
      /**
        * Encodes the specified GetLocationRequest message. Does not implicitly {@link google.cloud.location.GetLocationRequest.verify|verify} messages.
        * @param message GetLocationRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IGetLocationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IGetLocationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified GetLocationRequest message, length delimited. Does not implicitly {@link google.cloud.location.GetLocationRequest.verify|verify} messages.
        * @param message GetLocationRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IGetLocationRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IGetLocationRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a GetLocationRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns GetLocationRequest
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest]
      
      /**
        * Creates a plain object from a GetLocationRequest message. Also converts values to other types if specified.
        * @param message GetLocationRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleGax.locationsMod.google.cloud.location.GetLocationRequest,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a GetLocationRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ListLocationsRequest. */
    @JSImport("google-gax", "LocationProtos.google.cloud.location.ListLocationsRequest")
    @js.native
    /**
      * Constructs a new ListLocationsRequest.
      * @param [properties] Properties to set
      */
    open class ListLocationsRequest ()
      extends typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest {
      def this(properties: IListLocationsRequest) = this()
    }
    object ListLocationsRequest {
      
      @JSImport("google-gax", "LocationProtos.google.cloud.location.ListLocationsRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ListLocationsRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ListLocationsRequest instance
        */
      /* static member */
      inline def create(): typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest]
      inline def create(properties: IListLocationsRequest): typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest]
      /**
        * Decodes a ListLocationsRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ListLocationsRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest]
      inline def decode(reader: Reader, length: Double): typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest]
      /**
        * Decodes a ListLocationsRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ListLocationsRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest]
      
      /**
        * Encodes the specified ListLocationsRequest message. Does not implicitly {@link google.cloud.location.ListLocationsRequest.verify|verify} messages.
        * @param message ListLocationsRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IListLocationsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IListLocationsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ListLocationsRequest message, length delimited. Does not implicitly {@link google.cloud.location.ListLocationsRequest.verify|verify} messages.
        * @param message ListLocationsRequest message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IListLocationsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IListLocationsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ListLocationsRequest message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ListLocationsRequest
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest]
      
      /**
        * Creates a plain object from a ListLocationsRequest message. Also converts values to other types if specified.
        * @param message ListLocationsRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleGax.locationsMod.google.cloud.location.ListLocationsRequest,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ListLocationsRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ListLocationsResponse. */
    @JSImport("google-gax", "LocationProtos.google.cloud.location.ListLocationsResponse")
    @js.native
    /**
      * Constructs a new ListLocationsResponse.
      * @param [properties] Properties to set
      */
    open class ListLocationsResponse ()
      extends typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse {
      def this(properties: IListLocationsResponse) = this()
    }
    object ListLocationsResponse {
      
      @JSImport("google-gax", "LocationProtos.google.cloud.location.ListLocationsResponse")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ListLocationsResponse instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ListLocationsResponse instance
        */
      /* static member */
      inline def create(): typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse]
      inline def create(properties: IListLocationsResponse): typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse]
      /**
        * Decodes a ListLocationsResponse message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ListLocationsResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse]
      inline def decode(reader: Reader, length: Double): typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse]
      /**
        * Decodes a ListLocationsResponse message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ListLocationsResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse]
      
      /**
        * Encodes the specified ListLocationsResponse message. Does not implicitly {@link google.cloud.location.ListLocationsResponse.verify|verify} messages.
        * @param message ListLocationsResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IListLocationsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IListLocationsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ListLocationsResponse message, length delimited. Does not implicitly {@link google.cloud.location.ListLocationsResponse.verify|verify} messages.
        * @param message ListLocationsResponse message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IListLocationsResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IListLocationsResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ListLocationsResponse message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ListLocationsResponse
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse]
      
      /**
        * Creates a plain object from a ListLocationsResponse message. Also converts values to other types if specified.
        * @param message ListLocationsResponse
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleGax.locationsMod.google.cloud.location.ListLocationsResponse,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ListLocationsResponse message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Location. */
    @JSImport("google-gax", "LocationProtos.google.cloud.location.Location")
    @js.native
    /**
      * Constructs a new Location.
      * @param [properties] Properties to set
      */
    open class Location ()
      extends typings.googleGax.locationsMod.google.cloud.location.Location {
      def this(properties: ILocation) = this()
    }
    object Location {
      
      @JSImport("google-gax", "LocationProtos.google.cloud.location.Location")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Location instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Location instance
        */
      /* static member */
      inline def create(): typings.googleGax.locationsMod.google.cloud.location.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Location]
      inline def create(properties: ILocation): typings.googleGax.locationsMod.google.cloud.location.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Location]
      
      inline def decode(reader: js.typedarray.Uint8Array): typings.googleGax.locationsMod.google.cloud.location.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Location]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): typings.googleGax.locationsMod.google.cloud.location.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Location]
      /**
        * Decodes a Location message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Location
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.googleGax.locationsMod.google.cloud.location.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Location]
      inline def decode(reader: Reader, length: Double): typings.googleGax.locationsMod.google.cloud.location.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Location]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): typings.googleGax.locationsMod.google.cloud.location.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Location]
      /**
        * Decodes a Location message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Location
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.googleGax.locationsMod.google.cloud.location.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Location]
      
      /**
        * Encodes the specified Location message. Does not implicitly {@link google.cloud.location.Location.verify|verify} messages.
        * @param message Location message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ILocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ILocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Location message, length delimited. Does not implicitly {@link google.cloud.location.Location.verify|verify} messages.
        * @param message Location message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ILocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ILocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Location message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Location
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[Any]): typings.googleGax.locationsMod.google.cloud.location.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Location]
      
      /**
        * Creates a plain object from a Location message. Also converts values to other types if specified.
        * @param message Location
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.googleGax.locationsMod.google.cloud.location.Location): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(
        message: typings.googleGax.locationsMod.google.cloud.location.Location,
        options: IConversionOptions
      ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Location message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Locations */
    @JSImport("google-gax", "LocationProtos.google.cloud.location.Locations")
    @js.native
    open class Locations protected ()
      extends typings.googleGax.locationsMod.google.cloud.location.Locations {
      /**
        * Constructs a new Locations service.
        * @param rpcImpl RPC implementation
        * @param [requestDelimited=false] Whether requests are length-delimited
        * @param [responseDelimited=false] Whether responses are length-delimited
        */
      def this(rpcImpl: RPCImpl) = this()
      def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
      def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
      def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
    }
    object Locations {
      
      @JSImport("google-gax", "LocationProtos.google.cloud.location.Locations")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates new Locations service using the specified rpc implementation.
        * @param rpcImpl RPC implementation
        * @param [requestDelimited=false] Whether requests are length-delimited
        * @param [responseDelimited=false] Whether responses are length-delimited
        * @returns RPC service. Useful where requests and/or responses are streamed.
        */
      /* static member */
      inline def create(rpcImpl: RPCImpl): typings.googleGax.locationsMod.google.cloud.location.Locations = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Locations]
      inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): typings.googleGax.locationsMod.google.cloud.location.Locations = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Locations]
      inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): typings.googleGax.locationsMod.google.cloud.location.Locations = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Locations]
      inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): typings.googleGax.locationsMod.google.cloud.location.Locations = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[typings.googleGax.locationsMod.google.cloud.location.Locations]
    }
  }
}
