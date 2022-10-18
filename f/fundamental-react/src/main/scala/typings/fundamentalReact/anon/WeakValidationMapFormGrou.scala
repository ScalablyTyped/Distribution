package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Forms/FormGroup.FormGroupProps> */
trait WeakValidationMapFormGrou extends StObject {
  
  var disableStyles: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
  ] = js.undefined
}
object WeakValidationMapFormGrou {
  
  inline def apply(): WeakValidationMapFormGrou = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapFormGrou]
  }
  
  extension [Self <: WeakValidationMapFormGrou](x: Self) {
    
    inline def setDisableStyles(
      value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
    ): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
    
    inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
  }
}
