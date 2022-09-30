package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ArrayValue. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.ArrayValue")
@js.native
/**
  * Constructs a new ArrayValue.
  * @param [properties] Properties to set
  */
open class ArrayValue ()
  extends StObject
     with IArrayValue {
  def this(properties: IArrayValue) = this()
  
  /**
    * Converts this ArrayValue to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** ArrayValue values. */
  @JSName("values")
  var values_ArrayValue: js.Array[IValue] = js.native
}
object ArrayValue {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.ArrayValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an ArrayValue message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ArrayValue
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ArrayValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ArrayValue]
  
  /**
    * Creates a plain object from an ArrayValue message. Also converts values to other types if specified.
    * @param message ArrayValue
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ArrayValue): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ArrayValue, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
