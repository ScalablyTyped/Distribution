package typings.googleCloudFirestore.firestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Progress. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Progress")
@js.native
/**
  * Constructs a new Progress.
  * @param [properties] Properties to set
  */
open class Progress ()
  extends StObject
     with IProgress {
  def this(properties: IProgress) = this()
  
  /** Progress completedWork. */
  @JSName("completedWork")
  var completedWork_Progress: Double | String = js.native
  
  /** Progress estimatedWork. */
  @JSName("estimatedWork")
  var estimatedWork_Progress: Double | String = js.native
  
  /**
    * Converts this Progress to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Progress {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.Progress")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Progress message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Progress
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Progress = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Progress]
  
  /**
    * Creates a plain object from a Progress message. Also converts values to other types if specified.
    * @param message Progress
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Progress): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Progress, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
