package typings.gapiDotClientDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  /**
    * True if the photo is a default photo;
    * false if the photo is a user-provided photo.
    */
  var default: js.UndefOr[Boolean] = js.undefined
  /** Metadata about the photo. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The URL of the photo. You can change the desired size by appending a query
    * parameter `sz=`<var>size</var> at the end of the url. Example:
    * `https://lh3.googleusercontent.com/-T_wVWLlmg7w/AAAAAAAAAAI/AAAAAAAABa8/00gzXvDBYqw/s100/photo.jpg?sz=50`
    */
  var url: js.UndefOr[String] = js.undefined
}

object Photo {
  @scala.inline
  def apply(default: js.UndefOr[Boolean] = js.undefined, metadata: FieldMetadata = null, url: String = null): Photo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Photo]
  }
}

