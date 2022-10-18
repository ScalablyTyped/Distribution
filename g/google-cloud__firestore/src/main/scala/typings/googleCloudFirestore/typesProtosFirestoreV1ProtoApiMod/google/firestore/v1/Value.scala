package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudFirestore.googleCloudFirestoreStrings.arrayValue
import typings.googleCloudFirestore.googleCloudFirestoreStrings.booleanValue
import typings.googleCloudFirestore.googleCloudFirestoreStrings.bytesValue
import typings.googleCloudFirestore.googleCloudFirestoreStrings.doubleValue
import typings.googleCloudFirestore.googleCloudFirestoreStrings.geoPointValue
import typings.googleCloudFirestore.googleCloudFirestoreStrings.integerValue
import typings.googleCloudFirestore.googleCloudFirestoreStrings.mapValue
import typings.googleCloudFirestore.googleCloudFirestoreStrings.nullValue
import typings.googleCloudFirestore.googleCloudFirestoreStrings.referenceValue
import typings.googleCloudFirestore.googleCloudFirestoreStrings.stringValue
import typings.googleCloudFirestore.googleCloudFirestoreStrings.timestampValue
import typings.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Value. */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.Value")
@js.native
/**
  * Constructs a new Value.
  * @param [properties] Properties to set
  */
open class Value ()
  extends StObject
     with IValue {
  def this(properties: IValue) = this()
  
  /**
    * Converts this Value to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** Value valueType. */
  var valueType: js.UndefOr[
    nullValue | booleanValue | integerValue | doubleValue | timestampValue | stringValue | bytesValue | referenceValue | geoPointValue | arrayValue | mapValue
  ] = js.native
}
object Value {
  
  @JSImport("@google-cloud/firestore/types/protos/firestore_v1_proto_api", "google.firestore.v1.Value")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Value message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Value
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  /**
    * Creates a plain object from a Value message. Also converts values to other types if specified.
    * @param message Value
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Value): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Value, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
