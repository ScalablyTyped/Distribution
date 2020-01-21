package typings.entriaRelayExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useRefetchableFragmentNodeMod {
  type RefetchExact[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = js.Function1[
    /* data */ js.UndefOr[js.Any | scala.Null], 
    typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnExact[TQuery, TOptions]
  ]
  type RefetchExactDynamicResponse[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typings.std.ReturnType[
    typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchExact[TQuery, TOptions]
  ]
  type RefetchFn[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnExact[TQuery, TOptions]
  type RefetchFnBase[TVars, TOptions] = js.Function2[
    /* vars */ TVars, 
    /* options */ js.UndefOr[TOptions], 
    typings.relayRuntime.relayRuntimeTypesMod.Disposable
  ]
  type RefetchFnDynamic[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TKey /* <: org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null */, TOptions] = (typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchInexactDynamicResponse[TQuery, TOptions]) with (typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchExactDynamicResponse[TQuery, TOptions])
  type RefetchFnExact[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnBase[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any, 
    TOptions
  ]
  type RefetchFnInexact[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnBase[
    /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any, 
    TOptions
  ]
  type RefetchInexact[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = js.Function1[
    /* data */ js.UndefOr[js.Any], 
    typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchFnInexact[TQuery, TOptions]
  ]
  type RefetchInexactDynamicResponse[TQuery /* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */, TOptions] = typings.std.ReturnType[
    typings.entriaRelayExperimental.useRefetchableFragmentNodeMod.RefetchInexact[TQuery, TOptions]
  ]
}
