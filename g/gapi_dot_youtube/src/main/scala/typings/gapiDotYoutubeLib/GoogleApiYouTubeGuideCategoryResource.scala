package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeGuideCategoryResource extends js.Object {
  /**
    * The ETag of the guideCategory resource.
    */
  var etag: java.lang.String
  /**
    * The ID that YouTube uses to uniquely identify the guide category.
    */
  var id: java.lang.String
  /**
    * The type of the API resource. For guideCategory resources, the value will be youtube#guideCategory.
    */
  var kind: java.lang.String
  /**
    * The snippet object contains basic details about the category, such as its title.
    */
  var snippet: Anon_ChannelIdTitle
}

object GoogleApiYouTubeGuideCategoryResource {
  @scala.inline
  def apply(etag: java.lang.String, id: java.lang.String, kind: java.lang.String, snippet: Anon_ChannelIdTitle): GoogleApiYouTubeGuideCategoryResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[GoogleApiYouTubeGuideCategoryResource]
  }
}

