package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/List/List.ListItemProps> */
trait WeakValidationMapListItem extends StObject {
  
  var children: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
  ] = js.undefined
  
  var className: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
  ] = js.undefined
  
  var onClick: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: null extends (args : ...any): any | undefined ? react.react.Validator<(args : ...any): any | undefined | null | undefined> : undefined extends (args : ...any): any | undefined ? react.react.Validator<(args : ...any): any | undefined | null | undefined> : react.react.Validator<(args : ...any): any | undefined> */ js.Any
  ] = js.undefined
  
  var selected: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
  ] = js.undefined
}
object WeakValidationMapListItem {
  
  inline def apply(): WeakValidationMapListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeakValidationMapListItem] (val x: Self) extends AnyVal {
    
    inline def setChildren(
      value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(
      value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
    ): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setOnClick(
      value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (args : ...any): any | undefined ? react.react.Validator<(args : ...any): any | undefined | null | undefined> : undefined extends (args : ...any): any | undefined ? react.react.Validator<(args : ...any): any | undefined | null | undefined> : react.react.Validator<(args : ...any): any | undefined> */ js.Any
    ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setSelected(
      value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
    ): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
