package typings.googleGax.locationsMod.google

import org.scalablytyped.runtime.StringDictionary
import typings.googleGax.locationsMod.google.cloud.location.Locations.GetLocationCallback
import typings.googleGax.locationsMod.google.cloud.location.Locations.ListLocationsCallback
import typings.googleGax.locationsMod.google.protobuf.IAny
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.protobufjs.mod.rpc.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace cloud. */
object cloud {
  
  /** Namespace location. */
  object location {
    
    /** Represents a GetLocationRequest. */
    @JSImport("google-gax/build/protos/locations", "google.cloud.location.GetLocationRequest")
    @js.native
    /**
      * Constructs a new GetLocationRequest.
      * @param [properties] Properties to set
      */
    open class GetLocationRequest ()
      extends StObject
         with IGetLocationRequest {
      def this(properties: IGetLocationRequest) = this()
      
      /** GetLocationRequest name. */
      @JSName("name")
      var name_GetLocationRequest: String = js.native
      
      /**
        * Converts this GetLocationRequest to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[Any] = js.native
    }
    object GetLocationRequest {
      
      @JSImport("google-gax/build/protos/locations", "google.cloud.location.GetLocationRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new GetLocationRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns GetLocationRequest instance
        */
      /* static member */
      inline def create(): GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GetLocationRequest]
      inline def create(properties: IGetLocationRequest): GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GetLocationRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetLocationRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): GetLocationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetLocationRequest]
      /**
        * Decodes a GetLocationRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns GetLocationRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GetLocationRequest]
      inline def decode(reader: Reader, length: Double): GetLocationRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GetLocationRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetLocationRequest]
      /**
        * Decodes a GetLocationRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns GetLocationRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GetLocationRequest]
      
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
      inline def fromObject(`object`: StringDictionary[Any]): GetLocationRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GetLocationRequest]
      
      /**
        * Creates a plain object from a GetLocationRequest message. Also converts values to other types if specified.
        * @param message GetLocationRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: GetLocationRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: GetLocationRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a GetLocationRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ListLocationsRequest. */
    @JSImport("google-gax/build/protos/locations", "google.cloud.location.ListLocationsRequest")
    @js.native
    /**
      * Constructs a new ListLocationsRequest.
      * @param [properties] Properties to set
      */
    open class ListLocationsRequest ()
      extends StObject
         with IListLocationsRequest {
      def this(properties: IListLocationsRequest) = this()
      
      /** ListLocationsRequest filter. */
      @JSName("filter")
      var filter_ListLocationsRequest: String = js.native
      
      /** ListLocationsRequest name. */
      @JSName("name")
      var name_ListLocationsRequest: String = js.native
      
      /** ListLocationsRequest pageSize. */
      @JSName("pageSize")
      var pageSize_ListLocationsRequest: Double = js.native
      
      /** ListLocationsRequest pageToken. */
      @JSName("pageToken")
      var pageToken_ListLocationsRequest: String = js.native
      
      /**
        * Converts this ListLocationsRequest to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[Any] = js.native
    }
    object ListLocationsRequest {
      
      @JSImport("google-gax/build/protos/locations", "google.cloud.location.ListLocationsRequest")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ListLocationsRequest instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ListLocationsRequest instance
        */
      /* static member */
      inline def create(): ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListLocationsRequest]
      inline def create(properties: IListLocationsRequest): ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListLocationsRequest]
      
      inline def decode(reader: js.typedarray.Uint8Array): ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListLocationsRequest]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListLocationsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListLocationsRequest]
      /**
        * Decodes a ListLocationsRequest message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ListLocationsRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListLocationsRequest]
      inline def decode(reader: Reader, length: Double): ListLocationsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListLocationsRequest]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListLocationsRequest]
      /**
        * Decodes a ListLocationsRequest message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ListLocationsRequest
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListLocationsRequest]
      
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
      inline def fromObject(`object`: StringDictionary[Any]): ListLocationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListLocationsRequest]
      
      /**
        * Creates a plain object from a ListLocationsRequest message. Also converts values to other types if specified.
        * @param message ListLocationsRequest
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: ListLocationsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: ListLocationsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ListLocationsRequest message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ListLocationsResponse. */
    @JSImport("google-gax/build/protos/locations", "google.cloud.location.ListLocationsResponse")
    @js.native
    /**
      * Constructs a new ListLocationsResponse.
      * @param [properties] Properties to set
      */
    open class ListLocationsResponse ()
      extends StObject
         with IListLocationsResponse {
      def this(properties: IListLocationsResponse) = this()
      
      /** ListLocationsResponse locations. */
      @JSName("locations")
      var locations_ListLocationsResponse: js.Array[ILocation] = js.native
      
      /** ListLocationsResponse nextPageToken. */
      @JSName("nextPageToken")
      var nextPageToken_ListLocationsResponse: String = js.native
      
      /**
        * Converts this ListLocationsResponse to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[Any] = js.native
    }
    object ListLocationsResponse {
      
      @JSImport("google-gax/build/protos/locations", "google.cloud.location.ListLocationsResponse")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ListLocationsResponse instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ListLocationsResponse instance
        */
      /* static member */
      inline def create(): ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListLocationsResponse]
      inline def create(properties: IListLocationsResponse): ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListLocationsResponse]
      
      inline def decode(reader: js.typedarray.Uint8Array): ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListLocationsResponse]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListLocationsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListLocationsResponse]
      /**
        * Decodes a ListLocationsResponse message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ListLocationsResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListLocationsResponse]
      inline def decode(reader: Reader, length: Double): ListLocationsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListLocationsResponse]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListLocationsResponse]
      /**
        * Decodes a ListLocationsResponse message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ListLocationsResponse
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListLocationsResponse]
      
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
      inline def fromObject(`object`: StringDictionary[Any]): ListLocationsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListLocationsResponse]
      
      /**
        * Creates a plain object from a ListLocationsResponse message. Also converts values to other types if specified.
        * @param message ListLocationsResponse
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: ListLocationsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: ListLocationsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a ListLocationsResponse message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Location. */
    @JSImport("google-gax/build/protos/locations", "google.cloud.location.Location")
    @js.native
    /**
      * Constructs a new Location.
      * @param [properties] Properties to set
      */
    open class Location ()
      extends StObject
         with ILocation {
      def this(properties: ILocation) = this()
      
      /** Location displayName. */
      @JSName("displayName")
      var displayName_Location: String = js.native
      
      /** Location labels. */
      @JSName("labels")
      var labels_Location: StringDictionary[String] = js.native
      
      /** Location locationId. */
      @JSName("locationId")
      var locationId_Location: String = js.native
      
      /** Location name. */
      @JSName("name")
      var name_Location: String = js.native
      
      /**
        * Converts this Location to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[Any] = js.native
    }
    object Location {
      
      @JSImport("google-gax/build/protos/locations", "google.cloud.location.Location")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Location instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Location instance
        */
      /* static member */
      inline def create(): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Location]
      inline def create(properties: ILocation): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Location]
      
      inline def decode(reader: js.typedarray.Uint8Array): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Location]
      inline def decode(reader: js.typedarray.Uint8Array, length: Double): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Location]
      /**
        * Decodes a Location message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Location
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Location]
      inline def decode(reader: Reader, length: Double): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Location]
      
      inline def decodeDelimited(reader: js.typedarray.Uint8Array): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Location]
      /**
        * Decodes a Location message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Location
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Location]
      
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
      inline def fromObject(`object`: StringDictionary[Any]): Location = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Location]
      
      /**
        * Creates a plain object from a Location message. Also converts values to other types if specified.
        * @param message Location
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: Location): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
      inline def toObject(message: Location, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
      
      /**
        * Verifies a Location message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a Locations */
    @JSImport("google-gax/build/protos/locations", "google.cloud.location.Locations")
    @js.native
    open class Locations protected () extends Service {
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
      
      /**
        * Calls GetLocation.
        * @param request GetLocationRequest message or plain object
        * @returns Promise
        */
      def getLocation(request: IGetLocationRequest): js.Promise[Location] = js.native
      /**
        * Calls GetLocation.
        * @param request GetLocationRequest message or plain object
        * @param callback Node-style callback called with the error, if any, and Location
        */
      def getLocation(request: IGetLocationRequest, callback: GetLocationCallback): Unit = js.native
      
      /**
        * Calls ListLocations.
        * @param request ListLocationsRequest message or plain object
        * @returns Promise
        */
      def listLocations(request: IListLocationsRequest): js.Promise[ListLocationsResponse] = js.native
      /**
        * Calls ListLocations.
        * @param request ListLocationsRequest message or plain object
        * @param callback Node-style callback called with the error, if any, and ListLocationsResponse
        */
      def listLocations(request: IListLocationsRequest, callback: ListLocationsCallback): Unit = js.native
    }
    object Locations {
      
      @JSImport("google-gax/build/protos/locations", "google.cloud.location.Locations")
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
      inline def create(rpcImpl: RPCImpl): Locations = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[Locations]
      inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Locations = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[Locations]
      inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Locations = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Locations]
      inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): Locations = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Locations]
      
      /**
        * Callback as used by {@link google.cloud.location.Locations#getLocation}.
        * @param error Error, if any
        * @param [response] Location
        */
      type GetLocationCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Location], Unit]
      
      /**
        * Callback as used by {@link google.cloud.location.Locations#listLocations}.
        * @param error Error, if any
        * @param [response] ListLocationsResponse
        */
      type ListLocationsCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListLocationsResponse], Unit]
    }
    
    /** Properties of a GetLocationRequest. */
    trait IGetLocationRequest extends StObject {
      
      /** GetLocationRequest name */
      var name: js.UndefOr[String | Null] = js.undefined
    }
    object IGetLocationRequest {
      
      inline def apply(): IGetLocationRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IGetLocationRequest]
      }
      
      extension [Self <: IGetLocationRequest](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    /** Properties of a ListLocationsRequest. */
    trait IListLocationsRequest extends StObject {
      
      /** ListLocationsRequest filter */
      var filter: js.UndefOr[String | Null] = js.undefined
      
      /** ListLocationsRequest name */
      var name: js.UndefOr[String | Null] = js.undefined
      
      /** ListLocationsRequest pageSize */
      var pageSize: js.UndefOr[Double | Null] = js.undefined
      
      /** ListLocationsRequest pageToken */
      var pageToken: js.UndefOr[String | Null] = js.undefined
    }
    object IListLocationsRequest {
      
      inline def apply(): IListLocationsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IListLocationsRequest]
      }
      
      extension [Self <: IListLocationsRequest](x: Self) {
        
        inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterNull: Self = StObject.set(x, "filter", null)
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      }
    }
    
    /** Properties of a ListLocationsResponse. */
    trait IListLocationsResponse extends StObject {
      
      /** ListLocationsResponse locations */
      var locations: js.UndefOr[js.Array[ILocation] | Null] = js.undefined
      
      /** ListLocationsResponse nextPageToken */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
    }
    object IListLocationsResponse {
      
      inline def apply(): IListLocationsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IListLocationsResponse]
      }
      
      extension [Self <: IListLocationsResponse](x: Self) {
        
        inline def setLocations(value: js.Array[ILocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
        
        inline def setLocationsNull: Self = StObject.set(x, "locations", null)
        
        inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
        
        inline def setLocationsVarargs(value: ILocation*): Self = StObject.set(x, "locations", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    /** Properties of a Location. */
    trait ILocation extends StObject {
      
      /** Location displayName */
      var displayName: js.UndefOr[String | Null] = js.undefined
      
      /** Location labels */
      var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
      
      /** Location locationId */
      var locationId: js.UndefOr[String | Null] = js.undefined
      
      /** Location metadata */
      var metadata: js.UndefOr[IAny | Null] = js.undefined
      
      /** Location name */
      var name: js.UndefOr[String | Null] = js.undefined
    }
    object ILocation {
      
      inline def apply(): ILocation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ILocation]
      }
      
      extension [Self <: ILocation](x: Self) {
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsNull: Self = StObject.set(x, "labels", null)
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
        
        inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
        
        inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
        
        inline def setMetadata(value: IAny): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameNull: Self = StObject.set(x, "name", null)
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
  }
}
