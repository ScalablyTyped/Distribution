package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSlideRequest extends js.Object {
  /**
    * The optional zero-based index indicating where to insert the slides.
    *
    * If you don't specify an index, the new slide is created at the end.
    */
  var insertionIndex: js.UndefOr[Double] = js.undefined
  /**
    * A user-supplied object ID.
    *
    * If you specify an ID, it must be unique among all pages and page elements
    * in the presentation. The ID must start with an alphanumeric character or an
    * underscore (matches regex `[a-zA-Z0-9_]`); remaining characters
    * may include those as well as a hyphen or colon (matches regex
    * `[a-zA-Z0-9_-:]`).
    * The length of the ID must not be less than 5 or greater than 50.
    *
    * If you don't specify an ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.undefined
  /**
    * An optional list of object ID mappings from the placeholder(s) on the layout to the placeholder(s)
    * that will be created on the new slide from that specified layout. Can only
    * be used when `slide_layout_reference` is specified.
    */
  var placeholderIdMappings: js.UndefOr[js.Array[LayoutPlaceholderIdMapping]] = js.undefined
  /**
    * Layout reference of the slide to be inserted, based on the &#42;current
    * master&#42;, which is one of the following:
    *
    * - The master of the previous slide index.
    * - The master of the first slide, if the insertion_index is zero.
    * - The first master in the presentation, if there are no slides.
    *
    * If the LayoutReference is not found in the current master, a 400 bad
    * request error is returned.
    *
    * If you don't specify a layout reference, then the new slide will use the
    * predefined layout `BLANK`.
    */
  var slideLayoutReference: js.UndefOr[LayoutReference] = js.undefined
}

object CreateSlideRequest {
  @scala.inline
  def apply(
    insertionIndex: Int | Double = null,
    objectId: String = null,
    placeholderIdMappings: js.Array[LayoutPlaceholderIdMapping] = null,
    slideLayoutReference: LayoutReference = null
  ): CreateSlideRequest = {
    val __obj = js.Dynamic.literal()
    if (insertionIndex != null) __obj.updateDynamic("insertionIndex")(insertionIndex.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (placeholderIdMappings != null) __obj.updateDynamic("placeholderIdMappings")(placeholderIdMappings.asInstanceOf[js.Any])
    if (slideLayoutReference != null) __obj.updateDynamic("slideLayoutReference")(slideLayoutReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSlideRequest]
  }
}

