package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.addTarget
import typings.googleCloudFirestore.googleCloudFirestoreStrings.removeTarget
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListenRequest. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.ListenRequest")
@js.native
/**
  * Constructs a new ListenRequest.
  * @param [properties] Properties to set
  */
open class ListenRequest ()
  extends StObject
     with IListenRequest {
  def this(properties: IListenRequest) = this()
  
  /** ListenRequest database. */
  @JSName("database")
  var database_ListenRequest: String = js.native
  
  /** ListenRequest labels. */
  @JSName("labels")
  var labels_ListenRequest: StringDictionary[String] = js.native
  
  /** ListenRequest targetChange. */
  var targetChange: js.UndefOr[addTarget | removeTarget] = js.native
  
  /**
    * Converts this ListenRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListenRequest {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.ListenRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a ListenRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListenRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListenRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListenRequest]
  
  /**
    * Creates a plain object from a ListenRequest message. Also converts values to other types if specified.
    * @param message ListenRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListenRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListenRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
