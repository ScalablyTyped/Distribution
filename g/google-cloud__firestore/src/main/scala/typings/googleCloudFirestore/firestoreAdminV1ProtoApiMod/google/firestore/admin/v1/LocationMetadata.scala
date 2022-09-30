package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a LocationMetadata. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.LocationMetadata")
@js.native
/**
  * Constructs a new LocationMetadata.
  * @param [properties] Properties to set
  */
open class LocationMetadata ()
  extends StObject
     with ILocationMetadata {
  def this(properties: ILocationMetadata) = this()
  
  /**
    * Converts this LocationMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object LocationMetadata {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.LocationMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a LocationMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns LocationMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): LocationMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[LocationMetadata]
  
  /**
    * Creates a plain object from a LocationMetadata message. Also converts values to other types if specified.
    * @param message LocationMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: LocationMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: LocationMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
