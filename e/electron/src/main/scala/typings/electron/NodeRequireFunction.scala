package typings.electron

import typings.electron.anon.TypeofCommon
import typings.electron.anon.TypeofCrossProcessExports
import typings.electron.anon.TypeofMain
import typings.electron.anon.TypeofRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRequireFunction extends StObject {
  
  @JSName("<apply>")
  @scala.annotation.targetName("apply_electron")
  def apply(moduleName: "electron"): TypeofCrossProcessExports = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_electronmain")
  def apply(moduleName: "electron/main"): TypeofMain = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_electronrenderer")
  def apply(moduleName: "electron/renderer"): TypeofRenderer = js.native
  @JSName("<apply>")
  @scala.annotation.targetName("apply_electroncommon")
  def apply(moduleName: "electron/common"): TypeofCommon = js.native
}
