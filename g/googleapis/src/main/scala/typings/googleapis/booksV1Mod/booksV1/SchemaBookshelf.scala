package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBookshelf extends js.Object {
  /**
    * Whether this bookshelf is PUBLIC or PRIVATE.
    */
  var access: js.UndefOr[String] = js.native
  /**
    * Created time for this bookshelf (formatted UTC timestamp with millisecond
    * resolution).
    */
  var created: js.UndefOr[String] = js.native
  /**
    * Description of this bookshelf.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Id of this bookshelf, only unique by user.
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * Resource type for bookshelf metadata.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * URL to this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Title of this bookshelf.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Last modified time of this bookshelf (formatted UTC timestamp with
    * millisecond resolution).
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Number of volumes in this bookshelf.
    */
  var volumeCount: js.UndefOr[Double] = js.native
  /**
    * Last time a volume was added or removed from this bookshelf (formatted
    * UTC timestamp with millisecond resolution).
    */
  var volumesLastUpdated: js.UndefOr[String] = js.native
}

object SchemaBookshelf {
  @scala.inline
  def apply(
    access: String = null,
    created: String = null,
    description: String = null,
    id: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    selfLink: String = null,
    title: String = null,
    updated: String = null,
    volumeCount: js.UndefOr[Double] = js.undefined,
    volumesLastUpdated: String = null
  ): SchemaBookshelf = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (!js.isUndefined(volumeCount)) __obj.updateDynamic("volumeCount")(volumeCount.get.asInstanceOf[js.Any])
    if (volumesLastUpdated != null) __obj.updateDynamic("volumesLastUpdated")(volumesLastUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBookshelf]
  }
}

