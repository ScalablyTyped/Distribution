package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.exists
import typings.googleCloudFirestore.googleCloudFirestoreStrings.updateTime
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Precondition. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.Precondition")
@js.native
/**
  * Constructs a new Precondition.
  * @param [properties] Properties to set
  */
open class Precondition ()
  extends StObject
     with IPrecondition {
  def this(properties: IPrecondition) = this()
  
  /** Precondition conditionType. */
  var conditionType: js.UndefOr[exists | updateTime] = js.native
  
  /**
    * Converts this Precondition to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Precondition {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.Precondition")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Precondition message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Precondition
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Precondition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Precondition]
  
  /**
    * Creates a plain object from a Precondition message. Also converts values to other types if specified.
    * @param message Precondition
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Precondition): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Precondition, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
