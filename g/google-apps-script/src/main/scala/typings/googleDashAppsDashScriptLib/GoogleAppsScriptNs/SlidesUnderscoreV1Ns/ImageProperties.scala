package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ImageProperties extends js.Object {
  // The brightness effect of the image. The value should be in the interval
  // [-1.0, 1.0], where 0 means no effect. This property is read-only.
  var brightness: scala.Double
  // The contrast effect of the image. The value should be in the interval
  // [-1.0, 1.0], where 0 means no effect. This property is read-only.
  var contrast: scala.Double
  // The crop properties of the image. If not set, the image is not cropped.
  // This property is read-only.
  var crop_properties: CropProperties
  // The hyperlink destination of the image. If unset, there is no link.
  var link: Link
  // The outline of the image. If not set, the image has no outline.
  var outline: Outline
  // The recolor effect of the image. If not set, the image is not recolored.
  // This property is read-only.
  var recolor: Recolor
  // The shadow of the image. If not set, the image has no shadow. This property
  // is read-only.
  var shadow: Shadow
  // The transparency effect of the image. The value should be in the interval
  // [0.0, 1.0], where 0 means no effect and 1 means completely transparent.
  // This property is read-only.
  var transparency: scala.Double
}

