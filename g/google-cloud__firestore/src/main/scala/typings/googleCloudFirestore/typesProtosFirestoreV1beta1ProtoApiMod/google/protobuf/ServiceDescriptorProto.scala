package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ServiceDescriptorProto. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.ServiceDescriptorProto")
@js.native
/**
  * Constructs a new ServiceDescriptorProto.
  * @param [properties] Properties to set
  */
open class ServiceDescriptorProto ()
  extends StObject
     with IServiceDescriptorProto {
  def this(properties: IServiceDescriptorProto) = this()
  
  /** ServiceDescriptorProto method. */
  @JSName("method")
  var method_ServiceDescriptorProto: js.Array[IMethodDescriptorProto] = js.native
  
  /** ServiceDescriptorProto name. */
  @JSName("name")
  var name_ServiceDescriptorProto: String = js.native
  
  /**
    * Converts this ServiceDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
}
object ServiceDescriptorProto {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.protobuf.ServiceDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ServiceDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ServiceDescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): ServiceDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ServiceDescriptorProto]
  
  /**
    * Creates a plain object from a ServiceDescriptorProto message. Also converts values to other types if specified.
    * @param message ServiceDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ServiceDescriptorProto): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: ServiceDescriptorProto, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
