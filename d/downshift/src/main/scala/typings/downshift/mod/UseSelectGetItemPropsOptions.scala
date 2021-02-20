package typings.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSelectGetItemPropsOptions[Item]
  extends GetItemPropsOptions[Item]
     with GetPropsWithRefKey
object UseSelectGetItemPropsOptions {
  
  @scala.inline
  def apply[Item](GetItemPropsOptions: GetItemPropsOptions[Item]): UseSelectGetItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, GetItemPropsOptions)
    __obj.asInstanceOf[UseSelectGetItemPropsOptions[Item]]
  }
}
