package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Cursor. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.Cursor")
@js.native
/**
  * Constructs a new Cursor.
  * @param [properties] Properties to set
  */
open class Cursor ()
  extends StObject
     with ICursor {
  def this(properties: ICursor) = this()
  
  /** Cursor before. */
  @JSName("before")
  var before_Cursor: Boolean = js.native
  
  /**
    * Converts this Cursor to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** Cursor values. */
  @JSName("values")
  var values_Cursor: js.Array[IValue] = js.native
}
object Cursor {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.Cursor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Cursor message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Cursor
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Cursor = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Cursor]
  
  /**
    * Creates a plain object from a Cursor message. Also converts values to other types if specified.
    * @param message Cursor
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Cursor): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Cursor, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
