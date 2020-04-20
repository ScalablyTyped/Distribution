package typings.gatsbyLink

import typings.gatsbyLink.mod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gatsbyLinkComponents extends gatsbyLinkProps {
  @scala.inline
  def GatsbyLink[TState]: ComponentType[GatsbyLinkProps[TState]] = js.constructorOf[default[TState]].asInstanceOf[ComponentType[GatsbyLinkProps[TState]]]
}

