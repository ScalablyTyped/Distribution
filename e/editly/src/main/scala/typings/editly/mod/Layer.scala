package typings.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see [Examples]{@link https://github.com/mifi/editly/tree/master/examples}
	 * @see [Example 'commonFeatures.json5']{@link https://github.com/mifi/editly/blob/master/examples/commonFeatures.json5}
	 */
/* Rewritten from type alias, can be one of: 
  - typings.editly.mod.VideoLayer
  - typings.editly.mod.AudioLayer
  - typings.editly.mod.DetachedAudioLayer
  - typings.editly.mod.ImageLayer
  - typings.editly.mod.ImageOverlayLayer
  - typings.editly.mod.TitleLayer
  - typings.editly.mod.SubtitleLayer
  - typings.editly.mod.TitleBackgroundLayer
  - typings.editly.mod.NewsTitleLayer
  - typings.editly.mod.SlideInTextLayer
  - typings.editly.mod.FillColorLayer
  - typings.editly.mod.PauseLayer
  - typings.editly.mod.RadialGradientLayer
  - typings.editly.mod.LinearGradientLayer
  - typings.editly.mod.RainbowColorsLayer
  - typings.editly.mod.CanvasLayer
  - typings.editly.mod.FabricLayer
  - typings.editly.mod.GlLayer
  - typings.editly.mod.EditlyBannerLayer
*/
trait Layer extends StObject
object Layer {
  
  inline def AudioLayer(path: String): typings.editly.mod.AudioLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("audio")
    __obj.asInstanceOf[typings.editly.mod.AudioLayer]
  }
  
  inline def CanvasLayer(func: /* args */ CustomCanvasFunctionArgs => OptionalPromise[CustomFunctionCallbacks]): typings.editly.mod.CanvasLayer = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func))
    __obj.updateDynamic("type")("canvas")
    __obj.asInstanceOf[typings.editly.mod.CanvasLayer]
  }
  
  inline def DetachedAudioLayer(path: String): typings.editly.mod.DetachedAudioLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("detached-audio")
    __obj.asInstanceOf[typings.editly.mod.DetachedAudioLayer]
  }
  
  inline def EditlyBannerLayer(): typings.editly.mod.EditlyBannerLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("editly-banner")
    __obj.asInstanceOf[typings.editly.mod.EditlyBannerLayer]
  }
  
  inline def FabricLayer(func: /* args */ CustomFabricFunctionArgs => OptionalPromise[CustomFunctionCallbacks]): typings.editly.mod.FabricLayer = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func))
    __obj.updateDynamic("type")("fabric")
    __obj.asInstanceOf[typings.editly.mod.FabricLayer]
  }
  
  inline def FillColorLayer(): typings.editly.mod.FillColorLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fill-color")
    __obj.asInstanceOf[typings.editly.mod.FillColorLayer]
  }
  
  inline def GlLayer(fragmentPath: String): typings.editly.mod.GlLayer = {
    val __obj = js.Dynamic.literal(fragmentPath = fragmentPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gl")
    __obj.asInstanceOf[typings.editly.mod.GlLayer]
  }
  
  inline def ImageLayer(path: String): typings.editly.mod.ImageLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[typings.editly.mod.ImageLayer]
  }
  
  inline def ImageOverlayLayer(path: String): typings.editly.mod.ImageOverlayLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image-overlay")
    __obj.asInstanceOf[typings.editly.mod.ImageOverlayLayer]
  }
  
  inline def LinearGradientLayer(): typings.editly.mod.LinearGradientLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("linear-gradient")
    __obj.asInstanceOf[typings.editly.mod.LinearGradientLayer]
  }
  
  inline def NewsTitleLayer(text: String): typings.editly.mod.NewsTitleLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("news-title")
    __obj.asInstanceOf[typings.editly.mod.NewsTitleLayer]
  }
  
  inline def PauseLayer(): typings.editly.mod.PauseLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("pause")
    __obj.asInstanceOf[typings.editly.mod.PauseLayer]
  }
  
  inline def RadialGradientLayer(): typings.editly.mod.RadialGradientLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("radial-gradient")
    __obj.asInstanceOf[typings.editly.mod.RadialGradientLayer]
  }
  
  inline def RainbowColorsLayer(): typings.editly.mod.RainbowColorsLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rainbow-colors")
    __obj.asInstanceOf[typings.editly.mod.RainbowColorsLayer]
  }
  
  inline def SlideInTextLayer(text: String): typings.editly.mod.SlideInTextLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("slide-in-text")
    __obj.asInstanceOf[typings.editly.mod.SlideInTextLayer]
  }
  
  inline def SubtitleLayer(text: String): typings.editly.mod.SubtitleLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("subtitle")
    __obj.asInstanceOf[typings.editly.mod.SubtitleLayer]
  }
  
  inline def TitleBackgroundLayer(text: String): typings.editly.mod.TitleBackgroundLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("title-background")
    __obj.asInstanceOf[typings.editly.mod.TitleBackgroundLayer]
  }
  
  inline def TitleLayer(text: String): typings.editly.mod.TitleLayer = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("title")
    __obj.asInstanceOf[typings.editly.mod.TitleLayer]
  }
  
  inline def VideoLayer(path: String): typings.editly.mod.VideoLayer = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[typings.editly.mod.VideoLayer]
  }
}
