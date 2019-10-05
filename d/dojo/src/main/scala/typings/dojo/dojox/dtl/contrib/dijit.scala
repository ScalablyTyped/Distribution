package typings.dojo.dojox.dtl.contrib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/contrib/dijit.html
  *
  *
  */
trait dijit extends js.Object {
  /**
    *
    */
  var widgetsInTemplate: Boolean
  /**
    *
    * @param keys
    * @param object
    */
  def AttachNode(keys: js.Any, `object`: js.Any): Unit
  /**
    *
    * @param node
    * @param parsed
    */
  def DojoTypeNode(node: js.Any, parsed: js.Any): Unit
  /**
    *
    * @param command
    * @param obj
    */
  def EventNode(command: js.Any, obj: js.Any): Unit
  /**
    *
    * @param parser
    * @param token
    */
  def data_dojo_attach_event(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def data_dojo_attach_point(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def data_dojo_type(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def dojoAttachEvent(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def dojoAttachPoint(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def dojoType(parser: js.Any, token: js.Any): js.Any
  /**
    * Associates an event type to a function (on the current widget) by name
    *
    * @param parser
    * @param token
    */
  def on(parser: js.Any, token: js.Any): js.Any
}

object dijit {
  @scala.inline
  def apply(
    AttachNode: (js.Any, js.Any) => Unit,
    DojoTypeNode: (js.Any, js.Any) => Unit,
    EventNode: (js.Any, js.Any) => Unit,
    data_dojo_attach_event: (js.Any, js.Any) => js.Any,
    data_dojo_attach_point: (js.Any, js.Any) => js.Any,
    data_dojo_type: (js.Any, js.Any) => js.Any,
    dojoAttachEvent: (js.Any, js.Any) => js.Any,
    dojoAttachPoint: (js.Any, js.Any) => js.Any,
    dojoType: (js.Any, js.Any) => js.Any,
    on: (js.Any, js.Any) => js.Any,
    widgetsInTemplate: Boolean
  ): dijit = {
    val __obj = js.Dynamic.literal(AttachNode = js.Any.fromFunction2(AttachNode), DojoTypeNode = js.Any.fromFunction2(DojoTypeNode), EventNode = js.Any.fromFunction2(EventNode), data_dojo_attach_event = js.Any.fromFunction2(data_dojo_attach_event), data_dojo_attach_point = js.Any.fromFunction2(data_dojo_attach_point), data_dojo_type = js.Any.fromFunction2(data_dojo_type), dojoAttachEvent = js.Any.fromFunction2(dojoAttachEvent), dojoAttachPoint = js.Any.fromFunction2(dojoAttachPoint), dojoType = js.Any.fromFunction2(dojoType), on = js.Any.fromFunction2(on), widgetsInTemplate = widgetsInTemplate)
  
    __obj.asInstanceOf[dijit]
  }
}

