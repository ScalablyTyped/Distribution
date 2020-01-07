package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A guideCategory resource identifies a category that YouTube algorithmically
  * assigns based on a channel&#39;s content or other indicators, such as the
  * channel&#39;s popularity. The list is similar to video categories, with the
  * difference being that a video&#39;s uploader can assign a video category
  * but only YouTube can assign a channel category.
  */
@js.native
trait Schema$GuideCategory extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the guide category.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#guideCategory&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the category, such as its
    * title.
    */
  var snippet: js.UndefOr[Schema$GuideCategorySnippet] = js.native
}

object Schema$GuideCategory {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: Schema$GuideCategorySnippet = null
  ): Schema$GuideCategory = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GuideCategory]
  }
}

