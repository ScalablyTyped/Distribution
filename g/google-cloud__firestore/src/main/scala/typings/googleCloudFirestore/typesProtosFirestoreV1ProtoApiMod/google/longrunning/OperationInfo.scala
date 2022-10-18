package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an OperationInfo. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.longrunning.OperationInfo")
@js.native
/**
  * Constructs a new OperationInfo.
  * @param [properties] Properties to set
  */
open class OperationInfo ()
  extends StObject
     with IOperationInfo {
  def this(properties: IOperationInfo) = this()
  
  /** OperationInfo metadataType. */
  @JSName("metadataType")
  var metadataType_OperationInfo: String = js.native
  
  /** OperationInfo responseType. */
  @JSName("responseType")
  var responseType_OperationInfo: String = js.native
  
  /**
    * Converts this OperationInfo to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object OperationInfo {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.longrunning.OperationInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an OperationInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns OperationInfo
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): OperationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[OperationInfo]
  
  /**
    * Creates a plain object from an OperationInfo message. Also converts values to other types if specified.
    * @param message OperationInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: OperationInfo): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: OperationInfo, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
