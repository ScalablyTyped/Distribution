package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcContextMod {
  type ReadonlyContext = stdLib.Pick[
    Context, 
    stdLib.Exclude[
      java.lang.String, 
      expressDashValidatorLib.expressDashValidatorLibStrings.setData | expressDashValidatorLib.expressDashValidatorLibStrings.addFieldInstances | expressDashValidatorLib.expressDashValidatorLibStrings.addError
    ]
  ]
}
