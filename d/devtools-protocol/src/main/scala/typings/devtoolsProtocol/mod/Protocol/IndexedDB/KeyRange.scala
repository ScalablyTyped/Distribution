package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyRange extends js.Object {
  
  /**
    * Lower bound.
    */
  var lower: js.UndefOr[Key] = js.native
  
  /**
    * If true lower bound is open.
    */
  var lowerOpen: Boolean = js.native
  
  /**
    * Upper bound.
    */
  var upper: js.UndefOr[Key] = js.native
  
  /**
    * If true upper bound is open.
    */
  var upperOpen: Boolean = js.native
}
object KeyRange {
  
  @scala.inline
  def apply(lowerOpen: Boolean, upperOpen: Boolean): KeyRange = {
    val __obj = js.Dynamic.literal(lowerOpen = lowerOpen.asInstanceOf[js.Any], upperOpen = upperOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyRange]
  }
  
  @scala.inline
  implicit class KeyRangeOps[Self <: KeyRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLowerOpen(value: Boolean): Self = this.set("lowerOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperOpen(value: Boolean): Self = this.set("upperOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLower(value: Key): Self = this.set("lower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLower: Self = this.set("lower", js.undefined)
    
    @scala.inline
    def setUpper(value: Key): Self = this.set("upper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpper: Self = this.set("upper", js.undefined)
  }
}
