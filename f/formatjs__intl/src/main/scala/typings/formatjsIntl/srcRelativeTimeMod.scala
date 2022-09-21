package typings.formatjsIntl

import typings.formatjsIntl.anon.OnError
import typings.formatjsIntl.anon.TypeofRelativeTimeFormat
import typings.std.ConstructorParameters
import typings.std.Intl.RelativeTimeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRelativeTimeMod {
  
  @JSImport("@formatjs/intl/src/relativeTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofRelativeTimeFormat], RelativeTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofRelativeTimeFormat], RelativeTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofRelativeTimeFormat], RelativeTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofRelativeTimeFormat], RelativeTimeFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: Unit,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.RelativeTimeFormat['format']>[0], unit : std.Parameters<std.Intl.RelativeTimeFormat['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRelativeTime")(config.asInstanceOf[js.Any], getRelativeTimeFormat.asInstanceOf[js.Any], value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
