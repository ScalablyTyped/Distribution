package typings.expoGl

import typings.expoGl.glviewTypesMod.ExpoWebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glutilsMod {
  
  @JSImport("expo-gl/build/GLUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configureLogging(gl: ExpoWebGLRenderingContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureLogging")(gl.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
