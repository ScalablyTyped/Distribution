package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TagSetting extends js.Object {
  /**
               * Additional key-values to be included in tags. Each key-value pair must be of the form key=value, and pairs must be separated by a semicolon (;). Keys
               * and values must not contain commas. For example, id=2;color=red is a valid value for this field.
               */
  var additionalKeyValues: js.UndefOr[java.lang.String] = js.undefined
  /** Whether static landing page URLs should be included in the tags. This setting applies only to placements. */
  var includeClickThroughUrls: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether click-tracking string should be included in the tags. */
  var includeClickTracking: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Option specifying how keywords are embedded in ad tags. This setting can be used to specify whether keyword placeholders are inserted in placement tags
               * for this site. Publishers can then add keywords to those placeholders.
               */
  var keywordOption: js.UndefOr[java.lang.String] = js.undefined
}

