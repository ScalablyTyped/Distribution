package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Contains settings that specify parameters affecting how the dashboard or dashboard item is exported in Image format.
 */

trait ImageFormatOptions extends js.Object {
  /**
       * Gets or sets an image format in which the dashboard (dashboard item) is exported.
       * Value: A value returned by the DashboardExportImageFormat class that specifies an image format in which the dashboard (dashboard item) is exported.
       */
  var Format: java.lang.String
  /**
       * Gets or sets the resolution (in dpi) used to export a dashboard (dashboard item) in Image format.
       * Value: An integer value that specifies the resolution (in dpi) used to export a dashboard (dashboard item) in Image format.
       */
  var Resolution: scala.Double
}

