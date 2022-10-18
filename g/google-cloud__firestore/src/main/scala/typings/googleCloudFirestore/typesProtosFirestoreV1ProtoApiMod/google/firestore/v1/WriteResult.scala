package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a WriteResult. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.WriteResult")
@js.native
/**
  * Constructs a new WriteResult.
  * @param [properties] Properties to set
  */
open class WriteResult ()
  extends StObject
     with IWriteResult {
  def this(properties: IWriteResult) = this()
  
  /**
    * Converts this WriteResult to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** WriteResult transformResults. */
  @JSName("transformResults")
  var transformResults_WriteResult: js.Array[IValue] = js.native
}
object WriteResult {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.WriteResult")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a WriteResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns WriteResult
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): WriteResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[WriteResult]
  
  /**
    * Creates a plain object from a WriteResult message. Also converts values to other types if specified.
    * @param message WriteResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: WriteResult): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: WriteResult, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
