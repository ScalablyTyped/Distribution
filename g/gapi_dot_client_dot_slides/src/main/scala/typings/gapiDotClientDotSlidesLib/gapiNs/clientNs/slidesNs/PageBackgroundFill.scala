package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PageBackgroundFill extends js.Object {
  /**
               * The background fill property state.
               *
               * Updating the fill on a page will implicitly update this field to
               * `RENDERED`, unless another value is specified in the same request. To
               * have no fill on a page, set this field to `NOT_RENDERED`. In this case,
               * any other fill fields set in the same request will be ignored.
               */
  var propertyState: js.UndefOr[java.lang.String] = js.undefined
  /** Solid color fill. */
  var solidFill: js.UndefOr[SolidFill] = js.undefined
  /** Stretched picture fill. */
  var stretchedPictureFill: js.UndefOr[StretchedPictureFill] = js.undefined
}

