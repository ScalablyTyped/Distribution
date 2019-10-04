package typings.atEntriaRelayDashExperimental

import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typings.relayDashRuntime.relayDashRuntimeMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental/lib/fetchQuery", JSImport.Namespace)
@js.native
object libFetchQueryMod extends js.Object {
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: TQuery['variables'] */ js.Any
  ): Observable[
    /* import warning: ImportType.apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
  @JSName("fetchQuery")
  def fetchQuery_variables[TQuery /* <: OperationType */](
    environment: Environment,
    query: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: Anon_NetworkCacheConfig
  ): Observable[
    /* import warning: ImportType.apply Failed type conversion: TQuery['response'] */ js.Any
  ] = js.native
}

