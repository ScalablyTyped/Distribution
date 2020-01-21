package typings.glReact

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object glReactComponents extends glReactProps {
  @scala.inline
  def Bus: ComponentType[BusProps] = js.constructorOf[typings.glReact.mod.Bus].asInstanceOf[typings.react.mod.ComponentType[BusProps]]
  @scala.inline
  def LinearCopy: ComponentType[LinearCopyProps] = js.constructorOf[typings.glReact.mod.LinearCopy].asInstanceOf[typings.react.mod.ComponentType[LinearCopyProps]]
  @scala.inline
  def NearestCopy: ComponentType[NearestCopyProps] = js.constructorOf[typings.glReact.mod.NearestCopy].asInstanceOf[typings.react.mod.ComponentType[NearestCopyProps]]
  @scala.inline
  def Node: ComponentType[NodeProps] = js.constructorOf[typings.glReact.mod.Node].asInstanceOf[typings.react.mod.ComponentType[NodeProps]]
  @scala.inline
  def Surface[T]: ComponentType[SurfaceProps] = js.constructorOf[typings.glReact.mod.Surface[T]].asInstanceOf[typings.react.mod.ComponentType[SurfaceProps]]
}

