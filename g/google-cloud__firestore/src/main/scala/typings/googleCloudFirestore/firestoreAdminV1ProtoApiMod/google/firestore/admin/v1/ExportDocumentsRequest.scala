package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExportDocumentsRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ExportDocumentsRequest")
@js.native
/**
  * Constructs a new ExportDocumentsRequest.
  * @param [properties] Properties to set
  */
open class ExportDocumentsRequest ()
  extends StObject
     with IExportDocumentsRequest {
  def this(properties: IExportDocumentsRequest) = this()
  
  /** ExportDocumentsRequest collectionIds. */
  @JSName("collectionIds")
  var collectionIds_ExportDocumentsRequest: js.Array[String] = js.native
  
  /** ExportDocumentsRequest name. */
  @JSName("name")
  var name_ExportDocumentsRequest: String = js.native
  
  /** ExportDocumentsRequest outputUriPrefix. */
  @JSName("outputUriPrefix")
  var outputUriPrefix_ExportDocumentsRequest: String = js.native
  
  /**
    * Converts this ExportDocumentsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ExportDocumentsRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ExportDocumentsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an ExportDocumentsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExportDocumentsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ExportDocumentsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ExportDocumentsRequest]
  
  /**
    * Creates a plain object from an ExportDocumentsRequest message. Also converts values to other types if specified.
    * @param message ExportDocumentsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ExportDocumentsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ExportDocumentsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
