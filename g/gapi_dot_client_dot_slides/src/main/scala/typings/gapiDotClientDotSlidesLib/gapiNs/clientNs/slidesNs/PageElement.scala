package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PageElement extends js.Object {
  /**
               * The description of the page element. Combined with title to display alt
               * text.
               */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** A collection of page elements joined as a single unit. */
  var elementGroup: js.UndefOr[Group] = js.undefined
  /** An image page element. */
  var image: js.UndefOr[Image] = js.undefined
  /** A line page element. */
  var line: js.UndefOr[Line] = js.undefined
  /**
               * The object ID for this page element. Object IDs used by
               * google.apps.slides.v1.Page and
               * google.apps.slides.v1.PageElement share the same namespace.
               */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /** A generic shape. */
  var shape: js.UndefOr[Shape] = js.undefined
  /**
               * A linked chart embedded from Google Sheets. Unlinked charts are
               * represented as images.
               */
  var sheetsChart: js.UndefOr[SheetsChart] = js.undefined
  /** The size of the page element. */
  var size: js.UndefOr[Size] = js.undefined
  /** A table page element. */
  var table: js.UndefOr[Table] = js.undefined
  /**
               * The title of the page element. Combined with description to display alt
               * text.
               */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The transform of the page element.
               *
               * The visual appearance of the page element is determined by its absolute
               * transform. To compute the absolute transform, preconcatenate a page
               * element's transform with the transforms of all of its parent groups. If the
               * page element is not in a group, its absolute transform is the same as the
               * value in this field.
               *
               * The initial transform for the newly created Group is always the identity transform.
               */
  var transform: js.UndefOr[AffineTransform] = js.undefined
  /** A video page element. */
  var video: js.UndefOr[Video] = js.undefined
  /** A word art page element. */
  var wordArt: js.UndefOr[WordArt] = js.undefined
}

