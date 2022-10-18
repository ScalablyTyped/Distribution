package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> */
trait WeakValidationMapTileCont extends StObject {
  
  var className: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
  ] = js.undefined
  
  var twoColumns: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
  ] = js.undefined
}
object WeakValidationMapTileCont {
  
  inline def apply(): WeakValidationMapTileCont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileCont]
  }
  
  extension [Self <: WeakValidationMapTileCont](x: Self) {
    
    inline def setClassName(
      value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
    ): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setTwoColumns(
      value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
    ): Self = StObject.set(x, "twoColumns", value.asInstanceOf[js.Any])
    
    inline def setTwoColumnsUndefined: Self = StObject.set(x, "twoColumns", js.undefined)
  }
}
