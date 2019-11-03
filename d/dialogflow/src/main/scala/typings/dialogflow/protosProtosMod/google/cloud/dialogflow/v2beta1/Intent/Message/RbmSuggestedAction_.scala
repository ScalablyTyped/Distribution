package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.dialogflowStrings.dial
import typings.dialogflow.dialogflowStrings.openUrl
import typings.dialogflow.dialogflowStrings.shareLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a RbmSuggestedAction. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction")
@js.native
/**
  * Constructs a new RbmSuggestedAction.
  * @param [properties] Properties to set
  */
class RbmSuggestedAction_ () extends IRbmSuggestedAction {
  def this(properties: IRbmSuggestedAction) = this()
  /** RbmSuggestedAction action. */
  var action: js.UndefOr[dial | openUrl | shareLocation] = js.native
  /** RbmSuggestedAction postbackData. */
  @JSName("postbackData")
  var postbackData_RbmSuggestedAction_ : String = js.native
  /** RbmSuggestedAction text. */
  @JSName("text")
  var text_RbmSuggestedAction_ : String = js.native
  /**
    * Converts this RbmSuggestedAction to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

