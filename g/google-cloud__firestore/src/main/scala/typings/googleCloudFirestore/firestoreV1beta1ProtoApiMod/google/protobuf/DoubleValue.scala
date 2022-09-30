package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DoubleValue. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.DoubleValue")
@js.native
/**
  * Constructs a new DoubleValue.
  * @param [properties] Properties to set
  */
open class DoubleValue ()
  extends StObject
     with IDoubleValue {
  def this(properties: IDoubleValue) = this()
  
  /**
    * Converts this DoubleValue to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** DoubleValue value. */
  @JSName("value")
  var value_DoubleValue: Double = js.native
}
object DoubleValue {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.DoubleValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a DoubleValue message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DoubleValue
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): DoubleValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DoubleValue]
  
  /**
    * Creates a plain object from a DoubleValue message. Also converts values to other types if specified.
    * @param message DoubleValue
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DoubleValue): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: DoubleValue, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
