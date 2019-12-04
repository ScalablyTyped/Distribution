package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/CssClassStore.html
  *
  * Basic store to display CSS information.
  * The CssClassStore allows users to get information about active Css classes in the page running the CssClassStore.
  * It can also filter out classes from specific stylesheets.  The attributes it exposes on classes are as follows:
  *
  * class:        The classname, including the '.'.
  * classSans:    The classname without the '.'.
  *
  * @param keywordParameters
  */
@JSGlobal("dojox.data.CssClassStore")
@js.native
class CssClassStore protected () extends CssRuleStore {
  def this(keywordParameters: js.Object) = this()
  /**
    * See dojo/data/api/Identity.fetchItemByIdentity()
    *
    * @param request
    */
  def fetchItemByIdentity(request: js.Object): String = js.native
  /**
    * See dojo/data/api/Identity.getIdentity()
    *
    * @param item
    */
  def getIdentity(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Identity.getIdentityAttributes()
    *
    * @param item
    */
  def getIdentityAttributes(item: js.Any): js.Array[_] = js.native
}

