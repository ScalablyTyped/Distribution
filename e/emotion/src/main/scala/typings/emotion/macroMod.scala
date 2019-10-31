package typings.emotion

import typings.createDashEmotion.createDashEmotionMod.ClassNameArg
import typings.createDashEmotion.createDashEmotionMod.Interpolation
import typings.createDashEmotion.createDashEmotionMod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion/macro", JSImport.Namespace)
@js.native
object macroMod extends js.Object {
  val cache: /* import warning: ImportType.apply Failed type conversion: create-emotion.create-emotion.Emotion['cache'] */ js.Any = js.native
  val css: js.Function1[/* repeated */ Interpolation, String] = js.native
  val cx: js.Function1[/* repeated */ ClassNameArg, String] = js.native
  val flush: js.Function0[Unit] = js.native
  val getRegisteredStyles: js.Function2[/* registeredStyles */ js.Array[String], /* classNames */ String, String] = js.native
  val hydrate: js.Function1[/* ids */ js.Array[String], Unit] = js.native
  val injectGlobal: js.Function1[/* repeated */ Interpolation, Unit] = js.native
  val keyframes: js.Function1[/* repeated */ Interpolation, String] = js.native
  val sheet: StyleSheet = js.native
  @js.native
  object merge extends js.Object {
    def apply(className: String): String = js.native
    def apply(className: String, sourceMap: String): String = js.native
  }
  
}

