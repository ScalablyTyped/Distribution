package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a RbmCardContent. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent")
@js.native
/**
  * Constructs a new RbmCardContent.
  * @param [properties] Properties to set
  */
class RbmCardContent_ () extends IRbmCardContent {
  def this(properties: IRbmCardContent) = this()
  /** RbmCardContent description. */
  @JSName("description")
  var description_RbmCardContent_ : String = js.native
  /** RbmCardContent suggestions. */
  @JSName("suggestions")
  var suggestions_RbmCardContent_ : js.Array[IRbmSuggestion] = js.native
  /** RbmCardContent title. */
  @JSName("title")
  var title_RbmCardContent_ : String = js.native
  /**
    * Converts this RbmCardContent to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

