package typings.extjs.Ext.util

import typings.extjs.Ext.dd.IDragTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComponentDragger extends IDragTracker {
  
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var constrainDelegate: js.UndefOr[Boolean] = js.native
  
  /** [Method] Move either the ghost Component or the target Component to its new position on drag
    * @param e Object
    */
  @JSName("onDrag")
  var onDrag_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Object
    */
  @JSName("onEnd")
  var onEnd_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Template method which should be overridden by each DragTracker instance
    * @param e Object
    */
  @JSName("onStart")
  var onStart_IComponentDragger: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
}
object IComponentDragger {
  
  @scala.inline
  def apply(): IComponentDragger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponentDragger]
  }
  
  @scala.inline
  implicit class IComponentDraggerOps[Self <: IComponentDragger] (val x: Self) extends AnyVal {
    
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
    def setConstrain(value: Boolean): Self = this.set("constrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrain: Self = this.set("constrain", js.undefined)
    
    @scala.inline
    def setConstrainDelegate(value: Boolean): Self = this.set("constrainDelegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrainDelegate: Self = this.set("constrainDelegate", js.undefined)
    
    @scala.inline
    def setOnDrag(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    
    @scala.inline
    def setOnEnd(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    
    @scala.inline
    def setOnStart(value: /* e */ js.UndefOr[js.Any] => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
  }
}
