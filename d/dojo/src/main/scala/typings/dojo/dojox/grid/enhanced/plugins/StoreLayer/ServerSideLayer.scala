package typings.dojo.dojox.grid.enhanced.plugins.StoreLayer

import typings.dojo.dojo.data.api.Request
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/_StoreLayer._ServerSideLayer.html
  *
  * The most abstract class for all server side store layers.
  *
  * @param args
  */
@JSGlobal("dojox.grid.enhanced.plugins._StoreLayer._ServerSideLayer")
@js.native
class ServerSideLayer protected () extends js.Object {
  def this(args: js.Any) = this()
  /**
    *
    */
  var layerFuncName: String = js.native
  /**
    *
    */
  var tags: js.Array[_] = js.native
  /**
    * get/set a command (a name-value pair)
    *
    * @param cmdName The name of the command
    * @param cmdContent               OptionalThe content of the command
    */
  def command(cmdName: String, cmdContent: js.Any): js.Any = js.native
  /**
    * Overrided from _StoreLayer.enabled
    *
    * @param toEnable               Optional
    */
  def enabled(toEnable: Boolean): js.Any = js.native
  /**
    *
    * @param store
    */
  def initialize(store: js.Any): Unit = js.native
  /**
    *
    */
  def invalidate(): Unit = js.native
  /**
    * Get the name of this store layer.
    * The default name retrieved from class name, which should have a pattern of "{name}Layer".
    * If this pattern does not exist, the whole class name will be this layer's name.
    * It's better to override this method if your class name is too complicated.
    *
    */
  def name(): js.Any = js.native
  /**
    * handle errors when sending commands.
    *
    * @param error
    */
  def onCommandError(error: Error): Unit = js.native
  /**
    * When the server gives back response for the commands, you can do something here.
    *
    * @param response server response
    * @param userRequest The request object for fetch. You can modify this object according to the responseso as to change the behavior of fetch
    */
  def onCommandLoad(response: String, userRequest: Request): Unit = js.native
  /**
    *
    */
  def originFetch(): js.Any = js.native
  /**
    *
    * @param store
    */
  def uninitialize(store: js.Any): Unit = js.native
  /**
    * If you only want to modify the user request, instead of sending a separate command
    * to server before fetch, just call:
    *
    * this.useCommand(false);
    *
    * @param toUse               OptionalIf provided, it's a setter, otherwise, it's a getter
    */
  def useCommands(toUse: Boolean): Boolean = js.native
}

