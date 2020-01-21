package typings.dojo.dijit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_Templated.html
  *
  * Deprecated mixin for widgets that are instantiated from a template.
  * Widgets should use _TemplatedMixin plus if necessary _WidgetsInTemplateMixin instead.
  * 
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined contextRequire, widgetsInTemplate, startup */ @JSGlobal("dijit._Templated")
@js.native
class Templated () extends TemplatedMixin {
  /**
    * Used to provide a context require to the dojo/parser in order to be
    * able to use relative MIDs (e.g. ./Widget) in the widget's template.
    * 
    */
  var contextRequire: js.Function = js.native
  /**
    * Should we parse the template to find widgets that might be
    * declared in markup inside it?  False by default.
    * 
    */
  var widgetsInTemplate: Boolean = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
  /**
    * 
    */
  def startup(): Unit = js.native
}

