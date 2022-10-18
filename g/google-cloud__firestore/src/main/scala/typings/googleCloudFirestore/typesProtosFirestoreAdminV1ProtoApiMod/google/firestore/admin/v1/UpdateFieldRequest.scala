package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an UpdateFieldRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.UpdateFieldRequest")
@js.native
/**
  * Constructs a new UpdateFieldRequest.
  * @param [properties] Properties to set
  */
open class UpdateFieldRequest ()
  extends StObject
     with IUpdateFieldRequest {
  def this(properties: IUpdateFieldRequest) = this()
  
  /**
    * Converts this UpdateFieldRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object UpdateFieldRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.UpdateFieldRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an UpdateFieldRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns UpdateFieldRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): UpdateFieldRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[UpdateFieldRequest]
  
  /**
    * Creates a plain object from an UpdateFieldRequest message. Also converts values to other types if specified.
    * @param message UpdateFieldRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: UpdateFieldRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: UpdateFieldRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
