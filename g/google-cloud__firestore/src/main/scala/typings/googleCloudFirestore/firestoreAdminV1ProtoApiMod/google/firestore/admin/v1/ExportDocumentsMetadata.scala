package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExportDocumentsMetadata. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ExportDocumentsMetadata")
@js.native
/**
  * Constructs a new ExportDocumentsMetadata.
  * @param [properties] Properties to set
  */
open class ExportDocumentsMetadata ()
  extends StObject
     with IExportDocumentsMetadata {
  def this(properties: IExportDocumentsMetadata) = this()
  
  /** ExportDocumentsMetadata collectionIds. */
  @JSName("collectionIds")
  var collectionIds_ExportDocumentsMetadata: js.Array[String] = js.native
  
  /** ExportDocumentsMetadata operationState. */
  @JSName("operationState")
  var operationState_ExportDocumentsMetadata: OperationState = js.native
  
  /** ExportDocumentsMetadata outputUriPrefix. */
  @JSName("outputUriPrefix")
  var outputUriPrefix_ExportDocumentsMetadata: String = js.native
  
  /**
    * Converts this ExportDocumentsMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ExportDocumentsMetadata {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ExportDocumentsMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an ExportDocumentsMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExportDocumentsMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ExportDocumentsMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ExportDocumentsMetadata]
  
  /**
    * Creates a plain object from an ExportDocumentsMetadata message. Also converts values to other types if specified.
    * @param message ExportDocumentsMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ExportDocumentsMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ExportDocumentsMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
