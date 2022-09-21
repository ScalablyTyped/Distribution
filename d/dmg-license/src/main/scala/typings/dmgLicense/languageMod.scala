package typings.dmgLicense

import org.scalablytyped.runtime.StringDictionary
import typings.dmgLicense.anon.`2`
import typings.dmgLicense.labelsMod.Labels
import typings.iconvCorefoundation.mod.StringEncoding
import typings.std.Error
import typings.std.Exclude
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object languageMod {
  
  @JSImport("dmg-license/lib/Language", JSImport.Default)
  @js.native
  abstract class default () extends Language
  /* static members */
  object default {
    
    @JSImport("dmg-license/lib/Language", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(lang: Language): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(lang.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("dmg-license/lib/Language", "default.byID")
    @js.native
    def byID: js.Array[js.UndefOr[Language]] = js.native
    inline def byID_=(x: js.Array[js.UndefOr[Language]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byID")(x.asInstanceOf[js.Any])
    
    inline def bySpec(lang: LangSpecs): js.Array[Language] = ^.asInstanceOf[js.Dynamic].applyDynamic("bySpec")(lang.asInstanceOf[js.Any]).asInstanceOf[js.Array[Language]]
    inline def bySpec(lang: LangSpecs, context: typings.dmgLicense.contextMod.default): js.Array[Language] = (^.asInstanceOf[js.Dynamic].applyDynamic("bySpec")(lang.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Language]]
    
    @JSImport("dmg-license/lib/Language", "default.byTag")
    @js.native
    def byTag: StringDictionary[js.UndefOr[Language]] = js.native
    inline def byTag_=(x: StringDictionary[js.UndefOr[Language]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byTag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("dmg-license/lib/Language", "Language")
  @js.native
  abstract class Language () extends StObject {
    
    var charset: StringEncoding = js.native
    
    var doubleByteCharset: Boolean = js.native
    
    var englishName: String = js.native
    
    var labels: js.UndefOr[Labels[String]] = js.native
    
    var langTags: js.Array[String] = js.native
    
    var languageID: Double = js.native
    
    var localizedName: String = js.native
  }
  /* static members */
  object Language {
    
    @JSImport("dmg-license/lib/Language", "Language")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(lang: Language): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(lang.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("dmg-license/lib/Language", "Language.byID")
    @js.native
    def byID: js.Array[js.UndefOr[Language]] = js.native
    inline def byID_=(x: js.Array[js.UndefOr[Language]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byID")(x.asInstanceOf[js.Any])
    
    inline def bySpec(lang: LangSpecs): js.Array[Language] = ^.asInstanceOf[js.Dynamic].applyDynamic("bySpec")(lang.asInstanceOf[js.Any]).asInstanceOf[js.Array[Language]]
    inline def bySpec(lang: LangSpecs, context: typings.dmgLicense.contextMod.default): js.Array[Language] = (^.asInstanceOf[js.Dynamic].applyDynamic("bySpec")(lang.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Language]]
    
    @JSImport("dmg-license/lib/Language", "Language.byTag")
    @js.native
    def byTag: StringDictionary[js.UndefOr[Language]] = js.native
    inline def byTag_=(x: StringDictionary[js.UndefOr[Language]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byTag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("dmg-license/lib/Language", "NoSuchLanguageError")
  @js.native
  open class NoSuchLanguageError protected ()
    extends StObject
       with Error {
    def this(lang: LangSpecs) = this()
    
    var lang: LangSpecs = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  object indexByLanguage {
    
    inline def apply[T /* <: Localization */](objects: js.Iterable[T]): Map[Double, T] = ^.asInstanceOf[js.Dynamic].apply(objects.asInstanceOf[js.Any]).asInstanceOf[Map[Double, T]]
    inline def apply[T /* <: Localization */](objects: js.Iterable[T], options: (Options[T, T]) & typings.dmgLicense.anon.Map): Map[Double, T] = (^.asInstanceOf[js.Dynamic].apply(objects.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Map[Double, T]]
    inline def apply[T /* <: Localization */, U](objects: js.Iterable[T], options: (Options[T, U]) & (`2`[T, U])): Map[Double, Exclude[U, Unit]] = (^.asInstanceOf[js.Dynamic].apply(objects.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Map[Double, Exclude[U, Unit]]]
    
    @JSImport("dmg-license/lib/Language", "indexByLanguage")
    @js.native
    val ^ : js.Any = js.native
    
    trait Options[T, U] extends StObject {
      
      var filter: js.UndefOr[js.Function1[/* object */ T, Boolean]] = js.undefined
      
      var map: js.UndefOr[js.Function2[/* object */ T, /* lang */ Language, js.UndefOr[U]]] = js.undefined
      
      var onCollisions: js.UndefOr[js.Function1[/* languageIDs */ Set[Double], Unit]] = js.undefined
    }
    object Options {
      
      inline def apply[T, U](): Options[T, U] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options[T, U]]
      }
      
      extension [Self <: Options[?, ?], T, U](x: Self & (Options[T, U])) {
        
        inline def setFilter(value: /* object */ T => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setMap(value: (/* object */ T, /* lang */ Language) => js.UndefOr[U]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
        
        inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
        
        inline def setOnCollisions(value: /* languageIDs */ Set[Double] => Unit): Self = StObject.set(x, "onCollisions", js.Any.fromFunction1(value))
        
        inline def setOnCollisionsUndefined: Self = StObject.set(x, "onCollisions", js.undefined)
      }
    }
  }
  
  type LangSpec = String | Double
  
  type LangSpecs = LangSpec | js.Array[LangSpec]
  
  trait Localization extends StObject {
    
    var lang: LangSpecs
  }
  object Localization {
    
    inline def apply(lang: LangSpecs): Localization = {
      val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any])
      __obj.asInstanceOf[Localization]
    }
    
    extension [Self <: Localization](x: Self) {
      
      inline def setLang(value: LangSpecs): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangVarargs(value: LangSpec*): Self = StObject.set(x, "lang", js.Array(value*))
    }
  }
}
