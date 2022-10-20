package typings.electronOsxSign

import typings.electronOsxSign.distCjsTypesMod.SignOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSignMod {
  
  @JSImport("@electron/osx-sign/dist/cjs/sign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sign(opts: SignOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def sign(opts: SignOptions, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def signApp(_opts: SignOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("signApp")(_opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
