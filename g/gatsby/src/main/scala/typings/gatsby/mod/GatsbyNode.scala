package typings.gatsby.mod

import typings.gatsby.AnonInitialcreatePages
import typings.gatsby.AnonInitialcreatePagesStatefully
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyNode extends js.Object {
  /**
    * Tell plugins to add pages. This extension point is called only after the initial
    * sourcing and transformation of nodes plus creation of the GraphQL schema are
    * complete so you can query your data in order to create pages.
    *
    * @see https://www.gatsbyjs.org/docs/node-apis/#createPages
    */
  var createPages: js.UndefOr[
    js.Function3[
      /* args */ CreatePagesArgs with AnonInitialcreatePages, 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /**
    * Like `createPages` but for plugins who want to manage creating and removing
    * pages themselves in response to changes in data *not* managed by Gatsby.
    * Plugins implementing `createPages` will get called regularly to recompute
    * page information as Gatsby's data changes but those implementing
    * `createPagesStatefully` will not.
    *
    * An example of a plugin that uses this extension point is the plugin
    * [gatsby-plugin-page-creator](https://github.com/gatsbyjs/gatsby/tree/master/packages/gatsby-plugin-page-creator)
    * which monitors the `src/pages` directory for the adding and removal of JS
    * pages. As its source of truth, files in the pages directory, is not known by
    * Gatsby, it needs to keep its own state about its world to know when to
    * add and remove pages.
    */
  var createPagesStatefully: js.UndefOr[
    js.Function3[
      /* args */ CreatePagesArgs with AnonInitialcreatePagesStatefully, 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /**
    * Add custom field resolvers to the GraphQL schema.
    *
    * Allows adding new fields to types by providing field configs, or adding resolver
    * functions to existing fields.
    *
    * Things to note:
    * * Overriding field types is disallowed, instead use the `createTypes`
    *   action. In case of types added from third-party schemas, where this is not
    *   possible, overriding field types is allowed.
    * * New fields will not be available on `filter` and `sort` input types. Extend
    *   types defined with `createTypes` if you need this.
    * * In field configs, types can be referenced as strings.
    * * When extending a field with an existing field resolver, the original
    *   resolver function is available from `info.originalResolver`.
    * * The `createResolvers` API is called as the last step in schema generation.
    *   Thus, an intermediate schema is made available on the `schema` property.
    *   In resolver functions themselves, it is recommended to access the final
    *   built schema from `info.schema`.
    * * Gatsby's data layer, including all internal query capabilities, is
    *   exposed on [`context.nodeModel`](/docs/node-model/). The node store can be
    *   queried directly with `getAllNodes`, `getNodeById` and `getNodesByIds`,
    *   while more advanced queries can be composed with `runQuery`. Note that
    *   `runQuery` will call field resolvers before querying, so e.g. foreign-key
    *   fields will be expanded to full nodes. The other methods on `nodeModel`
    *   don't do this.
    * * It is possible to add fields to the root `Query` type.
    * * When using the first resolver argument (`source` in the example below,
    *   often also called `parent` or `root`), take care of the fact that field
    *   resolvers can be called more than once in a query, e.g. when the field is
    *   present both in the input filter and in the selection set. This means that
    *   foreign-key fields on `source` can be either resolved or not-resolved.
    *
    * For fuller examples, see [`using-type-definitions`](https://github.com/gatsbyjs/gatsby/tree/master/examples/using-type-definitions).
    *
    * @see https://www.gatsbyjs.org/docs/node-apis/#createResolvers
    */
  var createResolvers: js.UndefOr[
    (js.Function2[/* args */ CreateResolversArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ CreateResolversArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
      /* args */ CreateResolversArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ])
  ] = js.undefined
  /**
    * Customize Gatsby’s GraphQL schema by creating type definitions, field extensions or adding third-party schemas.
    * The createTypes, createFieldExtension and addThirdPartySchema actions are only available in this API.
    *
    * For details on their usage please refer to the actions documentation.
    *
    * This API runs immediately before schema generation. For modifications of the generated schema, e.g.
    * to customize added third-party types, use the createResolvers API.
    * @see https://www.gatsbyjs.org/docs/node-apis/#createSchemaCustomization
    */
  var createSchemaCustomization: js.UndefOr[
    (js.Function2[/* args */ CreateSchemaCustomizationArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ CreateSchemaCustomizationArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
      /* args */ CreateSchemaCustomizationArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ])
  ] = js.undefined
  /**
    * Let plugins extend/mutate the site's Babel configuration.
    * This API will change before 2.0 as it needs still to be converted to use
    * Redux actions.
    */
  var onCreateBabelConfig: js.UndefOr[
    js.Function3[
      /* args */ CreateBabelConfigArgs, 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /**
    * Run when gatsby develop server is started, its useful to add proxy and middleware
    * to the dev server app
    * @param {object} $0
    * @param {Express} $0.app The [Express app](https://expressjs.com/en/4x/api.html#app) used to run the dev server
    *
    * @example
    *
    * exports.onCreateDevServer = ({ app }) => {
    *   app.get('/hello', function (req, res) {
    *     res.send('hello world')
    *   })
    * }
    */
  var onCreateDevServer: js.UndefOr[
    js.Function3[
      /* args */ CreateDevServerArgs, 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /**
    * Called when a new node is created. Plugins wishing to extend or
    * transform nodes created by other plugins should implement this API.
    *
    * See also the documentation for `createNode`
    * and [`createNodeField`](https://www.gatsbyjs.org/docs/actions/#createNodeField)
    * @example
    * exports.onCreateNode = ({ node, actions }) => {
    *   const { createNode, createNodeField } = actions
    *   // Transform the new node here and create a new node or
    *   // create a new node field.
    * }
    */
  var onCreateNode: js.UndefOr[
    js.Function3[
      /* args */ CreateNodeArgs[js.Object], 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /**
    * Called when a new page is created. This extension API is useful
    * for programmatically manipulating pages created by other plugins e.g.
    * if you want paths without trailing slashes.
    *
    * See the guide [Creating and Modifying Pages](https://www.gatsbyjs.org/docs/creating-and-modifying-pages/)
    * for more on this API.
    */
  var onCreatePage: js.UndefOr[
    js.Function3[
      /* args */ CreatePageArgs[Record[String, _]], 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /**
    * Let plugins extend/mutate the site's webpack configuration.
    * @see https://www.gatsbyjs.org/docs/node-apis/#onCreateWebpackConfig
    */
  var onCreateWebpackConfig: js.UndefOr[
    js.Function3[
      /* args */ CreateWebpackConfigArgs, 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /** Called at the end of the bootstrap process after all other extension APIs have been called. */
  var onPostBootstrap: js.UndefOr[
    js.Function3[
      /* args */ ParentSpanPluginArgs, 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /** The last extension point called after all other parts of the build process are complete. */
  var onPostBuild: js.UndefOr[
    js.Function3[
      /* args */ BuildArgs, 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /** Called at the end of the bootstrap process after all other extension APIs have been called. */
  var onPreBootstrap: js.UndefOr[
    js.Function3[
      /* args */ ParentSpanPluginArgs, 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /** The first extension point called during the build process. Called after the bootstrap has completed but before the build steps start. */
  var onPreBuild: js.UndefOr[
    js.Function3[
      /* args */ BuildArgs, 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /** Called once Gatsby has initialized itself and is ready to bootstrap your site. */
  var onPreExtractQueries: js.UndefOr[
    js.Function3[
      /* args */ ParentSpanPluginArgs, 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /** The first API called during Gatsby execution, runs as soon as plugins are loaded, before cache initialization and bootstrap preparation. */
  var onPreInit: js.UndefOr[
    js.Function3[
      /* args */ ParentSpanPluginArgs, 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /**
    * Ask compile-to-js plugins to process source to JavaScript so the query
    * runner can extract out GraphQL queries for running.
    */
  var preprocessSource: js.UndefOr[
    js.Function3[
      /* args */ PreprocessSourceArgs, 
      /* options */ js.UndefOr[PluginOptions], 
      /* callback */ js.UndefOr[PluginCallback], 
      Unit
    ]
  ] = js.undefined
  /**
    * Lets plugins implementing support for other compile-to-js add to the list of "resolvable" file extensions. Gatsby supports `.js` and `.jsx` by default.
    */
  var resolvableExtensions: js.UndefOr[
    js.Function3[
      /* args */ ResolvableExtensionsArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      js.Array[_] | js.Promise[js.Array[_]]
    ]
  ] = js.undefined
  /**
    * Called during the creation of the GraphQL schema. Allows plugins
    * to add new fields to the types created from data nodes. It will be called
    * separately for each type.
    *
    * This function should return an object in the shape of
    * [GraphQLFieldConfigMap](https://graphql.org/graphql-js/type/#graphqlobjecttype)
    * which will be appended to fields inferred by Gatsby from data nodes.
    *
    * *Note:* Import GraphQL types from `gatsby/graphql` and don't add the `graphql`
    * package to your project/plugin dependencies to avoid Schema must
    * contain unique named types but contains multiple types named errors.
    * `gatsby/graphql` exports all builtin GraphQL types as well as the `graphQLJSON`
    * type.
    *
    * Many transformer plugins use this to add fields that take arguments.
    *
    * @see https://www.gatsbyjs.org/docs/node-apis/#setFieldsOnGraphQLNodeType
    */
  var setFieldsOnGraphQLNodeType: js.UndefOr[
    (js.Function2[/* args */ SetFieldsOnGraphQLNodeTypeArgs, /* options */ PluginOptions, _]) with (js.Function2[
      /* args */ SetFieldsOnGraphQLNodeTypeArgs, 
      /* options */ PluginOptions, 
      js.Promise[_]
    ]) with (js.Function3[
      /* args */ SetFieldsOnGraphQLNodeTypeArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ])
  ] = js.undefined
  /**
    * Extension point to tell plugins to source nodes. This API is called during
    * the Gatsby bootstrap sequence. Source plugins use this hook to create nodes.
    * This API is called exactly once per plugin (and once for your site's
    * `gatsby-config.js` file). If you define this hook in `gatsby-node.js` it
    * will be called exactly once after all of your source plugins have finished
    * creating nodes.
    *
    * @see https://www.gatsbyjs.org/docs/node-apis/#sourceNodes
    */
  var sourceNodes: js.UndefOr[
    (js.Function2[/* args */ SourceNodesArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ SourceNodesArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
      /* args */ SourceNodesArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ])
  ] = js.undefined
}

object GatsbyNode {
  @scala.inline
  def apply(
    createPages: (/* args */ CreatePagesArgs with AnonInitialcreatePages, /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    createPagesStatefully: (/* args */ CreatePagesArgs with AnonInitialcreatePagesStatefully, /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    createResolvers: (js.Function2[/* args */ CreateResolversArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ CreateResolversArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
      /* args */ CreateResolversArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ]) = null,
    createSchemaCustomization: (js.Function2[/* args */ CreateSchemaCustomizationArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ CreateSchemaCustomizationArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
      /* args */ CreateSchemaCustomizationArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ]) = null,
    onCreateBabelConfig: (/* args */ CreateBabelConfigArgs, /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    onCreateDevServer: (/* args */ CreateDevServerArgs, /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    onCreateNode: (/* args */ CreateNodeArgs[js.Object], /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    onCreatePage: (/* args */ CreatePageArgs[Record[String, _]], /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    onCreateWebpackConfig: (/* args */ CreateWebpackConfigArgs, /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    onPostBootstrap: (/* args */ ParentSpanPluginArgs, /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    onPostBuild: (/* args */ BuildArgs, /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    onPreBootstrap: (/* args */ ParentSpanPluginArgs, /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    onPreBuild: (/* args */ BuildArgs, /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    onPreExtractQueries: (/* args */ ParentSpanPluginArgs, /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    onPreInit: (/* args */ ParentSpanPluginArgs, /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    preprocessSource: (/* args */ PreprocessSourceArgs, /* options */ js.UndefOr[PluginOptions], /* callback */ js.UndefOr[PluginCallback]) => Unit = null,
    resolvableExtensions: (/* args */ ResolvableExtensionsArgs, /* options */ PluginOptions, /* callback */ PluginCallback) => js.Array[_] | js.Promise[js.Array[_]] = null,
    setFieldsOnGraphQLNodeType: (js.Function2[/* args */ SetFieldsOnGraphQLNodeTypeArgs, /* options */ PluginOptions, _]) with (js.Function2[
      /* args */ SetFieldsOnGraphQLNodeTypeArgs, 
      /* options */ PluginOptions, 
      js.Promise[_]
    ]) with (js.Function3[
      /* args */ SetFieldsOnGraphQLNodeTypeArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ]) = null,
    sourceNodes: (js.Function2[/* args */ SourceNodesArgs, /* options */ PluginOptions, _]) with (js.Function2[/* args */ SourceNodesArgs, /* options */ PluginOptions, js.Promise[_]]) with (js.Function3[
      /* args */ SourceNodesArgs, 
      /* options */ PluginOptions, 
      /* callback */ PluginCallback, 
      Unit
    ]) = null
  ): GatsbyNode = {
    val __obj = js.Dynamic.literal()
    if (createPages != null) __obj.updateDynamic("createPages")(js.Any.fromFunction3(createPages))
    if (createPagesStatefully != null) __obj.updateDynamic("createPagesStatefully")(js.Any.fromFunction3(createPagesStatefully))
    if (createResolvers != null) __obj.updateDynamic("createResolvers")(createResolvers.asInstanceOf[js.Any])
    if (createSchemaCustomization != null) __obj.updateDynamic("createSchemaCustomization")(createSchemaCustomization.asInstanceOf[js.Any])
    if (onCreateBabelConfig != null) __obj.updateDynamic("onCreateBabelConfig")(js.Any.fromFunction3(onCreateBabelConfig))
    if (onCreateDevServer != null) __obj.updateDynamic("onCreateDevServer")(js.Any.fromFunction3(onCreateDevServer))
    if (onCreateNode != null) __obj.updateDynamic("onCreateNode")(js.Any.fromFunction3(onCreateNode))
    if (onCreatePage != null) __obj.updateDynamic("onCreatePage")(js.Any.fromFunction3(onCreatePage))
    if (onCreateWebpackConfig != null) __obj.updateDynamic("onCreateWebpackConfig")(js.Any.fromFunction3(onCreateWebpackConfig))
    if (onPostBootstrap != null) __obj.updateDynamic("onPostBootstrap")(js.Any.fromFunction3(onPostBootstrap))
    if (onPostBuild != null) __obj.updateDynamic("onPostBuild")(js.Any.fromFunction3(onPostBuild))
    if (onPreBootstrap != null) __obj.updateDynamic("onPreBootstrap")(js.Any.fromFunction3(onPreBootstrap))
    if (onPreBuild != null) __obj.updateDynamic("onPreBuild")(js.Any.fromFunction3(onPreBuild))
    if (onPreExtractQueries != null) __obj.updateDynamic("onPreExtractQueries")(js.Any.fromFunction3(onPreExtractQueries))
    if (onPreInit != null) __obj.updateDynamic("onPreInit")(js.Any.fromFunction3(onPreInit))
    if (preprocessSource != null) __obj.updateDynamic("preprocessSource")(js.Any.fromFunction3(preprocessSource))
    if (resolvableExtensions != null) __obj.updateDynamic("resolvableExtensions")(js.Any.fromFunction3(resolvableExtensions))
    if (setFieldsOnGraphQLNodeType != null) __obj.updateDynamic("setFieldsOnGraphQLNodeType")(setFieldsOnGraphQLNodeType.asInstanceOf[js.Any])
    if (sourceNodes != null) __obj.updateDynamic("sourceNodes")(sourceNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyNode]
  }
}

