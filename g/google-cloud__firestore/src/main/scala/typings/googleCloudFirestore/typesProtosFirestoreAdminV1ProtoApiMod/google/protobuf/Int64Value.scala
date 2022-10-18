package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Int64Value. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.Int64Value")
@js.native
/**
  * Constructs a new Int64Value.
  * @param [properties] Properties to set
  */
open class Int64Value ()
  extends StObject
     with IInt64Value {
  def this(properties: IInt64Value) = this()
  
  /**
    * Converts this Int64Value to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** Int64Value value. */
  @JSName("value")
  var value_Int64Value: Double | String = js.native
}
object Int64Value {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.Int64Value")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an Int64Value message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Int64Value
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): Int64Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Int64Value]
  
  /**
    * Creates a plain object from an Int64Value message. Also converts values to other types if specified.
    * @param message Int64Value
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Int64Value): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: Int64Value, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
