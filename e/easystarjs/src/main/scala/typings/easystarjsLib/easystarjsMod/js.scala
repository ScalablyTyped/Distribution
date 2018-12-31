package typings
package easystarjsLib.easystarjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easystarjs", "js")
@js.native
class js () extends js.Object {
  /**
    * Avoid a particular point on the grid,
    * regardless of whether or not it is an acceptable tile.
    *
    * @param {Number} x The x value of the point to avoid.
    * @param {Number} y The y value of the point to avoid.
    */
  def avoidAdditionalPoint(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * This method steps through the A* Algorithm in an attempt to
    * find your path(s). It will search 4-8 tiles (depending on diagonals) for every calculation.
    * You can change the number of calculations done in a call by using
    * easystar.setIteratonsPerCalculation().
    */
  def calculate(): scala.Unit = js.native
  /**
    * Cancel a path calculation.
    *
    * @param {Number} instanceId The instance ID of the path being calculated
    * @return {Boolean} True if an instance was found and cancelled.
    *
    **/
  def cancelPath(instanceId: scala.Double): scala.Boolean = js.native
  /**
    * Disables corner cutting in diagonal movement.
    */
  def disableCornerCutting(): scala.Unit = js.native
  /**
    * Disable diagonal pathfinding.
    */
  def disableDiagonals(): scala.Unit = js.native
  /**
    * Disables sync mode for this EasyStar instance.
    */
  def disableSync(): scala.Unit = js.native
  /**
    * Enables corner cutting in diagonal movement.
    */
  def enableCornerCutting(): scala.Unit = js.native
  /**
    * Enable diagonal pathfinding.
    */
  def enableDiagonals(): scala.Unit = js.native
  /**
    * Enables sync mode for this EasyStar instance..
    * if you're into that sort of thing.
    */
  def enableSync(): scala.Unit = js.native
  /**
    * Find a path.
    *
    * @param {Number} startX The X position of the starting point.
    * @param {Number} startY The Y position of the starting point.
    * @param {Number} endX The X position of the ending point.
    * @param {Number} endY The Y position of the ending point.
    * @param {Function} callback A function that is called when your path
    * is found, or no path is found.
    * @return {Number} A numeric, non-zero value which identifies the created instance. This value can be passed to cancelPath to cancel the path calculation.
    *
    */
  def findPath(
    startX: scala.Double,
    startY: scala.Double,
    endX: scala.Double,
    endY: scala.Double,
    callback: js.Function1[/* path */ js.Array[easystarjsLib.Anon_Y], scala.Unit]
  ): scala.Double = js.native
  /**
    * Remove the additional cost for a particular point.
    *
    * @param {Number} x The x value of the point to stop costing.
    * @param {Number} y The y value of the point to stop costing.
    */
  def removeAdditionalPointCost(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Remove all additional point costs.
    */
  def removeAllAdditionalPointCosts(): scala.Unit = js.native
  /**
    * Remove all directional conditions
    */
  def removeAllDirectionalConditions(): scala.Unit = js.native
  /**
    * Sets the collision grid that EasyStar uses.
    *
    * @param {Array|Number} tiles An array of numbers that represent
    * which tiles in your grid should be considered
    * acceptable, or "walkable".
    */
  def setAcceptableTiles(tiles: js.Array[scala.Double]): scala.Unit = js.native
  def setAcceptableTiles(tiles: scala.Double): scala.Unit = js.native
  /**
    * Sets the an additional cost for a particular point.
    * Overrides the cost from setTileCost.
    *
    * @param {Number} x The x value of the point to cost.
    * @param {Number} y The y value of the point to cost.
    * @param {Number} The multiplicative cost associated with the given point.
    */
  def setAdditionalPointCost(x: scala.Double, y: scala.Double, cost: scala.Double): scala.Unit = js.native
  /**
    * Sets a directional condition on a tile
    *
    * @param {Number} x The x value of the point.
    * @param {Number} y The y value of the point.
    * @param {Array.<String>} allowedDirections A list of all the allowed directions from which the tile is accessible.
    *
    * eg. easystar.setDirectionalCondition(1, 1, ['TOP']): You can only access the tile by walking down onto it,
    */
  def setDirectionalCondition(x: scala.Double, y: scala.Double, allowedDirections: js.Array[easystarjsLib.Direction]): scala.Unit = js.native
  /**
    * Sets the collision grid that EasyStar uses.
    *
    * @param {Array} grid The collision grid that this EasyStar instance will read from.
    * This should be a 2D Array of Numbers.
    */
  def setGrid(grid: js.Array[js.Array[scala.Double]]): scala.Unit = js.native
  /**
    * Sets the number of search iterations per calculation.
    * A lower number provides a slower result, but more practical if you
    * have a large tile-map and don't want to block your thread while
    * finding a path.
    *
    * @param {Number} iterations The number of searches to prefrom per calculate() call.
    */
  def setIterationsPerCalculation(iterations: scala.Double): scala.Unit = js.native
  /**
    * Sets the tile cost for a particular tile type.
    *
    * @param {Number} The tile type to set the cost for.
    * @param {Number} The multiplicative cost associated with the given tile.
    */
  def setTileCost(tileType: scala.Double, cost: scala.Double): scala.Unit = js.native
  /**
    * Stop avoiding a particular point on the grid.
    *
    * @param {Number} x The x value of the point to stop avoiding.
    * @param {Number} y The y value of the point to stop avoiding.
    */
  def stopAvoidingAdditionalPoint(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Stop avoiding all additional points on the grid.
    */
  def stopAvoidingAllAdditionalPoints(): scala.Unit = js.native
}

