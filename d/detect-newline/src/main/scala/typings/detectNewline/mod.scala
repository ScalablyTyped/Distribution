package typings.detectNewline

import typings.detectNewline.detectNewlineStrings.CarriagereturnLinefeed
import typings.detectNewline.detectNewlineStrings.Linefeed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-newline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectNewline(string: String): js.UndefOr[CarriagereturnLinefeed | Linefeed] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectNewline")(string.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CarriagereturnLinefeed | Linefeed]]
  
  inline def detectNewlineGraceful(): Linefeed = ^.asInstanceOf[js.Dynamic].applyDynamic("detectNewlineGraceful")().asInstanceOf[Linefeed]
  inline def detectNewlineGraceful(string: String): CarriagereturnLinefeed | Linefeed = ^.asInstanceOf[js.Dynamic].applyDynamic("detectNewlineGraceful")(string.asInstanceOf[js.Any]).asInstanceOf[CarriagereturnLinefeed | Linefeed]
  inline def detectNewlineGraceful(string: Any): Linefeed = ^.asInstanceOf[js.Dynamic].applyDynamic("detectNewlineGraceful")(string.asInstanceOf[js.Any]).asInstanceOf[Linefeed]
}
