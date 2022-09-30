package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace type. */
object `type` {
  
  /** Represents a LatLng. */
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.type.LatLng")
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
    
    @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.type.LatLng")
    @js.native
    val ^ : js.Any = js.native
    
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
