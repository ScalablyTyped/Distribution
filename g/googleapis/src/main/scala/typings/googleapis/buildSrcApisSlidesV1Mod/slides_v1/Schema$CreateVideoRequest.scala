package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a video.  NOTE: Creating a video from Google Drive requires that
  * the requesting app have at least one of the drive, drive.readonly, or
  * drive.file OAuth scopes.
  */
@js.native
trait Schema$CreateVideoRequest extends js.Object {
  /**
    * The element properties for the video.  The PageElementProperties.size
    * property is optional. If you don&#39;t specify a size, a default size is
    * chosen by the server.  The PageElementProperties.transform property is
    * optional. The transform must not have shear components. If you don&#39;t
    * specify a transform, the video will be placed at the top left corner of
    * the page.
    */
  var elementProperties: js.UndefOr[Schema$PageElementProperties] = js.native
  /**
    * The video source&#39;s unique identifier for this video.  e.g. For
    * YouTube video https://www.youtube.com/watch?v=7U3axjORYZ0, the ID is
    * 7U3axjORYZ0. For a Google Drive video
    * https://drive.google.com/file/d/1xCgQLFTJi5_Xl8DgW_lcUYq5e-q6Hi5Q the ID
    * is 1xCgQLFTJi5_Xl8DgW_lcUYq5e-q6Hi5Q.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A user-supplied object ID.  If you specify an ID, it must be unique among
    * all pages and page elements in the presentation. The ID must start with
    * an alphanumeric character or an underscore (matches regex
    * `[a-zA-Z0-9_]`); remaining characters may include those as well as a
    * hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID
    * must not be less than 5 or greater than 50.  If you don&#39;t specify an
    * ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * The video source.
    */
  var source: js.UndefOr[String] = js.native
}

object Schema$CreateVideoRequest {
  @scala.inline
  def apply(
    elementProperties: Schema$PageElementProperties = null,
    id: String = null,
    objectId: String = null,
    source: String = null
  ): Schema$CreateVideoRequest = {
    val __obj = js.Dynamic.literal()
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateVideoRequest]
  }
}

