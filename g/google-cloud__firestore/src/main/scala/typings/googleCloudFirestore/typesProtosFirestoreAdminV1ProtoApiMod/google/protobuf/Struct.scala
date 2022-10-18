package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Struct. */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.Struct")
@js.native
/**
  * Constructs a new Struct.
  * @param [properties] Properties to set
  */
open class Struct ()
  extends StObject
     with IStruct {
  def this(properties: IStruct) = this()
  
  /** Struct fields. */
  @JSName("fields")
  var fields_Struct: StringDictionary[IValue] = js.native
  
  /**
    * Converts this Struct to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
}
object Struct {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.protobuf.Struct")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Struct message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Struct
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Struct]
  
  /**
    * Creates a plain object from a Struct message. Also converts values to other types if specified.
    * @param message Struct
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Struct): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: Struct, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
}
