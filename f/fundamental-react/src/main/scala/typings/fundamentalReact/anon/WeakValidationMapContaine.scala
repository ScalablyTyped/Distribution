package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Container/Container.ContainerProps> */
trait WeakValidationMapContaine extends StObject {
  
  var children: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode ? react.react.Validator<react.react.ReactNode | null | undefined> : undefined extends react.react.ReactNode ? react.react.Validator<react.react.ReactNode | null | undefined> : react.react.Validator<react.react.ReactNode> */ js.Any
  ] = js.undefined
  
  var className: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
  ] = js.undefined
  
  var noGap: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
  ] = js.undefined
}
object WeakValidationMapContaine {
  
  inline def apply(): WeakValidationMapContaine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapContaine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeakValidationMapContaine] (val x: Self) extends AnyVal {
    
    inline def setChildren(
      value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode ? react.react.Validator<react.react.ReactNode | null | undefined> : undefined extends react.react.ReactNode ? react.react.Validator<react.react.ReactNode | null | undefined> : react.react.Validator<react.react.ReactNode> */ js.Any
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(
      value: /* import warning: importer.ImportType#apply Failed type conversion: null extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : undefined extends string | undefined ? react.react.Validator<string | undefined | null | undefined> : react.react.Validator<string | undefined> */ js.Any
    ): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setNoGap(
      value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
    ): Self = StObject.set(x, "noGap", value.asInstanceOf[js.Any])
    
    inline def setNoGapUndefined: Self = StObject.set(x, "noGap", js.undefined)
  }
}
