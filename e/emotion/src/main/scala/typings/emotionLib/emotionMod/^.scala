package typings
package emotionLib.emotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emotion", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val cache: atEmotionUtilsLib.atEmotionUtilsMod.EmotionCache = js.native
  val css: (js.Function2[
    /* template */ stdLib.TemplateStringsArray, 
    /* repeated */ atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]], 
    java.lang.String
  ]) | (js.Function1[
    /* repeated */ atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]], 
    java.lang.String
  ]) = js.native
  val cx: js.Function1[
    /* repeated */ createDashEmotionLib.createDashEmotionMod.ClassNamesArg, 
    java.lang.String
  ] = js.native
  val flush: js.Function0[scala.Unit] = js.native
  val getRegisteredStyles: js.Function2[
    /* registeredStyles */ js.Array[java.lang.String], 
    /* className */ java.lang.String, 
    java.lang.String
  ] = js.native
  val hydrate: js.Function1[/* ids */ js.Array[java.lang.String], scala.Unit] = js.native
  val injectGlobal: (js.Function2[
    /* template */ stdLib.TemplateStringsArray, 
    /* repeated */ atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]], 
    scala.Unit
  ]) | (js.Function1[
    /* repeated */ atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]], 
    scala.Unit
  ]) = js.native
  val keyframes: (js.Function2[
    /* template */ stdLib.TemplateStringsArray, 
    /* repeated */ atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]], 
    java.lang.String
  ]) | (js.Function1[
    /* repeated */ atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]], 
    java.lang.String
  ]) = js.native
  val merge: js.Function1[/* className */ java.lang.String, java.lang.String] = js.native
  val sheet: atEmotionSheetLib.atEmotionSheetMod.StyleSheet = js.native
}

