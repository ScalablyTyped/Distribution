package typings.downshift

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object downshiftComponents extends downshiftProps {
  @scala.inline
  def Downshift[Item]: ComponentType[DownshiftProps[Item]] = js.constructorOf[typings.downshift.mod.default[Item]].asInstanceOf[typings.react.mod.ComponentType[DownshiftProps[Item]]]
}

