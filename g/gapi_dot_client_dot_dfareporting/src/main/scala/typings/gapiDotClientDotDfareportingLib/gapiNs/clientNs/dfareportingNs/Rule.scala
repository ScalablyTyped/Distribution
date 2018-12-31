package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rule extends js.Object {
  /** A creativeAssets[].id. This should refer to one of the parent assets in this creative. This is a required field. */
  var assetId: js.UndefOr[java.lang.String] = js.undefined
  /** A user-friendly name for this rule. This is a required field. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A targeting template ID. The targeting from the targeting template will be used to determine whether this asset should be served. This is a required
    * field.
    */
  var targetingTemplateId: js.UndefOr[java.lang.String] = js.undefined
}

