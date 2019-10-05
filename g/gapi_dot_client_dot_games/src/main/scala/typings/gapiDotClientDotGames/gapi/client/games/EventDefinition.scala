package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDefinition extends js.Object {
  /** A list of events that are a child of this event. */
  var childEvents: js.UndefOr[js.Array[EventChild]] = js.undefined
  /** Description of what this event represents. */
  var description: js.UndefOr[String] = js.undefined
  /** The name to display for the event. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The ID of the event. */
  var id: js.UndefOr[String] = js.undefined
  /** The base URL for the image that represents the event. */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** Indicates whether the icon image being returned is a default image, or is game-provided. */
  var isDefaultImageUrl: js.UndefOr[Boolean] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventDefinition. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The visibility of event being tracked in this definition.
    * Possible values are:
    * - "REVEALED": This event should be visible to all users.
    * - "HIDDEN": This event should only be shown to users that have recorded this event at least once.
    */
  var visibility: js.UndefOr[String] = js.undefined
}

object EventDefinition {
  @scala.inline
  def apply(
    childEvents: js.Array[EventChild] = null,
    description: String = null,
    displayName: String = null,
    id: String = null,
    imageUrl: String = null,
    isDefaultImageUrl: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    visibility: String = null
  ): EventDefinition = {
    val __obj = js.Dynamic.literal()
    if (childEvents != null) __obj.updateDynamic("childEvents")(childEvents)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (!js.isUndefined(isDefaultImageUrl)) __obj.updateDynamic("isDefaultImageUrl")(isDefaultImageUrl)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[EventDefinition]
  }
}

