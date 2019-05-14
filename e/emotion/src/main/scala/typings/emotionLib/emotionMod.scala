package typings
package emotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion", JSImport.Namespace)
@js.native
object emotionMod extends js.Object {
  val cache: /* import warning: ImportType.apply Failed type conversion: create-emotion.create-emotion.Emotion['cache'] */ js.Any = js.native
  val css: js.Function1[
    /* repeated */ createDashEmotionLib.createDashEmotionMod.Interpolation, 
    java.lang.String
  ] = js.native
  val cx: js.Function1[
    /* repeated */ createDashEmotionLib.createDashEmotionMod.ClassNameArg, 
    java.lang.String
  ] = js.native
  val flush: js.Function0[scala.Unit] = js.native
  val getRegisteredStyles: js.Function2[
    /* registeredStyles */ js.Array[java.lang.String], 
    /* classNames */ java.lang.String, 
    java.lang.String
  ] = js.native
  val hydrate: js.Function1[/* ids */ js.Array[java.lang.String], scala.Unit] = js.native
  val injectGlobal: js.Function1[/* repeated */ createDashEmotionLib.createDashEmotionMod.Interpolation, scala.Unit] = js.native
  val keyframes: js.Function1[
    /* repeated */ createDashEmotionLib.createDashEmotionMod.Interpolation, 
    java.lang.String
  ] = js.native
  val sheet: createDashEmotionLib.createDashEmotionMod.StyleSheet = js.native
  @js.native
  object merge extends js.Object {
    def apply(className: java.lang.String): java.lang.String = js.native
    def apply(className: java.lang.String, sourceMap: java.lang.String): java.lang.String = js.native
  }
  
}

