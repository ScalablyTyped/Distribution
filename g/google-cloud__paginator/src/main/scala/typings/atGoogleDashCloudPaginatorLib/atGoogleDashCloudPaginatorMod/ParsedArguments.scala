package typings
package atGoogleDashCloudPaginatorLib.atGoogleDashCloudPaginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedArguments
  extends nodeLib.streamMod.internalNs.TransformOptions {
  /**
    * Auto-pagination enabled.
    */
  var autoPaginate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback function.
    */
  var callback: js.UndefOr[js.Function] = js.undefined
  /**
    * Maximum API calls to make.
    */
  var maxApiCalls: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum results to return.
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Query object. This is most commonly an object, but to make the API more
    * simple, it can also be a string in some places.
    */
  var query: js.UndefOr[ParsedArguments] = js.undefined
  var streamOptions: js.UndefOr[ParsedArguments] = js.undefined
}

