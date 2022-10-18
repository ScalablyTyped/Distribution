package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.boolean_
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.string_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOptionMod {
  
  @JSImport("@formatjs/ecma402-abstract/GetOption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetOption[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](
    opts: T,
    prop: K,
    `type`: string_ | boolean_,
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ],
    fallback: F
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    Unit
  ]) | F = (^.asInstanceOf[js.Dynamic].applyDynamic("GetOption")(opts.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], values.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[(Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    Unit
  ]) | F]
  inline def GetOption[T /* <: js.Object */, K /* <: /* keyof T */ String */, F](opts: T, prop: K, `type`: string_ | boolean_, values: Unit, fallback: F): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    Unit
  ]) | F = (^.asInstanceOf[js.Dynamic].applyDynamic("GetOption")(opts.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], values.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[(Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
    Unit
  ]) | F]
}
