package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ImportDocumentsRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ImportDocumentsRequest")
@js.native
/**
  * Constructs a new ImportDocumentsRequest.
  * @param [properties] Properties to set
  */
open class ImportDocumentsRequest ()
  extends StObject
     with IImportDocumentsRequest {
  def this(properties: IImportDocumentsRequest) = this()
  
  /** ImportDocumentsRequest collectionIds. */
  @JSName("collectionIds")
  var collectionIds_ImportDocumentsRequest: js.Array[String] = js.native
  
  /** ImportDocumentsRequest inputUriPrefix. */
  @JSName("inputUriPrefix")
  var inputUriPrefix_ImportDocumentsRequest: String = js.native
  
  /** ImportDocumentsRequest name. */
  @JSName("name")
  var name_ImportDocumentsRequest: String = js.native
  
  /**
    * Converts this ImportDocumentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ImportDocumentsRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ImportDocumentsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an ImportDocumentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ImportDocumentsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ImportDocumentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ImportDocumentsRequest]
  
  /**
    * Creates a plain object from an ImportDocumentsRequest message. Also converts values to other types if specified.
    * @param message ImportDocumentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ImportDocumentsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ImportDocumentsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
