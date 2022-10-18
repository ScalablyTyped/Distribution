package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumDescriptorProto. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.EnumDescriptorProto")
@js.native
/**
  * Constructs a new EnumDescriptorProto.
  * @param [properties] Properties to set
  */
open class EnumDescriptorProto ()
  extends StObject
     with IEnumDescriptorProto {
  def this(properties: IEnumDescriptorProto) = this()
  
  /** EnumDescriptorProto name. */
  @JSName("name")
  var name_EnumDescriptorProto: String = js.native
  
  /**
    * Converts this EnumDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** EnumDescriptorProto value. */
  @JSName("value")
  var value_EnumDescriptorProto: js.Array[IEnumValueDescriptorProto] = js.native
}
object EnumDescriptorProto {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.EnumDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an EnumDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumDescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): EnumDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProto]
  
  /**
    * Creates a plain object from an EnumDescriptorProto message. Also converts values to other types if specified.
    * @param message EnumDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: EnumDescriptorProto): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: EnumDescriptorProto, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
