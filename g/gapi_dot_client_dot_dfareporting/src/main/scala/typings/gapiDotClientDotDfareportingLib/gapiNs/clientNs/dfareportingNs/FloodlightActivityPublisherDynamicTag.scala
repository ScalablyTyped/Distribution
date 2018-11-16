package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FloodlightActivityPublisherDynamicTag extends js.Object {
  /** Whether this tag is applicable only for click-throughs. */
  var clickThrough: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Directory site ID of this dynamic tag. This is a write-only field that can be used as an alternative to the siteId field. When this resource is
               * retrieved, only the siteId field will be populated.
               */
  var directorySiteId: js.UndefOr[java.lang.String] = js.undefined
  /** Dynamic floodlight tag. */
  var dynamicTag: js.UndefOr[FloodlightActivityDynamicTag] = js.undefined
  /** Site ID of this dynamic tag. */
  var siteId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the site. This is a read-only, auto-generated field. */
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether this tag is applicable only for view-throughs. */
  var viewThrough: js.UndefOr[scala.Boolean] = js.undefined
}

