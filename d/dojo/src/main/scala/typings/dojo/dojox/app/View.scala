package typings.dojo.dojox.app

import typings.dojo.dijit.TemplatedMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/app/View.html
  *
  * View class inheriting from ViewBase adding templating & globalization capabilities.
  *
  * @param params view parameters, include:app: the appid: view idname: view nametemplate: view template identifier. If templateString is not empty, this parameter is ignored.templateString: view template stringcontroller: view controller module identifierparent: parent viewchildren: children viewsnls: nls definition module identifier
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.app.ViewBase because Inheritance from two classes. Inlined afterActivate, afterDeactivate, beforeActivate, beforeDeactivate, init, load, start
- typings.dojo.dijit.Destroyable because Inheritance from two classes. Inlined destroy, destroy, own
- typings.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup */ @JSGlobal("dojox.app.View")
@js.native
class View protected () extends TemplatedMixin {
  def this(params: js.Any) = this()
  /**
    * Used to provide a context require to the dojo/parser in order to be
    * able to use relative MIDs (e.g. ./Widget) in the widget's template.
    *
    */
  var contextRequire: js.Function = js.native
  /**
    * Should we parse the template to find widgets that might be
    * declared in markup inside it?  (Remove for 2.0 and assume true)
    *
    */
  var widgetsInTemplate: Boolean = js.native
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
    *
    * @param obj
    * @param event
    * @param method
    */
  def connect(obj: js.Any, event: js.Any, method: js.Any): js.Any = js.native
  /**
    * Destroy this class, releasing any resources registered via own().
    *
    * @param preserveDom
    */
  /**
    * Destroy this class, releasing any resources registered via own().
    * 
    * @param preserveDom             
    */
  def destroy(): Unit = js.native
  def destroy(preserveDom: Boolean): Unit = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
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
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    * 
    */
  def own(handle: js.Any): js.Any = js.native
  /**
    * start view object.
    * load view template, view controller implement and startup all widgets in view template.
    *
    */
  def start(): js.Any = js.native
  /**
    *
    */
  /**
    * 
    */
  def startup(): Unit = js.native
}

