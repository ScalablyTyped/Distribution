package typings.esFeatureDetection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2017Syntax, boolean> */
trait RecordES2017Syntaxboolean extends js.Object {
  var `Trailing parameter commas`: Boolean
  var __all: Boolean
  @JSName("async/await")
  var asyncSlashawait: Boolean
}

object RecordES2017Syntaxboolean {
  @scala.inline
  def apply(`Trailing parameter commas`: Boolean, __all: Boolean, asyncSlashawait: Boolean): RecordES2017Syntaxboolean = {
    val __obj = js.Dynamic.literal(__all = __all.asInstanceOf[js.Any])
    __obj.updateDynamic("Trailing parameter commas")((`Trailing parameter commas`).asInstanceOf[js.Any])
    __obj.updateDynamic("async/await")(asyncSlashawait.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordES2017Syntaxboolean]
  }
}

