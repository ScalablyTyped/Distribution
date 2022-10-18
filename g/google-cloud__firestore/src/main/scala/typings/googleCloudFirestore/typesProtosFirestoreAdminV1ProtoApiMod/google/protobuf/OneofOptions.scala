package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an OneofOptions. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.OneofOptions")
@js.native
/**
  * Constructs a new OneofOptions.
  * @param [properties] Properties to set
  */
open class OneofOptions ()
  extends StObject
     with IOneofOptions {
  def this(properties: IOneofOptions) = this()
  
  /**
    * Converts this OneofOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** OneofOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_OneofOptions: js.Array[IUninterpretedOption] = js.native
}
object OneofOptions {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.OneofOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an OneofOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OneofOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): OneofOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[OneofOptions]
  
  /**
    * Creates a plain object from an OneofOptions message. Also converts values to other types if specified.
    * @param message OneofOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: OneofOptions): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: OneofOptions, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
