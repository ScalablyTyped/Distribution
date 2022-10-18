package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a BytesValue. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.BytesValue")
@js.native
/**
  * Constructs a new BytesValue.
  * @param [properties] Properties to set
  */
open class BytesValue ()
  extends StObject
     with IBytesValue {
  def this(properties: IBytesValue) = this()
  
  /**
    * Converts this BytesValue to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** BytesValue value. */
  @JSName("value")
  var value_BytesValue: js.typedarray.Uint8Array = js.native
}
object BytesValue {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.BytesValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a BytesValue message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BytesValue
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): BytesValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BytesValue]
  
  /**
    * Creates a plain object from a BytesValue message. Also converts values to other types if specified.
    * @param message BytesValue
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: BytesValue): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: BytesValue, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
