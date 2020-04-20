package typings.glReact

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object glReactComponents extends glReactProps {
  @scala.inline
  def Bus: ComponentType[BusProps] = js.constructorOf[typings.glReact.mod.Bus].asInstanceOf[ComponentType[BusProps]]
  @scala.inline
  def LinearCopy: ComponentType[LinearCopyProps] = js.constructorOf[typings.glReact.mod.LinearCopy].asInstanceOf[ComponentType[LinearCopyProps]]
  @scala.inline
  def NearestCopy: ComponentType[NearestCopyProps] = js.constructorOf[typings.glReact.mod.NearestCopy].asInstanceOf[ComponentType[NearestCopyProps]]
  @scala.inline
  def Node: ComponentType[NodeProps] = js.constructorOf[typings.glReact.mod.Node].asInstanceOf[ComponentType[NodeProps]]
  @scala.inline
  def Surface[T]: ComponentType[SurfaceProps] = js.constructorOf[typings.glReact.mod.Surface[T]].asInstanceOf[ComponentType[SurfaceProps]]
}

