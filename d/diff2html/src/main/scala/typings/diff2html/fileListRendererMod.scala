package typings.diff2html

import typings.diff2html.hoganjsUtilsMod.default
import typings.diff2html.typesMod.DiffFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileListRendererMod {
  
  @JSImport("diff2html/lib/file-list-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def render(diffFiles: js.Array[DiffFile], hoganUtils: default): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(diffFiles.asInstanceOf[js.Any], hoganUtils.asInstanceOf[js.Any])).asInstanceOf[String]
}
