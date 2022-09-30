package typings.editly.mod

import org.scalablytyped.runtime.StringDictionary
import typings.editly.mod.^
import typings.fabric.mod.fabric.Canvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Edit and render videos.
  *
  * @param config - Config.
  */
inline def apply(config: Config): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

/**
	 * WARNING: Undocumented feature!
	 * Pure function to get a frame at a certain time.
	 *
	 * @param config - Config.
	 */
inline def renderSingleFrame(config: RenderSingleFrameConfig): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderSingleFrame")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

/**
	 * @see [Curve types]{@link https://trac.ffmpeg.org/wiki/AfadeCurves}
	 */
/* Rewritten from type alias, can be one of: 
  - typings.editly.editlyStrings.tri
  - typings.editly.editlyStrings.qsin
  - typings.editly.editlyStrings.hsin
  - typings.editly.editlyStrings.esin
  - typings.editly.editlyStrings.log
  - typings.editly.editlyStrings.ipar
  - typings.editly.editlyStrings.qua
  - typings.editly.editlyStrings.cub
  - typings.editly.editlyStrings.squ
  - typings.editly.editlyStrings.cbr
  - typings.editly.editlyStrings.par
  - typings.editly.editlyStrings.exp
  - typings.editly.editlyStrings.iqsin
  - typings.editly.editlyStrings.ihsin
  - typings.editly.editlyStrings.dese
  - typings.editly.editlyStrings.desi
  - typings.editly.editlyStrings.losi
  - typings.editly.editlyStrings.nofade
  - java.lang.String
*/
type CurveType = _CurveType | String

type CustomCanvasFunction = js.Function1[/* args */ CustomCanvasFunctionArgs, OptionalPromise[CustomFunctionCallbacks]]

type CustomFabricFunction = js.Function1[/* args */ CustomFabricFunctionArgs, OptionalPromise[CustomFunctionCallbacks]]

type DefaultTransitionOptions = Transition

type OnCloseCallback = js.Function0[OptionalPromise[Unit]]

type OnRenderCallback = js.Function2[/* progress */ Double, /* canvas */ Canvas, OptionalPromise[Unit]]

/** Little utility */
type OptionalPromise[T] = js.Promise[T] | T

/**
	 * WARNING: Undocumented feature!
	 */
type TransitionParams = /**
		 * WARNING: Undocumented feature!
		 */
StringDictionary[Double | Boolean | GLTextureLike | js.Array[Double]]

/**
	 * @see [Transition types]{@link https://github.com/mifi/editly#transition-types}
	 */
/* Rewritten from type alias, can be one of: 
  - typings.editly.editlyStrings.`directional-left`
  - typings.editly.editlyStrings.`directional-right`
  - typings.editly.editlyStrings.`directional-up`
  - typings.editly.editlyStrings.`directional-down`
  - typings.editly.editlyStrings.random
  - typings.editly.editlyStrings.dummy
  - java.lang.String
*/
type TransitionType = _TransitionType | String
