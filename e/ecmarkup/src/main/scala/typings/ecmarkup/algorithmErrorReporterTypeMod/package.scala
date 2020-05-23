package typings.ecmarkup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object algorithmErrorReporterTypeMod {
  type Reporter = js.Function2[
    /* lintingError */ js.Array[typings.ecmarkup.algorithmErrorReporterTypeMod.LintingError], 
    /* sourceText */ java.lang.String, 
    scala.Unit
  ]
}
