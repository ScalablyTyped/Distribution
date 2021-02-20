package typings.formatjsEcma402Abstract

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.formatjsEcma402Abstract.anon.Dictk
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveLocaleMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/ResolveLocale", "ResolveLocale")
  @js.native
  def ResolveLocale[K /* <: String */, D /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]: any}
    */ typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.ResolveLocale with TopLevel[js.Any] */](
    availableLocales: Set[String],
    requestedLocales: js.Array[String],
    options: Dictk,
    relevantExtensionKeys: js.Array[K],
    localeData: Record[String, js.UndefOr[D]],
    getDefaultLocale: js.Function0[String]
  ): ResolveLocaleResult = js.native
  
  @js.native
  trait ResolveLocaleResult
    extends /* k */ StringDictionary[js.Any] {
    
    var dataLocale: String = js.native
    
    var locale: String = js.native
  }
  object ResolveLocaleResult {
    
    @scala.inline
    def apply(dataLocale: String, locale: String): ResolveLocaleResult = {
      val __obj = js.Dynamic.literal(dataLocale = dataLocale.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveLocaleResult]
    }
    
    @scala.inline
    implicit class ResolveLocaleResultMutableBuilder[Self <: ResolveLocaleResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataLocale(value: String): Self = StObject.set(x, "dataLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
}
