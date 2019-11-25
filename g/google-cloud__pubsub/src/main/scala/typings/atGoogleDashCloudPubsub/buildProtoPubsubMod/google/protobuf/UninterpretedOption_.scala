package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.UninterpretedOption.INamePart
import typings.long.longMod.^
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an UninterpretedOption. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.UninterpretedOption")
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
  var negativeIntValue_UninterpretedOption_ : Double | ^  = js.native
  /** UninterpretedOption positiveIntValue. */
  @JSName("positiveIntValue")
  var positiveIntValue_UninterpretedOption_ : Double | ^  = js.native
  /** UninterpretedOption stringValue. */
  @JSName("stringValue")
  var stringValue_UninterpretedOption_ : Uint8Array = js.native
  /**
    * Converts this UninterpretedOption to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

