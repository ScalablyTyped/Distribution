package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExportDocumentsResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ExportDocumentsResponse")
@js.native
/**
  * Constructs a new ExportDocumentsResponse.
  * @param [properties] Properties to set
  */
open class ExportDocumentsResponse ()
  extends StObject
     with IExportDocumentsResponse {
  def this(properties: IExportDocumentsResponse) = this()
  
  /** ExportDocumentsResponse outputUriPrefix. */
  @JSName("outputUriPrefix")
  var outputUriPrefix_ExportDocumentsResponse: String = js.native
  
  /**
    * Converts this ExportDocumentsResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ExportDocumentsResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.ExportDocumentsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an ExportDocumentsResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExportDocumentsResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ExportDocumentsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ExportDocumentsResponse]
  
  /**
    * Creates a plain object from an ExportDocumentsResponse message. Also converts values to other types if specified.
    * @param message ExportDocumentsResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ExportDocumentsResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ExportDocumentsResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
