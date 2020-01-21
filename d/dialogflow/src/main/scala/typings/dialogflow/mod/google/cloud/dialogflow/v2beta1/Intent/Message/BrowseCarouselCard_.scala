package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.IBrowseCarouselCardItem
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BrowseCarouselCard. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard")
@js.native
/**
  * Constructs a new BrowseCarouselCard.
  * @param [properties] Properties to set
  */
class BrowseCarouselCard_ () extends IBrowseCarouselCard {
  def this(properties: IBrowseCarouselCard) = this()
  /** BrowseCarouselCard imageDisplayOptions. */
  @JSName("imageDisplayOptions")
  var imageDisplayOptions_BrowseCarouselCard_ : ImageDisplayOptions = js.native
  /** BrowseCarouselCard items. */
  @JSName("items")
  var items_BrowseCarouselCard_ : js.Array[IBrowseCarouselCardItem] = js.native
  /**
    * Converts this BrowseCarouselCard to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

