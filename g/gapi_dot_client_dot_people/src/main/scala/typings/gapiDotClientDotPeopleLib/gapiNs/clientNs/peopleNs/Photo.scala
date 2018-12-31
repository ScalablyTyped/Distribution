package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  /**
    * True if the photo is a default photo;
    * false if the photo is a user-provided photo.
    */
  var default: js.UndefOr[scala.Boolean] = js.undefined
  /** Metadata about the photo. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /**
    * The URL of the photo. You can change the desired size by appending a query
    * parameter `sz=`<var>size</var> at the end of the url. Example:
    * `https://lh3.googleusercontent.com/-T_wVWLlmg7w/AAAAAAAAAAI/AAAAAAAABa8/00gzXvDBYqw/s100/photo.jpg?sz=50`
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

