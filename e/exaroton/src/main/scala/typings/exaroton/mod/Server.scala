package typings.exaroton.mod

import typings.exaroton.anon.CRASHED
import typings.exaroton.exarotonBooleans.`false`
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("exaroton", "Server")
@js.native
open class Server protected () extends EventEmitter {
  /**
    * Server constructor
    *
    * @param client
    * @param id
    */
  def this(client: Client, id: String) = this()
  
  /**
    * Shorthand to get server status constants
    */
  val STATUS: CRASHED = js.native
  
  /**
    * Full server address (e.g. example.exaroton.me)
    */
  val address: String = js.native
  
  /* private */ val client: Client = js.native
  
  /**
    * Execute a command in the server console
    *
    * @param command
    */
  def executeCommand(command: String): js.Promise[Response | Boolean] = js.native
  
  /**
    * Get/update the server info
    *
    * @throws {RequestError}
    */
  def get(): js.Promise[Server] = js.native
  
  def getClient(): Server = js.native
  
  /**
    * Get a file object for a server file
    *
    * This doesn't request file info or content yet.
    * Use the File.getInfo() and File.getContent() methods for that
    *
    * @param path The path of the file relative to the server root
    */
  def getFile(path: String): File = js.native
  
  /**
    * Get the content of the server logs
    *
    * This is cached and will not return the latest updates immediately.
    */
  def getLogs(): js.Promise[String] = js.native
  
  /**
    * Get the server MOTD
    */
  def getMOTD(): js.Promise[String] = js.native
  
  /**
    * Get a server option
    *
    * @param option
    */
  def getOption(option: String): js.Promise[js.Object | Null] = js.native
  
  /**
    * Get a player list by name
    *
    * @param name
    */
  def getPlayerList(name: PlayerListTypes): PlayerList = js.native
  
  /**
    * Get all player lists available for the server
    */
  def getPlayerLists(): js.Promise[js.Array[PlayerList]] = js.native
  
  /**
    * Get the assigned max server RAM in GB
    */
  def getRAM(): js.Promise[Double] = js.native
  
  /**
    * Get a websocket client for this server
    */
  def getWebsocketClient(): WebsocketClient = js.native
  
  def hasStatus(status: js.Array[Double]): Boolean = js.native
  /**
    * Check if the server has one or one of multiple status codes
    *
    * Use this.STATUS.<STATUS> for status codes
    *
    * @param status
    */
  def hasStatus(status: Double): Boolean = js.native
  
  /**
    * Host address, only available if the server is online
    */
  val host: String | Null = js.native
  
  /**
    * Unique server ID
    */
  val id: String = js.native
  
  /**
    * MOTD
    */
  val motd: String = js.native
  
  /**
    * Server name
    */
  val name: String = js.native
  
  /**
    * Player lists
    */
  val player: Players = js.native
  
  val players: Players = js.native
  
  /**
    * Server port, only available if the server is online
    */
  val port: Double | Null = js.native
  
  /**
    * Restart the server
    *
    * @throws {RequestError}
    */
  def restart(): js.Promise[Response] = js.native
  
  /**
    * Map raw object to this instance
    *
    * @param server
    */
  def setFromObject(server: js.Object): Server = js.native
  
  /**
    * Set the server MOTD
    *
    * @param motd
    */
  def setMOTD(motd: String): js.Promise[Response] = js.native
  
  /**
    * Set a server option
    *
    * @param option
    * @param value
    */
  def setOption(option: String, value: String): js.Promise[Response] = js.native
  
  /**
    * Set the assigned max server RAM in GB
    *
    * @param ram
    */
  def setRAM(ram: Double): js.Promise[Response] = js.native
  
  /**
    * Upload the content of the server logs to mclo.gs
    *
    * Returns the URL of the logs on mclo.gs
    */
  def shareLogs(): js.Promise[String] = js.native
  
  /**
    * Check if this is an owned or shared server
    */
  val shared: (`false` & Boolean) | Boolean = js.native
  
  /**
    * Server software
    */
  val software: Software = js.native
  
  /**
    * Start the server
    *
    * @throws {RequestError}
    */
  def start(): js.Promise[Response] = js.native
  
  /**
    * Server status
    */
  val status: Double = js.native
  
  /**
    * Stop the server
    *
    * @throws {RequestError}
    */
  def stop(): js.Promise[Response] = js.native
  
  /**
    * Subscribe to one or multiple streams
    *
    * @param streams
    */
  def subscribe(): Boolean = js.native
  def subscribe(streams: js.Array[SubscriptionType]): Boolean = js.native
  def subscribe(streams: SubscriptionType): Boolean = js.native
  
  /**
    * Only return intended public fields for JSON serialization
    *
    * Otherwise, fields inherited from EventEmitter would be serialized as well
    */
  def toJSON(): Server = js.native
  
  /**
    * Unsubscribe from one, multiple or all streams
    *
    * @param streams
    */
  def unsubscribe(): Boolean = js.native
  def unsubscribe(streams: js.Array[SubscriptionType]): Boolean = js.native
  def unsubscribe(streams: SubscriptionType): Boolean = js.native
}
