package typings.esToPrimitive

import org.scalablytyped.runtime.Shortcut
import typings.esToPrimitive.anon.ES2015
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("es-to-primitive", JSImport.Namespace)
  @js.native
  val ^ : (js.Function2[
    /* input */ js.Any, 
    /* hint */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof String */ js.Any
    ], 
    js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null]
  ]) & ES2015 = js.native
  
  type _To = (js.Function2[
    /* input */ js.Any, 
    /* hint */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof String */ js.Any
    ], 
    js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null]
  ]) & ES2015
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: (js.Function2[
    /* input */ js.Any, 
    /* hint */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof String */ js.Any
    ], 
    js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null]
  ]) & ES2015 = ^
}
