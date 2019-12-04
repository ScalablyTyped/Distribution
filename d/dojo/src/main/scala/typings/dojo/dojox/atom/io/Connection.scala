package typings.dojo.dojox.atom.io

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/io/Connection.html
  *
  * This object implements a transport layer for working with ATOM feeds and ATOM publishing protocols.
  * This object implements a transport layer for working with ATOM feeds and ATOM publishing protocols.
  * Specifically, it provides a mechanism by which feeds can be fetched and entries can be fetched, created
  * deleted, and modified.  It also provides access to the introspection data.
  *
  * @param sync
  * @param preventCache
  */
@JSGlobal("dojox.atom.io.Connection")
@js.native
class Connection protected () extends js.Object {
  def this(sync: Boolean, preventCache: Boolean) = this()
  /**
    *
    */
  var alertsEnabled: Boolean = js.native
  /**
    *
    */
  var preventCache: Boolean = js.native
  /**
    * Function to add a new ATOM entry by posting the new entry via APP.
    * This function takes a specific dojox.atom.io.model.Entry object and pushes the
    * changes back to the provider of the Entry.
    *
    * @param entry ObjectThe dojox.atom.io.model.Entry object to publish.
    * @param url
    * @param callback FunctionA function reference that will handle the results from the entry publish.The callback should accept two parameters:   The first is an dojox.atom.io.model.Entry object, and the second is the location of the entryEither can be null, depending on the value of retrieveUpdated.
    * @param errorCallback
    * @param retrieveEntry booleanA boolean flag denoting if the entry that was created should then beretrieved and returned to the caller via the callback.
    * @param scope ObjectThe scope to use for all callbacks.
    */
  def addEntry(
    entry: js.Any,
    url: js.Any,
    callback: js.Any,
    errorCallback: js.Any,
    retrieveEntry: js.Any,
    scope: js.Any
  ): js.Any = js.native
  /**
    * Function to delete a specific ATOM entry via APP.
    * This function takes a specific dojox.atom.io.model.Entry object and calls for a delete on the
    * service housing the ATOM Entry database.
    * The entry MUST have a link tag with rel="edit" for this to work.
    *
    * @param entry ObjectThe dojox.atom.io.model.Entry object to delete.
    * @param callback FunctionA function reference that will handle the results from the entry delete.The callback is called only if the delete is successful.
    * @param errorCallback
    * @param xmethod
    * @param scope
    */
  def deleteEntry(entry: js.Any, callback: js.Any, errorCallback: js.Any, xmethod: js.Any, scope: js.Any): js.Any = js.native
  /**
    * Function to retrieve a single entry from an ATOM feed from the given URL.
    * This function takes the URL for an ATOM entry and returns the constructed dojox.atom.io.model.Entry object through
    * the specified callback.
    *
    * @param url StringThe URL of the ATOM Entry document to parse.
    * @param callback FunctionA function reference that will handle the Entry object obtained.The callback should accept two parameters, the dojox.atom.io.model.Entry object and the original dom.
    * @param errorCallback
    * @param scope
    */
  def getEntry(url: js.Any, callback: js.Any, errorCallback: js.Any, scope: js.Any): js.Any = js.native
  /**
    * Function to obtain a s specific ATOM feed from a given ATOM Feed url.
    * This function takes the URL for a specific ATOM feed and returns
    * the data from that feed to the caller through the use of a callback
    * handler.
    *
    * @param url The URL of the ATOM feed to fetch.
    * @param callback FunctionA function reference that will handle the feed when it has been retrieved.The callback should accept two parameters:  The feed object and the original complete DOM object.
    * @param errorCallback
    * @param scope The scope to use for all callbacks.
    */
  def getFeed(url: String, callback: js.Function, errorCallback: js.Function, scope: js.Object): js.Any = js.native
  /**
    * Function to retrieve an introspection document from the given URL.
    * This function takes the URL for an ATOM item and feed and returns
    * the introspection document.
    *
    * @param url StringThe URL of the ATOM document to obtain the introspection document of.
    * @param callback FunctionA function reference that will handle the introspection document when it has been retrieved.The callback should accept two parameters:  The introspection document object and the original complete DOM object.
    * @param errorCallback
    * @param scope
    */
  def getService(url: js.Any, callback: js.Any, errorCallback: js.Any, scope: js.Any): js.Any = js.native
  /**
    * Function to update a specific ATOM entry by putting the new changes via APP.
    * This function takes a specific dojox.atom.io.model.Entry object and pushes the
    * changes back to the provider of the Entry.
    * The entry MUST have a link tag with rel="edit" for this to work.
    *
    * @param entry ObjectThe dojox.atom.io.model.Entry object to update.
    * @param callback FunctionA function reference that will handle the results from the entry update.The callback should accept two parameters:  The first is an Entry object, and the second is the URL of that EntryEither can be null, depending on the value of retrieveUpdated.
    * @param errorCallback
    * @param retrieveUpdated booleanA boolean flag denoting if the entry that was updated should then beretrieved and returned to the caller via the callback.
    * @param xmethod booleanWhether to use POST for PUT/DELETE items and send the X-Method-Override header.
    * @param scope ObjectThe scope to use for all callbacks.
    */
  def updateEntry(
    entry: js.Any,
    callback: js.Any,
    errorCallback: js.Any,
    retrieveUpdated: js.Any,
    xmethod: js.Any,
    scope: js.Any
  ): js.Any = js.native
}

