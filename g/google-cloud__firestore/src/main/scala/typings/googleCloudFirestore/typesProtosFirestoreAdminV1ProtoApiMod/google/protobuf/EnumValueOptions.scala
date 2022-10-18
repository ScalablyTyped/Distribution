package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumValueOptions. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.EnumValueOptions")
@js.native
/**
  * Constructs a new EnumValueOptions.
  * @param [properties] Properties to set
  */
open class EnumValueOptions ()
  extends StObject
     with IEnumValueOptions {
  def this(properties: IEnumValueOptions) = this()
  
  /** EnumValueOptions deprecated. */
  @JSName("deprecated")
  var deprecated_EnumValueOptions: Boolean = js.native
  
  /**
    * Converts this EnumValueOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** EnumValueOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_EnumValueOptions: js.Array[IUninterpretedOption] = js.native
}
object EnumValueOptions {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.EnumValueOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an EnumValueOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumValueOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EnumValueOptions]
  
  /**
    * Creates a plain object from an EnumValueOptions message. Also converts values to other types if specified.
    * @param message EnumValueOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: EnumValueOptions): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: EnumValueOptions, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
