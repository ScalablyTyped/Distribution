package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FloatValue. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.FloatValue")
@js.native
/**
  * Constructs a new FloatValue.
  * @param [properties] Properties to set
  */
open class FloatValue ()
  extends StObject
     with IFloatValue {
  def this(properties: IFloatValue) = this()
  
  /**
    * Converts this FloatValue to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** FloatValue value. */
  @JSName("value")
  var value_FloatValue: Double = js.native
}
object FloatValue {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.FloatValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a FloatValue message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FloatValue
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): FloatValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FloatValue]
  
  /**
    * Creates a plain object from a FloatValue message. Also converts values to other types if specified.
    * @param message FloatValue
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: FloatValue): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: FloatValue, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
