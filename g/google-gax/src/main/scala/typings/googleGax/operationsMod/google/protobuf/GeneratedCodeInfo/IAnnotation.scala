package typings.googleGax.operationsMod.google.protobuf.GeneratedCodeInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Annotation. */
trait IAnnotation extends js.Object {
  /** Annotation begin */
  var begin: js.UndefOr[Double | Null] = js.undefined
  /** Annotation end */
  var end: js.UndefOr[Double | Null] = js.undefined
  /** Annotation path */
  var path: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** Annotation sourceFile */
  var sourceFile: js.UndefOr[String | Null] = js.undefined
}

object IAnnotation {
  @scala.inline
  def apply(
    begin: js.UndefOr[Null | Double] = js.undefined,
    end: js.UndefOr[Null | Double] = js.undefined,
    path: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    sourceFile: js.UndefOr[Null | String] = js.undefined
  ): IAnnotation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(begin)) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceFile)) __obj.updateDynamic("sourceFile")(sourceFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnotation]
  }
}

