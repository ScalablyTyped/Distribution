package typings.downshift

import typings.downshift.mod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object downshiftComponents extends downshiftProps {
  @scala.inline
  def Downshift[Item]: ComponentType[DownshiftProps[Item]] = js.constructorOf[default[Item]].asInstanceOf[ComponentType[DownshiftProps[Item]]]
}

