package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a line.
  */
@js.native
trait Schema$CreateLineRequest extends js.Object {
  /**
    * The category of the line to be created.  The exact line type created is
    * determined based on the category and how it&#39;s routed to connect to
    * other page elements.  If you specify both a `category` and a
    * `line_category`, the `category` takes precedence.  If you do not specify
    * a value for `category`, but specify a value for `line_category`, then the
    * specified `line_category` value is used.  If you do not specify either,
    * then STRAIGHT is used.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * The element properties for the line.
    */
  var elementProperties: js.UndefOr[Schema$PageElementProperties] = js.native
  /**
    * The category of the line to be created.  &lt;b&gt;Deprecated&lt;/b&gt;:
    * use `category` instead.  The exact line type created is determined based
    * on the category and how it&#39;s routed to connect to other page
    * elements.  If you specify both a `category` and a `line_category`, the
    * `category` takes precedence.
    */
  var lineCategory: js.UndefOr[String] = js.native
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
}

object Schema$CreateLineRequest {
  @scala.inline
  def apply(
    category: String = null,
    elementProperties: Schema$PageElementProperties = null,
    lineCategory: String = null,
    objectId: String = null
  ): Schema$CreateLineRequest = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties.asInstanceOf[js.Any])
    if (lineCategory != null) __obj.updateDynamic("lineCategory")(lineCategory.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateLineRequest]
  }
}

