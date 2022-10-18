package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.error
import typings.googleCloudFirestore.googleCloudFirestoreStrings.response
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Operation. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.longrunning.Operation")
@js.native
/**
  * Constructs a new Operation.
  * @param [properties] Properties to set
  */
open class Operation ()
  extends StObject
     with IOperation {
  def this(properties: IOperation) = this()
  
  /** Operation done. */
  @JSName("done")
  var done_Operation: Boolean = js.native
  
  /** Operation name. */
  @JSName("name")
  var name_Operation: String = js.native
  
  /** Operation result. */
  var result: js.UndefOr[error | response] = js.native
  
  /**
    * Converts this Operation to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Operation {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.longrunning.Operation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an Operation message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Operation
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Operation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Operation]
  
  /**
    * Creates a plain object from an Operation message. Also converts values to other types if specified.
    * @param message Operation
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Operation): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Operation, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
