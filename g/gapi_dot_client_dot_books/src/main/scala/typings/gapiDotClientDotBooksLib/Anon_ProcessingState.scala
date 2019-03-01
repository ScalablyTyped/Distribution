package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProcessingState extends js.Object {
  var processingState: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ProcessingState {
  @scala.inline
  def apply(processingState: java.lang.String = null): Anon_ProcessingState = {
    val __obj = js.Dynamic.literal()
    if (processingState != null) __obj.updateDynamic("processingState")(processingState)
    __obj.asInstanceOf[Anon_ProcessingState]
  }
}

