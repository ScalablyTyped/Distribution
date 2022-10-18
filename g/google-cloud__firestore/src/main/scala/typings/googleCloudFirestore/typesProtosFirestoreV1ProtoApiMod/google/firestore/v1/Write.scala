package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.delete
import typings.googleCloudFirestore.googleCloudFirestoreStrings.transform
import typings.googleCloudFirestore.googleCloudFirestoreStrings.update
import typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1.DocumentTransform.IFieldTransform
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Write. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.Write")
@js.native
/**
  * Constructs a new Write.
  * @param [properties] Properties to set
  */
open class Write ()
  extends StObject
     with IWrite {
  def this(properties: IWrite) = this()
  
  /** Write operation. */
  var operation: js.UndefOr[update | delete | transform] = js.native
  
  /**
    * Converts this Write to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** Write updateTransforms. */
  @JSName("updateTransforms")
  var updateTransforms_Write: js.Array[IFieldTransform] = js.native
}
object Write {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.Write")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Write message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Write
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Write = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Write]
  
  /**
    * Creates a plain object from a Write message. Also converts values to other types if specified.
    * @param message Write
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Write): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Write, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
