package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/CouchDBRestStore.html
  *
  * A CouchDBRestStore is an extension of JsonRestStore to handle CouchDB's idiosyncrasies, special features,
  * and deviations from standard HTTP Rest.
  * NOTE: CouchDB is not designed to be run on a public facing network. There is no access control
  * on database documents, and you should NOT rely on client side control to implement security.
  *
  */
@JSGlobal("dojox.data.CouchDBRestStore")
@js.native
class CouchDBRestStore () extends js.Object {
  /**
    * This only differs from JsonRestStore in that it, will put the query string the query part of the URL and it handles start and count
    *
    * @param args
    */
  def fetch(args: js.Any): js.Any = js.native
  /**
    *
    * @param couchServerUrl
    */
  def getStores(couchServerUrl: js.Any): Unit = js.native
  /**
    *
    * @param kwArgs
    */
  def save(kwArgs: js.Any): Unit = js.native
}

