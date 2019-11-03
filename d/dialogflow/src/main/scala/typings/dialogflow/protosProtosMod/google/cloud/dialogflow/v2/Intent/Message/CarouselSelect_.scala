package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.IItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a CarouselSelect. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.CarouselSelect")
@js.native
/**
  * Constructs a new CarouselSelect.
  * @param [properties] Properties to set
  */
class CarouselSelect_ () extends ICarouselSelect {
  def this(properties: ICarouselSelect) = this()
  /** CarouselSelect items. */
  @JSName("items")
  var items_CarouselSelect_ : js.Array[IItem] = js.native
  /**
    * Converts this CarouselSelect to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

