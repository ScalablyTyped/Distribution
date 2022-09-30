package typings.electron

import typings.electron.anon.TypeofCommon
import typings.electron.anon.TypeofCrossProcessExports
import typings.electron.anon.TypeofMain
import typings.electron.anon.TypeofRenderer
import typings.electron.electronStrings.electronSlashcommon
import typings.electron.electronStrings.electronSlashmain
import typings.electron.electronStrings.electronSlashrenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeRequire extends StObject {
  
  def apply(moduleName: typings.electron.electronStrings.electron): TypeofCrossProcessExports = js.native
  def apply(moduleName: electronSlashcommon): TypeofCommon = js.native
  def apply(moduleName: electronSlashmain): TypeofMain = js.native
  def apply(moduleName: electronSlashrenderer): TypeofRenderer = js.native
}
