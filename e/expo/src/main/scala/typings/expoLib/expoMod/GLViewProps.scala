package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GLViewProps
  extends reactDashNativeLib.reactDashNativeMod.ViewProps {
  /** Number of MSAA samples to use on iOS. Defaults to 4. Ignored on Android. */
  var msaaSamples: js.UndefOr[scala.Double] = js.undefined
  /**
       * A function that will be called when the OpenGL ES context is created.
       * Passes an object with a WebGLRenderingContext interface as an argument.
       */
  def onContextCreate(gl: ExpoWebGLRenderingContext): scala.Unit
}

