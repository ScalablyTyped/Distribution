package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommitResponse. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.CommitResponse")
@js.native
/**
  * Constructs a new CommitResponse.
  * @param [properties] Properties to set
  */
open class CommitResponse ()
  extends StObject
     with ICommitResponse {
  def this(properties: ICommitResponse) = this()
  
  /**
    * Converts this CommitResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** CommitResponse writeResults. */
  @JSName("writeResults")
  var writeResults_CommitResponse: js.Array[IWriteResult] = js.native
}
object CommitResponse {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.CommitResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a CommitResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommitResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): CommitResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[CommitResponse]
  
  /**
    * Creates a plain object from a CommitResponse message. Also converts values to other types if specified.
    * @param message CommitResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: CommitResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: CommitResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
