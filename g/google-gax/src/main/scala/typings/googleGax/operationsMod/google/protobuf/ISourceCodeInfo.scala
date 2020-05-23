package typings.googleGax.operationsMod.google.protobuf

import typings.googleGax.operationsMod.google.protobuf.SourceCodeInfo.ILocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SourceCodeInfo. */
trait ISourceCodeInfo extends js.Object {
  /** SourceCodeInfo location */
  var location: js.UndefOr[js.Array[ILocation] | Null] = js.undefined
}

object ISourceCodeInfo {
  @scala.inline
  def apply(location: js.UndefOr[Null | js.Array[ILocation]] = js.undefined): ISourceCodeInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceCodeInfo]
  }
}

