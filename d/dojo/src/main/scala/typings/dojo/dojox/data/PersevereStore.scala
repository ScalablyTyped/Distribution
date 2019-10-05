package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/PersevereStore.html
  *
  *
  */
@JSGlobal("dojox.data.PersevereStore")
@js.native
class PersevereStore () extends js.Object {
  /**
    *
    */
  var jsonQueryPagination: Boolean = js.native
  /**
    *
    */
  var useFullIdInQueries: Boolean = js.native
  /**
    * Invokes the XHR proxy plugin. Call this if you will be using x-site data.
    *
    */
  def addProxy(): Unit = js.native
  /**
    * Creates Dojo data stores for all the table/classes on a Persevere server
    *
    * @param path               OptionalURL of the Persevere server's root, this normally just "/"which is the default value if the target is not provided
    * @param sync               OptionalIndicates that the operation should happen synchronously.
    */
  def getStores(path: String, sync: Boolean): js.Any = js.native
}

