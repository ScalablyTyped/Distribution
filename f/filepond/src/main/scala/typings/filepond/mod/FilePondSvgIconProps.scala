package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePondSvgIconProps extends StObject {
  
  /**
    * The icon used for done.
    * @default '<svg></svg>'
    */
  var iconDone: js.UndefOr[String] = js.undefined
  
  /**
    * The icon used for process actions.
    * @default '<svg></svg>'
    */
  var iconProcess: js.UndefOr[String] = js.undefined
  
  /**
    * The icon used for remove actions.
    * @default '<svg></svg>'
    */
  var iconRemove: js.UndefOr[String] = js.undefined
  
  /**
    * The icon used for retry actions.
    * @default '<svg></svg>'
    */
  var iconRetry: js.UndefOr[String] = js.undefined
  
  /**
    * The icon used for undo actions.
    * @default '<svg></svg>'
    */
  var iconUndo: js.UndefOr[String] = js.undefined
}
object FilePondSvgIconProps {
  
  inline def apply(): FilePondSvgIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondSvgIconProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilePondSvgIconProps] (val x: Self) extends AnyVal {
    
    inline def setIconDone(value: String): Self = StObject.set(x, "iconDone", value.asInstanceOf[js.Any])
    
    inline def setIconDoneUndefined: Self = StObject.set(x, "iconDone", js.undefined)
    
    inline def setIconProcess(value: String): Self = StObject.set(x, "iconProcess", value.asInstanceOf[js.Any])
    
    inline def setIconProcessUndefined: Self = StObject.set(x, "iconProcess", js.undefined)
    
    inline def setIconRemove(value: String): Self = StObject.set(x, "iconRemove", value.asInstanceOf[js.Any])
    
    inline def setIconRemoveUndefined: Self = StObject.set(x, "iconRemove", js.undefined)
    
    inline def setIconRetry(value: String): Self = StObject.set(x, "iconRetry", value.asInstanceOf[js.Any])
    
    inline def setIconRetryUndefined: Self = StObject.set(x, "iconRetry", js.undefined)
    
    inline def setIconUndo(value: String): Self = StObject.set(x, "iconUndo", value.asInstanceOf[js.Any])
    
    inline def setIconUndoUndefined: Self = StObject.set(x, "iconUndo", js.undefined)
  }
}
