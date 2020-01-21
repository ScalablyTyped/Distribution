package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BasicCard. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BasicCard")
@js.native
/**
  * Constructs a new BasicCard.
  * @param [properties] Properties to set
  */
class BasicCard_ () extends IBasicCard {
  def this(properties: IBasicCard) = this()
  /** BasicCard buttons. */
  @JSName("buttons")
  var buttons_BasicCard_ : js.Array[IButton] = js.native
  /** BasicCard formattedText. */
  @JSName("formattedText")
  var formattedText_BasicCard_ : String = js.native
  /** BasicCard subtitle. */
  @JSName("subtitle")
  var subtitle_BasicCard_ : String = js.native
  /** BasicCard title. */
  @JSName("title")
  var title_BasicCard_ : String = js.native
  /**
    * Converts this BasicCard to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

