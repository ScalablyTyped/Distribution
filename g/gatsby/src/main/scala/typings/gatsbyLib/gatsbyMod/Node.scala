package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var browserAPIs: js.UndefOr[js.Array[_]] = js.undefined
  var buildTime: js.UndefOr[java.lang.String] = js.undefined
  var children: js.Array[Node]
  var component: js.UndefOr[java.lang.String] = js.undefined
  var componentChunkName: js.UndefOr[java.lang.String] = js.undefined
  var componentPath: js.UndefOr[java.lang.String] = js.undefined
  var context: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var fields: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var internal: gatsbyLib.Anon_Content
  var internalComponentName: js.UndefOr[java.lang.String] = js.undefined
  var jsonName: js.UndefOr[java.lang.String] = js.undefined
  var matchPath: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var nodeAPIs: js.UndefOr[js.Array[_]] = js.undefined
  var packageJson: js.UndefOr[PackageJson] = js.undefined
  var parent: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var pathPrefix: js.UndefOr[java.lang.String] = js.undefined
  var pluginCreatorId: js.UndefOr[java.lang.String] = js.undefined
  var pluginFilepath: js.UndefOr[java.lang.String] = js.undefined
  var pluginOptions: js.UndefOr[PluginOptions] = js.undefined
  var polyfill: js.UndefOr[scala.Boolean] = js.undefined
  var port: js.UndefOr[java.lang.String] = js.undefined
  var resolve: js.UndefOr[java.lang.String] = js.undefined
  var siteMetadata: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var ssrAPIs: js.UndefOr[js.Array[_]] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    children: js.Array[Node],
    id: java.lang.String,
    internal: gatsbyLib.Anon_Content,
    parent: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    browserAPIs: js.Array[_] = null,
    buildTime: java.lang.String = null,
    component: java.lang.String = null,
    componentChunkName: java.lang.String = null,
    componentPath: java.lang.String = null,
    context: stdLib.Record[java.lang.String, _] = null,
    fields: stdLib.Record[java.lang.String, java.lang.String] = null,
    host: java.lang.String = null,
    internalComponentName: java.lang.String = null,
    jsonName: java.lang.String = null,
    matchPath: js.Any = null,
    name: java.lang.String = null,
    nodeAPIs: js.Array[_] = null,
    packageJson: PackageJson = null,
    path: java.lang.String = null,
    pathPrefix: java.lang.String = null,
    pluginCreatorId: java.lang.String = null,
    pluginFilepath: java.lang.String = null,
    pluginOptions: PluginOptions = null,
    polyfill: js.UndefOr[scala.Boolean] = js.undefined,
    port: java.lang.String = null,
    resolve: java.lang.String = null,
    siteMetadata: stdLib.Record[java.lang.String, _] = null,
    ssrAPIs: js.Array[_] = null,
    version: java.lang.String = null
  ): Node = {
    val __obj = js.Dynamic.literal(children = children, id = id, internal = internal, parent = parent)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (browserAPIs != null) __obj.updateDynamic("browserAPIs")(browserAPIs)
    if (buildTime != null) __obj.updateDynamic("buildTime")(buildTime)
    if (component != null) __obj.updateDynamic("component")(component)
    if (componentChunkName != null) __obj.updateDynamic("componentChunkName")(componentChunkName)
    if (componentPath != null) __obj.updateDynamic("componentPath")(componentPath)
    if (context != null) __obj.updateDynamic("context")(context)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (host != null) __obj.updateDynamic("host")(host)
    if (internalComponentName != null) __obj.updateDynamic("internalComponentName")(internalComponentName)
    if (jsonName != null) __obj.updateDynamic("jsonName")(jsonName)
    if (matchPath != null) __obj.updateDynamic("matchPath")(matchPath)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nodeAPIs != null) __obj.updateDynamic("nodeAPIs")(nodeAPIs)
    if (packageJson != null) __obj.updateDynamic("packageJson")(packageJson)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix)
    if (pluginCreatorId != null) __obj.updateDynamic("pluginCreatorId")(pluginCreatorId)
    if (pluginFilepath != null) __obj.updateDynamic("pluginFilepath")(pluginFilepath)
    if (pluginOptions != null) __obj.updateDynamic("pluginOptions")(pluginOptions)
    if (!js.isUndefined(polyfill)) __obj.updateDynamic("polyfill")(polyfill)
    if (port != null) __obj.updateDynamic("port")(port)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (siteMetadata != null) __obj.updateDynamic("siteMetadata")(siteMetadata)
    if (ssrAPIs != null) __obj.updateDynamic("ssrAPIs")(ssrAPIs)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Node]
  }
}

