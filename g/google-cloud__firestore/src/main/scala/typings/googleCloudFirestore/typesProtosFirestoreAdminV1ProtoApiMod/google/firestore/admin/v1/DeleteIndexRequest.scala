package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteIndexRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.DeleteIndexRequest")
@js.native
/**
  * Constructs a new DeleteIndexRequest.
  * @param [properties] Properties to set
  */
open class DeleteIndexRequest ()
  extends StObject
     with IDeleteIndexRequest {
  def this(properties: IDeleteIndexRequest) = this()
  
  /** DeleteIndexRequest name. */
  @JSName("name")
  var name_DeleteIndexRequest: String = js.native
  
  /**
    * Converts this DeleteIndexRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DeleteIndexRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.DeleteIndexRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a DeleteIndexRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteIndexRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DeleteIndexRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DeleteIndexRequest]
  
  /**
    * Creates a plain object from a DeleteIndexRequest message. Also converts values to other types if specified.
    * @param message DeleteIndexRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DeleteIndexRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DeleteIndexRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
