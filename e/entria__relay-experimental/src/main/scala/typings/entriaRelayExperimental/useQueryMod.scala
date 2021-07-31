package typings.entriaRelayExperimental

import typings.entriaRelayExperimental.anon.FetchKey
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useQueryMod {
  
  @JSImport("@entria/relay-experimental/lib/useQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(gqlQuery.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  @scala.inline
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: Null, options: FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  @scala.inline
  def useQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, variables: Unit, options: FetchKey): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  
  @scala.inline
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
  @scala.inline
  def useQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: FetchKey
  ): /* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(gqlQuery.asInstanceOf[js.Any], variables.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TQuery['response'] */ js.Any]
}
