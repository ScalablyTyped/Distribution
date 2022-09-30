package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StringValue. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.StringValue")
@js.native
/**
  * Constructs a new StringValue.
  * @param [properties] Properties to set
  */
open class StringValue ()
  extends StObject
     with IStringValue {
  def this(properties: IStringValue) = this()
  
  /**
    * Converts this StringValue to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** StringValue value. */
  @JSName("value")
  var value_StringValue: String = js.native
}
object StringValue {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.StringValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a StringValue message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StringValue
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): StringValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringValue]
  
  /**
    * Creates a plain object from a StringValue message. Also converts values to other types if specified.
    * @param message StringValue
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: StringValue): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: StringValue, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
