package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ImportDocumentsMetadata. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ImportDocumentsMetadata")
@js.native
/**
  * Constructs a new ImportDocumentsMetadata.
  * @param [properties] Properties to set
  */
open class ImportDocumentsMetadata ()
  extends StObject
     with IImportDocumentsMetadata {
  def this(properties: IImportDocumentsMetadata) = this()
  
  /** ImportDocumentsMetadata collectionIds. */
  @JSName("collectionIds")
  var collectionIds_ImportDocumentsMetadata: js.Array[String] = js.native
  
  /** ImportDocumentsMetadata inputUriPrefix. */
  @JSName("inputUriPrefix")
  var inputUriPrefix_ImportDocumentsMetadata: String = js.native
  
  /** ImportDocumentsMetadata operationState. */
  @JSName("operationState")
  var operationState_ImportDocumentsMetadata: OperationState = js.native
  
  /**
    * Converts this ImportDocumentsMetadata to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ImportDocumentsMetadata {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ImportDocumentsMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an ImportDocumentsMetadata message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ImportDocumentsMetadata
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ImportDocumentsMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ImportDocumentsMetadata]
  
  /**
    * Creates a plain object from an ImportDocumentsMetadata message. Also converts values to other types if specified.
    * @param message ImportDocumentsMetadata
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ImportDocumentsMetadata): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ImportDocumentsMetadata, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
