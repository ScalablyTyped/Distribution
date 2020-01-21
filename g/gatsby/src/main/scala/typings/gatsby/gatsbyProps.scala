package typings.gatsby

import typings.gatsbyLink.mod.GatsbyLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait gatsbyProps {
  @scala.inline
  def LinkProps: GatsbyLinkProps.type = typings.gatsbyLink.mod.GatsbyLinkProps
  type LinkProps[TState] = GatsbyLinkProps[TState]
  @scala.inline
  def PageRendererProps: typings.gatsby.mod.PageRendererProps.type = typings.gatsby.mod.PageRendererProps
  type PageRendererProps = typings.gatsby.mod.PageRendererProps
  @scala.inline
  def StaticQueryProps: typings.gatsby.mod.StaticQueryProps.type = typings.gatsby.mod.StaticQueryProps
  type StaticQueryProps[T] = typings.gatsby.mod.StaticQueryProps[T]
}

