package typings.gatsby

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gatsbyComponents extends gatsbyProps {
  @scala.inline
  def Link[TState]: ComponentType[LinkProps[TState]] = js.constructorOf[typings.gatsby.gatsbyMod.Link[TState]].asInstanceOf[typings.react.reactMod.ComponentType[LinkProps[TState]]]
  @scala.inline
  def PageRenderer: ComponentType[PageRendererProps] = js.constructorOf[typings.gatsby.gatsbyMod.PageRenderer].asInstanceOf[typings.react.reactMod.ComponentType[PageRendererProps]]
  @scala.inline
  def StaticQuery[T]: ComponentType[StaticQueryProps[T]] = js.constructorOf[typings.gatsby.gatsbyMod.StaticQuery[T]].asInstanceOf[typings.react.reactMod.ComponentType[StaticQueryProps[T]]]
}

