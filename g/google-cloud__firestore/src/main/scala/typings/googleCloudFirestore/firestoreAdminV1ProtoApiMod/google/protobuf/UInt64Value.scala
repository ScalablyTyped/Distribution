package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a UInt64Value. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.UInt64Value")
@js.native
/**
  * Constructs a new UInt64Value.
  * @param [properties] Properties to set
  */
open class UInt64Value ()
  extends StObject
     with IUInt64Value {
  def this(properties: IUInt64Value) = this()
  
  /**
    * Converts this UInt64Value to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** UInt64Value value. */
  @JSName("value")
  var value_UInt64Value: Double | String = js.native
}
object UInt64Value {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.UInt64Value")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a UInt64Value message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UInt64Value
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): UInt64Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UInt64Value]
  
  /**
    * Creates a plain object from a UInt64Value message. Also converts values to other types if specified.
    * @param message UInt64Value
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UInt64Value): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: UInt64Value, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
