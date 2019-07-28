package typings.atGoogleDashCloudPaginator.atGoogleDashCloudPaginatorMod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLimiterOptions extends js.Object {
  /**
    * The maximum number of API calls to make.
    */
  var maxApiCalls: js.UndefOr[Double] = js.undefined
  /**
    * Options to pass to the Stream constructor.
    */
  var streamOptions: js.UndefOr[TransformOptions] = js.undefined
}

object CreateLimiterOptions {
  @scala.inline
  def apply(maxApiCalls: Int | Double = null, streamOptions: TransformOptions = null): CreateLimiterOptions = {
    val __obj = js.Dynamic.literal()
    if (maxApiCalls != null) __obj.updateDynamic("maxApiCalls")(maxApiCalls.asInstanceOf[js.Any])
    if (streamOptions != null) __obj.updateDynamic("streamOptions")(streamOptions)
    __obj.asInstanceOf[CreateLimiterOptions]
  }
}

