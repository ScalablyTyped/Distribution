package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseSelectGetItemPropsOptions[Item]
  extends StObject
     with GetItemPropsOptions[Item]
     with GetPropsWithRefKey
object UseSelectGetItemPropsOptions {
  
  inline def apply[Item](GetItemPropsOptions: GetItemPropsOptions[Item]): UseSelectGetItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, GetItemPropsOptions)
    __obj.asInstanceOf[UseSelectGetItemPropsOptions[Item]]
  }
}
