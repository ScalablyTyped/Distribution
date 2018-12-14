package typings
package expressDashGraphqlLib.expressDashGraphqlMod.graphqlHTTPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptionsData extends js.Object {
  /**
           * A value to pass as the context to the graphql() function.
           */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
           * An optional function for adding additional metadata to the GraphQL response
           * as a key-value object. The result will be added to "extensions" field in
           * the resulting JSON. This is often a useful place to add development time
           * info such as the runtime of a query or the amount of resources consumed.
           *
           * Information about the request is provided to be used.
           *
           * This function may be async.
           */
  var extensions: js.UndefOr[
    (js.Function1[/* info */ RequestInfo, org.scalablytyped.runtime.StringDictionary[_]]) | scala.Null
  ] = js.undefined
  /**
           * An optional function which will be used to format any errors produced by
           * fulfilling a GraphQL operation. If no function is provided, GraphQL's
           * default spec-compliant `formatError` function will be used.
           */
  var formatError: js.UndefOr[(js.Function1[/* error */ graphqlLib.graphqlMod.GraphQLError, _]) | scala.Null] = js.undefined
  /**
           * A boolean to optionally enable GraphiQL mode.
           */
  var graphiql: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
           * A boolean to configure whether the output should be pretty-printed.
           */
  var pretty: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
           * An object to pass as the rootValue to the graphql() function.
           */
  var rootValue: js.UndefOr[js.Any] = js.undefined
  /**
           * A GraphQL schema from graphql-js.
           */
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  /**
           * An optional array of validation rules that will be applied on the document
           * in additional to those defined by the GraphQL spec.
           */
  var validationRules: js.UndefOr[js.Array[_] | scala.Null] = js.undefined
}

