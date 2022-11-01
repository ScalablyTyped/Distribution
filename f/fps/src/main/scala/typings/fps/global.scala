package typings.fps

import typings.fps.mod.FPSObject
import typings.fps.mod.FPSOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def fps(): FPSObject = js.Dynamic.global.applyDynamic("fps")().asInstanceOf[FPSObject]
  inline def fps(options: FPSOptions): FPSObject = js.Dynamic.global.applyDynamic("fps")(options.asInstanceOf[js.Any]).asInstanceOf[FPSObject]
}
