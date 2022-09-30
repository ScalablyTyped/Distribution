package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileDescriptorProto. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.FileDescriptorProto")
@js.native
/**
  * Constructs a new FileDescriptorProto.
  * @param [properties] Properties to set
  */
open class FileDescriptorProto ()
  extends StObject
     with IFileDescriptorProto {
  def this(properties: IFileDescriptorProto) = this()
  
  /** FileDescriptorProto package. */
  @JSName("package")
  var _package_FileDescriptorProto: String = js.native
  
  /** FileDescriptorProto dependency. */
  @JSName("dependency")
  var dependency_FileDescriptorProto: js.Array[String] = js.native
  
  /** FileDescriptorProto enumType. */
  @JSName("enumType")
  var enumType_FileDescriptorProto: js.Array[IEnumDescriptorProto] = js.native
  
  /** FileDescriptorProto extension. */
  @JSName("extension")
  var extension_FileDescriptorProto: js.Array[IFieldDescriptorProto] = js.native
  
  /** FileDescriptorProto messageType. */
  @JSName("messageType")
  var messageType_FileDescriptorProto: js.Array[IDescriptorProto] = js.native
  
  /** FileDescriptorProto name. */
  @JSName("name")
  var name_FileDescriptorProto: String = js.native
  
  /** FileDescriptorProto publicDependency. */
  @JSName("publicDependency")
  var publicDependency_FileDescriptorProto: js.Array[Double] = js.native
  
  /** FileDescriptorProto service. */
  @JSName("service")
  var service_FileDescriptorProto: js.Array[IServiceDescriptorProto] = js.native
  
  /** FileDescriptorProto syntax. */
  @JSName("syntax")
  var syntax_FileDescriptorProto: String = js.native
  
  /**
    * Converts this FileDescriptorProto to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** FileDescriptorProto weakDependency. */
  @JSName("weakDependency")
  var weakDependency_FileDescriptorProto: js.Array[Double] = js.native
}
object FileDescriptorProto {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.FileDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a FileDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileDescriptorProto
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  
  /**
    * Creates a plain object from a FileDescriptorProto message. Also converts values to other types if specified.
    * @param message FileDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: FileDescriptorProto): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: FileDescriptorProto, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
