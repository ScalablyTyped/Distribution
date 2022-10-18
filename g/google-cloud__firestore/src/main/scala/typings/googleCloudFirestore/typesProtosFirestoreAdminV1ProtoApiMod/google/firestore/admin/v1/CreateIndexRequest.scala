package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CreateIndexRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.CreateIndexRequest")
@js.native
/**
  * Constructs a new CreateIndexRequest.
  * @param [properties] Properties to set
  */
open class CreateIndexRequest ()
  extends StObject
     with ICreateIndexRequest {
  def this(properties: ICreateIndexRequest) = this()
  
  /** CreateIndexRequest parent. */
  @JSName("parent")
  var parent_CreateIndexRequest: String = js.native
  
  /**
    * Converts this CreateIndexRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object CreateIndexRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.CreateIndexRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a CreateIndexRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CreateIndexRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CreateIndexRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CreateIndexRequest]
  
  /**
    * Creates a plain object from a CreateIndexRequest message. Also converts values to other types if specified.
    * @param message CreateIndexRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CreateIndexRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CreateIndexRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
