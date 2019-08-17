package typings.electronDashBuilder.electronDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder", "Target")
@js.native
abstract class Target protected ()
  extends typings.appDashBuilderDashLib.outMod.Target {
  protected def this(name: String) = this()
  protected def this(name: String, isAsyncSupported: Boolean) = this()
}

