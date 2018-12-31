package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDefinition extends js.Object {
  /** A list of events that are a child of this event. */
  var childEvents: js.UndefOr[js.Array[EventChild]] = js.undefined
  /** Description of what this event represents. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The name to display for the event. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the event. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The base URL for the image that represents the event. */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the icon image being returned is a default image, or is game-provided. */
  var isDefaultImageUrl: js.UndefOr[scala.Boolean] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventDefinition. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The visibility of event being tracked in this definition.
    * Possible values are:
    * - "REVEALED": This event should be visible to all users.
    * - "HIDDEN": This event should only be shown to users that have recorded this event at least once.
    */
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

