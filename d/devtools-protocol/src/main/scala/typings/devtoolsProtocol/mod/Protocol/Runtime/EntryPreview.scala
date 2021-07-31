package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryPreview extends StObject {
  
  /**
    * Preview of the key. Specified for map-like collection entries.
    */
  var key: js.UndefOr[ObjectPreview] = js.undefined
  
  /**
    * Preview of the value.
    */
  var value: ObjectPreview
}
object EntryPreview {
  
  @scala.inline
  def apply(value: ObjectPreview): EntryPreview = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPreview]
  }
  
  @scala.inline
  implicit class EntryPreviewMutableBuilder[Self <: EntryPreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: ObjectPreview): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: ObjectPreview): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
