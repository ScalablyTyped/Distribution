package typings.esFeatureDetection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<es-feature-detection.es-feature-detection.ES2016Syntax, boolean> */
trait RecordES2016Syntaxboolean extends js.Object {
  var `Exponentiation operator`: Boolean
  var `Rest destructuring`: Boolean
  var __all: Boolean
}

object RecordES2016Syntaxboolean {
  @scala.inline
  def apply(`Exponentiation operator`: Boolean, `Rest destructuring`: Boolean, __all: Boolean): RecordES2016Syntaxboolean = {
    val __obj = js.Dynamic.literal(__all = __all.asInstanceOf[js.Any])
    __obj.updateDynamic("Exponentiation operator")((`Exponentiation operator`).asInstanceOf[js.Any])
    __obj.updateDynamic("Rest destructuring")((`Rest destructuring`).asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordES2016Syntaxboolean]
  }
}

