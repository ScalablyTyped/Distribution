package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bookshelf extends js.Object {
  /** Whether this bookshelf is PUBLIC or PRIVATE. */
  var access: js.UndefOr[String] = js.undefined
  /** Created time for this bookshelf (formatted UTC timestamp with millisecond resolution). */
  var created: js.UndefOr[String] = js.undefined
  /** Description of this bookshelf. */
  var description: js.UndefOr[String] = js.undefined
  /** Id of this bookshelf, only unique by user. */
  var id: js.UndefOr[Double] = js.undefined
  /** Resource type for bookshelf metadata. */
  var kind: js.UndefOr[String] = js.undefined
  /** URL to this resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Title of this bookshelf. */
  var title: js.UndefOr[String] = js.undefined
  /** Last modified time of this bookshelf (formatted UTC timestamp with millisecond resolution). */
  var updated: js.UndefOr[String] = js.undefined
  /** Number of volumes in this bookshelf. */
  var volumeCount: js.UndefOr[Double] = js.undefined
  /** Last time a volume was added or removed from this bookshelf (formatted UTC timestamp with millisecond resolution). */
  var volumesLastUpdated: js.UndefOr[String] = js.undefined
}

object Bookshelf {
  @scala.inline
  def apply(
    access: String = null,
    created: String = null,
    description: String = null,
    id: Int | Double = null,
    kind: String = null,
    selfLink: String = null,
    title: String = null,
    updated: String = null,
    volumeCount: Int | Double = null,
    volumesLastUpdated: String = null
  ): Bookshelf = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (volumeCount != null) __obj.updateDynamic("volumeCount")(volumeCount.asInstanceOf[js.Any])
    if (volumesLastUpdated != null) __obj.updateDynamic("volumesLastUpdated")(volumesLastUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bookshelf]
  }
}

