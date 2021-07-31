package typings.fastGlob

import typings.fastGlob.typesMod.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errnoMod {
  
  @JSImport("fast-glob/out/utils/errno", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isEnoentCodeError(error: ErrnoException): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnoentCodeError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
