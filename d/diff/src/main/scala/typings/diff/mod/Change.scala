package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  /**
    * `true` if the value was inserted into the new string.
    */
  var added: js.UndefOr[Boolean] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * `true` if the value was removed from the old string.
    */
  var removed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Text content.
    */
  var value: String
}
object Change {
  
  @scala.inline
  def apply(value: String): Change = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeMutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded(value: Boolean): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedUndefined: Self = StObject.set(x, "added", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
