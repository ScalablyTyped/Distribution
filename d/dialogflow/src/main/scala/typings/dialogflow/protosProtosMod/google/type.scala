package typings.dialogflow.protosProtosMod.google

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  open class LatLng ()
    extends StObject
       with ILatLng {
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
    def toJSON(): StringDictionary[Any] = js.native
  }
  object LatLng {
    
    @JSImport("dialogflow/protos/protos", "google.type.LatLng")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new LatLng instance using the specified properties.
      * @param [properties] Properties to set
      * @returns LatLng instance
      */
    /* static member */
    inline def create(): LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[LatLng]
    inline def create(properties: ILatLng): LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[LatLng]
    
    inline def decode(reader: js.typedarray.Uint8Array): LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[LatLng]
    inline def decode(reader: js.typedarray.Uint8Array, length: Double): LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[LatLng]
    /**
      * Decodes a LatLng message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns LatLng
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[LatLng]
    inline def decode(reader: Reader, length: Double): LatLng = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[LatLng]
    
    inline def decodeDelimited(reader: js.typedarray.Uint8Array): LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[LatLng]
    /**
      * Decodes a LatLng message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns LatLng
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[LatLng]
    
    /**
      * Encodes the specified LatLng message. Does not implicitly {@link google.type.LatLng.verify|verify} messages.
      * @param message LatLng message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ILatLng): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ILatLng, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified LatLng message, length delimited. Does not implicitly {@link google.type.LatLng.verify|verify} messages.
      * @param message LatLng message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ILatLng): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ILatLng, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a LatLng message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns LatLng
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[Any]): LatLng = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[LatLng]
    
    /**
      * Creates a plain object from a LatLng message. Also converts values to other types if specified.
      * @param message LatLng
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: LatLng): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
    inline def toObject(message: LatLng, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    /**
      * Verifies a LatLng message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Properties of a LatLng. */
  trait ILatLng extends StObject {
    
    /** LatLng latitude */
    var latitude: js.UndefOr[Double | Null] = js.undefined
    
    /** LatLng longitude */
    var longitude: js.UndefOr[Double | Null] = js.undefined
  }
  object ILatLng {
    
    inline def apply(): ILatLng = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILatLng]
    }
    
    extension [Self <: ILatLng](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
      
      inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
      
      inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    }
  }
}
