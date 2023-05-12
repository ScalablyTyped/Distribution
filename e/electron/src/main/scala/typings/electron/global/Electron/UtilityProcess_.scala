package typings.electron.global.Electron

import typings.electron.Electron.ForkOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.UtilityProcess")
@js.native
open class UtilityProcess_ ()
  extends typings.electron.Electron.UtilityProcess_
object UtilityProcess_ {
  
  @JSGlobal("Electron.UtilityProcess")
  @js.native
  val ^ : js.Any = js.native
  
  // Docs: https://electronjs.org/docs/api/utility-process
  /* static member */
  inline def fork(modulePath: String): typings.electron.Electron.UtilityProcess_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.UtilityProcess_]
  inline def fork(modulePath: String, args: js.Array[String]): typings.electron.Electron.UtilityProcess_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.electron.Electron.UtilityProcess_]
  inline def fork(modulePath: String, args: js.Array[String], options: ForkOptions): typings.electron.Electron.UtilityProcess_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.electron.Electron.UtilityProcess_]
  inline def fork(modulePath: String, args: Unit, options: ForkOptions): typings.electron.Electron.UtilityProcess_ = (^.asInstanceOf[js.Dynamic].applyDynamic("fork")(modulePath.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.electron.Electron.UtilityProcess_]
}
