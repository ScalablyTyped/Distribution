package typings.dialogflow.protosProtosMod.google.protobuf.GeneratedCodeInfo

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
    begin: Int | Double = null,
    end: Int | Double = null,
    path: js.Array[Double] = null,
    sourceFile: String = null
  ): IAnnotation = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(begin.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (sourceFile != null) __obj.updateDynamic("sourceFile")(sourceFile)
    __obj.asInstanceOf[IAnnotation]
  }
}

