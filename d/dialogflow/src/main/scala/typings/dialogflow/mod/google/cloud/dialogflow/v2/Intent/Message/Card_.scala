package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Card. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card")
@js.native
/**
  * Constructs a new Card.
  * @param [properties] Properties to set
  */
class Card_ () extends ICard {
  def this(properties: ICard) = this()
  /** Card buttons. */
  @JSName("buttons")
  var buttons_Card_ : js.Array[IButton] = js.native
  /** Card imageUri. */
  @JSName("imageUri")
  var imageUri_Card_ : String = js.native
  /** Card subtitle. */
  @JSName("subtitle")
  var subtitle_Card_ : String = js.native
  /** Card title. */
  @JSName("title")
  var title_Card_ : String = js.native
  /**
    * Converts this Card to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

