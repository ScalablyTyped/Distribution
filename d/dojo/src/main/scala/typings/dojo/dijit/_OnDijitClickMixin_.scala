package typings.dojo.dijit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_OnDijitClickMixin.html
  *
  * Deprecated.   New code should access the dijit/a11yclick event directly, ex:
  * 
  * this.own(on(node, a11yclick, function(){ ... }));
  * Mixing in this class will make _WidgetBase.connect(node, "ondijitclick", ...) work.
  * It also used to be necessary to make templates with ondijitclick work, but now you can just require
  * dijit/a11yclick.
  * 
  */
@JSGlobal("dijit._OnDijitClickMixin")
@js.native
class _OnDijitClickMixin_ () extends js.Object {
  /**
    * Custom press, release, and click synthetic events
    * which trigger on a left mouse click, touch, or space/enter keyup.
    * 
    */
  var a11yclick: js.Object = js.native
  /**
    * 
    * @param obj             
    * @param event             
    * @param method             
    */
  def connect(obj: js.Any, event: js.Any, method: js.Any): js.Any = js.native
}

