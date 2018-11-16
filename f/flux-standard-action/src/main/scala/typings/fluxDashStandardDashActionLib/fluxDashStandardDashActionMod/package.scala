package typings
package fluxDashStandardDashActionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fluxDashStandardDashActionMod {
  type ErrorFSA[CustomError /* <: stdLib.Error */, Meta] = ErrorFluxStandardAction[CustomError, Meta]
  type FSA[Payload, Meta] = FluxStandardAction[Payload, Meta]
}
