package typings
package emotionLib.emotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion", JSImport.Namespace)
@js.native
object emotionModMembers extends js.Object {
  val caches: createDashEmotionLib.createDashEmotionMod.EmotionCache = js.native
  val css: js.Function1[
    /* repeated */createDashEmotionLib.createDashEmotionMod.Interpolation, 
    java.lang.String
  ] = js.native
  val cx: js.Function1[
    /* repeated */createDashEmotionLib.createDashEmotionMod.ClassNameArg, 
    java.lang.String
  ] = js.native
  val flush: js.Function0[scala.Unit] = js.native
  val getRegisteredStyles: js.Function2[
    /* registeredStyles */ js.Array[java.lang.String], 
    /* classNames */ java.lang.String, 
    java.lang.String
  ] = js.native
  val hydrate: js.Function1[/* ids */ js.Array[java.lang.String], scala.Unit] = js.native
  val injectGlobal: js.Function1[/* repeated */createDashEmotionLib.createDashEmotionMod.Interpolation, scala.Unit] = js.native
  val keyframes: js.Function1[
    /* repeated */createDashEmotionLib.createDashEmotionMod.Interpolation, 
    java.lang.String
  ] = js.native
  val merge: (js.Function1[/* className */ java.lang.String, java.lang.String]) | (js.Function2[/* className */ java.lang.String, /* sourceMap */ java.lang.String, java.lang.String]) = js.native
  val sheet: createDashEmotionLib.createDashEmotionMod.StyleSheet = js.native
}

