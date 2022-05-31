package typings.featherIcons

import typings.featherIcons.mod.FeatherAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object feather {
    
    @JSGlobal("feather")
    @js.native
    val ^ : js.Any = js.native
    
    inline def replace(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")().asInstanceOf[Unit]
    inline def replace(options: FeatherAttributes): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
