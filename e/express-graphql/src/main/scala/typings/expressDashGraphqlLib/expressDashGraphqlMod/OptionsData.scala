package typings
package expressDashGraphqlLib.expressDashGraphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsData extends js.Object {
  /**
    * A value to pass as the context to the graphql() function.
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * An optional function which will be used to execute instead of default `execute`
    * from `graphql-js`.
    */
  var customExecuteFn: js.UndefOr[
    (js.Function1[
      /* args */ graphqlLib.executionExecuteMod.ExecutionArgs, 
      js.Promise[
        graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
      ]
    ]) | scala.Null
  ] = js.undefined
  /**
    * An optional function which will be used to format any errors produced by
    * fulfilling a GraphQL operation. If no function is provided, GraphQL's
    * default spec-compliant `formatError` function will be used.
    */
  var customFormatErrorFn: js.UndefOr[(js.Function1[/* error */ graphqlLib.graphqlMod.GraphQLError, _]) | scala.Null] = js.undefined
  /**
    * An optional function which will be used to validate instead of default `validate`
    * from `graphql-js`.
    */
  var customValidateFn: js.UndefOr[
    (js.Function3[
      /* schema */ graphqlLib.graphqlMod.GraphQLSchema, 
      /* documentAST */ graphqlLib.languageAstMod.DocumentNode, 
      /* rules */ js.Array[_], 
      js.Array[graphqlLib.graphqlMod.GraphQLError]
    ]) | scala.Null
  ] = js.undefined
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
    * A resolver function to use when one is not provided by the schema.
    * If not provided, the default field resolver is used (which looks for a
    * value or method on the source value with the field's name).
    */
  var fieldResolver: js.UndefOr[
    (graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]) | scala.Null
  ] = js.undefined
  /**
    * `formatError` is deprecated and replaced by `customFormatErrorFn`. It will
    *  be removed in version 1.0.0.
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
  var validationRules: js.UndefOr[
    (js.Array[
      js.Function1[
        /* ctx */ graphqlLib.graphqlMod.ValidationContext, 
        graphqlLib.languageVisitorMod.ASTVisitor
      ]
    ]) | scala.Null
  ] = js.undefined
}

object OptionsData {
  @scala.inline
  def apply(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    context: js.Any = null,
    customExecuteFn: /* args */ graphqlLib.executionExecuteMod.ExecutionArgs => js.Promise[
      graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
    ] = null,
    customFormatErrorFn: /* error */ graphqlLib.graphqlMod.GraphQLError => _ = null,
    customValidateFn: (/* schema */ graphqlLib.graphqlMod.GraphQLSchema, /* documentAST */ graphqlLib.languageAstMod.DocumentNode, /* rules */ js.Array[_]) => js.Array[graphqlLib.graphqlMod.GraphQLError] = null,
    extensions: /* info */ RequestInfo => org.scalablytyped.runtime.StringDictionary[_] = null,
    fieldResolver: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]] = null,
    formatError: /* error */ graphqlLib.graphqlMod.GraphQLError => _ = null,
    graphiql: js.UndefOr[scala.Boolean] = js.undefined,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    rootValue: js.Any = null,
    validationRules: js.Array[
      js.Function1[
        /* ctx */ graphqlLib.graphqlMod.ValidationContext, 
        graphqlLib.languageVisitorMod.ASTVisitor
      ]
    ] = null
  ): OptionsData = {
    val __obj = js.Dynamic.literal(schema = schema)
    if (context != null) __obj.updateDynamic("context")(context)
    if (customExecuteFn != null) __obj.updateDynamic("customExecuteFn")(js.Any.fromFunction1(customExecuteFn))
    if (customFormatErrorFn != null) __obj.updateDynamic("customFormatErrorFn")(js.Any.fromFunction1(customFormatErrorFn))
    if (customValidateFn != null) __obj.updateDynamic("customValidateFn")(js.Any.fromFunction3(customValidateFn))
    if (extensions != null) __obj.updateDynamic("extensions")(js.Any.fromFunction1(extensions))
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(fieldResolver)
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1(formatError))
    if (!js.isUndefined(graphiql)) __obj.updateDynamic("graphiql")(graphiql)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    __obj.asInstanceOf[OptionsData]
  }
}

