package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBarOptions extends StObject {
  
  /**
    * Mode for the progress bar. Can be `none`, `normal`, `indeterminate`, `error` or
    * `paused`.
    *
    * @platform win32
    */
  var mode: "none" | "normal" | "indeterminate" | "error" | "paused"
}
object ProgressBarOptions {
  
  inline def apply(mode: "none" | "normal" | "indeterminate" | "error" | "paused"): ProgressBarOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarOptions]
  }
  
  extension [Self <: ProgressBarOptions](x: Self) {
    
    inline def setMode(value: "none" | "normal" | "indeterminate" | "error" | "paused"): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
