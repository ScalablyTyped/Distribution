package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MethodDescriptorProto. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.MethodDescriptorProto")
@js.native
/**
  * Constructs a new MethodDescriptorProto.
  * @param [properties] Properties to set
  */
open class MethodDescriptorProto ()
  extends StObject
     with IMethodDescriptorProto {
  def this(properties: IMethodDescriptorProto) = this()
  
  /** MethodDescriptorProto clientStreaming. */
  @JSName("clientStreaming")
  var clientStreaming_MethodDescriptorProto: Boolean = js.native
  
  /** MethodDescriptorProto inputType. */
  @JSName("inputType")
  var inputType_MethodDescriptorProto: String = js.native
  
  /** MethodDescriptorProto name. */
  @JSName("name")
  var name_MethodDescriptorProto: String = js.native
  
  /** MethodDescriptorProto outputType. */
  @JSName("outputType")
  var outputType_MethodDescriptorProto: String = js.native
  
  /** MethodDescriptorProto serverStreaming. */
  @JSName("serverStreaming")
  var serverStreaming_MethodDescriptorProto: Boolean = js.native
  
  /**
    * Converts this MethodDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
}
object MethodDescriptorProto {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.MethodDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a MethodDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MethodDescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): MethodDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[MethodDescriptorProto]
  
  /**
    * Creates a plain object from a MethodDescriptorProto message. Also converts values to other types if specified.
    * @param message MethodDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: MethodDescriptorProto): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: MethodDescriptorProto, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
