package typings.fingerprintjsFingerprintjs.mod

import typings.fingerprintjsFingerprintjs.anon.AdBlock
import typings.fingerprintjsFingerprintjs.anon.DetectScreenOrientation
import typings.fingerprintjsFingerprintjs.anon.ExcludeIE
import typings.fingerprintjsFingerprintjs.anon.ExcludeIOS11
import typings.fingerprintjsFingerprintjs.anon.ExtendedJsFonts
import typings.fingerprintjsFingerprintjs.anon.GetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var ERROR: js.UndefOr[String] = js.native
  
  var EXCLUDED: js.UndefOr[String] = js.native
  
  var NOT_AVAILABLE: js.UndefOr[String] = js.native
  
  var audio: js.UndefOr[ExcludeIOS11] = js.native
  
  var excludes: js.UndefOr[AdBlock] = js.native
  
  var extraComponents: js.UndefOr[js.Array[GetData]] = js.native
  
  var fonts: js.UndefOr[ExtendedJsFonts] = js.native
  
  var plugins: js.UndefOr[ExcludeIE] = js.native
  
  var preprocessor: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  
  var screen: js.UndefOr[DetectScreenOrientation] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setERROR(value: String): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteERROR: Self = this.set("ERROR", js.undefined)
    
    @scala.inline
    def setEXCLUDED(value: String): Self = this.set("EXCLUDED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEXCLUDED: Self = this.set("EXCLUDED", js.undefined)
    
    @scala.inline
    def setNOT_AVAILABLE(value: String): Self = this.set("NOT_AVAILABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNOT_AVAILABLE: Self = this.set("NOT_AVAILABLE", js.undefined)
    
    @scala.inline
    def setAudio(value: ExcludeIOS11): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setExcludes(value: AdBlock): Self = this.set("excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
    
    @scala.inline
    def setExtraComponentsVarargs(value: GetData*): Self = this.set("extraComponents", js.Array(value :_*))
    
    @scala.inline
    def setExtraComponents(value: js.Array[GetData]): Self = this.set("extraComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraComponents: Self = this.set("extraComponents", js.undefined)
    
    @scala.inline
    def setFonts(value: ExtendedJsFonts): Self = this.set("fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    
    @scala.inline
    def setPlugins(value: ExcludeIE): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPreprocessor(value: (/* key */ String, /* value */ js.Any) => _): Self = this.set("preprocessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePreprocessor: Self = this.set("preprocessor", js.undefined)
    
    @scala.inline
    def setScreen(value: DetectScreenOrientation): Self = this.set("screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreen: Self = this.set("screen", js.undefined)
  }
}
