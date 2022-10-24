package typings.formatjsIntl

import typings.formatjsIntl.anon.LocaleOnError
import typings.formatjsIntl.anon.TypeofDisplayNames
import typings.formatjsIntlDisplaynames.mod.DisplayNames
import typings.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcDisplayNameMod {
  
  @JSImport("@formatjs/intl/lib/src/displayName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatDisplayName(
    param0: LocaleOnError,
    getDisplayNames: js.Function1[/* args */ ConstructorParameters[TypeofDisplayNames], DisplayNames],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatDisplayNameOptions): string | undefined>[1] */ js.Any
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDisplayName")(param0.asInstanceOf[js.Any], getDisplayNames.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
}
