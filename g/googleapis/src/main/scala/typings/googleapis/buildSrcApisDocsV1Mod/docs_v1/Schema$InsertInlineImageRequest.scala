package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inserts an InlineObject containing an image at the given location.
  */
@js.native
trait Schema$InsertInlineImageRequest extends js.Object {
  /**
    * Inserts the text at the end of a header, footer or the document body.
    * Inline images cannot be inserted inside a footnote.
    */
  var endOfSegmentLocation: js.UndefOr[Schema$EndOfSegmentLocation] = js.native
  /**
    * Inserts the image at a specific index in the document.  The image must be
    * inserted inside the bounds of an existing Paragraph. For instance, it
    * cannot be inserted at a table&#39;s start index (i.e. between the table
    * and its preceding paragraph).  Inline images cannot be inserted inside a
    * footnote or equation.
    */
  var location: js.UndefOr[Schema$Location] = js.native
  /**
    * The size that the image should appear as in the document. This property
    * is optional and the final size of the image in the document is determined
    * by the following rules:  * If neither width nor height is specified, then
    * a default size of the  image is calculated based on its resolution.  * If
    * one dimension is specified then the other dimension is calculated to
    * preserve the aspect ratio of the image.  * If both width and height are
    * specified, the image is scaled to fit  within the provided dimensions
    * while maintaining its aspect ratio.
    */
  var objectSize: js.UndefOr[Schema$Size] = js.native
  /**
    * The image URI.  The image is fetched once at insertion time and a copy is
    * stored for display inside the document. Images must be less than 50MB in
    * size, cannot exceed 25 megapixels, and must be in one of PNG, JPEG, or
    * GIF format.  The provided URI can be at most 2 kB in length. The URI
    * itself is saved with the image, and exposed via the
    * ImageProperties.content_uri field.
    */
  var uri: js.UndefOr[String] = js.native
}

object Schema$InsertInlineImageRequest {
  @scala.inline
  def apply(
    endOfSegmentLocation: Schema$EndOfSegmentLocation = null,
    location: Schema$Location = null,
    objectSize: Schema$Size = null,
    uri: String = null
  ): Schema$InsertInlineImageRequest = {
    val __obj = js.Dynamic.literal()
    if (endOfSegmentLocation != null) __obj.updateDynamic("endOfSegmentLocation")(endOfSegmentLocation.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (objectSize != null) __obj.updateDynamic("objectSize")(objectSize.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InsertInlineImageRequest]
  }
}

