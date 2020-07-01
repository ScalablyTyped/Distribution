package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVolumeannotations extends js.Object {
  /**
    * A list of volume annotations.
    */
  var items: js.UndefOr[js.Array[SchemaVolumeannotation]] = js.native
  /**
    * Resource type
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token to pass in for pagination for the next page. This will not be
    * present if this request does not have more results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of volume annotations found.
    */
  var totalItems: js.UndefOr[Double] = js.native
  /**
    * The version string for all of the volume annotations in this layer (not
    * just the ones in this response). Note: the version string doesn&#39;t
    * apply to the annotation data, just the information in this response (e.g.
    * the location of annotations in the book).
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaVolumeannotations {
  @scala.inline
  def apply(
    items: js.Array[SchemaVolumeannotation] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: js.UndefOr[Double] = js.undefined,
    version: String = null
  ): SchemaVolumeannotations = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVolumeannotations]
  }
}

