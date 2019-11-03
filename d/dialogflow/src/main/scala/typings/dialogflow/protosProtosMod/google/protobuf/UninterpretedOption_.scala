package typings.dialogflow.protosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.protobuf.UninterpretedOption.INamePart
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an UninterpretedOption. */
@JSImport("dialogflow/protos/protos", "google.protobuf.UninterpretedOption")
@js.native
/**
  * Constructs a new UninterpretedOption.
  * @param [properties] Properties to set
  */
class UninterpretedOption_ () extends IUninterpretedOption {
  def this(properties: IUninterpretedOption) = this()
  /** UninterpretedOption aggregateValue. */
  @JSName("aggregateValue")
  var aggregateValue_UninterpretedOption_ : String = js.native
  /** UninterpretedOption doubleValue. */
  @JSName("doubleValue")
  var doubleValue_UninterpretedOption_ : Double = js.native
  /** UninterpretedOption identifierValue. */
  @JSName("identifierValue")
  var identifierValue_UninterpretedOption_ : String = js.native
  /** UninterpretedOption name. */
  @JSName("name")
  var name_UninterpretedOption_ : js.Array[INamePart] = js.native
  /** UninterpretedOption negativeIntValue. */
  @JSName("negativeIntValue")
  var negativeIntValue_UninterpretedOption_ : Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** UninterpretedOption positiveIntValue. */
  @JSName("positiveIntValue")
  var positiveIntValue_UninterpretedOption_ : Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Long */ js.Any) = js.native
  /** UninterpretedOption stringValue. */
  @JSName("stringValue")
  var stringValue_UninterpretedOption_ : Uint8Array = js.native
  /**
    * Converts this UninterpretedOption to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

