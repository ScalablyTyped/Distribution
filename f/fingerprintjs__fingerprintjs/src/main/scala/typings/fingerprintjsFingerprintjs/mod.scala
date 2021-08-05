package typings.fingerprintjsFingerprintjs

import org.scalablytyped.runtime.Shortcut
import typings.fingerprintjsFingerprintjs.anon.AdBlock
import typings.fingerprintjsFingerprintjs.anon.DetectScreenOrientation
import typings.fingerprintjsFingerprintjs.anon.ExcludeIE
import typings.fingerprintjsFingerprintjs.anon.ExcludeIOS11
import typings.fingerprintjsFingerprintjs.anon.ExtendedJsFonts
import typings.fingerprintjsFingerprintjs.anon.GetData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@fingerprintjs/fingerprintjs", JSImport.Namespace)
  @js.native
  val ^ : Fingerprint2Static = js.native
  
  trait Component extends StObject {
    
    var key: String
    
    var value: js.Any
  }
  object Component {
    
    inline def apply(key: String, value: js.Any): Component = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    extension [Self <: Component](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fingerprint2Static extends StObject {
    
    var VERSION: String = js.native
    
    def get(callback: js.Function1[/* components */ js.Array[Component], Unit]): Unit = js.native
    def get(options: Options, callback: js.Function1[/* components */ js.Array[Component], Unit]): Unit = js.native
    
    def getPromise(): js.Promise[js.Array[Component]] = js.native
    def getPromise(options: Options): js.Promise[js.Array[Component]] = js.native
    
    def getV18(callback: js.Function2[/* murmur */ String, /* components */ js.Array[V18Component], Unit]): Unit = js.native
    def getV18(
      options: Options,
      callback: js.Function2[/* murmur */ String, /* components */ js.Array[V18Component], Unit]
    ): Unit = js.native
    
    def x64hash128(value: String, num: Double): String = js.native
  }
  
  trait Options extends StObject {
    
    var ERROR: js.UndefOr[String] = js.undefined
    
    var EXCLUDED: js.UndefOr[String] = js.undefined
    
    var NOT_AVAILABLE: js.UndefOr[String] = js.undefined
    
    var audio: js.UndefOr[ExcludeIOS11] = js.undefined
    
    var excludes: js.UndefOr[AdBlock] = js.undefined
    
    var extraComponents: js.UndefOr[js.Array[GetData]] = js.undefined
    
    var fonts: js.UndefOr[ExtendedJsFonts] = js.undefined
    
    var plugins: js.UndefOr[ExcludeIE] = js.undefined
    
    var preprocessor: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, js.Any]] = js.undefined
    
    var screen: js.UndefOr[DetectScreenOrientation] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAudio(value: ExcludeIOS11): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setERROR(value: String): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setERRORUndefined: Self = StObject.set(x, "ERROR", js.undefined)
      
      inline def setEXCLUDED(value: String): Self = StObject.set(x, "EXCLUDED", value.asInstanceOf[js.Any])
      
      inline def setEXCLUDEDUndefined: Self = StObject.set(x, "EXCLUDED", js.undefined)
      
      inline def setExcludes(value: AdBlock): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      inline def setExtraComponents(value: js.Array[GetData]): Self = StObject.set(x, "extraComponents", value.asInstanceOf[js.Any])
      
      inline def setExtraComponentsUndefined: Self = StObject.set(x, "extraComponents", js.undefined)
      
      inline def setExtraComponentsVarargs(value: GetData*): Self = StObject.set(x, "extraComponents", js.Array(value :_*))
      
      inline def setFonts(value: ExtendedJsFonts): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      inline def setNOT_AVAILABLE(value: String): Self = StObject.set(x, "NOT_AVAILABLE", value.asInstanceOf[js.Any])
      
      inline def setNOT_AVAILABLEUndefined: Self = StObject.set(x, "NOT_AVAILABLE", js.undefined)
      
      inline def setPlugins(value: ExcludeIE): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPreprocessor(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "preprocessor", js.Any.fromFunction2(value))
      
      inline def setPreprocessorUndefined: Self = StObject.set(x, "preprocessor", js.undefined)
      
      inline def setScreen(value: DetectScreenOrientation): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    }
  }
  
  trait V18Component extends StObject {
    
    var key: String
    
    var value: String
  }
  object V18Component {
    
    inline def apply(key: String, value: String): V18Component = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[V18Component]
    }
    
    extension [Self <: V18Component](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Fingerprint2Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Fingerprint2Static = ^
}
