package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DocumentChange. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.DocumentChange")
@js.native
/**
  * Constructs a new DocumentChange.
  * @param [properties] Properties to set
  */
open class DocumentChange ()
  extends StObject
     with IDocumentChange {
  def this(properties: IDocumentChange) = this()
  
  /** DocumentChange removedTargetIds. */
  @JSName("removedTargetIds")
  var removedTargetIds_DocumentChange: js.Array[Double] = js.native
  
  /** DocumentChange targetIds. */
  @JSName("targetIds")
  var targetIds_DocumentChange: js.Array[Double] = js.native
  
  /**
    * Converts this DocumentChange to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DocumentChange {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.DocumentChange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a DocumentChange message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DocumentChange
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DocumentChange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DocumentChange]
  
  /**
    * Creates a plain object from a DocumentChange message. Also converts values to other types if specified.
    * @param message DocumentChange
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DocumentChange): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DocumentChange, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
