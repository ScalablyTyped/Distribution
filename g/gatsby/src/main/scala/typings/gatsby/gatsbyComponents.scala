package typings.gatsby

import typings.gatsbyDashLink.gatsbyDashLinkMod.GatsbyLinkProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gatsbyComponents extends gatsbyProps {
  @scala.inline
  def Link[TState]: ComponentType[GatsbyLinkProps[TState]] = js.constructorOf[typings.gatsby.gatsbyMod.Link[TState]].asInstanceOf[typings.react.reactMod.ComponentType[typings.gatsbyDashLink.gatsbyDashLinkMod.GatsbyLinkProps[TState]]]
  @scala.inline
  def PageRenderer: ComponentType[typings.gatsby.gatsbyMod.PageRendererProps] = js.constructorOf[typings.gatsby.gatsbyMod.PageRenderer].asInstanceOf[typings.react.reactMod.ComponentType[typings.gatsby.gatsbyMod.PageRendererProps]]
  @scala.inline
  def StaticQuery: ComponentType[typings.gatsby.gatsbyMod.StaticQueryProps] = js.constructorOf[typings.gatsby.gatsbyMod.StaticQuery].asInstanceOf[typings.react.reactMod.ComponentType[typings.gatsby.gatsbyMod.StaticQueryProps]]
}

