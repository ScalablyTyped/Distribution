package typings.dojo.dojox.drawing.manager

import typings.dojo.dojox.drawing.stencil.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/manager/Anchors.html
  *
  *
  * @param options
  */
@JSGlobal("dojox.drawing.manager.Anchors")
@js.native
class Anchors protected () extends js.Object {
  def this(options: js.Object) = this()
  /**
    * Creates anchor points on a Stencil, based on the
    * Stencil's points.
    *
    * @param item
    */
  def add(item: Base): Unit = js.native
  /**
    * Event fires when anchor is created
    *
    * @param anchor An object with the following properties:y_anchorx_anchorrender: Creates the anchor point. Unlike most render methodsin Drawing, this is only called once.onRenderStencil: Event fires when an anchor calls a Stencil's render methodonTransformPoint: Event fires when an anchor changes the points of a StencilonAnchorDown: Event fires for mousedown on anchoronAnchorUp: Event fires for mouseup on anchoronAnchorDrag: Event fires for on dragging of an anchoranchorConstrain: To be over written by tool!Add an anchorConstrain method to the tooland it will automatically overwrite this stub.Should return a constrained x & y value.anchorPositionCheck: To be over written by tool!Add a anchorPositionCheck method to the tooland it will automatically overwrite this stub.Should return x and y coords. Success is bothbeing greater than zero, fail is if one or bothare less than zero.setPoint: Internal. Sets the Stencil's pointconnectMouse: Internal. Connects anchor to manager.mousedisconnectMouse: Internal. Disconnects anchor to manager.mousereset: Called (usually) from a Stencil when that Stencilneeded to make modifications to the position of thepoint. Basically used when teh anchor causes aless than zero condition.destroy: Destroys anchor.
    */
  def onAddAnchor(anchor: js.Object): Unit = js.native
  /**
    * Event fired on anchor mousedown
    *
    * @param anchor An object with the following properties:y_anchorx_anchorrender: Creates the anchor point. Unlike most render methodsin Drawing, this is only called once.onRenderStencil: Event fires when an anchor calls a Stencil's render methodonTransformPoint: Event fires when an anchor changes the points of a StencilonAnchorDown: Event fires for mousedown on anchoronAnchorUp: Event fires for mouseup on anchoronAnchorDrag: Event fires for on dragging of an anchoranchorConstrain: To be over written by tool!Add an anchorConstrain method to the tooland it will automatically overwrite this stub.Should return a constrained x & y value.anchorPositionCheck: To be over written by tool!Add a anchorPositionCheck method to the tooland it will automatically overwrite this stub.Should return x and y coords. Success is bothbeing greater than zero, fail is if one or bothare less than zero.setPoint: Internal. Sets the Stencil's pointconnectMouse: Internal. Connects anchor to manager.mousedisconnectMouse: Internal. Disconnects anchor to manager.mousereset: Called (usually) from a Stencil when that Stencilneeded to make modifications to the position of thepoint. Basically used when teh anchor causes aless than zero condition.destroy: Destroys anchor.
    */
  def onAnchorDown(anchor: js.Object): Unit = js.native
  /**
    * Event fired when anchor is moved
    *
    * @param anchor An object with the following properties:y_anchorx_anchorrender: Creates the anchor point. Unlike most render methodsin Drawing, this is only called once.onRenderStencil: Event fires when an anchor calls a Stencil's render methodonTransformPoint: Event fires when an anchor changes the points of a StencilonAnchorDown: Event fires for mousedown on anchoronAnchorUp: Event fires for mouseup on anchoronAnchorDrag: Event fires for on dragging of an anchoranchorConstrain: To be over written by tool!Add an anchorConstrain method to the tooland it will automatically overwrite this stub.Should return a constrained x & y value.anchorPositionCheck: To be over written by tool!Add a anchorPositionCheck method to the tooland it will automatically overwrite this stub.Should return x and y coords. Success is bothbeing greater than zero, fail is if one or bothare less than zero.setPoint: Internal. Sets the Stencil's pointconnectMouse: Internal. Connects anchor to manager.mousedisconnectMouse: Internal. Disconnects anchor to manager.mousereset: Called (usually) from a Stencil when that Stencilneeded to make modifications to the position of thepoint. Basically used when teh anchor causes aless than zero condition.destroy: Destroys anchor.
    */
  def onAnchorDrag(anchor: js.Object): Unit = js.native
  /**
    * Event fired on anchor mouseup
    *
    * @param anchor An object with the following properties:y_anchorx_anchorrender: Creates the anchor point. Unlike most render methodsin Drawing, this is only called once.onRenderStencil: Event fires when an anchor calls a Stencil's render methodonTransformPoint: Event fires when an anchor changes the points of a StencilonAnchorDown: Event fires for mousedown on anchoronAnchorUp: Event fires for mouseup on anchoronAnchorDrag: Event fires for on dragging of an anchoranchorConstrain: To be over written by tool!Add an anchorConstrain method to the tooland it will automatically overwrite this stub.Should return a constrained x & y value.anchorPositionCheck: To be over written by tool!Add a anchorPositionCheck method to the tooland it will automatically overwrite this stub.Should return x and y coords. Success is bothbeing greater than zero, fail is if one or bothare less than zero.setPoint: Internal. Sets the Stencil's pointconnectMouse: Internal. Connects anchor to manager.mousedisconnectMouse: Internal. Disconnects anchor to manager.mousereset: Called (usually) from a Stencil when that Stencilneeded to make modifications to the position of thepoint. Basically used when teh anchor causes aless than zero condition.destroy: Destroys anchor.
    */
  def onAnchorUp(anchor: js.Object): Unit = js.native
  /**
    * if the Stencil changes color while were's selected
    * this moves the anchors to the back. Fix it.
    *
    * @param stencil
    */
  def onChangeStyle(stencil: js.Object): Unit = js.native
  /**
    * Event fires when an anchor calls a Stencil's render method
    *
    */
  def onRenderStencil(): Unit = js.native
  /**
    * Event fires when an anchor's reset method is called
    *
    * @param stencil
    */
  def onReset(stencil: Base): Unit = js.native
  /**
    * Event fired on anchor drag
    *
    * @param anchor An object with the following properties:y_anchorx_anchorrender: Creates the anchor point. Unlike most render methodsin Drawing, this is only called once.onRenderStencil: Event fires when an anchor calls a Stencil's render methodonTransformPoint: Event fires when an anchor changes the points of a StencilonAnchorDown: Event fires for mousedown on anchoronAnchorUp: Event fires for mouseup on anchoronAnchorDrag: Event fires for on dragging of an anchoranchorConstrain: To be over written by tool!Add an anchorConstrain method to the tooland it will automatically overwrite this stub.Should return a constrained x & y value.anchorPositionCheck: To be over written by tool!Add a anchorPositionCheck method to the tooland it will automatically overwrite this stub.Should return x and y coords. Success is bothbeing greater than zero, fail is if one or bothare less than zero.setPoint: Internal. Sets the Stencil's pointconnectMouse: Internal. Connects anchor to manager.mousedisconnectMouse: Internal. Disconnects anchor to manager.mousereset: Called (usually) from a Stencil when that Stencilneeded to make modifications to the position of thepoint. Basically used when teh anchor causes aless than zero condition.destroy: Destroys anchor.
    */
  def onTransformPoint(anchor: js.Object): Unit = js.native
  /**
    * Destroys the anchor points for a Stencil.
    *
    * @param item
    */
  def remove(item: Base): Unit = js.native
}

