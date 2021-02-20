package typings.dialogflow.mod.google

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace type. */
object `type` {
  
  /** Represents a LatLng. */
  @JSImport("dialogflow/protos/protos", "google.type.LatLng")
  @js.native
  /**
    * Constructs a new LatLng.
    * @param [properties] Properties to set
    */
  class LatLng () extends ILatLng {
    def this(properties: ILatLng) = this()
    
    /** LatLng latitude. */
    @JSName("latitude")
    var latitude_LatLng: Double = js.native
    
    /** LatLng longitude. */
    @JSName("longitude")
    var longitude_LatLng: Double = js.native
    
    /**
      * Converts this LatLng to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object LatLng {
    
    /**
      * Creates a new LatLng instance using the specified properties.
      * @param [properties] Properties to set
      * @returns LatLng instance
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.create")
    @js.native
    def create(): LatLng = js.native
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.create")
    @js.native
    def create(properties: ILatLng): LatLng = js.native
    
    /**
      * Decodes a LatLng message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns LatLng
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.decode")
    @js.native
    def decode(reader: Reader): LatLng = js.native
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.decode")
    @js.native
    def decode(reader: Reader, length: Double): LatLng = js.native
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.decode")
    @js.native
    def decode(reader: Uint8Array): LatLng = js.native
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): LatLng = js.native
    
    /**
      * Decodes a LatLng message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns LatLng
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): LatLng = js.native
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): LatLng = js.native
    
    /**
      * Encodes the specified LatLng message. Does not implicitly {@link google.type.LatLng.verify|verify} messages.
      * @param message LatLng message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.encode")
    @js.native
    def encode(message: ILatLng): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.encode")
    @js.native
    def encode(message: ILatLng, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified LatLng message, length delimited. Does not implicitly {@link google.type.LatLng.verify|verify} messages.
      * @param message LatLng message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILatLng): Writer = js.native
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.encodeDelimited")
    @js.native
    def encodeDelimited(message: ILatLng, writer: Writer): Writer = js.native
    
    /**
      * Creates a LatLng message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns LatLng
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): LatLng = js.native
    
    /**
      * Creates a plain object from a LatLng message. Also converts values to other types if specified.
      * @param message LatLng
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.toObject")
    @js.native
    def toObject(message: LatLng): StringDictionary[js.Any] = js.native
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.toObject")
    @js.native
    def toObject(message: LatLng, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a LatLng message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("dialogflow/protos/protos", "google.type.LatLng.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Properties of a LatLng. */
  @js.native
  trait ILatLng extends StObject {
    
    /** LatLng latitude */
    var latitude: js.UndefOr[Double | Null] = js.native
    
    /** LatLng longitude */
    var longitude: js.UndefOr[Double | Null] = js.native
  }
  object ILatLng {
    
    @scala.inline
    def apply(): ILatLng = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILatLng]
    }
    
    @scala.inline
    implicit class ILatLngMutableBuilder[Self <: ILatLng] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitudeNull: Self = StObject.set(x, "latitude", null)
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitudeNull: Self = StObject.set(x, "longitude", null)
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    }
  }
}
