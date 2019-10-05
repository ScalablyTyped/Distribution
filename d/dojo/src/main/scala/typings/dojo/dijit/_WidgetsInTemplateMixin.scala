package typings.dojo.dijit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_WidgetsInTemplateMixin.html
  *
  * Mixin to supplement _TemplatedMixin when template contains widgets
  * 
  */
@JSGlobal("dijit._WidgetsInTemplateMixin")
@js.native
class _WidgetsInTemplateMixin () extends js.Object {
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
    * 
    */
  def startup(): Unit = js.native
}

