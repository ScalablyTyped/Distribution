package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExistenceFilter. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.ExistenceFilter")
@js.native
/**
  * Constructs a new ExistenceFilter.
  * @param [properties] Properties to set
  */
open class ExistenceFilter ()
  extends StObject
     with IExistenceFilter {
  def this(properties: IExistenceFilter) = this()
  
  /** ExistenceFilter count. */
  @JSName("count")
  var count_ExistenceFilter: Double = js.native
  
  /** ExistenceFilter targetId. */
  @JSName("targetId")
  var targetId_ExistenceFilter: Double = js.native
  
  /**
    * Converts this ExistenceFilter to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ExistenceFilter {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.ExistenceFilter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an ExistenceFilter message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExistenceFilter
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ExistenceFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ExistenceFilter]
  
  /**
    * Creates a plain object from an ExistenceFilter message. Also converts values to other types if specified.
    * @param message ExistenceFilter
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ExistenceFilter): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ExistenceFilter, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
