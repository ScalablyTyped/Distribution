package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/WikipediaStore.html
  *
  * Initializer for the Wikipedia data store interface.
  * The WikipediaStore is a data store interface to Wikipedia, using the
  * Wikipedia SMD spec from dojox.rpc. It currently is useful only for
  * finding articles that contain some particular text or grabbing single
  * articles by full name; no wildcards or other filtering are supported.
  *
  * @param options
  */
@JSGlobal("dojox.data.WikipediaStore")
@js.native
class WikipediaStore protected () extends ServiceStore {
  def this(options: js.Any) = this()
  /**
    * Fetch a page or some partially-loaded search results from
    * Wikipedia. Note that there isn't a way to sort data coming
    * in from the API, so we just ignore the sort parameter.
    *
    * @param request
    */
  def fetch(request: js.Object): js.Any = js.native
}

