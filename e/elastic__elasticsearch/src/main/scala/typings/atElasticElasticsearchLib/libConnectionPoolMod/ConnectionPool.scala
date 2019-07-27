package typings
package atElasticElasticsearchLib.libConnectionPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionPool extends js.Object {
  var Connection: atElasticElasticsearchLib.TypeofClassConnection = js.native
  var _agent: atElasticElasticsearchLib.libConnectionMod.AgentOptions | scala.Null = js.native
  var _sniffEnabled: scala.Boolean = js.native
  var _ssl: nodeLib.tlsMod.SecureContextOptions | scala.Null = js.native
  var connections: js.Any = js.native
  var dead: js.Array[java.lang.String] = js.native
  var pingTimeout: scala.Double = js.native
  var resurrectStrategy: scala.Double = js.native
  var resurrectTimeout: scala.Double = js.native
  var resurrectTimeoutCutoff: scala.Double = js.native
  /**
    * Adds a new connection to the pool.
    *
    * @param {object|string} host
    * @returns {ConnectionPool}
    */
  def addConnection(opts: js.Any): atElasticElasticsearchLib.libConnectionMod.default | scala.Unit = js.native
  /**
    * Empties the connection pool.
    *
    * @returns {ConnectionPool}
    */
  def empty(): ConnectionPool = js.native
  /**
    * Returns an alive connection if present,
    * otherwise returns null.
    * By default it filters the `master` only nodes.
    * It uses the selector to choose which
    * connection return.
    *
    * @param {object} options (filter and selector)
    * @returns {object|null} connection
    */
  def getConnection(): atElasticElasticsearchLib.libConnectionMod.default | scala.Null = js.native
  def getConnection(opts: getConnectionOptions): atElasticElasticsearchLib.libConnectionMod.default | scala.Null = js.native
  /**
    * Marks a connection as 'alive'.
    * If needed removes the connection from the dead list
    * and then resets the `deadCount`.
    *
    * @param {object} connection
    */
  def markAlive(connection: atElasticElasticsearchLib.libConnectionMod.default): scala.Unit = js.native
  /**
    * Marks a connection as 'dead'.
    * If needed adds the connection to the dead list
    * and then increments the `deadCount`.
    *
    * @param {object} connection
    */
  def markDead(connection: atElasticElasticsearchLib.libConnectionMod.default): scala.Unit = js.native
  /**
    * Transforms the nodes objects to a host object.
    *
    * @param {object} nodes
    * @returns {array} hosts
    */
  def nodesToHost(nodes: js.Any, protocol: java.lang.String): js.Array[_] = js.native
  /**
    * Removes a new connection to the pool.
    *
    * @param {object} connection
    * @returns {ConnectionPool}
    */
  def removeConnection(connection: atElasticElasticsearchLib.libConnectionMod.default): ConnectionPool = js.native
  /**
    * If enabled, tries to resurrect a connection with the given
    * resurrect strategy ('ping', 'optimistic', 'none').
    *
    * @param {object} { now, requestId, name }
    * @param {function} callback (isAlive, connection)
    */
  def resurrect(opts: resurrectOptions): scala.Unit = js.native
  def resurrect(
    opts: resurrectOptions,
    callback: js.Function2[
      /* isAlive */ scala.Boolean | scala.Null, 
      /* connection */ atElasticElasticsearchLib.libConnectionMod.default | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Update the ConnectionPool with new connections.
    *
    * @param {array} array of connections
    * @returns {ConnectionPool}
    */
  def update(connections: js.Array[atElasticElasticsearchLib.libConnectionMod.default]): ConnectionPool = js.native
  /**
    * Transforms an url string to a host object
    *
    * @param {string} url
    * @returns {object} host
    */
  def urlToHost(url: java.lang.String): js.Any = js.native
}

