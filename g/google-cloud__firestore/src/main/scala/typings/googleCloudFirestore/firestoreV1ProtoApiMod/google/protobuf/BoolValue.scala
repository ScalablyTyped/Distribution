package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BoolValue. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.BoolValue")
@js.native
/**
  * Constructs a new BoolValue.
  * @param [properties] Properties to set
  */
open class BoolValue ()
  extends StObject
     with IBoolValue {
  def this(properties: IBoolValue) = this()
  
  /**
    * Converts this BoolValue to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** BoolValue value. */
  @JSName("value")
  var value_BoolValue: Boolean = js.native
}
object BoolValue {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.BoolValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a BoolValue message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BoolValue
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): BoolValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BoolValue]
  
  /**
    * Creates a plain object from a BoolValue message. Also converts values to other types if specified.
    * @param message BoolValue
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BoolValue): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: BoolValue, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
