package typings.dojo.dojox.app

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/ViewBase.html
  *
  * View base class with model & controller capabilities. Subclass must implement rendering capabilities.
  *
  * @param params view parameters, include:app: the appid: view idname: view nameparent: parent viewcontroller: view controller module identifierchildren: children views
  */
@JSGlobal("dojox.app.ViewBase")
@js.native
class ViewBase protected () extends js.Object {
  def this(params: js.Any) = this()
  /**
    * view life cycle afterActivate()
    *
    */
  def afterActivate(): Unit = js.native
  /**
    * view life cycle afterDeactivate()
    *
    */
  def afterDeactivate(): Unit = js.native
  /**
    * view life cycle beforeActivate()
    *
    */
  def beforeActivate(): Unit = js.native
  /**
    * view life cycle beforeDeactivate()
    *
    */
  def beforeDeactivate(): Unit = js.native
  /**
    * view life cycle destroy()
    *
    */
  def destroy(): Unit = js.native
  /**
    * view life cycle init()
    *
    */
  def init(): Unit = js.native
  /**
    *
    */
  def load(): js.Any = js.native
  /**
    * start view object.
    * load view template, view controller implement and startup all widgets in view template.
    *
    */
  def start(): js.Any = js.native
}

