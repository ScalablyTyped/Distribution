package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BrowseCarouselCardItem. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.BrowseCarouselCardItem")
@js.native
/**
  * Constructs a new BrowseCarouselCardItem.
  * @param [properties] Properties to set
  */
class BrowseCarouselCardItem_ () extends IBrowseCarouselCardItem {
  def this(properties: IBrowseCarouselCardItem) = this()
  /** BrowseCarouselCardItem description. */
  @JSName("description")
  var description_BrowseCarouselCardItem_ : String = js.native
  /** BrowseCarouselCardItem footer. */
  @JSName("footer")
  var footer_BrowseCarouselCardItem_ : String = js.native
  /** BrowseCarouselCardItem title. */
  @JSName("title")
  var title_BrowseCarouselCardItem_ : String = js.native
  /**
    * Converts this BrowseCarouselCardItem to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

