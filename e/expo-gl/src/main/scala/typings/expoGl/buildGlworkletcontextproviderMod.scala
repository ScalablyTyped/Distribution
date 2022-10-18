package typings.expoGl

import typings.expoGl.buildGlviewDottypesMod.ExpoWebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGlworkletcontextproviderMod {
  
  @JSImport("expo-gl/build/GLWorkletContextProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWorkletContextProvider(): js.Function1[/* contextId */ Double, js.UndefOr[ExpoWebGLRenderingContext]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWorkletContextProvider")().asInstanceOf[js.Function1[/* contextId */ Double, js.UndefOr[ExpoWebGLRenderingContext]]]
}
