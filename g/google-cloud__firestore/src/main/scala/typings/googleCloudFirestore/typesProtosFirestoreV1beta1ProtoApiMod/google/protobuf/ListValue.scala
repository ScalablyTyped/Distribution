package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListValue. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.ListValue")
@js.native
/**
  * Constructs a new ListValue.
  * @param [properties] Properties to set
  */
open class ListValue ()
  extends StObject
     with IListValue {
  def this(properties: IListValue) = this()
  
  /**
    * Converts this ListValue to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** ListValue values. */
  @JSName("values")
  var values_ListValue: js.Array[IValue] = js.native
}
object ListValue {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.ListValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListValue message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListValue
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): ListValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListValue]
  
  /**
    * Creates a plain object from a ListValue message. Also converts values to other types if specified.
    * @param message ListValue
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListValue): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: ListValue, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
