package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an OneofDescriptorProto. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.OneofDescriptorProto")
@js.native
/**
  * Constructs a new OneofDescriptorProto.
  * @param [properties] Properties to set
  */
open class OneofDescriptorProto ()
  extends StObject
     with IOneofDescriptorProto {
  def this(properties: IOneofDescriptorProto) = this()
  
  /** OneofDescriptorProto name. */
  @JSName("name")
  var name_OneofDescriptorProto: String = js.native
  
  /**
    * Converts this OneofDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
}
object OneofDescriptorProto {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.OneofDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an OneofDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OneofDescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): OneofDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[OneofDescriptorProto]
  
  /**
    * Creates a plain object from an OneofDescriptorProto message. Also converts values to other types if specified.
    * @param message OneofDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: OneofDescriptorProto): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: OneofDescriptorProto, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
