package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MapValue. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.MapValue")
@js.native
/**
  * Constructs a new MapValue.
  * @param [properties] Properties to set
  */
open class MapValue ()
  extends StObject
     with IMapValue {
  def this(properties: IMapValue) = this()
  
  /** MapValue fields. */
  @JSName("fields")
  var fields_MapValue: StringDictionary[IValue] = js.native
  
  /**
    * Converts this MapValue to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object MapValue {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.MapValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a MapValue message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MapValue
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): MapValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[MapValue]
  
  /**
    * Creates a plain object from a MapValue message. Also converts values to other types if specified.
    * @param message MapValue
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: MapValue): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: MapValue, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
