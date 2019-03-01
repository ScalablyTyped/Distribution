package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Part extends js.Object {
  /**
    * HTTP Request Body
    */
  var RequestBody: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. The part names that you can include in the parameter value are snippet and status. Note that this method will override the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies. For example, a playlist's privacy setting is contained in the status part. As such, if your request is updating a private playlist, and the request's part parameter value includes the status part, the playlist's privacy setting will be updated to whatever value the request body specifies. If the request body does not specify a value, the existing privacy setting will be removed and the playlist will revert to the default privacy setting.
    */
  var part: java.lang.String
}

object Anon_Part {
  @scala.inline
  def apply(part: java.lang.String, RequestBody: java.lang.String = null): Anon_Part = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("part")(part)
    if (RequestBody != null) __obj.updateDynamic("RequestBody")(RequestBody)
    __obj.asInstanceOf[Anon_Part]
  }
}

