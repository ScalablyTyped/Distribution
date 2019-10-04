package typings.atEntriaRelayDashExperimental

import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@entria/relay-experimental/lib/useQuery", JSImport.Namespace)
@js.native
object libUseQueryMod extends js.Object {
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode): /* import warning: ImportType.apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: Null, options: Anon_FetchKey): /* import warning: ImportType.apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useQuery")
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: ImportType.apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useQuery")
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: Anon_FetchKey
  ): /* import warning: ImportType.apply Failed type conversion: TQuery['response'] */ js.Any = js.native
}

