package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a UInt32Value. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.UInt32Value")
@js.native
/**
  * Constructs a new UInt32Value.
  * @param [properties] Properties to set
  */
open class UInt32Value ()
  extends StObject
     with IUInt32Value {
  def this(properties: IUInt32Value) = this()
  
  /**
    * Converts this UInt32Value to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** UInt32Value value. */
  @JSName("value")
  var value_UInt32Value: Double = js.native
}
object UInt32Value {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.UInt32Value")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a UInt32Value message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UInt32Value
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): UInt32Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UInt32Value]
  
  /**
    * Creates a plain object from a UInt32Value message. Also converts values to other types if specified.
    * @param message UInt32Value
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UInt32Value): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: UInt32Value, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
