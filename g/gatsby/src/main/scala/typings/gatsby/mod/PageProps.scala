package typings.gatsby.mod

import typings.gatsby.AnonComponent
import typings.reachRouter.mod.NavigateFn
import typings.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageProps[DataType, PageContextType] extends js.Object {
  /** You can't get passed children as this is the root user-land component */
  var children: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Data passed into the page via an exported GraphQL query. To set up this type
    * you need to use [generics](https://www.typescriptlang.org/play/#example/generic-functions),
    * see below for an example
    *
    * @example
    *
    * import {PageProps} from "gatsby"
    *
    * type IndexQueryProps = { downloadCount: number }
    * type IndexPageProps = PageProps<IndexPageProps>
    *
    * export default (props: IndexProps) => {
    *   ..
    *
    */
  var data: DataType
  /** An extended version of window.document which comes from @react/router */
  var location: WindowLocation
  /** A way to handle programmatically controlling navigation */
  var navigate: NavigateFn
  /**
    * A context object which is passed in during the creation of the page. Can be extended if you are using
    * `createPage` yourself using generics:
    *
    * @example
    *
    * import {PageProps} from "gatsby"
    *
    * type IndexQueryProps = { downloadCount: number }
    * type LocaleLookUpInfo = { translationStrings: any } & { langKey: string, slug: string }
    * type IndexPageProps = PageProps<IndexPageProps, LocaleLookUpInfo>
    *
    * export default (props: IndexProps) => {
    *   ..
    */
  var pageContext: PageContextType
  /** Holds information about the build process for this component */
  var pageResources: AnonComponent[DataType, PageContextType]
  /** The path for this current page */
  var path: String
  /** @deprecated use pageContext instead */
  var pathContext: js.Object
  /** The URI for the current page */
  var uri: String
}

object PageProps {
  @scala.inline
  def apply[DataType, PageContextType](
    data: DataType,
    location: WindowLocation,
    navigate: NavigateFn,
    pageContext: PageContextType,
    pageResources: AnonComponent[DataType, PageContextType],
    path: String,
    pathContext: js.Object,
    uri: String,
    children: js.UndefOr[scala.Nothing] = js.undefined
  ): PageProps[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], pageContext = pageContext.asInstanceOf[js.Any], pageResources = pageResources.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathContext = pathContext.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageProps[DataType, PageContextType]]
  }
}

