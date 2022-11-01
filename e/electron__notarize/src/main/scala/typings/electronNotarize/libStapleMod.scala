package typings.electronNotarize

import typings.electronNotarize.libTypesMod.NotarizeStapleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStapleMod {
  
  @JSImport("@electron/notarize/lib/staple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stapleApp(opts: NotarizeStapleOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stapleApp")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
