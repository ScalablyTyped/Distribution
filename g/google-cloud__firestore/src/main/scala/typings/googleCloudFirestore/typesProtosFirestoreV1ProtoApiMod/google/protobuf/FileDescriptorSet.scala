package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FileDescriptorSet. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.FileDescriptorSet")
@js.native
/**
  * Constructs a new FileDescriptorSet.
  * @param [properties] Properties to set
  */
open class FileDescriptorSet ()
  extends StObject
     with IFileDescriptorSet {
  def this(properties: IFileDescriptorSet) = this()
  
  /** FileDescriptorSet file. */
  @JSName("file")
  var file_FileDescriptorSet: js.Array[IFileDescriptorProto] = js.native
  
  /**
    * Converts this FileDescriptorSet to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
}
object FileDescriptorSet {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.protobuf.FileDescriptorSet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a FileDescriptorSet message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FileDescriptorSet
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): FileDescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorSet]
  
  /**
    * Creates a plain object from a FileDescriptorSet message. Also converts values to other types if specified.
    * @param message FileDescriptorSet
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: FileDescriptorSet): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: FileDescriptorSet, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
