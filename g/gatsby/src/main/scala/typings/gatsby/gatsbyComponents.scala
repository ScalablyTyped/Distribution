package typings.gatsby

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gatsbyComponents extends gatsbyProps {
  @scala.inline
  def Link[TState]: ComponentType[LinkProps[TState]] = js.constructorOf[typings.gatsby.mod.Link[TState]].asInstanceOf[typings.react.mod.ComponentType[LinkProps[TState]]]
  @scala.inline
  def PageRenderer: ComponentType[PageRendererProps] = js.constructorOf[typings.gatsby.mod.PageRenderer].asInstanceOf[typings.react.mod.ComponentType[PageRendererProps]]
  @scala.inline
  def StaticQuery[T]: ComponentType[StaticQueryProps[T]] = js.constructorOf[typings.gatsby.mod.StaticQuery[T]].asInstanceOf[typings.react.mod.ComponentType[StaticQueryProps[T]]]
}

