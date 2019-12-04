package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/GoogleFeedStore.html
  *
  * A data store for retrieving RSS and Atom feeds from Google. The
  * feeds can come from any source, which is specified in the "url"
  * parameter of the query passed to the "fetch" function.
  * The following attributes are supported on each item:
  *
  * title - The feed entry title.
  * link - The URL for the HTML version of the feed entry.
  * content - The full content of the blog post, in HTML format
  * summary - A snippet of information about the feed entry, in plain text
  * published - The string date on which the entry was published.      You can parse the date with new Date(store.getValue(item, "published")
  * categories - An array of string tags for the entry
  * The query accepts one parameter: url - The URL of the feed to retrieve
  *
  * @param args
  */
@JSGlobal("dojox.data.GoogleFeedStore")
@js.native
class GoogleFeedStore protected () extends js.Object {
  def this(args: js.Object) = this()
  /**
    * The default attribute which acts as a label for each item.
    *
    */
  var label: String = js.native
  /**
    * Sets whether or not to pass preventCache to dojo.io.script.
    *
    */
  var urlPreventCache: Boolean = js.native
  /**
    * See dojo/data/api/Read.close()
    *
    * @param request
    */
  def close(request: js.Any): Unit = js.native
  /**
    * See dojo/data/api/Read.containsValue()
    *
    * @param item
    * @param attribute
    * @param value
    */
  def containsValue(item: js.Any, attribute: js.Any, value: js.Any): Boolean = js.native
  /**
    * Fetch Google search items that match to a query
    *
    * @param request A request object
    */
  def fetch(request: js.Any): Unit = js.native
  /**
    * See dojo/data/api/Read.getAttributes()
    *
    * @param item
    */
  def getAttributes(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getFeatures()
    *
    */
  def getFeatures(): js.Object = js.native
  /**
    * Non-API method for retrieving values regarding the Atom feed,
    * rather than the Atom entries.
    *
    * @param attribute
    * @param defaultValue
    */
  def getFeedValue(attribute: js.Any, defaultValue: js.Any): js.Any = js.native
  /**
    * Non-API method for retrieving values regarding the Atom feed,
    * rather than the Atom entries.
    *
    * @param attribute
    * @param defaultValue
    */
  def getFeedValues(attribute: js.Any, defaultValue: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getLabel()
    *
    * @param item
    */
  def getLabel(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getLabelAttributes()
    *
    * @param item
    */
  def getLabelAttributes(item: js.Any): js.Array[_] = js.native
  /**
    * See dojo/data/api/Read.getValue()
    *
    * @param item
    * @param attribute
    * @param defaultValue
    */
  def getValue(item: js.Any, attribute: js.Any, defaultValue: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.getValue()
    *
    * @param item
    * @param attribute
    */
  def getValues(item: js.Any, attribute: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.hasAttributes()
    *
    * @param item
    * @param attribute
    */
  def hasAttribute(item: js.Any, attribute: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.isItem()
    *
    * @param item
    */
  def isItem(item: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.isItemLoaded()
    *
    * @param item
    */
  def isItemLoaded(item: js.Any): js.Any = js.native
  /**
    * See dojo/data/api/Read.loadItem()
    *
    * @param keywordArgs
    */
  def loadItem(keywordArgs: js.Any): Unit = js.native
}

