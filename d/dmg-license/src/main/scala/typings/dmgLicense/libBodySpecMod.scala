package typings.dmgLicense

import typings.dmgLicense.anon.Data
import typings.dmgLicense.dmgLicenseStrings.`UTF-8`
import typings.dmgLicense.dmgLicenseStrings.plain
import typings.dmgLicense.dmgLicenseStrings.rtf
import typings.dmgLicense.libLanguageMod.LangSpecs
import typings.dmgLicense.libLanguageMod.Localization
import typings.dmgLicense.libLanguageMod.default
import typings.dmgLicense.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodySpecMod {
  
  object default {
    
    @JSImport("dmg-license/lib/BodySpec", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def prepare(spec: BodySpec, lang: typings.dmgLicense.libLanguageMod.default): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(spec.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
    inline def prepare(
      spec: BodySpec,
      lang: typings.dmgLicense.libLanguageMod.default,
      contextOrOptions: typings.dmgLicense.libContextMod.default
    ): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(spec.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
    inline def prepare(spec: BodySpec, lang: typings.dmgLicense.libLanguageMod.default, contextOrOptions: Options): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(spec.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.dmgLicense.libBodySpecMod.BodySpec.BodyInline
    - typings.dmgLicense.libBodySpecMod.BodySpec.BodyInFile
  */
  trait BodySpec extends StObject
  object BodySpec {
    
    @JSImport("dmg-license/lib/BodySpec", "BodySpec")
    @js.native
    val ^ : js.Any = js.native
    
    inline def prepare(spec: BodySpec, lang: default): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(spec.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
    inline def prepare(spec: BodySpec, lang: default, contextOrOptions: typings.dmgLicense.libContextMod.default): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(spec.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
    inline def prepare(spec: BodySpec, lang: default, contextOrOptions: Options): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(spec.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], contextOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
    
    trait BaseBodySpec
      extends StObject
         with Localization {
      
      var `type`: js.UndefOr[rtf | plain] = js.undefined
    }
    object BaseBodySpec {
      
      inline def apply(lang: LangSpecs): BaseBodySpec = {
        val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseBodySpec]
      }
      
      extension [Self <: BaseBodySpec](x: Self) {
        
        inline def setType(value: rtf | plain): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait BodyInFile
      extends StObject
         with BaseBodySpec
         with BodySpec {
      
      var charset: js.UndefOr[`UTF-8` | String] = js.undefined
      
      var file: String
      
      var text: js.UndefOr[scala.Nothing] = js.undefined
    }
    object BodyInFile {
      
      inline def apply(file: String, lang: LangSpecs): BodyInFile = {
        val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
        __obj.asInstanceOf[BodyInFile]
      }
      
      extension [Self <: BodyInFile](x: Self) {
        
        inline def setCharset(value: `UTF-8` | String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
        
        inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
        
        inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      }
    }
    
    trait BodyInline
      extends StObject
         with BaseBodySpec
         with BodySpec {
      
      var charset: js.UndefOr[scala.Nothing] = js.undefined
      
      var file: js.UndefOr[scala.Nothing] = js.undefined
      
      var text: String
    }
    object BodyInline {
      
      inline def apply(lang: LangSpecs, text: String): BodyInline = {
        val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[BodyInline]
      }
      
      extension [Self <: BodyInline](x: Self) {
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
  }
}
