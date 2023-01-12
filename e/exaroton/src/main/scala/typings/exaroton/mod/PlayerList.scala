package typings.exaroton.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerList extends StObject {
  
  /**
    * Add multiple entries
    *
    * @param entries
    */
  def addEntries(entries: js.Array[String]): js.Promise[Response]
  
  /**
    * Add a single entry
    *
    * @param entry
    */
  def addEntry(entry: String): js.Promise[Response]
  
  /* private */ var client: Client
  
  /**
    * Delete multiple entries
    *
    * @param entries
    */
  def deleteEntries(entries: js.Array[String]): js.Promise[Response]
  
  /**
    * Delete a single entry
    *
    * @param entry
    */
  def deleteEntry(entry: String): js.Promise[Response]
  
  def getEntries(): js.Promise[js.Array[String]]
  
  /**
    * Get the list name
    */
  def getName(): String
  
  /**
    * List name / identifier
    */
  var name: String
  
  /* private */ var server: Server
  
  /**
    * Set the API client
    *
    * @param client
    */
  def setClient(client: Client): PlayerList
  
  /**
    * Set the server for this list
    *
    * @param server
    */
  def setServer(server: Server): PlayerList
}
object PlayerList {
  
  inline def apply(
    addEntries: js.Array[String] => js.Promise[Response],
    addEntry: String => js.Promise[Response],
    client: Client,
    deleteEntries: js.Array[String] => js.Promise[Response],
    deleteEntry: String => js.Promise[Response],
    getEntries: () => js.Promise[js.Array[String]],
    getName: () => String,
    name: String,
    server: Server,
    setClient: Client => PlayerList,
    setServer: Server => PlayerList
  ): PlayerList = {
    val __obj = js.Dynamic.literal(addEntries = js.Any.fromFunction1(addEntries), addEntry = js.Any.fromFunction1(addEntry), client = client.asInstanceOf[js.Any], deleteEntries = js.Any.fromFunction1(deleteEntries), deleteEntry = js.Any.fromFunction1(deleteEntry), getEntries = js.Any.fromFunction0(getEntries), getName = js.Any.fromFunction0(getName), name = name.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], setClient = js.Any.fromFunction1(setClient), setServer = js.Any.fromFunction1(setServer))
    __obj.asInstanceOf[PlayerList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerList] (val x: Self) extends AnyVal {
    
    inline def setAddEntries(value: js.Array[String] => js.Promise[Response]): Self = StObject.set(x, "addEntries", js.Any.fromFunction1(value))
    
    inline def setAddEntry(value: String => js.Promise[Response]): Self = StObject.set(x, "addEntry", js.Any.fromFunction1(value))
    
    inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setDeleteEntries(value: js.Array[String] => js.Promise[Response]): Self = StObject.set(x, "deleteEntries", js.Any.fromFunction1(value))
    
    inline def setDeleteEntry(value: String => js.Promise[Response]): Self = StObject.set(x, "deleteEntry", js.Any.fromFunction1(value))
    
    inline def setGetEntries(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getEntries", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setSetClient(value: Client => PlayerList): Self = StObject.set(x, "setClient", js.Any.fromFunction1(value))
    
    inline def setSetServer(value: Server => PlayerList): Self = StObject.set(x, "setServer", js.Any.fromFunction1(value))
  }
}
