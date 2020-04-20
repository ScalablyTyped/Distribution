package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeGuideCategoryResource extends js.Object {
  /**
    * The ETag of the guideCategory resource.
    */
  var etag: String
  /**
    * The ID that YouTube uses to uniquely identify the guide category.
    */
  var id: String
  /**
    * The type of the API resource. For guideCategory resources, the value will be youtube#guideCategory.
    */
  var kind: String
  /**
    * The snippet object contains basic details about the category, such as its title.
    */
  var snippet: AnonTitle
}

object GoogleApiYouTubeGuideCategoryResource {
  @scala.inline
  def apply(etag: String, id: String, kind: String, snippet: AnonTitle): GoogleApiYouTubeGuideCategoryResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeGuideCategoryResource]
  }
}

