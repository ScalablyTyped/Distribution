package typings.esFeatureDetection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.esFeatureDetection.esFeatureDetectionStrings.__all
  - typings.esFeatureDetection.esFeatureDetectionStrings.ArrayDotprototypeDotincludes
  - typings.esFeatureDetection.esFeatureDetectionStrings.TypedArrayDotprototypeDotincludes
*/
trait ES2016Builtins extends js.Object

object ES2016Builtins {
  @scala.inline
  def ArrayDotprototypeDotincludes: typings.esFeatureDetection.esFeatureDetectionStrings.ArrayDotprototypeDotincludes = this.cast("Array.prototype.includes")
  @scala.inline
  def TypedArrayDotprototypeDotincludes: typings.esFeatureDetection.esFeatureDetectionStrings.TypedArrayDotprototypeDotincludes = this.cast("TypedArray.prototype.includes")
  @scala.inline
  def __all: typings.esFeatureDetection.esFeatureDetectionStrings.__all = this.cast("__all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

