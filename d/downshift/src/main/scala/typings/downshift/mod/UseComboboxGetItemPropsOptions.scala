package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseComboboxGetItemPropsOptions[Item]
  extends StObject
     with GetItemPropsOptions[Item]
     with GetPropsWithRefKey
object UseComboboxGetItemPropsOptions {
  
  inline def apply[Item](GetItemPropsOptions: GetItemPropsOptions[Item]): UseComboboxGetItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, GetItemPropsOptions)
    __obj.asInstanceOf[UseComboboxGetItemPropsOptions[Item]]
  }
}
