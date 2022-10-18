package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Int32Value. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.Int32Value")
@js.native
/**
  * Constructs a new Int32Value.
  * @param [properties] Properties to set
  */
open class Int32Value ()
  extends StObject
     with IInt32Value {
  def this(properties: IInt32Value) = this()
  
  /**
    * Converts this Int32Value to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** Int32Value value. */
  @JSName("value")
  var value_Int32Value: Double = js.native
}
object Int32Value {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.Int32Value")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an Int32Value message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Int32Value
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): Int32Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Int32Value]
  
  /**
    * Creates a plain object from an Int32Value message. Also converts values to other types if specified.
    * @param message Int32Value
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Int32Value): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: Int32Value, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
