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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@fingerprintjs/fingerprintjs", JSImport.Namespace)
  @js.native
  val ^ : Fingerprint2Static = js.native
  
  @js.native
  trait Component extends StObject {
    
    var key: String = js.native
    
    var value: js.Any = js.native
  }
  object Component {
    
    @scala.inline
    def apply(key: String, value: js.Any): Component = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: ExcludeIOS11): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setERROR(value: String): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERRORUndefined: Self = StObject.set(x, "ERROR", js.undefined)
      
      @scala.inline
      def setEXCLUDED(value: String): Self = StObject.set(x, "EXCLUDED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEXCLUDEDUndefined: Self = StObject.set(x, "EXCLUDED", js.undefined)
      
      @scala.inline
      def setExcludes(value: AdBlock): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      @scala.inline
      def setExtraComponents(value: js.Array[GetData]): Self = StObject.set(x, "extraComponents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraComponentsUndefined: Self = StObject.set(x, "extraComponents", js.undefined)
      
      @scala.inline
      def setExtraComponentsVarargs(value: GetData*): Self = StObject.set(x, "extraComponents", js.Array(value :_*))
      
      @scala.inline
      def setFonts(value: ExtendedJsFonts): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
      
      @scala.inline
      def setNOT_AVAILABLE(value: String): Self = StObject.set(x, "NOT_AVAILABLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOT_AVAILABLEUndefined: Self = StObject.set(x, "NOT_AVAILABLE", js.undefined)
      
      @scala.inline
      def setPlugins(value: ExcludeIE): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPreprocessor(value: (/* key */ String, /* value */ js.Any) => _): Self = StObject.set(x, "preprocessor", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPreprocessorUndefined: Self = StObject.set(x, "preprocessor", js.undefined)
      
      @scala.inline
      def setScreen(value: DetectScreenOrientation): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    }
  }
  
  @js.native
  trait V18Component extends StObject {
    
    var key: String = js.native
    
    var value: String = js.native
  }
  object V18Component {
    
    @scala.inline
    def apply(key: String, value: String): V18Component = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[V18Component]
    }
    
    @scala.inline
    implicit class V18ComponentMutableBuilder[Self <: V18Component] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Fingerprint2Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Fingerprint2Static = ^
}
