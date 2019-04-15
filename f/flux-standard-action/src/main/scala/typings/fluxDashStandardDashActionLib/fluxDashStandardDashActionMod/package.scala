package typings
package fluxDashStandardDashActionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fluxDashStandardDashActionMod {
  type ErrorFSA[CustomError /* <: stdLib.Error */, Meta, Type /* <: java.lang.String */] = ErrorFluxStandardAction[Type, CustomError, Meta]
  type ErrorFSAAuto[Type /* <: java.lang.String */, CustomError /* <: stdLib.Error */, Meta] = ErrorFluxStandardActionAuto[Type, CustomError, Meta]
  type ErrorFSAWithMeta[Type /* <: java.lang.String */, CustomError /* <: stdLib.Error */, Meta] = ErrorFluxStandardActionWithMeta[Type, CustomError, Meta]
  type ErrorFSAWithPayload[Type /* <: java.lang.String */, CustomError /* <: stdLib.Error */, Meta] = ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]
  type ErrorFSAWithPayloadAndMeta[Type /* <: java.lang.String */, CustomError /* <: stdLib.Error */, Meta] = ErrorFluxStandardActionWithPayloadAndMeta[Type, CustomError, Meta]
  type ErrorFluxStandardActionAuto[Type /* <: java.lang.String */, CustomError /* <: stdLib.Error */, Meta] = (ErrorFluxStandardActionWithPayloadAndMeta[Type, CustomError, Meta]) | (ErrorFluxStandardActionWithPayload[Type, CustomError, Meta])
  type ErrorFluxStandardActionWithMeta[Type /* <: java.lang.String */, CustomError /* <: stdLib.Error */, Meta] = (ErrorFluxStandardAction[Type, CustomError, Meta]) with (FluxStandardActionWithMeta[Type, CustomError, Meta])
  type ErrorFluxStandardActionWithPayload[Type /* <: java.lang.String */, CustomError /* <: stdLib.Error */, Meta] = (ErrorFluxStandardAction[Type, CustomError, Meta]) with (FluxStandardActionWithPayload[Type, CustomError, Meta])
  type ErrorFluxStandardActionWithPayloadAndMeta[Type /* <: java.lang.String */, CustomError /* <: stdLib.Error */, Meta] = (ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]) with (ErrorFluxStandardActionWithMeta[Type, CustomError, Meta])
  type FSA[Type /* <: java.lang.String */, Payload, Meta] = FluxStandardAction[Type, Payload, Meta]
  type FSAAuto[Type /* <: java.lang.String */, Payload, Meta] = FluxStandardActionAuto[Type, Payload, Meta]
  type FSAWithMeta[Type /* <: java.lang.String */, Payload, Meta] = FluxStandardActionWithMeta[Type, Payload, Meta]
  type FSAWithPayload[Type /* <: java.lang.String */, Payload, Meta] = FluxStandardActionWithPayload[Type, Payload, Meta]
  type FSAWithPayloadAndMeta[Type /* <: java.lang.String */, Payload, Meta] = FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]
  /* Rewritten from type alias, can be one of: 
    - FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]
    - FluxStandardActionWithPayload[Type, Payload, Meta]
    - FluxStandardActionWithMeta[Type, Payload, Meta]
    - FluxStandardAction[Type, Payload, Meta]
  */
  type FluxStandardActionAuto[Type /* <: java.lang.String */, Payload, Meta] = (_FluxStandardActionAuto[Type, Payload, Meta]) | (FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta])
  type FluxStandardActionWithPayloadAndMeta[Type /* <: java.lang.String */, Payload, Meta] = (FluxStandardActionWithPayload[Type, Payload, Meta]) with (FluxStandardActionWithMeta[Type, Payload, Meta])
}
