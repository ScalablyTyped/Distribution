package typings.fluxDashStandardDashAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fluxDashStandardDashActionMod {
  import typings.std.Error

  type ErrorFSA[CustomError /* <: Error */, Meta, Type /* <: String */] = ErrorFluxStandardAction[Type, CustomError, Meta]
  type ErrorFSAAuto[Type /* <: String */, CustomError /* <: Error */, Meta] = ErrorFluxStandardActionAuto[Type, CustomError, Meta]
  type ErrorFSAWithMeta[Type /* <: String */, CustomError /* <: Error */, Meta] = ErrorFluxStandardActionWithMeta[Type, CustomError, Meta]
  type ErrorFSAWithPayload[Type /* <: String */, CustomError /* <: Error */, Meta] = ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]
  type ErrorFSAWithPayloadAndMeta[Type /* <: String */, CustomError /* <: Error */, Meta] = ErrorFluxStandardActionWithPayloadAndMeta[Type, CustomError, Meta]
  type ErrorFluxStandardActionAuto[Type /* <: String */, CustomError /* <: Error */, Meta] = (ErrorFluxStandardActionWithPayloadAndMeta[Type, CustomError, Meta]) | (ErrorFluxStandardActionWithPayload[Type, CustomError, Meta])
  type ErrorFluxStandardActionWithMeta[Type /* <: String */, CustomError /* <: Error */, Meta] = (ErrorFluxStandardAction[Type, CustomError, Meta]) with (FluxStandardActionWithMeta[Type, CustomError, Meta])
  type ErrorFluxStandardActionWithPayload[Type /* <: String */, CustomError /* <: Error */, Meta] = (ErrorFluxStandardAction[Type, CustomError, Meta]) with (FluxStandardActionWithPayload[Type, CustomError, Meta])
  type ErrorFluxStandardActionWithPayloadAndMeta[Type /* <: String */, CustomError /* <: Error */, Meta] = (ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]) with (ErrorFluxStandardActionWithMeta[Type, CustomError, Meta])
  type FSA[Type /* <: String */, Payload, Meta] = FluxStandardAction[Type, Payload, Meta]
  type FSAAuto[Type /* <: String */, Payload, Meta] = FluxStandardActionAuto[Type, Payload, Meta]
  type FSAWithMeta[Type /* <: String */, Payload, Meta] = FluxStandardActionWithMeta[Type, Payload, Meta]
  type FSAWithPayload[Type /* <: String */, Payload, Meta] = FluxStandardActionWithPayload[Type, Payload, Meta]
  type FSAWithPayloadAndMeta[Type /* <: String */, Payload, Meta] = FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]
  /* Rewritten from type alias, can be one of: 
    - typings.fluxDashStandardDashAction.fluxDashStandardDashActionMod.FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]
    - typings.fluxDashStandardDashAction.fluxDashStandardDashActionMod.FluxStandardActionWithPayload[Type, Payload, Meta]
    - typings.fluxDashStandardDashAction.fluxDashStandardDashActionMod.FluxStandardActionWithMeta[Type, Payload, Meta]
    - typings.fluxDashStandardDashAction.fluxDashStandardDashActionMod.FluxStandardAction[Type, Payload, Meta]
  */
  type FluxStandardActionAuto[Type /* <: String */, Payload, Meta] = (_FluxStandardActionAuto[Type, Payload, Meta]) | (FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta])
  type FluxStandardActionWithPayloadAndMeta[Type /* <: String */, Payload, Meta] = (FluxStandardActionWithPayload[Type, Payload, Meta]) with (FluxStandardActionWithMeta[Type, Payload, Meta])
}
