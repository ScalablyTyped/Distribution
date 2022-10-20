package typings.electronOsxSign

import typings.electronOsxSign.distEsmTypesMod.FlatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmFlatMod {
  
  @JSImport("@electron/osx-sign/dist/esm/flat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildPkg(_opts: FlatOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPkg")(_opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def flat(opts: FlatOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def flat(opts: FlatOptions, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flat")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
