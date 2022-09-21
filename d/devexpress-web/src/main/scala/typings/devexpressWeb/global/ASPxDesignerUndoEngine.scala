package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ASPxDesignerUndoEngine")
@js.native
open class ASPxDesignerUndoEngine ()
  extends StObject
     with typings.devexpressWeb.ASPxDesignerUndoEngine {
  
  /* CompleteClass */
  override def clearHistory(): Unit = js.native
  
  /* CompleteClass */
  var isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any = js.native
  
  /* CompleteClass */
  override def redo(): Unit = js.native
  
  /* CompleteClass */
  var redoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any = js.native
  
  /* CompleteClass */
  override def undo(): Unit = js.native
  
  /* CompleteClass */
  override def undoAll(): Unit = js.native
  
  /* CompleteClass */
  var undoEnabled: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any = js.native
}
